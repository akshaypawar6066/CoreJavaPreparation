package day20_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetInJava {

	public static void main(String[] args) {
		
		/*
		// Declaration

		//HashSet mySet = new HashSet<>();   //Chld class ref varable, chld class Object
	     //Set MySet = new HashSet();       //Parentclass ref. varable, child class Object
	    // Set<Integer> mySet = new HashSet<Integer>();  //To store Homogenious data, here only integer values.
	     
	     //How to declare the set and add valiues at a time?
	     
	     HashSet mySet = new HashSet<>(Arrays.asList("Akshay", "Pawar",101,8.25));
	     HashSet test = new HashSet<>(Arrays.asList("Rohini", "Priyanka","Sachin"));
	     
	     //Different methods in Set
	     mySet.add("Morningstar");   //add()
	     System.out.println(mySet);
	     
	     mySet.addAll(test);   //addAll(Collection)   //To add multiple elemnts
	     System.out.println(mySet);
	     
	     mySet.add(100);                //To check if dplicates allowed
	     mySet.add(100);
	     System.out.println(mySet);
	     
	     
	     mySet.add(null);                //To check if how many null values allowed allowed
	     mySet.add(null);
	     System.out.println(mySet);             //duplicated not allowed,Insertion order not preserved, Indexing Concept not present,  allow only one null value
	     
	     
	    mySet.remove(101) ;        //remove(Object)  -->To remove specific object
	    System.out.println(mySet);
	    
	    
	    mySet.removeAll(test);  //removeAll(Collection)  -->To remove all elemnts which are present in the another collection.
	    System.out.println(mySet);
	    
	    System.out.println(mySet.contains("Akshay"));   //contains(object) ->To check if object is present in the set or not.
	    
	    System.out.println("Size of set is:"+mySet.size());  //size()---->to check size of set
	    System.out.println(mySet.isEmpty());  //isEmpty()  -->To check if set is empty or not
	    
	    Iterator it = mySet.iterator();   //iterator()  -->To Iterate set elemnts.
	    
	    while(it.hasNext()) {
	    	System.out.print(it.next()+":");
	    }
	    
	    System.out.println();
	    
	    //Iterate elemnts through loop.
        System.out.print("Iterate elemnts through foe rach loop:");
	    for(Object e:mySet) {
	    	System.out.print(e+":");
	    }
	    
	    //Convert HashSet to ArrayList
	    ArrayList list = new ArrayList(mySet);            //Pass set collection in ArrayList constrctor.
	    
	   System.out.println("ArrayList Conversiion Done:"+list);
	   System.out.println(list.get(0));
	    
	    
	    System.out.println();
	    
	  Object [] a = mySet.toArray();   //toArray()   -->To convert set in array.
	  System.out.println("Size of an Array is:"+a.length);
	  
	  System.out.println(mySet);
	  
	  mySet.clear();          //clear() -->To cleart the elemnts of the set.
	  System.out.println(mySet);
	  System.out.println(mySet.size());
	  
	  System.out.println("---------------------------");

	    //Index Based Operation is not allowed in set, Inserting element at specific index, remove elements from specific index, retriiveelemnts from specific index.
 
	  LinkedHashSet l = new LinkedHashSet<>();
	  l.add("Akshay");
	  */
		
		 HashSet<Object> hashSet = new HashSet<>();
	        hashSet.add(10);          // Integer
	        hashSet.add("Akshay");    // String
	        hashSet.add(8.25);        // Double
	        hashSet.add(true);        // Boolean
	        
	        for(Object e:hashSet) {
	        	System.out.println(e);
	        }
	        
	        System.out.println();
	        
	        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
	        linkedHashSet.add(10);          // Integer
	        linkedHashSet.add("Akshay");    // String
	        linkedHashSet.add(8.25);        // Double
	        linkedHashSet.add(true);        // Boolean
	        
	        for(Object e:linkedHashSet) {
	        	System.out.println(e);
	        }
	  
	}

}
