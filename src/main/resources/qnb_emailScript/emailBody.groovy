import groovy.json.*
import java.util.regex.Matcher;

String emailBody ;
try{
	def jsonEmailData = new JsonSlurper().parseText(emailData);
	
	def jsonBrandData = new JsonSlurper().parseText(brandData);
	
	println "In grrovy the addBcc is "+addBcc;
	
	// println "calss and size of jsonEmailData and jsonEmailData " +jsonEmailData.getClass() + " " +jsonEmailData;
	
	// println "calss and size of jsonBrandData and jsonBrandData " +jsonBrandData.getClass() + " " + jsonBrandData.size() + " " +jsonBrandData;
	
	def jsonBrandTempleteData = null;
	
	
	String cover_start_date;
	String cust_no;
	String email_address;
	String install_first_payment;
	String install_other_payments;
	String instalments;
	String policy_no;
	String premium;
	String quote_valid_days;
	String renewal_date;
	String surname;
	String title;
	String v_discount;
	String cover_type;
	String brand;
	String registration_page_URL;
	
	
	
	String terms = null;
	String customer_login_url = null;
	String signature = null;
	String sales_email = null;
	String phone_number = null;
	String company_info_email = null;
	String company_name = null;
	String company_support_email = null;
	String policy_file_url = null;
	String company_website = null;
	String logo_path = null;
	
	Date date = null; 
	
	if(null !=jsonEmailData && null != jsonEmailData.quote_response) {
	
		cover_start_date =jsonEmailData.quote_response.cover_start_date;
		cust_no =jsonEmailData.quote_response.cust_no;
		email_address =jsonEmailData.quote_response.email_address;
		install_first_payment =jsonEmailData.quote_response.install_first_payment;
		install_other_payments =jsonEmailData.quote_response.install_other_payments;
		instalments =jsonEmailData.quote_response.instalments;
		policy_no =jsonEmailData.quote_response.policy_no;
		premium =jsonEmailData.quote_response.premium;
		quote_valid_days =jsonEmailData.quote_response.quote_valid_days;
		renewal_date =jsonEmailData.quote_response.renewal_date;
		surname =jsonEmailData.quote_response.surname;
		title =jsonEmailData.quote_response.title;
		v_discount =jsonEmailData.quote_response.v_discount;
		cover_type=jsonEmailData.quote_response.cover_type;
		brand = jsonEmailData.quote_response.brand;
		
		
	
	}
	
	if(null!= install_first_payment && install_first_payment.isNumber()){
		install_first_payment =  String.format( "%.2f", Double.parseDouble(install_first_payment));
		
		install_first_payment = "&pound;" + " " + install_first_payment;
	}
	
	if(null!= install_other_payments && install_other_payments.isNumber()){
		install_other_payments = String.format( "%.2f", Double.parseDouble(install_other_payments));
		install_other_payments = "&pound;" + " " + install_other_payments;
	}
	
	if(null!= premium && premium.isNumber()){
		premium = String.format( "%.2f", Double.parseDouble(premium));
		premium = "&pound;" + " " + premium;
	}
	
	//String a = "2010.12.12";
    // System.out.println(a.matches("\\d{4}\\.\\d{2}\\.\\d{2}"));
	
	//println " cover_start_date " + cover_start_date + " : " + cover_start_date.matches("\\d{4}\\-\\d{2}\\-\\d{2}");
	
	
	if(null!= cover_start_date && cover_start_date.matches("\\d{4}\\-\\d{2}\\-\\d{2}")){
		date = Date.parse('yyyy-MM-dd', cover_start_date);
		cover_start_date = date.format( 'dd-MM-yyyy' );
	}  
	
	if(null!= renewal_date && renewal_date.matches("\\d{4}\\-\\d{2}\\-\\d{2}")){
		date = Date.parse( 'yyyy-MM-dd', renewal_date);
		renewal_date = date.format( 'dd-MM-yyyy');
	}
	
	
	Properties emailSubjectProperties = new Properties();
	InputStream stream =  getClass().getResourceAsStream("/emailTemplates/emailSubject.properties");
	
	emailSubjectProperties.load(stream);
	String subject = "" ; 
	
	
	switch(templateType){
		case "ET1": emailBody = new File(getClass().getResource("/emailTemplates/ET1.html").getPath()).text; 
									subject = emailSubjectProperties.ET1subject;
									break;
		case "ET2": emailBody = new File(getClass().getResource("/emailTemplates/ET2.html").getPath()).text;
									subject = emailSubjectProperties.ET2subject;
									break;
		case "ET3": emailBody = new File(getClass().getResource("/emailTemplates/ET3.html").getPath()).text; 
									subject = emailSubjectProperties.ET3subject;
									break;
		case "ET4": emailBody = new File(getClass().getResource("/emailTemplates/ET4.html").getPath()).text;
									subject = emailSubjectProperties.ET4subject;
									break;
		case "ET5": emailBody = new File(getClass().getResource("/emailTemplates/ET5.html").getPath()).text;
									subject = emailSubjectProperties.ET5subject;
									break;
		case "ET6": emailBody = new File(getClass().getResource("/emailTemplates/ET6.html").getPath()).text;
									subject = emailSubjectProperties.ET6subject;
									break;
		case "ET7": emailBody = new File(getClass().getResource("/emailTemplates/ET7.html").getPath()).text;
									subject = emailSubjectProperties.ET7subject;
									break;
	 	default : emailBody = "error";
	 			return 	emailBody;
	}
	
	//String brand = ("UIA".equalsIgnoreCase(templateBrand.trim()))?"UIA":"Together"; // Control the branding of the template
	//String bcc = ("UIA".equalsIgnoreCase(templateBrand.trim()))?"5e7237628b@invite.trustpilot.com":"323b8b9edf@invite.trustpilot.com"; // Control the bcc of the mail
	
	if(null==brand){
		brand = "uia";
	}
	
	if(brand.equalsIgnoreCase("UIA")){
		jsonBrandTempleteData = jsonBrandData.get(0).uia;
		bcc="webquotes@uia.co.uk";
		from="noreply@uia.co.uk";
		registration_page_URL = "https://www.uia.co.uk/registeruser/";
		if(null!=addBcc && "1" == addBcc){
			bcc += ",5e7237628b@invite.trustpilot.com";
		}
		
			
	} else{
		jsonBrandTempleteData = jsonBrandData.get(0).together;
		bcc= "webquotes@uia.co.uk";
		from="noreply@togetherinsurance.co.uk";
		registration_page_URL = "https://www.togethermutualinsurance.co.uk/registeruser/";
		if(null!=addBcc && "1" == addBcc){
			bcc += ",323b8b9edf@invite.trustpilot.com";
		}
	
	}
	
	println "In groovy the bcc is "+bcc;
	
	
	if(null!= jsonBrandTempleteData){
		terms = jsonBrandTempleteData.terms; 
		customer_login_url = jsonBrandTempleteData.customer_login_url; 
		signature = jsonBrandTempleteData.signature; 
		sales_email = jsonBrandTempleteData.sales_email; 
		phone_number = jsonBrandTempleteData.phone_number; 
		company_info_email = jsonBrandTempleteData.company_info_email;
		company_name = jsonBrandTempleteData.company_name;
		company_support_email = jsonBrandTempleteData.company_support_email; 
		policy_file_url = jsonBrandTempleteData.policy_file_url;
		company_website=jsonBrandTempleteData.company_website;
		logo_path = jsonBrandTempleteData.logo_path;
		//registration_page_URL = jsonBrandTempleteData.registration_page;
	}	
	
			
		
	if(null !=company_name) {
		subject = subject.replaceAll("\\[CompanyName\\]", company_name);
	}
	
	
	message.setInvocationProperty("emailSubject" ,subject); 
	message.setInvocationProperty("bcc" ,bcc); 
	message.setInvocationProperty("from" ,from);
	
	//emailBody = emailBody.replaceAll('\\[LogoPath\\]',(brand == "UIA")?emailSubjectProperties.uialogopath : emailSubjectProperties.togetherlogopath);
	
	if(null!= logo_path){
		emailBody = emailBody.replaceAll('\\[LogoPath\\]',logo_path);
	}
	
	
	if(null !=cover_start_date) {
		emailBody = emailBody.replaceAll('%cover_start_date%',cover_start_date);
	} 
	
	if(null !=cover_start_date) {
		emailBody = emailBody.replaceAll('\\[CoverStartDate\\]',cover_start_date);
	}
	
	if(null !=cust_no) {
		emailBody = emailBody.replaceAll('\\[Customer Number\\]',cust_no);
	}
	
	if(null !=email_address) {
		emailBody = emailBody.replaceAll('\\[CustomerEmail\\]',email_address);
	}
	
	if(null !=install_first_payment) {
		emailBody = emailBody.replaceAll('\\[1stInstallment\\]',install_first_payment);
	}
	
	if(null !=install_other_payments) {
		emailBody = emailBody.replaceAll('%install_other_payments%',install_other_payments);
	} 
	
	if(null !=install_other_payments) {
		emailBody = emailBody.replaceAll('\\[InstallOtherPayments\\]',install_other_payments);
	}
	
	if(null !=instalments) {
		emailBody = emailBody.replaceAll('%instalments%',instalments);
	}
	
	if(null !=instalments) {
		emailBody = emailBody.replaceAll('\\[Installments\\]',instalments);
	}
	
	if(null !=policy_no) {
		emailBody = emailBody.replaceAll('\\[PolicyNumber]',policy_no);
	}
	
	if(null !=renewal_date) {
		emailBody = emailBody.replaceAll('\\[RenewalDate\\]',renewal_date);
	}
	
	if(null !=premium) {
		emailBody = emailBody.replaceAll('\\[Premium\\]',premium);
	}
	
	if(null !=premium) {
		emailBody = emailBody.replaceAll('\\[AnnualPremium\\]',premium);
	}
	
	if(null !=quote_valid_days) {
		emailBody = emailBody.replaceAll('\\[ValidUntil\\]',quote_valid_days);
	}
	
	if(null !=surname) {
		emailBody = emailBody.replaceAll('\\[Surname\\]',surname);
	}
	
	if(null !=title) {
		emailBody = emailBody.replaceAll('\\[Title\\]',title);
	}
	
	if(null !=v_discount) {
		emailBody = emailBody.replaceAll('%v_discount%',v_discount);
	}
	
	if(null !=company_name) {
		emailBody = emailBody.replaceAll("\\[CompanyName\\]", company_name );
	}
	
	if(null !=policy_file_url) {
		emailBody = emailBody.replaceAll("\\[PolicyFileUrl\\]", policy_file_url);
	}
	
	if(null !=company_support_email) {
		emailBody = emailBody.replaceAll("\\[CompanySupportEmail\\]", company_support_email);
	}
	
	if(null !=phone_number) {
		emailBody = emailBody.replaceAll("\\[PhoneNumber\\]", phone_number);
	}
	
	if(null !=terms) {
		emailBody = emailBody.replaceAll("\\[Terms\\]", terms);
	}
	
	if(null !=company_info_email) {
		emailBody = emailBody.replaceAll("\\[CompanyInfoEmail\\]", company_info_email);
	}
	
	if(null !=signature) {
		emailBody = emailBody.replaceAll("\\[Signature\\]", signature);
	}
	
	if(null !=customer_login_url) {
		emailBody = emailBody.replaceAll("\\[CustomerLoginUrl\\]", customer_login_url);
	} 
	
	if(null !=sales_email) {
		emailBody = emailBody.replaceAll("\\[SalesEmail\\]", sales_email);
	} 
	
	if(null !=customer_login_url) {
		emailBody = emailBody.replaceAll("\\[CompanyWebsiteLogon\\]", customer_login_url);
	} 
	
	if(null !=cover_type) {
		emailBody = emailBody.replaceAll("\\[CoverType\\]", cover_type);
	} 
	
	if(null !=company_website) {
		emailBody = emailBody.replaceAll("\\[CompanyWebsite\\]", company_website);
	}
	
	if(null !=registration_page_URL) {
		emailBody = emailBody.replaceAll("\\[RegistrationPageURL\\]", registration_page_URL);
	}
	
	
	// println "Email Body "+ emailBody;
	
	
	/*
	[Title]
	[LoginUrl]
	[ValidUntil]
	[Premier]
	[Flexi]
	[Premier Plus]
	[Signature]
	[SalesEmail]
	[PhoneNumber]
	[CompanyWebsite]
	[CompanyInfoEmail]
	[UIATerms]
	[TogetherTerms]
	[Password]
	[CompanyName]
	[CoverStartDate]
	[AnnualPremium]
	[CompanySupportEmail]
	[CompanyWebsite]
	[PolicyFileUrl]
	[CompanyWebsiteLogon]
	*/
	
}catch(Exception e){
    e.printStackTrace();
	emailBody = "error";

}

return emailBody;


 