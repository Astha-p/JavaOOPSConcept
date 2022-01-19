package OOPConceptPart2;

import java.util.Hashtable ;


public class HashTable {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		
		h.put("1", "Abc");
		h.put("2", "def");
		h.put("3", "ghi");
		
		System.out.println(h.size());
		System.out.println(h.get("2"));
		System.out.println(h.get("Abc"));
			
		
		Hashtable <Integer,Integer> ht = new Hashtable<Integer,Integer>();
		
		ht.put(100,1000);
		ht.put(101,1001);
		System.out.println(h.size());
		
	}

}
