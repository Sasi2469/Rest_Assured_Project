package org.properties_logfile;

public class Fields {

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String summary;
	
	private String description;
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public IssueType getIssuetype() {
		return issuetype;
	}

	public void setIssuetype(IssueType issuetype) {
		this.issuetype = issuetype;
	}

	private Project project ;
	
	private IssueType issuetype;
	
}
