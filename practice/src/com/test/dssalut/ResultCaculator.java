package com.test.dssalut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResultCaculator {
	
	public static void main(String[] args) {
		
//		Student stud= new Student();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter standred for result calculation");
		String std=sc.next();
		System.out.println("Enter division for result calculation");
		String div=sc.next();
		
		Division division=new Division();
		DivA diva=new DivA();
		
		AnnualExam exam=new AnnualExam();
		 //exam.setStd(std);
		
		List<Student> list=new ArrayList<Student>();
		
//		list.add(new Student("101", "sai", 70,68,46,59));
//		list.add(new Student("102", "om", 73,64,46,59));
//		list.add(new Student("103", "hggh", 60,28,46,59));
//		list.add(new Student("104", "jhj", 20,34,24,28));
		
		
//		for(Student stud :list) {
//			
////			float result=stud.getMark1()+stud.getMark2()+stud.getMark3()+stud.getMark4();
//			float percent=(result/400)*100;
//			
//			if(percent>=35) {
//				System.out.println("student with name "+stud.getSname()+ " passed with percentage "+percent);
//			}else {
//				System.out.println("student with name "+stud.getSname()+ " failed with percentage "+percent);
//			}
//			
//		}
	}

}
