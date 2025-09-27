package com.tnsif.statickeyword;

public class emplyee {
	int id;
	String name;
	static String company="reva";
	
	emplyee(int a,String n){
		id=a;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name+" "+company);
	}
	public static void main(String[] args) {
		emplyee e=new emplyee(1,"raki");
		emplyee e1=new emplyee(2,"ravi");
		emplyee e2=new emplyee(3,"mml");
	
	e.display();
	e1.display();
	e2.display();

}
}
