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
				if(null!= initonIncrementS.next) { 
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

	//O = E + S LINK ���ݽṹ���� (�򵥲���)
	public Initon PDE_DecrementO(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("O")) {
				Initon initonIncrementE= new Initon();
				initonIncrementE.setE(); //����һ������V
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //����һ������S

				initonIncrementE.next= initonIncrementS;  //V��ʼ
				initonIncrementE.prev= initonLink.prev;
				if(null!= initonIncrementE.prev) {
					initonIncrementE.prev.next= initonIncrementE;
				}

				initonIncrementS.prev= initonIncrementE;  //S��ʼ
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) {
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
	
	public Initon PDE_DecrementP(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementM(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementV(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementE(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementC(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementS(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementI(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementD(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementU(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	public Initon PDE_DecrementQ(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		return initonLink;
	}
	
	
	
	public static void main(String[] argv) {	
//		//��ʼ
//		Initon initonV= new Initon();
//		initonV.setE(); // ģ�� ��EVS �ĳ� VES �ھ� ��O �ϳ�.
//		Initon initonE= new Initon();
//		initonE.setV(); //
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
//		InitonPDE= new PDE_Formular().PDE_IncrementO(initonLinkDNA);
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
				initonA.setO();   //�ĳ�  O ������
				Initon initonS= new Initon();
				initonS.setA();
				Initon initonS1= new Initon();
				initonS1.setE();
				Initon initonS2= new Initon();
				initonS2.setS();
				Initon initonS3= new Initon();
				initonS3.setV();
				Initon initonS4= new Initon();
				initonS4.setS();

				initonA.next= initonV;
				initonV.prev= initonA;
				initonV.next= initonS;
				initonS.prev= initonV;
				initonS.next= initonS1;
				initonS1.prev= initonS;
				
				initonS.next= initonS1;
				initonS1.prev= initonS;
				
				initonS1.next= initonS2;
				initonS2.prev= initonS1;
				
				initonS2.next= initonS3;
				initonS3.prev= initonS2;
				
				initonS3.next= initonS4;
				initonS4.prev= initonS3;
				
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
				InitonPDE= new PDE_Formular().PDE_DecrementO(initonLinkDNA);
				//����
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				//��ӡ
				System.out.print("output O=ES:" + InitonPDE.getStore());
				while(InitonPDE.hasNext()) {
					InitonPDE= InitonPDE.forwardNext();
					System.out.print(InitonPDE.getStore());
				}
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				
				initonLinkDNA.setInitonLink(InitonPDE);
				InitonPDE= new PDE_Formular().PDE_DecrementA(initonLinkDNA);
				//����
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				//��ӡ
				System.out.println();
				System.out.print("output A=VS:" + InitonPDE.getStore());
				while(InitonPDE.hasNext()) {
					InitonPDE= InitonPDE.forwardNext();
					System.out.print(InitonPDE.getStore());
				}
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				
				
				initonLinkDNA.setInitonLink(InitonPDE);
				InitonPDE= new PDE_Formular().PDE_IncrementA(initonLinkDNA);
				//����
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				//��ӡ
				System.out.println();
				System.out.print("output VS=A:" + InitonPDE.getStore());
				while(InitonPDE.hasNext()) {
					InitonPDE= InitonPDE.forwardNext();
					System.out.print(InitonPDE.getStore());
				}
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				
					
				initonLinkDNA.setInitonLink(InitonPDE);
				InitonPDE= new PDE_Formular().PDE_IncrementO(initonLinkDNA);
				//����
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				//��ӡ
				System.out.println();
				System.out.print("output ES=O:" + InitonPDE.getStore());
				while(InitonPDE.hasNext()) {
					InitonPDE= InitonPDE.forwardNext();
					System.out.print(InitonPDE.getStore());
				}
	}
}