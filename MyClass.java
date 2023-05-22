package com.dal;

public class MyClass {
	
	
	
	
	public static void main(String[] args) {
		Child mc = new Child();
    	Child2 mc2=new Child2();
		mc.method();
		mc2.method2(10,20);
		
	}

}
class Child{
//	String y;
	String s="Sai";
	String l="Kumar";
	public void method() {
//	String y = s+""+l;
		System.out.println(s+" "+l);
	}
}

class Child2{
	String s="Kumar";
	public void method2(int y,int z) {
		System.out.println(y+z);
	}
}