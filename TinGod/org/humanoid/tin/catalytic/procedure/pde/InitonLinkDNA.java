package org.humanoid.tin.catalytic.procedure.pde;

import java.util.List;

public class InitonLinkDNA {
	private Initon initonLink;
	private List<Initon> initonList;
	
	public void addNextIniton(Initon initon) {
		initonLink= initonLink.addNextInitons(initon);
		initonList.add(initon);
	}
	public void addPrevIniton(Initon initon) {
		initonLink= initonLink.addPrevInitons(initon);
		initonList.add(0, initon);
	}
	public Initon getInitonLink() {
		// TODO Auto-generated method stub
		return initonLink;
	}
}