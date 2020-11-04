package org.humanoid.tin.catalytic.procedure.pde;
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class PDE_Decrement_Formular {
	//A = V + S LINK 数据结构对象 (简单测试)
	//作用发现有A 的initon进行VPCS级展开. 按我在 印度 ANSI C代码风格进行编写方式.
	public Initon PDE_DecrementA(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("A")) {
				Initon initonIncrementV= new Initon();
				initonIncrementV.setV(); //新增一个数据V
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //新增一个数据S

				initonIncrementV.next= initonIncrementS;  //V初始
				initonIncrementV.prev= initonLink.prev;
				if(null!= initonIncrementV.prev) {
					initonIncrementV.prev.next= initonIncrementV;
				}

				initonIncrementS.prev= initonIncrementV;  //S初始
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) { 
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//最后S代替
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop 替增.
		}
		return initonLink;
	}

	//O = E + S LINK 数据结构对象 (简单测试)
	public Initon PDE_DecrementO(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("O")) {
				Initon initonIncrementE= new Initon();
				initonIncrementE.setE(); //新增一个数据V
				Initon initonIncrementS= new Initon();
				initonIncrementS.setS(); //新增一个数据S

				initonIncrementE.next= initonIncrementS;  //V初始
				initonIncrementE.prev= initonLink.prev;
				if(null!= initonIncrementE.prev) {
					initonIncrementE.prev.next= initonIncrementE;
				}

				initonIncrementS.prev= initonIncrementE;  //S初始
				initonIncrementS.next= initonLink.next;
				if(null!= initonIncrementS.next) {
					initonIncrementS.next.prev= initonIncrementS;
				}
				initonLink= initonIncrementS;//最后S代替
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop 替增.
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
		//		//初始
		//		Initon initonV= new Initon();
		//		initonV.setE(); // 模拟 将EVS 改成 VES 邻居 做O 合成.
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
		//        //赋值
		//		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		//		initonLinkDNA.setInitonLink(initonE);
		//		//肽展计算
		//		InitonPDE= new PDE_Formular().PDE_IncrementO(initonLinkDNA);
		//		//整理
		//		while(InitonPDE.hasPrev()) {
		//			InitonPDE= InitonPDE.forwardPrev();
		//		}
		//		//打印
		//		System.out.print("output:" + InitonPDE.getStore());
		//		while(InitonPDE.hasNext()) {
		//			InitonPDE= InitonPDE.forwardNext();
		//			System.out.print(InitonPDE.getStore());
		//		}

		//初始
		Initon initonV= new Initon();
		initonV.setV();
		Initon initonA= new Initon();
		initonA.setO();   //改成  O 测试下
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
		//赋值
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		initonLinkDNA.setInitonLink(initonA);
		//肽展计算
		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementO(initonLinkDNA);
		//整理
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//打印
		System.out.print("output:" + InitonPDE.getStore());
		while(InitonPDE.hasNext()) {
			InitonPDE= InitonPDE.forwardNext();
			System.out.print(InitonPDE.getStore());
		}

		InitonPDE= new PDE_Decrement_Formular().PDE_DecrementA(initonLinkDNA);
		//整理
		while(InitonPDE.hasPrev()) {
			InitonPDE= InitonPDE.forwardPrev();
		}
		//打印
		System.out.print("output:" + InitonPDE.getStore());
		while(InitonPDE.hasNext()) {
			InitonPDE= InitonPDE.forwardNext();
			System.out.print(InitonPDE.getStore());
		}
	}
}