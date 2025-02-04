package org.desum;

public class PayLoad {
	
	public static String createIssue8() {
		
		String body ="{\r\n" + 
				"    \"fields\": {\r\n" + 
				"       \"project\":\r\n" + 
				"       {\r\n" + 
				"          \"key\": \"KAN\"\r\n" + 
				"       },\r\n" + 
				"       \"summary\": \"LoginPage button issue\",\r\n" + 
				"       \"description\": \"Clicking login page button not going to login page\",\r\n" + 
				"       \"issuetype\": {\r\n" + 
				"          \"name\": \"Bug\"\r\n" + 
				"       }\r\n" + 
				"   }\r\n" + 
				"}";
		return body;

	}
	
	public static  String updateIssue() {
		String body = "{\r\n" + 
				"    \"fields\" : {\r\n" + 
				"        \"summary\": \"creatig bug in login\",\r\n" + 
				"        \"description\": \"Description\"\r\n" + 
				"       \r\n" + 
				"    }\r\n" + 
				"}" ;
		return body ;

	}
	
	public static CreateNewIssue7 createNewIssue(String description, String summary) {
		
		Project projects = new Project();
		projects.setKey("KAN");
		Issuetype issue = new Issuetype(); 
		issue.setName("Bug");
		
		
		
		Fields fiel = new Fields();
		fiel.setProject(projects);
		fiel.setIssuetype(issue);
		fiel.setDescription(description);
		fiel.setSummary(summary);
		
		CreateNewIssue7 postIssue = new CreateNewIssue7();
		postIssue.setFields(fiel);
		return postIssue;
	}

}
