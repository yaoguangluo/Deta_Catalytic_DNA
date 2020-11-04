package org.humanoid.tin.catalytic.procedure.pde;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//ע��: �� �ļ���Ӧ�������������� DNA ���� �� ���������  ���������� ˼��ı��� ʵ��. 
//������ �� ֪ʶ��ȨίԱ�� �Ѿ����� , ���Ķ� ��� ����Ȩ ԭ��  �����߼����.  
public class PDE_Increment_Formular {
	//A = V + S LINK ���ݽṹ���� (�򵥲���)
	//���������û�а�sonarģʽ �޸�,��Ϊ�ҵ��� sonar��Ǳ��ʶ �ı��ҵ�д��ģʽ, 
	//���� �����Һܶ����ANSI C��������б�д, ��Ϊ���ַ�ʽ���ҵĻ���. �Ҹ��˾�
	//�� һ���˵��з���������������ĸ��ˮƽ.��������C����, ��Ӧ�ü�����������츳.���������⺯��.
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
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}

	//A = V + S LIST jdk util����, ���溯����ֱ����JDK����������� ��д��,�߼��Ƚ�����, ���и����ô�.
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

	//O = E + S LINK ���ݽṹ���� (�򵥲���)
	public Initon PDE_IncrementO(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("E")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("S")) {					
						Initon initonIncrementO= new Initon();
						initonIncrementO.setO(); //����һ������A
						if(initonNext.hasNext()) {
							initonIncrementO.next= initonNext.next; //A�����滻
							initonIncrementO.next.prev= initonIncrementO;//A����ǰ����
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementO.prev= initonNext.prev.prev;//Aǰ���滻
							initonIncrementO.prev.next= initonIncrementO;//Aǰ�������
						}		
						initonLink= initonIncrementO;//���A����
					}
				}
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop ����.
		}
		return initonLink;
	}

	public Initon PDE_IncrementP(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementM(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementV(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementE(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementC(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementS(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementI(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementD(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementU(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_IncrementQ(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}

	public static void main(String[] argv) {	
	}
}