package day20_Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapInJava {
	
	public static void main(String[] args) {
		
		//Declaraton 
		
		// HashMap hm = new HashMap();            //Raw type -->Avoid this.
		//HashMap<Integer, String> hm = new HashMap<>();   //Child class ref., child class Object
		//Map<String,String> hm  = new HashMap<>();         //Parent class ref., child class Object
		
		 
		
		
		HashMap<Integer, String> hashmap = new HashMap<>();
		Map<Integer, String> test = Map.of(
			    105, "Abhijit",
			    106, "Tushar"
			);
		
		hashmap.put(101, "Akshay");  //put()  to add key-value pair
		hashmap.put(102, "Amol");
		hashmap.put(103, "Suraj");
		hashmap.put(104, "Kiran");
		
		hashmap.putAll(test);   //putAll()--->To add one hashamp key-values in another hash-map
		
		System.out.println(hashmap);
		
		System.out.println("-------------------------");
		
		System.out.println(hashmap.get(105));   //get(Object key)  -->Get the value at specific key
		System.out.println("Removed value is:"+hashmap.remove(106));  //remove(Object key)--->remove the key-value pair/remove the mapping for the given key
		System.out.println("After Removing:"+hashmap);
		
		
		System.out.println(hashmap.containsKey(103));   //containsKey()-->To check if key is exists or not
		System.out.println(hashmap.containsValue("Morningstar"));   //containsValue()-->To check if Value is exists or not
		System.out.println("--------------------------");
		
		System.out.println(hashmap.size());   //size() -->To check size of hashmap
		System.out.println(hashmap.isEmpty());  //isEMpty() -->TO check if hashmap is empty or not.
		
		System.out.println("--------------------------");

		Set<Integer> keys=hashmap.keySet() ;                //keySet()  --->To get set of all the Keys.
		for(Integer a: keys) {
			System.out.println(a);
		}
		
		System.out.println("--------------------------");
             //values()  --->To get Colllection of all the values
		   for(String s: hashmap.values()) {
			   System.out.println(s);
		   }
			
		    System.out.println("--------------------------");
		    
		     Set<Map.Entry<Integer, String>> entries= hashmap.entrySet();          //entrySet() -->To get all key-values. / to get alll the entriies(keys-values).
               
		     for(Map.Entry<Integer, String> entry:entries) {
		    	 System.out.println(entry);
		     }
		     System.out.println("-------------------------------");
		     
		     for(Map.Entry<Integer, String> entry: entries) {
		    	 System.out.println(entry.getKey()+"==>"+entry.getValue());
		     }
		  
		  System.out.println("--------------------------");
		  
		  //Iterate map through for each loop.
		  for(Integer key:hashmap.keySet()) {
			  System.out.println(key+":"+hashmap.get(key));
		  }
		  
		  System.out.println("--------------------------Test");
		  //Iterate map through Iterator.
		    
		 Iterator<Map.Entry<Integer, String>>it= hashmap.entrySet().iterator();
		 while(it.hasNext()) {
			Map.Entry<Integer, String> entry= it.next();
			System.out.println(entry);
			System.out.println(entry.getKey()+"=====>"+entry.getValue());
		 }
	  
		  /*
		  System.out.println("-----------------------------");
		  
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  */
		   
	}

}
