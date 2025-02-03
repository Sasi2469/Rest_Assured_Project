package org.restti;

public class PayLoad {

	public static String createIssue() {
		
		String body = "{\r\n" + 
				"    \"fields\": {\r\n" + 
				"       \"project\":\r\n" + 
				"       {\r\n" + 
				"          \"key\": \"KAN\"\r\n" + 
				"       },\r\n" + 
				"       \"summary\": \"Update link not clickable\",\r\n" + 
				"       \"description\": \"debugging the update link in login page using RestAPI\",\r\n" + 
				"       \"issuetype\": {\r\n" + 
				"          \"name\": \"Bug\"\r\n" + 
				"       }\r\n" + 
				"   }\r\n" + 
				"}" ;
		return body ;
		

	}
	
	
	public static  String putIssue() {
		String body = "{\r\n" + 
				"    \"fields\" : {\r\n" + 
				"        \"summary\": \"creatig bug in login\",\r\n" + 
				"        \"description\": \"Description\"\r\n" + 
				"       \r\n" + 
				"    }\r\n" + 
				"}" ;
		return body ;

	}
	
	
	      public static String createUser() {
			String body = "{\r\n" + 
					"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
					"    \"password\": \"pistol\"\r\n" + 
					"}" ;
			return body;
		}
	
	      
	      public static String updateUser() {
			String body = "{\r\n" + 
					"    \"name\": \"morpheus\",\r\n" + 
					"    \"job\": \"zion resident\"\r\n" + 
					"}" ;
			return body;

		}
	
}
