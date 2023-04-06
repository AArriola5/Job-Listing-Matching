//Adrian Arriola

package joblisting;

import java.util.ArrayList;
import java.util.List;

public class Match {
	public static void main(String[] args) {
		List<Opening> jobOpenings = new ArrayList<>();
		List<Resume> jobApplicants = new ArrayList<>();
		
		//Pushing new Openings and Resumes for testing purposes, but I could add an "add" function for these with user input.
		jobOpenings.add(new Opening("Bob's Sandwiches", "Sandwich Maker", "Cooking", 2));
		jobOpenings.add(new Opening("Pixel", "AI Photographs", "Coding", 4));
		jobOpenings.add(new Opening("HD Cinemas", "Box Office", "Communication", 1));
		jobOpenings.add(new Opening("Stoneworks", "Game Studio", "Coding", 6));
		
		jobApplicants.add(new Resume("Andrew", "Ortega", "Coding", 8));
		jobApplicants.add(new Resume("Bella", "Yu", "Communication", 2));
		jobApplicants.add(new Resume("Tyler", "Myrvin", "Cooking", 1));
		
		//2 way counter: 1 for Job Resumes and 1 for Job Openings. Compare the job's experience description with both the Applicants and Openings as well as years of experience.
		for(int i = 0; i < jobApplicants.size(); i++) {
			jobApplicants.get(i).loadResume(jobApplicants.get(i).firstName);
			for(int j = 0; j < jobOpenings.size(); j++) {
				if (jobApplicants.get(i).getYearsOfExp() >= jobOpenings.get(j).getYearsOfExp() && jobApplicants.get(i).getExperienceDesc().equals(jobOpenings.get(j).getExperienceDesc())) {
					jobOpenings.get(j).loadOpenings();
				}
			}
		}
	}
}
