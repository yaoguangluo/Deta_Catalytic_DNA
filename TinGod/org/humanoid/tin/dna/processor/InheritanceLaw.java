package org.humanoid.tin.dna.processor;

import DNAProcessor.DatingLaw;
import DNAProcessor.MutationLaw;
import DNAProcessor.RST;

public class InheritanceLaw{
	public RST inheritance(RST father, RST mother) {
		RST son= new RST();
		//random
		if(Math.random()> 0.997) {
			son=new MutationLaw().mutation(father, mother);
		}else {
			son=new DatingLaw().dating(father, mother);
		}
		return son;
	}
}