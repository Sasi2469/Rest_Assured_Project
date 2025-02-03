package org.deserialize;

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
	      
	      public static WriteIssue updateUser1() {
	    	  
	    	  WriteIssue w = new WriteIssue();
	    	  
	    	  w.setJob("leader");
	    	  w.setName("morpheus");
			return w;
	    	  
	    	  
	      }
	      
	      public static PutDetails putUser() {
	    	  PutDetails p = new PutDetails();
	    	  
	    	  p.setJob("zion resident");
	    	  p.setName("morpheus");
			return p;
	      }
	
	      
	      public static CreateNewIssue2 createIssue1() {
			
	    	  Project project = new Project();
	    	  project.setKey("KAN");
	    	  
	    	  IssueType ip = new IssueType();
	    	  ip.setName("Bug");
	    	  
	    	  Fields f = new Fields();
	    	  f.setProject(project);
              f.setIssuetype(ip);
              f.setDescription("Forget Password button issue on the ui screen");
              f.setSummary("Forget password button not responding");
              
              CreateNewIssue2 cr = new CreateNewIssue2();
              cr.setFields(f);
			return cr;
		}
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
}
