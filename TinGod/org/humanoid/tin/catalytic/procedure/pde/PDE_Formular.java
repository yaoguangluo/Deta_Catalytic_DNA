package org.humanoid.tin.catalytic.procedure.pde;
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class PDE_Formular {
	public static void main(String[] argv) {	
		//初始
				Initon initonV= new Initon();
				initonV.setM();
				Initon initonA= new Initon();
				initonA.setO();   //改成  O 测试下
				Initon initonS= new Initon();
				initonS.setA();
				Initon initonS1= new Initon();
				initonS1.setE();
				Initon initonS2= new Initon();
				initonS2.setP();
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
			//	InitonPDE= new PDE_Decrement_Formular().PDE_DecrementE_IU(initonLinkDNA);
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
		//InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS(initonLinkDNA);
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
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS_Q(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("11降元S = Q");
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
		System.out.println("11肽展 增元");
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
		System.out.println("11V = U + Q");
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
		System.out.println("111概率Increment IU");
	    doIncrementE_IU(InitonPDE, initonLinkDNA); 
	    
	    initonLinkDNA.setInitonLink(InitonPDE_COPY);
		System.out.println();
	    System.out.println("112概率Increment DU");
	    doIncrementE_DU(InitonPDE_COPY, initonLinkDNA); 
	}

	private static void doS_Q(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
				initonLinkDNA.setInitonLink(InitonPDE);
				InitonPDE= new PDE_Increment_Formular().PDE_IncrementS_Q(initonLinkDNA);
				while(InitonPDE.hasPrev()) {
					InitonPDE= InitonPDE.forwardPrev();
				}
				System.out.println();
				System.out.println("S = Q");
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
				System.out.println("A = V + S");
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
				System.out.println("O = E + S");
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
				System.out.println("P = E + C");
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
				System.out.println("M = C + S");
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

	private static void doS_I(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS_I(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("S = I");
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
		System.out.println("A = V + S");
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
		System.out.println("O = E + S");
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
		System.out.println("P = E + C");
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
		System.out.println("M = C + S");
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

	private static void doS(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementS(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("S = I + Q");
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
		System.out.println("A = V + S");
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
		System.out.println("O = E + S");
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
		System.out.println("P = E + C");
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
		System.out.println("M = C + S");
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
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementS(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("21降元S = I + Q");
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
		System.out.println("21肽展 增元");
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
		System.out.println("21V = U + Q");
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
		System.out.println("211概率Increment IU");
	    doIncrementE_IU(InitonPDE, initonLinkDNA); 
	    
	    initonLinkDNA.setInitonLink(InitonPDE_COPY);
		System.out.println();
	    System.out.println("212概率Increment DU");
	    doIncrementE_DU(InitonPDE_COPY, initonLinkDNA); 
	}
	
	
	
	private static void doIncrementE_DU(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementE_DU(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("E = D + U");
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
		System.out.println("C = I + D");
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
		System.out.println();
		System.out.println("S = I + Q");
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
		System.out.println("A = V + S");
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
		System.out.println("O = E + S");
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
		System.out.println("P = E + C");
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
		System.out.println("M = C + S");
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

	private static void doIncrementE_IU(Initon InitonPDE, InitonLinkDNA initonLinkDNA) {
		initonLinkDNA.setInitonLink(InitonPDE);
		InitonPDE= new PDE_Increment_Formular().PDE_IncrementE_IU(initonLinkDNA);
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		System.out.println();
		System.out.println("E = I + U");
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
		System.out.println("C = I + D");
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
		System.out.println();
		System.out.println("S = I + Q");
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
		System.out.println("A = V + S");
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
		System.out.println("O = E + S");
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
		System.out.println("P = E + C");
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
		System.out.println("M = C + S");
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