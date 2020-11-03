package org.humanoid.tin.catalytic.procedure.pde;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//注意: 该 文件对应的是罗瑶光先生 DNA 编码 与 计算的两本  国家软著作 思想的编码 实现. 
//公安部 与 知识产权委员会 已经备案 , 可阅读 相关 著作权 原文  进行逻辑辨别.  
public class PDE_Formular {
	//A = V + S
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