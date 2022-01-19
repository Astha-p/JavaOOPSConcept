package OOPConceptPart2;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
	  ArrayList <Comparable> arr= new ArrayList<Comparable>();
	  
	  arr.add(100);		//0
	  arr.add("Astha");	//1
	  arr.add('K');		//2
	  arr.add("asdfg");		//3
	  arr.add(11.11);	//4
	  System.out.println(arr);
	  System.out.println(arr.size());
	  System.out.println(arr.get(2));
	 
	  arr.remove(0);
	  System.out.println(arr.size());
	  
	  for(int i=0;i<arr.size();i++) //using for loop to print all values of array 
	  {
		  System.out.println(arr.get(i));  
	  }
  
	  ArrayList<String> a2= new ArrayList<String>();
	  a2.add("Patel");  //0
	  a2.add("100");	//1
	  System.out.println(a2.get(0));
	}

}
