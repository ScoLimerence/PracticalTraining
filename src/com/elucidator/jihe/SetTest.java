package com.elucidator.jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *@author Administrator
 *Ψһ��?
 *	�ǣ�Set
 *		������?
 *			�ǣ�TreeSet��LinkedHashSet
 *			��HashSet
 *�����֪����Set�����ǲ�֪�����ĸ�Set������HashSet��
 */
public class SetTest {

	/**
	 * 
	 * Ϊ�˱�֤Ψһ�� set�ڲ������ʱ�������ڶ���ʵ��������д hashCode��equals����
	 * String��������д�˷������ʱ�֤��Ψһ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Set ����,Ψһ,�����ǽӿ�,ͬʱ�̳�Connection�ӿ�
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
