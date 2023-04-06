//Adrian Arriola

package joblisting;

public class Opening {
	String companyName, jobTitle;
	Skill requiredSkills = new Skill();
	
	Opening(){}
	Opening(String _companyName, String _jobTitle, String _experienceDesc, int _yearsOfExp){
		this.companyName = _companyName;
		this.jobTitle = _jobTitle;
		this.requiredSkills.setExperienceDesc(_experienceDesc);
		this.requiredSkills.setYearsOfExp(_yearsOfExp);
	}
	
	//Overall this class is the same as Resume, except that we're given company information rather than people information
	
	public String getCompanyName() {
		return companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public int getYearsOfExp() {
		return this.requiredSkills.getYearsOfExp();
	}
	public String getExperienceDesc() {
		return this.requiredSkills.getExperienceDesc();
	}
	public void loadOpenings() {
		System.out.println("Company Name: " + companyName 
				+ "\n Job Title: " + jobTitle
				+ "\n Experience required: " + this.requiredSkills.getExperienceDesc()
				+ "\n Years of Experience: " + this.requiredSkills.getYearsOfExp() + "\n");
	}
}
