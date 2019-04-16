package org.humanoid.tin.life;

import java.util.concurrent.ConcurrentHashMap;

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
		//loop the Hello World.
		while(true) {
			//love issues
			//study issues
			//help issues
			//work issues
			//creative issues
			//safe issues
		}
	}
}