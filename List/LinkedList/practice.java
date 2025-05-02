package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class practice  {
	
	
	
	
	public static void main(String[]args) {
		  
		  List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Ravi");//adding object in arraylist    
		  al.add("Vijay");    
		  al.add("Ravi");     
		  
		  al.add("Ajay");     
		  
		  System.out.println("===================================");
		    
		  List<String> al2=new LinkedList<String>();//creating linkedlist    
		  al2.add("Ravi");//adding object in linkedlist    
		  al2.add("Ravi");    
		  al2.add("Vijay");    
		  al2.add("Ajay");    
		    
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);  
		 }    
		
	}


/*
String s="The Qafox-is the main software tetsing course";



String[]s1=s.split("-");



for(String s2:s1) {
	System.out.println(s2);
}

System.out.println(s1[0]); //The Qafox

String cont=s1[0].concat(" Amar");

System.out.println(cont);

System.out.println("one".concat("two").concat("three"));


String y="Amar";

String x="Kumar";

System.out.println(y+x);

*/