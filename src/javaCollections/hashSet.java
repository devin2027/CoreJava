package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		HashSet<Integer> hash = new HashSet<Integer>();
		hash.add(1);
		hash.add(3);
		hash.add(5);
		hash.add(7);
		System.out.println(hash);
		hash.add(3);
		System.out.println(hash);
		hash.remove(5);
		System.out.println(hash);
		System.out.println(hash.isEmpty()+ " Size:"+ hash.size());
		Iterator<Integer> it = hash.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
