package arrayCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListAndLinkList {
	//Java Collection: We have 3 types collection
	//1- List 2- Set
	//1- List: we have ArrayList, LinkList
	//Formula List: List<Object Datatype> objname = new TypeOfList<Object DataType>();
	
	public static void main(String[] args) {
		//what is the difference between array and arraylist?
		//Array is static and arraylist is non-static and in array list we can add as many as we want
		//In Dynamic we can add as many as we want.
//List<String> mylist = new ArrayList<String>();
		//Interview Question: what is the difference between Arraylist and Linklist?
		//There is no different in workwise or printing. The difference is in architecture and time saving. it knows which one is 
		// before it and after. In Linklist. Example like when you go to doctor you hav ticket number 5 you know before is 4 and after you is 6
		// when go to doctor 5 goes and replace with that. but in Arraylist like line but one move it shuffling.
		//Linklist is faster. which one do you use most? arraylist.
		
List<String> mylist = new LinkedList<String>();
		mylist.add("Tom");
		mylist.add("Mike");
		mylist.add("Jay");
		mylist.add("james");
		mylist.add("RF");
		
		System.out.println(mylist); // This will pring inside bracket means that is object and printed
		
		System.out.println(mylist.size()); // if we don't have length we can find the size
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(1));
		System.out.println(mylist.get(2));
		System.out.println(mylist.get(4));
		mylist.remove(1);
		System.out.println(mylist.size());
		System.out.println(mylist.get(1));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayCol a = new ArrayCol();
//		System.out.println(a.names[1]);
//		System.out.println(a.names.length);
//	String[] s = new String[4];
//	s[1]="jay";
//	s[3]="mike";
//	s[0]="tom";
//	s[2]="khan";
//
//	System.out.println(s[1]);
//	System.out.println(s[2]);
	
	}

}
