package com.test.dssalut;

public class Division {

	DivA divA;
	DivB divB;
//	public Division(DivA divA, DivB divB) {
//		super();
//		this.divA = divA;
//		this.divB = divB;
//	}
	public DivA getDivA() {
		return divA;
	}
	public void setDivA(DivA divA) {
		this.divA = divA;
	}
	public DivB getDivB() {
		return divB;
	}
	public void setDivB(DivB divB) {
		this.divB = divB;
	}
	@Override
	public String toString() {
		return "Division [divA=" + divA + ", divB=" + divB + "]";
	}
	
	
}
