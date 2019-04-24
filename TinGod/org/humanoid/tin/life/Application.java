package org.humanoid.tin.life;

import java.util.concurrent.ConcurrentHashMap;

import org.humanoid.tin.dna.processor.Family;
import org.humanoid.tin.dna.processor.Life;
import org.humanoid.tin.dna.processor.Race;
import org.humanoid.tin.life.CreativeIssues;
import org.humanoid.tin.life.HelpIssues;
import org.humanoid.tin.life.LoveIssues;
import org.humanoid.tin.life.SafeIssues;
import org.humanoid.tin.life.StudyIssues;
import org.humanoid.tin.life.WorkIssues;

public class Application extends Thread {
	public String read;
	boolean isSleep= true;
	public void run() {
		isSleep= false;
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
		LoveIssues loveIssues= new LoveIssues();
		StudyIssues studyIssues= new StudyIssues();
		HelpIssues helpIssues= new HelpIssues();
		SafeIssues safeIssues= new SafeIssues();
		WorkIssues workIssues= new WorkIssues();
		CreativeIssues creativeIssues= new CreativeIssues();
		//loop the Hello World.
		while(true) {
			try {
				isSleep= wakeUp();
				if(!isSleep) {
					//love issues
					loveIssues.philosothon(read);
					//study issues
					studyIssues.philosothon(read);
					//help issues
					helpIssues.philosothon(read);
					//work issues
					workIssues.philosothon(read);
					//creative issues
					creativeIssues.philosothon(read);
					//safe issues
					safeIssues.philosothon(read);
					read= null;
					isSleep= true;
				}	 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private boolean wakeUp() throws InterruptedException {
		while(null== read) {
			Thread.sleep(100);
		}
		System.out.println("Tin God at here!");
		return false;
	}
	
	public static void main(String[] argv) throws InterruptedException {
		Application application= new Application();
		application.run();
	}
}