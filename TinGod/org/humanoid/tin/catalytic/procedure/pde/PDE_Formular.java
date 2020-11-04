package org.humanoid.tin.catalytic.procedure.pde;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class PDE_Formular {
	//A = V + S LINK 数据结构对象 (简单测试)
	//这个函数我没有按sonar模式 修改,因为我担心 sonar会潜意识 改变我的写作模式, 
	//于是 按照我很多年的ANSI C代码风格进行编写, 因为这种方式是我的基础. 我个人觉
	//得 一个人的研发能力来自于他的母语水平.所以我是C基础, 我应该继续跟进这个天赋.正如下面这函数.
	public Initon PDE_IncrementA(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("V")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("S")) {					
						Initon initonIncrementA= new Initon();
						initonIncrementA.setA(); //新增一个数据A
						if(initonNext.hasNext()) {
							initonIncrementA.next= initonNext.next; //A后序替换
							initonIncrementA.next.prev= initonIncrementA;//A后序前序恒等
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementA.prev= initonNext.prev.prev;//A前序替换
							initonIncrementA.prev.next= initonIncrementA;//A前序后序恒等
						}		
						initonLink= initonIncrementA;//最后A代替
					}
				}
			}
			if(!initonLink.hasNext()) {
				return initonLink;
			}
			initonLink= initonLink.forwardNext();//while loop 替增.
		}
		return initonLink;
	}

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
				if(null!= initonIncrementV.next) {
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
	
	
	//A = V + S LIST jdk util对象, 下面函数是直接用JDK的虚拟机函数 编写的,逻辑比较清晰, 各有各的用处.
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
//		//初始
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
//        //赋值
//		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
//		initonLinkDNA.setInitonLink(initonE);
//		//肽展计算
//		InitonPDE= new PDE_Formular().PDE_IncrementA(initonLinkDNA);
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
		        //赋值
				InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
				initonLinkDNA.setInitonLink(initonA);
				//肽展计算
				InitonPDE= new PDE_Formular().PDE_DecrementA(initonLinkDNA);
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