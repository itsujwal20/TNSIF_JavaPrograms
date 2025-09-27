package corejava;



public class encapsulation {
	
	int serialnumber; // data memebrs or proprties
	String name;
	int age;
	
	void show() {
	System.out.println(serialnumber +" "+name+" "+age);
	}

	public static void main(String[] args) {
		encapsulation e=new encapsulation ();
		
		e.serialnumber=1;
		e.name="raki";
		e.age=21;
		
		e.show();
	}
}

