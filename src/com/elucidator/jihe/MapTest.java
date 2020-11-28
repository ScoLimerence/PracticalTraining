package com.elucidator.jihe;

import java.util.*;
import java.util.Map.Entry;

/*
 * Map集合，本身也是接口，存储的是键值对形式
 * 常用有HashMap和LinkedHashMap两种
 * 前者无序后者有序
 * 集合中存的都是对象，泛型，若取出需要做类型转换
 */
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map1 = new HashMap();
		Map map2 = new LinkedHashMap();
		map1.put("1", "java");
		map1.put("2", "c");
		map1.put("3", "python");
		map1.put("4", "c++");
		map1.put("5", "C#");
		map2.put("1", "java");
		map2.put("2", "c");
		map2.put("3", "python");
		int hashCode1 = "1".hashCode();
		int hashCode2= "2".hashCode();
		int hashCode3 = "3".hashCode();
		System.out.println(hashCode1+" "+hashCode2+" "+hashCode3);
		//关键在于map集合的遍历，有三种方式
		//方法一使用keyset
		Set keySet = map1.keySet();
		Iterator it= keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value = map1.get(key);
			System.out.println(key+"->"+value);
		}
//		方法2：使用entrySet，切开每个键值对
		Set entrySet = map1.entrySet();
		Iterator it1 = entrySet.iterator();
		while(it1.hasNext()) {
			//将类型转为map单个实体
			Map.Entry entry=(Map.Entry) (it1.next());
			Object key=entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"->"+value);
		}
		//方法3：使用Map自带的values方法，可以获取所有值的集合，只能得到存的值，得不到键
		Collection values = map2.values();
		Iterator it2 = values.iterator();
		while(it2.hasNext()) {
			//将类型转为map单个实体
			Object value = it2.next();
			System.out.println("->"+value);
		}
	}

}
