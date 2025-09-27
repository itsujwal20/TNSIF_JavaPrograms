package com.tnsif.setdemo;
interface sayable{
	public String Say();
}
public class LambdaExpressionExample3 {
public static void main(String[] args) {
	sayable s=()->{
		return "i have nothing to say";
	};
	System.out.println(s.Say());
}

public char[] say() {
	// TODO Auto-generated method stub
	return null;
}
}
