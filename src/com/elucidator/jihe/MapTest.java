package com.elucidator.jihe;

import java.util.*;
import java.util.Map.Entry;

/*
 * Map���ϣ�����Ҳ�ǽӿڣ��洢���Ǽ�ֵ����ʽ
 * ������HashMap��LinkedHashMap����
 * ǰ�������������
 * �����д�Ķ��Ƕ��󣬷��ͣ���ȡ����Ҫ������ת��
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
		//�ؼ�����map���ϵı����������ַ�ʽ
		//����һʹ��keyset
		Set keySet = map1.keySet();
		Iterator it= keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value = map1.get(key);
			System.out.println(key+"->"+value);
		}
//		����2��ʹ��entrySet���п�ÿ����ֵ��
		Set entrySet = map1.entrySet();
		Iterator it1 = entrySet.iterator();
		while(it1.hasNext()) {
			//������תΪmap����ʵ��
			Map.Entry entry=(Map.Entry) (it1.next());
			Object key=entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"->"+value);
		}
		//����3��ʹ��Map�Դ���values���������Ի�ȡ����ֵ�ļ��ϣ�ֻ�ܵõ����ֵ���ò�����
		Collection values = map2.values();
		Iterator it2 = values.iterator();
		while(it2.hasNext()) {
			//������תΪmap����ʵ��
			Object value = it2.next();
			System.out.println("->"+value);
		}
	}

}
