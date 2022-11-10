package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hi");
		list.add("my");
		list.add("name");
		list.add("is");
	    
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.set(3, "xyz"));
		list.add(3, "name");
		System.out.println(list);
		System.out.println(list.contains("name"));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.indexOf("name"));
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {	
			System.out.println(it.next());
		}
	}

}
