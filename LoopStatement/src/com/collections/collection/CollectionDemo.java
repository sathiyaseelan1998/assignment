package com.collections.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionDemo cd=new CollectionDemo();
		//cd.arrayList();
		//cd.addTwoArrys();
	    //cd.linkedList();
		//cd.hashSet();
		//cd.linkesHashSet();
		//cd.treeSet();
		//cd.iterationMethod();
		//cd.sumOfNumber();
		//cd.removeDuplicate();
		//cd.printDuplicate();
		//cd.yesOrNo();
		//cd.printIntegerOnly();
		//cd.objectAdd();
		cd.iterate();
	}
	private void iterate() {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(8);
		al.add(25);
		al.add(18);
		Iterator<Integer> it=al.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}
	Mobile m1=new Mobile("apple",25000,64,4);
	Mobile m2=new Mobile("sumsung",45000,128,6);
	Mobile m3=new Mobile("apple",35000,64,4);
	private void objectAdd() {
		// TODO Auto-generated method stub
		ArrayList<Mobile> al=new ArrayList<Mobile>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

	private void printIntegerOnly() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("aa");
		al.add(6.7f);
		al.add(12.99d);
		al.add(true);
		al.add(18);
		for(Object ob:al) {
			
			try {
				Integer i=(Integer) ob;
				System.out.println(i);
				
			} catch (Exception e) {
			//System.out.println("i am not int");
			}
			
		}
	}

	private void yesOrNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("continue or not");
		String str=sc.next();
		ArrayList al=new ArrayList();
		while(str.equals("y")) {
			System.out.println("enter number");
			Integer no=sc.nextInt();
			al.add(no);
			System.out.println("continue or not");
			str=sc.next();
		}
		System.out.println(al);
	}

	private void printDuplicate() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(6);
		al.add(6);
		al.add(12);
		al.add(12);
		al.add(18);
		LinkedHashSet ll=new LinkedHashSet();
		for(Object ob:al) {
			boolean dup=ll.add(ob);
			if(dup==false) {
				System.out.println(ob);
			}
		}
	}

	private void removeDuplicate() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(6);
		al.add(6);
		al.add(12);
		al.add(12);
		al.add(18);
		System.out.println(al);
		LinkedHashSet ll=new LinkedHashSet(al);
		System.out.println(ll);
	}

	private void sumOfNumber() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(6);
		al.add(4);
		al.add(12);
		al.add(1);
		al.add(18);
		int total=0;
		for(Object ob:al) {
			Integer i=(Integer) ob;
			total+=i;
		}
		System.out.println(total);
	}

	private void iterationMethod() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(6);
		al.add(4);
		al.add(12);
		al.add(1);
		al.add(18);
		for(Object ob:al) {
			Integer i=(Integer) ob;
			if(i%6==0) {
				System.out.println(ob);
			}
		}
	}

	private void treeSet() {
		// TODO Auto-generated method stub
		TreeSet hs=new TreeSet();
		hs.add("ram");
		hs.add("virat");
		hs.add("ms");
		hs.add("ms");
	//	hs.add(null);
		hs.add("dhoni");
		System.out.println(hs);
	}

	private void linkesHashSet() {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("ram");
		hs.add(10);
		hs.add(10);
		hs.add(null);
		hs.add("dhoni");
		System.out.println(hs);
	}

	private void hashSet() {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("ram");
		hs.add(10);
		hs.add(10);
		hs.add(null);
		hs.add("dhoni");
		System.out.println(hs);
	}

	private void linkedList() {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add("ram");
		ll.add("ram");
		ll.add(10);
		ll.add(null);
		LinkedList ll1=new LinkedList();
		ll1.add("ram");
		ll1.add("kumar");
		ll1.add(12);
		ll.addAll(ll1);
		System.out.println(ll);
	}

	private void addTwoArrys() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("dhoni");
		al.add("dhoni");
		al.add(true);
		al.add(null);
		ArrayList al2=new ArrayList();
		al2.add("virat");
		al2.add(11);
		al.add(false);
		
		al.addAll(al2);
		System.out.println(al);
	}

	private void arrayList() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("dhoni");
		al.add(true);
		al.add(5.7f);
		al.add('a');
		System.out.println("before "+al.size());
		al.remove(0);// remove index
		al.remove(5.7f);// remove object
		System.out.println(al);
		System.out.println("after "+al.size());
		System.out.println(al.get(0));
		System.out.println(al.contains("dhoni"));
	}


}
