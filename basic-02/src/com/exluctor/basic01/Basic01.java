package com.exluctor.basic01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Basic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put(01, 123);
		map.put(02, new String("china"));
		map.put("hhd", 0.01);
		map.put("hhd", 0.02);
		
		Collection values = map.values();
//		Iterator it = values.iterator();
		for (Object object : values) {
			System.out.println(object);
		}
		
		Set<Entry<Object,Object>> set = map.entrySet();
	/*	for (Entry<Object, Object> entry : set) {
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}*/
		Iterator<Entry<Object, Object>> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getKey()+"--->"+it.next().getValue());			
		}
	}

}
