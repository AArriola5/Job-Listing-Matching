//Adrian Arriola

package joblisting;

public class Skill {
	String experienceDesc;
	int yearsOfExp;
	
	Skill() {}	
	Skill(String _experienceDesc, int _yearsOfExp) {
		this.experienceDesc = _experienceDesc;
		this.yearsOfExp = _yearsOfExp;
	}
	
	//I made sure to make a getter and setter for all variables just in case
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public String getExperienceDesc() {
		return experienceDesc;
	}
	public void setYearsOfExp(int _yearsOfExp) {
		yearsOfExp = _yearsOfExp;
	}
	public void setExperienceDesc(String _experienceDesc) {
		experienceDesc = _experienceDesc;
	}
	
	
}
