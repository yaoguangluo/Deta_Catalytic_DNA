package org.humanoid.tin.life;

import java.util.concurrent.ConcurrentHashMap;

import org.humanoid.tin.life.CreativeIssues;
import org.humanoid.tin.life.HelpIssues;
import org.humanoid.tin.life.LoveIssues;
import org.humanoid.tin.life.SafeIssues;
import org.humanoid.tin.life.StudyIssues;
import org.humanoid.tin.life.WorkIssues;

import DNAProcessor.Family;
import DNAProcessor.Life;
import DNAProcessor.Race;

public class Application{
	public static void main(String[] argv) {
		Life life= new Life();
		life.born();
		//register family
		Family family= new Family();
		ConcurrentHashMap<String, Life> familyLife= new ConcurrentHashMap<>();
		familyLife.put("Tin", life);
		family.setFamily(familyLife);
		//register race
		Race race= new Race();
		ConcurrentHashMap<String, Family> raceFamily= new ConcurrentHashMap<>();
		raceFamily.put("Royal", family);
		race.setRace(raceFamily);
		//init analysis
		LoveIssues loveIssues=new LoveIssues();
		StudyIssues studyIssues=new StudyIssues();
		HelpIssues helpIssues=new HelpIssues();
		SafeIssues safeIssues=new SafeIssues();
		WorkIssues workIssues=new WorkIssues();
		CreativeIssues creativeIssues=new CreativeIssues();
		//loop the Hello World.
		while(true) {
			//love issues
			loveIssues.philosothon();
			//study issues
			studyIssues.philosothon();
			//help issues
			helpIssues.philosothon();
			//work issues
			workIssues.philosothon();
			//creative issues
			creativeIssues.philosothon();
			//safe issues
			safeIssues.philosothon();
		}
	}
}