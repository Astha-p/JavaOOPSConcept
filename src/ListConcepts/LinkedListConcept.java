package ListConcepts;

import java.util.LinkedList;


public class LinkedListConcept {

	public static void main(String[] args) {
		

		LinkedList <String> ll = new LinkedList<String>(); 

		ll.add ("Python"); 
		ll.add ("Software"); 
		ll.add ("QA"); 
		ll.add ("Java"); 

		System.out.println (ll); 

		//addfirst 
		ll.addFirst("New"); 

		//addlast 
		ll.addLast("Language"); 
		System.out.println(ll); 
		System.out.println(ll.get(1)); 

		 

		ll.set(1,"Automation"); 
		System.out.println(ll); 

		 
		//remove First from the list
		//remove last from the list
		ll.removeFirst(); 
		ll.removeLast(); 
		System.out.println(ll); 

		 

		//whileloop 

		int num = 0; 

		while(ll.size()>num);
		{ 
			
		System.out.println(ll);
		num++; 

		} 

		 

	}



	

}
