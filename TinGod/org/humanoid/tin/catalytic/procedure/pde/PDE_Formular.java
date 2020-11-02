package org.humanoid.tin.catalytic.procedure.pde;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//ע��: �� �ļ���Ӧ�������������� DNA ���� �� ���������  ���������� ˼��ı��� ʵ��. 
//������ �� ֪ʶ��ȨίԱ�� �Ѿ����� , ���Ķ� ��� ����Ȩ ԭ��  �����߼����.  
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
						Initon initonIncrement= new Initon();
						initonIncrement.setA();
						output.add(initonIncrement);
						continue HERE;
					}
					Initon initonIncrement= new Initon();
					initonIncrement.setS();
					output.add(initon);
					continue HERE;
				}
				Initon initonIncrement= new Initon();
				initonIncrement.setV();
				output.add(initon);
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