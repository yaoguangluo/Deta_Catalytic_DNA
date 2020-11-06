package org.humanoid.tin.catalytic.procedure.pde;
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class PDE_Formular {
	public static void main(String[] argv) {	
		Initon initonA= new Initon();
		initonA.setM();  // 改成  O 测试下
		Initon initonV= new Initon();
		initonV.setS();
		Initon initonS= new Initon();
		initonS.setI();
		Initon initonS1= new Initon();
		initonS1.setO();
		Initon initonS2= new Initon();
		initonS2.setC();
		Initon initonS3= new Initon();
		initonS3.setU();
		Initon initonS4= new Initon();
		initonS4.setO();
		Initon initonS5= new Initon();
		initonS5.setC();
		Initon initonS6= new Initon();
		initonS6.setI();
		Initon initonS7= new Initon();
		initonS7.setP();
		Initon initonS8= new Initon();
		initonS8.setC();
		Initon initonS9= new Initon();
		initonS9.setU();
		Initon initonS10= new Initon();
		initonS10.setP();
		Initon initonS11= new Initon();
		initonS11.setC();
		Initon initonS12= new Initon();
		initonS12.setI();

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

		initonS4.next= initonS5;
		initonS5.prev= initonS4;

		initonS5.next= initonS6;
		initonS6.prev= initonS5;

		initonS6.next= initonS7;
		initonS7.prev= initonS6;

		initonS7.next= initonS8;
		initonS8.prev= initonS7;

		initonS8.next= initonS9;
		initonS9.prev= initonS8;

		initonS9.next= initonS10;
		initonS10.prev= initonS9;

		initonS10.next= initonS11;
		initonS11.prev= initonS10;

		initonS11.next= initonS12;
		initonS12.prev= initonS11;

		PDE_Formular pDE_RNA_Formular = new PDE_Formular();
		pDE_RNA_Formular.do_PDE_RNA_Formular(initonA);
	}

	public void do_PDE_RNA_Formular(Initon initon) {	
		//初始
		Initon InitonPDE= initon;
		System.out.print("input:" + InitonPDE.getStore());
		while(InitonPDE.hasNext()) {
			InitonPDE= InitonPDE.forwardNext();
			System.out.print(InitonPDE.getStore());
		}
		System.out.println();

		System.out.println("肽展 降元");
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementA(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("降元A = V + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementO(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("降元O = E + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementP(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("降元P = E + C");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementM(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("降元M = C + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementV(initonLinkDNA);
			InitonPDE= new PDE_Decrement_Formular().PDE_DecrementE_IU(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("降元V = U + Q");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPY= InitonPDE.copyRNA(InitonPDE);
		System.out.println();
		System.out.println("1降元概率IU");
		doE_IU(InitonPDE, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPY);
		System.out.println();
		System.out.println("2降元概率DU");
		doE_DU(InitonPDE_COPY, initonLinkDNA); 


	}

	private static void doE_IU(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementE_IU(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("11降元E = I + U");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementC(initonLinkDNA);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("11降元C = I + D");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);    

		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPYSI= InitonPDE.copyRNA(InitonPDE);
		Initon InitonPDE_COPYSQ= InitonPDE.copyRNA(InitonPDE);

		System.out.println();
		String s= "1111概率S_";
		String si= "1111概率S_I_";
		String sq= "1111概率S_Q_";
		System.out.println("1111概率S");
		doS(s, InitonPDE, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPYSI);
		System.out.println();
		System.out.println("1112概率S_I");
		doS_I(si, InitonPDE_COPYSI, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPYSQ);
		System.out.println();
		System.out.println("1113概率S_Q");
		doS_Q(sq, InitonPDE_COPYSQ, initonLinkDNA); 
	}

	private static void doS_Q(String sq, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS_Q(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();

		System.out.println(sq+ "降元S = Q");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);

		//全部 收
		System.out.println();
		System.out.println(sq+ "肽展 增元");
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA= new InitonLinkDNA();
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(sq+ "V = U + Q");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPY= InitonPDE.copyRNA(InitonPDE);
		System.out.println();
		System.out.println(sq+ "概率Increment IU");
		doIncrementE_IU(sq, InitonPDE, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPY);
		System.out.println();
		System.out.println(sq+ "概率Increment DU");
		doIncrementE_DU(sq, InitonPDE_COPY, initonLinkDNA); 
	}

	private static void doS_I(String si, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS_I(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(si+ "11降元S = I");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);

		//全部 收
		System.out.println();
		System.out.println(si+ "11肽展 增元");
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA= new InitonLinkDNA();
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(si+ "11V = U + Q");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPY= InitonPDE.copyRNA(InitonPDE);
		System.out.println();
		System.out.println(si+ "111概率Increment IU");
		doIncrementE_IU(si, InitonPDE, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPY);
		System.out.println();
		System.out.println(si+ "112概率Increment DU");
		doIncrementE_DU(si, InitonPDE_COPY, initonLinkDNA); 
	}

	private static void doS(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();

		System.out.println(s+ "11降元S = I + Q");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);

		//全部 收
		System.out.println();
		System.out.println(s+ "11肽展 增元");
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA= new InitonLinkDNA();
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementV(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "11V = U + Q");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPY= InitonPDE.copyRNA(InitonPDE);
		System.out.println();
		System.out.println(s+ "111概率Increment IU");
		doIncrementE_IU(s, InitonPDE, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPY);
		System.out.println();
		System.out.println(s+ "112概率Increment DU");
		doIncrementE_DU(s, InitonPDE_COPY, initonLinkDNA); 
	}

	private static void doE_DU(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementE_DU(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("21降元E = D + U");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementC(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("21降元C = I + D");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}



		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPYSI= InitonPDE.copyRNA(InitonPDE);
		Initon InitonPDE_COPYSQ= InitonPDE.copyRNA(InitonPDE);
		String s= "2222概率S_";
		String si= "2222概率S_I_";
		String sq= "2222概率S_Q_";
		System.out.println();
		System.out.println("2111概率S");
		doS(s, InitonPDE, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPYSI);
		System.out.println();
		System.out.println("2112概率S_I");
		doS_I(si, InitonPDE_COPYSI, initonLinkDNA); 

		initonLinkDNA.setInitonLink(InitonPDE_COPYSQ);
		System.out.println();
		System.out.println("2113概率S_Q");
		doS_Q(sq, InitonPDE_COPYSQ, initonLinkDNA); 
	}



	private static void doIncrementE_DU(String sq, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementE_DU(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(sq+ "E = D + U");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementC(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(sq+ "C = I + D");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPYSI= InitonPDE.copyRNA(InitonPDE);
		Initon InitonPDE_COPYSQ= InitonPDE.copyRNA(InitonPDE);
		
		doIncrementS(sq + "EDU_IQ_", InitonPDE, initonLinkDNA);
		doIncrementS_I(sq + "EDU_I_", InitonPDE_COPYSI, initonLinkDNA);
		doIncrementS_Q(sq + "EDU_Q_", InitonPDE_COPYSQ, initonLinkDNA);
	}

	private static void doIncrementE_IU(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementE_IU(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "E = I + U");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementC(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "C = I + D");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		Initon InitonPDE_COPYSI= InitonPDE.copyRNA(InitonPDE);
		Initon InitonPDE_COPYSQ= InitonPDE.copyRNA(InitonPDE);
		
		doIncrementS(s + "EIU_IQ_", InitonPDE, initonLinkDNA);
		doIncrementS_I(s + "EIU_I_", InitonPDE_COPYSI, initonLinkDNA);
		doIncrementS_Q(s + "EIU_Q_", InitonPDE_COPYSQ, initonLinkDNA);
	}
	private static void doIncrementS_Q(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS_Q(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "S = Q");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementA(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "A = V + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementO(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "O = E + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementP(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "P = E + C");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementM(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "M = C + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
	}

	private static void doIncrementS_I(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS_I(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "S = I");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementA(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "A = V + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementO(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "O = E + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementP(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "P = E + C");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementM(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "M = C + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
	}

	private static void doIncrementS(String s, Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "S = I + Q");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementA(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "A = V + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementO(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "O = E + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementP(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "P = E + C");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementM(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println(s+ "M = C + S");
		while(InitonPDE.hasNext()) {
			System.out.print(InitonPDE.getStore());
			InitonPDE= InitonPDE.forwardNext();
		}
		System.out.print(InitonPDE.getStore());
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		initonLinkDNA.setInitonLink(InitonPDE);
	}
	
	public static void doE_IU(String[] argv) {	

	}
}