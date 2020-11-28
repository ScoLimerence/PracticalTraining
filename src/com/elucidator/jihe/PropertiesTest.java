package com.elucidator.jihe;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.junit.Test;

/**
 * 
 * @author 黄湖栋
 * 2020年11月21日 下午9:01:55
 *	properties本身也是集合类型，存储键值对，线程安全，与hashmap相似
 */
public class PropertiesTest {
	InputStream in =null;
	public PropertiesTest() {
		// TODO Auto-generated constructor stub
		in=PropertiesTest.class.getClassLoader().getResourceAsStream("some.properties");
	}
	@Test
	public void getValues() {
		Properties prop = new Properties();
		try {
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Properties集合的遍历方法
		//Enumeration是枚举类型集合
		Enumeration names = prop.propertyNames();//得到键的集合
		while (names.hasMoreElements()) {
			String key =(String) names.nextElement();
			String value=prop.getProperty(key);
			System.out.println(key+"="+value);
		}
		
	}

}
