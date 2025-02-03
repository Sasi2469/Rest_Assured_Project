package org.properties_logfile;

public class PayLoad2 {

	
	
	public static String creatIssue() {
	
		String body = "{\r\n" + 
				"  \"fields\": {\r\n" + 
				"    \"project\": {\r\n" + 
				"      \"key\": \"KAN\"\r\n" + 
				"    },\r\n" + 
				"    \"summary\": \"List button not clicking\",\r\n" + 
				"    \"description\": \"list button after clicking cant load full page of the list page\",\r\n" + 
				"    \"issuetype\": {\r\n" + 
				"      \"name\": \"Bug\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}" ;
		return body;
	}
	
	public static CreatIssue3 createIssue2() {
	         IssueType i = new IssueType();
	         i.setName("Bug");
	         
	         Project p = new Project();
	         p.setKey("KAN");
           Fields f = new Fields();
              f.setDescription("list button after clicking cant load full page of the list page");
             f.setSummary("List button not clicking");
             f.setProject(p);
             f.setIssuetype(i);
             CreatIssue3 c = new CreatIssue3();
             c.setFields(f);
			return c;
  }
	
	
	
	
	
	    
}
