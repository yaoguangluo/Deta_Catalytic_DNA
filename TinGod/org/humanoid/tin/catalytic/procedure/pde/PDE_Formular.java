package org.humanoid.tin.catalytic.procedure.pde;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//ע��: �� �ļ���Ӧ�������������� DNA ���� �� ���������  ���������� ˼��ı��� ʵ��. 
//������ �� ֪ʶ��ȨίԱ�� �Ѿ����� , ���Ķ� ��� ����Ȩ ԭ��  �����߼����.  
public class PDE_Formular {
	//A = V + S LINK ���ݽṹ���� (δ����)
	public Initon PDE_IncrementA(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("V")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("S")) {					
						Initon initonIncrementA= new Initon();
						initonIncrementA.setA(); //����һ������A
						if(initonNext.hasNext()) {
							initonIncrementA.next= initonNext.next; //A�����滻
							initonIncrementA.next.prev= initonIncrementA;//A����ǰ����
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementA.prev= initonNext.prev.prev;//Aǰ���滻
							initonIncrementA.prev.next= initonIncrementA;//Aǰ�������
						}		
						initonLink= initonIncrementA;//���A����
					}
				}
			}
		}
		return initonLink;
	}
	
	//A = V + S LIST jdk util���� 
	public List<Initon> PDE_IncrementA(List<Initon> Initons) {
		List<Initon> output= new CopyOnWriteArrayList<>(); 
		Iterator<Initon> iterator= Initons.iterator();
		HERE:
		while(iterator.hasNext()) {
			Initon initon= iterator.next();
			if(initon.getStore().equalsIgnoreCase("V")) {
				if(iterator.hasNext()) {
					Initon initonNext= iterator.next();
					if(initonNext.getStore().equalsIgnoreCase("S")) {
						Initon initonIncrementA= new Initon();
						initonIncrementA.setA();
						output.add(initonIncrementA);
						continue HERE;
					}
					Initon initonIncrementV= new Initon();
					initonIncrementV.setV();
					Initon initonIncrementS= new Initon();
					initonIncrementS.setS();
					output.add(initonIncrementV);
					output.add(initonIncrementS);
					continue HERE;
				}
				Initon initonIncrementV= new Initon();
				initonIncrementV.setV();
				output.add(initonIncrementV);
				continue HERE;
			}
			output.add(initon);
		}
		return output;
	}
	//O = E + S
	public void PDE_IncrementO(List<Initon> Initons) {
	}
	public void PDE_IncrementP(List<Initon> Initons) {
	}
	public void PDE_IncrementM(List<Initon> Initons) {
	}
	public void PDE_IncrementV(List<Initon> Initons) {
	}
	public void PDE_IncrementE(List<Initon> Initons) {
	}
	public void PDE_IncrementC(List<Initon> Initons) {
	}
	public void PDE_IncrementS(List<Initon> Initons) {
	}
	public void PDE_IncrementI(List<Initon> Initons) {
	}
	public void PDE_IncrementD(List<Initon> Initons) {
	}
	public void PDE_IncrementU(List<Initon> Initons) {
	}
	public void PDE_IncrementQ(List<Initon> Initons) {
	}
}