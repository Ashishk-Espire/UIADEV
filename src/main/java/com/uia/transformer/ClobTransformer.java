package com.uia.transformer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class ClobTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		final String  fncResult = "fncResult";

		//logger.info("Coming into ClobTransformer");
		String returnPayload = null;
		Clob clobData = ((HashMap<String, Clob>) message.getPayload()).get(fncResult);
		InputStream input;
		if (null != clobData) {
			try {
				input = clobData.getAsciiStream();
				//logger.info("Input stream "+input);
				try (BufferedReader buffer = new BufferedReader(new InputStreamReader(input))) {
					returnPayload = buffer.lines().collect(Collectors.joining("\n"));
				}
			} catch (SQLException | IOException e) {
				e.printStackTrace();
			}
		}
		//logger.info("In trnasformer payload is "+returnPayload);
		return returnPayload;
	}

}
