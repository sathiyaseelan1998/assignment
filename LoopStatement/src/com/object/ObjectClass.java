package com.object;

public class ObjectClass {
	String name;
	int age;
	public ObjectClass(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectClass oc=new ObjectClass("virat",33);
		ObjectClass oc1=new ObjectClass("dhoni",38);
		System.out.println(oc.equals(oc1));// compare to two object
		System.out.println(oc.hashCode()+"  "+oc1.hashCode());//each object unique id -memory address
		System.out.println(oc);
		System.out.println(oc1);
	}
	public String toString() { //automatically call when object created
		
		return this.name+" "+this.age;
	}
}
