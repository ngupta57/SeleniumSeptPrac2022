package day15;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		
		/* 1) Heterogenios data ---> allowed
	2) Insertion order  --> Not preserved (Index not supported)
	3) Duplicate elements --> Not Allowed
	4) Multiple nulls Not allowed/ only single null is allowed */
		
		
		//Declaration
		
		HashSet HS =new HashSet();
		HashSet <Integer>HS2=new HashSet <Integer>();// can only store integers
		Set HS3=new HashSet();// using interface refrence  create object of HasSet Class
		
		//Adding Element to HashSet object
		
		HS.add(10);
		HS.add("welcome");
		HS.add(null);
		HS.add(true);
		HS.add(2.45);
		HS.add(null);
		HS.add(10);
		HS.size();
		System.out.println(HS);
		HS.remove(2.45);
		System.out.println(HS.size());
		System.out.println(HS);
		for (Object x:HS) {
			System.out.println(x);
			
		}

	}

}
