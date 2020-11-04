package org.humanoid.tin.catalytic.procedure.pde;
@SuppressWarnings("unused")
public class Initon {
	private String store;
	public Initon prev;
	public Initon next;
	public String getStore() {
		return store;
	}

	public Initon addNextInitons(Initon initon) {
		Initon thisIniton= this;
		while(null!= thisIniton.next) {
			thisIniton= thisIniton.next;
		}
		thisIniton.next= initon;
		return thisIniton;
	}

	public Initon addPrevInitons(Initon initon) {
		Initon thisIniton= this;
		while(null!= thisIniton.prev) {
			thisIniton= thisIniton.prev;
		}
		thisIniton.prev= initon;
		return thisIniton;
	}

	public void setA() {
		this.store= "A";
	}
	public void setO() {
		this.store= "O";
	}
	public void setP() {
		this.store= "P";
	}
	public void setM() {
		this.store= "M";
	}
	public void setV() {
		this.store= "V";
	}
	public void setE() {
		this.store= "E";
	}
	public void setC() {
		this.store= "C";
	}
	public void setS() {
		this.store= "S";
	}
	public void setI() {
		this.store= "I";
	}
	public void setD() {
		this.store= "D";
	}
	public void setU() {
		this.store= "U";
	}
	public void setQ() {
		this.store= "Q";
	}

	public boolean hasNext() {
		if(null!= this.next) {
			return true;
		}
		return false;
	}

	public Initon forwardNext() {
		return this.next;
	}

	public boolean hasPrev() {
		if(null!= this.prev) {
			return true;
		}
		return false;
	}

	public Initon forwardPrev() {
		return this.prev;
	}
}