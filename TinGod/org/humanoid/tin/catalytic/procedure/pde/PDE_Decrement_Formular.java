package org.humanoid.tin.catalytic.procedure.pde;
//ע��: �� �ļ���Ӧ�������������� DNA ���� �� ���������  ���������� ˼��ı��� ʵ��. 
//������ �� ֪ʶ��ȨίԱ�� �Ѿ����� , ���Ķ� ��� ����Ȩ ԭ��  �����߼����.  
public class PDE_Decrement_Formular {
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
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementO(initonLinkDNA);
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

		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementA(initonLinkDNA);
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