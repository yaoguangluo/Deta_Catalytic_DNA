package org.humanoid.tin.catalytic.procedure.pde;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class PDE_Increment_Formular {
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

	//O = E + S LINK 数据结构对象 (简单测试)
	public Initon PDE_IncrementO(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("E")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("S")) {					
						Initon initonIncrementO= new Initon();
						initonIncrementO.setO(); //新增一个数据O
						if(initonNext.hasNext()) {
							initonIncrementO.next= initonNext.next; //O后序替换
							initonIncrementO.next.prev= initonIncrementO;//O后序前序恒等
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementO.prev= initonNext.prev.prev;//O前序替换
							initonIncrementO.prev.next= initonIncrementO;//O前序后序恒等
						}		
						initonLink= initonIncrementO;//最后O代替
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

	//P = E + C LINK 数据结构对象 (简单测试)
	public Initon PDE_IncrementP(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("E")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("C")) {					
						Initon initonIncrementP= new Initon();
						initonIncrementP.setP(); //新增一个数据P
						if(initonNext.hasNext()) {
							initonIncrementP.next= initonNext.next; //P后序替换
							initonIncrementP.next.prev= initonIncrementP;//P后序前序恒等
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementP.prev= initonNext.prev.prev;//P前序替换
							initonIncrementP.prev.next= initonIncrementP;//P前序后序恒等
						}		
						initonLink= initonIncrementP;//最后P代替
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
	//M = C + S
	public Initon PDE_IncrementM(InitonLinkDNA initonLinkDNA) {
		Initon initonLink= initonLinkDNA.getInitonLink();
		while(null!= initonLink) {
			if(initonLink.getStore().equalsIgnoreCase("C")) {
				if(initonLink.hasNext()) {
					Initon initonNext= initonLink.forwardNext();
					if(initonNext.getStore().equalsIgnoreCase("S")) {					
						Initon initonIncrementM= new Initon();
						initonIncrementM.setM(); //新增一个数据M
						if(initonNext.hasNext()) {
							initonIncrementM.next= initonNext.next; //M后序替换
							initonIncrementM.next.prev= initonIncrementM;//M后序前序恒等
						}
						if(null!= initonNext.prev.prev) {
							initonIncrementM.prev= initonNext.prev.prev;//M前序替换
							initonIncrementM.prev.next= initonIncrementM;//M前序后序恒等
						}		
						initonLink= initonIncrementM;//最后M代替
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
	
	
	//V = U + Q
		public Initon PDE_IncrementV(InitonLinkDNA initonLinkDNA) {
			Initon initonLink= initonLinkDNA.getInitonLink();
			while(null!= initonLink) {
				if(initonLink.getStore().equalsIgnoreCase("U")) {
					if(initonLink.hasNext()) {
						Initon initonNext= initonLink.forwardNext();
						if(initonNext.getStore().equalsIgnoreCase("Q")) {					
							Initon initonIncrementV= new Initon();
							initonIncrementV.setV(); //新增一个数据V
							if(initonNext.hasNext()) {
								initonIncrementV.next= initonNext.next; //V后序替换
								initonIncrementV.next.prev= initonIncrementV;//V后序前序恒等
							}
							if(null!= initonNext.prev.prev) {
								initonIncrementV.prev= initonNext.prev.prev;//V前序替换
								initonIncrementV.prev.next= initonIncrementV;//V前序后序恒等
							}		
							initonLink= initonIncrementV;//最后V代替
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
		
		//E = I + U
		//肽展公式的概率问题, 先这样命名,之后讨论 是IU还是DU
		public Initon PDE_IncrementE_IU(InitonLinkDNA initonLinkDNA) {
			Initon initonLink= initonLinkDNA.getInitonLink();
			while(null!= initonLink) {
				if(initonLink.getStore().equalsIgnoreCase("I")) {
					if(initonLink.hasNext()) {
						Initon initonNext= initonLink.forwardNext();
						if(initonNext.getStore().equalsIgnoreCase("U")) {					
							Initon initonIncrementE= new Initon();
							initonIncrementE.setM(); //新增一个数据E
							if(initonNext.hasNext()) {
								initonIncrementE.next= initonNext.next; //E后序替换
								initonIncrementE.next.prev= initonIncrementE;//E后序前序恒等
							}
							if(null!= initonNext.prev.prev) {
								initonIncrementE.prev= initonNext.prev.prev;//E前序替换
								initonIncrementE.prev.next= initonIncrementE;//E前序后序恒等
							}		
							initonLink= initonIncrementE;//最后E代替
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
		
		//C = I + D
		public Initon PDE_IncrementC(InitonLinkDNA initonLinkDNA) {
			Initon initonLink= initonLinkDNA.getInitonLink();
			while(null!= initonLink) {
				if(initonLink.getStore().equalsIgnoreCase("I")) {
					if(initonLink.hasNext()) {
						Initon initonNext= initonLink.forwardNext();
						if(initonNext.getStore().equalsIgnoreCase("D")) {					
							Initon initonIncrementC= new Initon();
							initonIncrementC.setC(); //新增一个数据C
							if(initonNext.hasNext()) {
								initonIncrementC.next= initonNext.next; //C后序替换
								initonIncrementC.next.prev= initonIncrementC;//C后序前序恒等
							}
							if(null!= initonNext.prev.prev) {
								initonIncrementC.prev= initonNext.prev.prev;//M前序替换
								initonIncrementC.prev.next= initonIncrementC;//M前序后序恒等
							}		
							initonLink= initonIncrementC;//最后C代替
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
		
		//S = I + Q
		public Initon PDE_IncrementS(InitonLinkDNA initonLinkDNA) {
			Initon initonLink= initonLinkDNA.getInitonLink();
			while(null!= initonLink) {
				if(initonLink.getStore().equalsIgnoreCase("I")) {
					if(initonLink.hasNext()) {
						Initon initonNext= initonLink.forwardNext();
						if(initonNext.getStore().equalsIgnoreCase("Q")) {					
							Initon initonIncrementS= new Initon();
							initonIncrementS.setS(); //新增一个数据S
							if(initonNext.hasNext()) {
								initonIncrementS.next= initonNext.next; //S后序替换
								initonIncrementS.next.prev= initonIncrementS;//S后序前序恒等
							}
							if(null!= initonNext.prev.prev) {
								initonIncrementS.prev= initonNext.prev.prev;//S前序替换
								initonIncrementS.prev.next= initonIncrementS;//S前序后序恒等
							}		
							initonLink= initonIncrementS;//最后S代替
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
		
		//E = D + U
		//肽展公式的概率问题, 先这样命名,之后讨论 是IU还是DU
		public Initon PDE_IncrementE_DU(InitonLinkDNA initonLinkDNA) {
			Initon initonLink= initonLinkDNA.getInitonLink();
			while(null!= initonLink) {
				if(initonLink.getStore().equalsIgnoreCase("D")) {
					if(initonLink.hasNext()) {
						Initon initonNext= initonLink.forwardNext();
						if(initonNext.getStore().equalsIgnoreCase("U")) {					
							Initon initonIncrementE= new Initon();
							initonIncrementE.setE(); //新增一个数据E
							if(initonNext.hasNext()) {
								initonIncrementE.next= initonNext.next; //E后序替换
								initonIncrementE.next.prev= initonIncrementE;//E后序前序恒等
							}
							if(null!= initonNext.prev.prev) {
								initonIncrementE.prev= initonNext.prev.prev;//E前序替换
								initonIncrementE.prev.next= initonIncrementE;//E前序后序恒等
							}		
							initonLink= initonIncrementE;//最后E代替
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

		//S = I
		//肽展公式的概率问题, 先这样命名,之后讨论 是I, Q还是I + Q
		public Initon PDE_IncrementS_I(InitonLinkDNA initonLinkDNA) {
			Initon initonLink= initonLinkDNA.getInitonLink();
			while(null!= initonLink) {
				if(initonLink.getStore().equalsIgnoreCase("I")) {
					Initon initonIncrementS= new Initon();
					initonIncrementS.setS(); //新增一个数据S
					if(initonLink.hasNext()) {
						initonIncrementS.next= initonLink.next; //S后序替换
						initonIncrementS.next.prev= initonIncrementS;//S后序前序恒等
					}
					if(null!= initonLink.prev) {
						initonIncrementS.prev= initonLink.prev;//S前序替换
						initonIncrementS.prev.next= initonIncrementS;//S前序后序恒等
					}		
					initonLink= initonIncrementS;//最后M代替

				}
				if(!initonLink.hasNext()) {
					return initonLink;
				}
				initonLink= initonLink.forwardNext();//while loop 替增.
			}
			return initonLink;
		}

		//S = Q
		//肽展公式的概率问题, 先这样命名,之后讨论 是I, Q还是I + Q
		public Initon PDE_IncrementS_Q(InitonLinkDNA initonLinkDNA) {
			Initon initonLink= initonLinkDNA.getInitonLink();
			while(null!= initonLink) {
				if(initonLink.getStore().equalsIgnoreCase("Q")) {
					Initon initonIncrementS= new Initon();
					initonIncrementS.setM(); //新增一个数据S
					if(initonLink.hasNext()) {
						initonIncrementS.next= initonLink.next; //S后序替换
						initonIncrementS.next.prev= initonIncrementS;//S后序前序恒等
					}
					if(null!= initonLink.prev) {
						initonIncrementS.prev= initonLink.prev;//S前序替换
						initonIncrementS.prev.next= initonIncrementS;//S前序后序恒等
					}		
					initonLink= initonIncrementS;//最后M代替

				}
				if(!initonLink.hasNext()) {
					return initonLink;
				}
				initonLink= initonLink.forwardNext();//while loop 替增.
			}
			return initonLink;
		}
}