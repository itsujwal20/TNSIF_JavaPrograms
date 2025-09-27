package com.tnsif.statickeyword;

public class student {
	int srn;
	String name;
	static String collage;
	static void change() {
		collage="reva";
		
	}
	student(int a,String n){
		srn=a;
		name=n;
	}
	void display() {
		System.out.println(srn+" "+name+" "+collage);
	}
	public static void main(String[] args) {
		student.change();
		student s=new student(1,"raki");
		student s1=new student(2,"raki");
		student s2=new student(3,"raki");
		s.display();
		s1.display();
		s2.display();
	}
	

}
