//Adrian Arriola

package joblisting;

public class Resume {
	String firstName, lastName;
	Skill resumeSkills = new Skill();
	
	Resume(){}
	Resume(String _firstName, String _lastName, String _experienceDesc, int _yearsOfExp){
		this.firstName = _firstName;
		this.lastName = _lastName;
		this.resumeSkills.setExperienceDesc(_experienceDesc);
		this.resumeSkills.setYearsOfExp(_yearsOfExp);
	}
	
	//I had to create a new Skill because it would read from the Skill class as null.
	public String getFirstName() {
		return firstName;
	}	
	public String getLastName() {
		return lastName;
	}	
	public int getYearsOfExp() {
		return this.resumeSkills.getYearsOfExp();
	}
	public String getExperienceDesc() {
		return this.resumeSkills.getExperienceDesc();
	}
	
	//Formatted this so it is separated for easier reading.
	public void loadResume(String fname) {
		if (fname.equals(firstName)) {
			System.out.println("----------------------\n" + "First Name: " + firstName 
					+ "\n Last Name: " + lastName
					+ "\n Job Experience: " + this.resumeSkills.getExperienceDesc()
					+ "\n Years of Experience: " + this.resumeSkills.getYearsOfExp() + "\n");
		}
	}
}
