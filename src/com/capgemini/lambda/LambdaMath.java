package com.capgemini.lambda;

import java.util.*;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{
	public void accept(Integer t) {
		System.out.println("Method2 value::"+t);
	}
}


public class LambdaMath {
	
	 public static void main(String[] args) {
		  
		  ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(23,28,98,47,23,12,24));
		  
		  //Method 1
		  Iterator<Integer> it=numbers.iterator();
		  while(it.hasNext()) {
			  Integer i=it.next();
			  System.out.println("Iterator value::"+i);
		  }
		  
		  //Method 2...
		  MyConsumer myconsumer=new MyConsumer();
		  numbers.forEach(myconsumer);
		  
		  
		  //Method 3..
		  numbers.forEach(new Consumer<Integer>() {
			  public void accept(Integer t) {
				  System.out.println("Method 3 for anonymous class : "+t);
			  }
		  });
		  
		  //Method 4(Explicit Lambda)
		  Consumer<Integer> myListAction=n->{
			  System.out.println("Method 4:"+n);
		  };
		  numbers.forEach(myListAction);
		  
		  //Method 5(Implicit Lambda)
		  numbers.forEach(n->{
			  System.out.println("Method 5: for each numbers"+n);
		  });
		  		  
	   }
}
