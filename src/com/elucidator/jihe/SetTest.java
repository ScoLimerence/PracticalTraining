package com.elucidator.jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *@author Administrator
 *唯一吗?
 *	是：Set
 *		排序吗?
 *			是：TreeSet或LinkedHashSet
 *			否：HashSet
 *如果你知道是Set，但是不知道是哪个Set，就用HashSet。
 */
public class SetTest {

	/**
	 * 
	 * 为了保证唯一性 set在插入对象时，必须在对象实体类中重写 hashCode和equals方法
	 * String类中已重写此方法，故保证了唯一性
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Set 无序,唯一,本身是接口,同时继承Connection接口
		Set hashSet = new HashSet();
		hashSet.add("java");
		hashSet.add("c");
		hashSet.add("c");
		hashSet.add("c++");
		hashSet.add("c++");
		hashSet.add("c#");
		hashSet.add("java");
		Iterator iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
		}
	}

}
