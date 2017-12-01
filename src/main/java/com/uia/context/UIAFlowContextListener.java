package com.uia.context;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONObject;
import org.mule.api.MuleContext;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.api.context.notification.MuleContextNotificationListener;
import org.mule.config.spring.SpringRegistry;
import org.mule.context.notification.MuleContextNotification;
import org.springframework.context.ApplicationContext;

import com.uia.component.UIACacheComponent;
import com.uia.component.UIAReferenceDataMapper;

public class UIAFlowContextListener implements MuleContextNotificationListener<MuleContextNotification> {

	private final String UIACACHEBEAN = "uiaCacheBean";
	private final String DONE = "DONE";
	private final String REFERENCE_DATA_ENDPOINT = "http://0.0.0.0:7082/UIA/cache/referencedata";
	private final Long timeOut = -1l; // 0 will not wait for response, -1 will
										// wait till response


	public void onNotification(final MuleContextNotification notification) {
		if (notification.getAction() == MuleContextNotification.CONTEXT_STARTED) {
			
			Logger logger = LogManager.getLogger(UIAFlowContextListener.class);

			

			MuleContext muleContext = notification.getMuleContext();
			MuleMessage muleMessage = null;

			MuleClient muleClient = muleContext.getClient();

			try {

				ApplicationContext appContext = (ApplicationContext) muleContext.getRegistry()
						.lookupObject(SpringRegistry.SPRING_APPLICATION_CONTEXT);
				UIACacheComponent uiaCacheBean = (com.uia.component.UIACacheComponent) appContext.getBean(UIACACHEBEAN);

				if (null != uiaCacheBean) {
					uiaCacheBean.setReferenceDataCache(DONE);
				}

				//muleMessage = muleClient.request(REFERENCE_DATA_ENDPOINT, 0);
				muleMessage = muleClient.request(REFERENCE_DATA_ENDPOINT, timeOut);

				
				//String productAsJson = "{\"name\":\"Widget\", \"price\": 9.99,\"weight\": 1.0, \"sku\":\"abcd-12345\"}";
				//muleClient.dispatch("http://localhost:8080/products",productAsJson, null);
				
				
				if (null != muleMessage && null != muleMessage.getPayloadAsString()) {

					JSONObject jsonObj = new JSONObject(muleMessage.getPayloadAsString());

					if (null != jsonObj) {

						uiaCacheBean.setLovsData(jsonObj.toString());

					}
					logger.info("Lov Data " + uiaCacheBean.getLovsData());
				

				}
			} catch (MuleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (notification.getAction() == MuleContextNotification.CONTEXT_STOPPING) {

		}
	}

}
