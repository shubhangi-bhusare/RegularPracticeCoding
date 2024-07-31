package com.test.dssalut;

public class AnnualExam {

	Standred std;

	

//	public AnnualExam(Standred std) {
//		super();
//		this.std = std;
//	}

	public Standred getStd() {
		return std;
	}

	public void setStd(Standred std) {
		this.std = std;
	}
	
	@Override
	public String toString() {
		return "AnnualExam [std=" + std + "]";
	}
	
	
}
