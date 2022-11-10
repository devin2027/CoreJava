package javaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0, "abc");
		hm.put(5, "efg");
		hm.put(50, "xyz");
		hm.put(2, "123");
		
		System.out.println(hm);
		
		hm.remove(2);
		System.out.println(hm);
		Set sn=hm.entrySet();
		Iterator it = sn.iterator();
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
		
		   // Creating a HashMap and traversing whol hashmap
//        Map<String, String> foodTable
//            = new HashMap<String, String>();
// 
//        // Inserting elements to the adobe HashMap
//        // Elements- Key value pairs using put() method
//        foodTable.put("A", "Angular");
//        foodTable.put("J", "Java");
//        foodTable.put("P", "Python");
//        foodTable.put("H", "Hibernate");
// 
//        // Iterating HashMap through for loop
//        for (Map.Entry<String, String> set :
//             foodTable.entrySet()) {
// 
//            // Printing all elements of a Map
//            System.out.println(set.getKey() + " = "
//                               + set.getValue());
//        }
	}

}
