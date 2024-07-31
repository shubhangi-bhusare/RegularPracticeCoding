package com.test.dssalut;

import java.util.List;

public class Student {

	String sid;
	String sname;
	List<Float> mark1;
	
	public Student(String sid, String sname, List<Float> mark1, float mark2, float mark3, float mark4) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mark1 = mark1;
//		this.mark2 = mark2;
//		this.mark3 = mark3;
//		this.mark4 = mark4;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Float> getMark1() {
		return mark1;
	}
	public void setMark1(List<Float> mark1) {
		this.mark1 = mark1;
	}
//	public float getMark2() {
//		return mark2;
//	}
//	public void setMark2(float mark2) {
//		this.mark2 = mark2;
//	}
//	public float getMark3() {
//		return mark3;
//	}
//	public void setMark3(float mark3) {
//		this.mark3 = mark3;
//	}
//	public float getMark4() {
//		return mark4;
//	}
//	public void setMark4(float mark4) {
//		this.mark4 = mark4;
//	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mark1=" + mark1 + "]";
	}
	
	
}
