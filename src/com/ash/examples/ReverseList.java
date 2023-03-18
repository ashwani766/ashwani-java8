package com.ash.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseList {

	public static void main(String[] args) {
	
		
	List<String> items= new ArrayList<>();
	items.add("ashwani");
	items.add("kushal");
	items.add("prashant");
	items.add("chhotu");
	
	/* Reverse using  IntStream  */
	
	
	System.out.println("List Before");
	System.out.println(items);
	
	
	List<String> reversedList= IntStream.range(0, items.size()).mapToObj(i->items.get((items.size()-1)-i)).collect(Collectors.toList());

	
	System.out.println("List in reverse order");
	System.out.println(reversedList);
	}

}
