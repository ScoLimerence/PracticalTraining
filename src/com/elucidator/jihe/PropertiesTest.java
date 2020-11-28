package com.elucidator.jihe;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.junit.Test;

/**
 * 
 * @author �ƺ���
 * 2020��11��21�� ����9:01:55
 *	properties����Ҳ�Ǽ������ͣ��洢��ֵ�ԣ��̰߳�ȫ����hashmap����
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
		//Properties���ϵı�������
		//Enumeration��ö�����ͼ���
		Enumeration names = prop.propertyNames();//�õ����ļ���
		while (names.hasMoreElements()) {
			String key =(String) names.nextElement();
			String value=prop.getProperty(key);
			System.out.println(key+"="+value);
		}
		
	}

}
