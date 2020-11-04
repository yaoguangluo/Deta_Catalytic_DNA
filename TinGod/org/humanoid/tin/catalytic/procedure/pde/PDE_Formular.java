package org.humanoid.tin.catalytic.procedure.pde;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//ע��: �� �ļ���Ӧ�������������� DNA ���� �� ���������  ���������� ˼��ı��� ʵ��. 
//������ �� ֪ʶ��ȨίԱ�� �Ѿ����� , ���Ķ� ��� ����Ȩ ԭ��  �����߼����.  
public class PDE_Formular {
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

	//A = V + S LINK ���ݽṹ���� (�򵥲���)
	//���÷�����A ��initon����VPCS��չ��. ������ ӡ�� ANSI C��������б�д��ʽ.
	public Initon PDE_DecrementA(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("A")) {
				Initon initonIncrementV= new Initon();
				initonIncrementV.setV(); //����һ������V
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //����һ������S
				
				initonIncrementV.next= initonIncrementS;  //V��ʼ
				initonIncrementV.prev= initonLink.prev;
				if(null!= initonIncrementV.prev) {
					initonIncrementV.prev.next= initonIncrementV;
				}
				
				initonIncrementS.prev= initonIncrementV;  //S��ʼ
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementV.next) {
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//���S����
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
	
	public static void main(String[] argv) {	
//		//��ʼ
//		Initon initonV= new Initon();
//		initonV.setV();
//		Initon initonE= new Initon();
//		initonE.setE();
//		Initon initonS= new Initon();
//		initonS.setS();
//
//		initonE.next= initonV;
//		initonV.prev= initonE;
//		initonV.next= initonS;
//		initonS.prev= initonV;
//		Initon InitonPDE= initonE;
//		System.out.print("input:" + InitonPDE.getStore());
//		while(InitonPDE.hasNext()) {
//			InitonPDE= InitonPDE.forwardNext();
//			System.out.print(InitonPDE.getStore());
//		}
//		System.out.println();
//        //��ֵ
//		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
//		initonLinkDNA.setInitonLink(initonE);
//		//��չ����
//		InitonPDE= new PDE_Formular().PDE_IncrementA(initonLinkDNA);
//		//����
//		while(InitonPDE.hasPrev()) {
//			InitonPDE= InitonPDE.forwardPrev();
//		}
//		//��ӡ
//		System.out.print("output:" + InitonPDE.getStore());
//		while(InitonPDE.hasNext()) {
//			InitonPDE= InitonPDE.forwardNext();
//			System.out.print(InitonPDE.getStore());
//		}
		
		//��ʼ
				Initon initonV= new Initon();
				initonV.setV();
				Initon initonA= new Initon();
				initonA.setA();
				Initon initonS= new Initon();
				initonS.setS();

				initonA.next= initonV;
				initonV.prev= initonA;
				initonV.next= initonS;
				initonS.prev= initonV;
				Initon InitonPDE= initonA;
				System.out.print("input:" + InitonPDE.getStore());
				while(InitonPDE.hasNext()) {
					InitonPDE= InitonPDE.forwardNext();
					System.out.print(InitonPDE.getStore());
				}
				System.out.println();
		        //��ֵ
				InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
				initonLinkDNA.setInitonLink(initonA);
				//��չ����
				InitonPDE= new PDE_Formular().PDE_DecrementA(initonLinkDNA);
				//����
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				//��ӡ
				System.out.print("output:" + InitonPDE.getStore());
				while(InitonPDE.hasNext()) {
					InitonPDE= InitonPDE.forwardNext();
					System.out.print(InitonPDE.getStore());
				}
	}
}