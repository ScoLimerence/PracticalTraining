package com.elucidator.fanxing;

/**
 * 
 * @author Administrator
 * ���;��������װ������������ �磺Integer
 * ����int��Integer������
 * int �ǻ�����������
 * Integer�����װ�࣬ע����һ���ࡣ
 * Ŀ����Ϊ���ڸ������ͼ�ת����ͨ�����ַ����ĵ��á����� ���޷�ֱ��ͨ������ת����
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���磬����intҪתΪString
		int a=0;
		String result=Integer.toString(a);
		/*
		 * Integer.parseInt(String s)���᷵��int������
		 * Integer.valueOf(String s)���᷵��Integer���ͣ�������ڻ��潫�᷵�ػ��������еĶ���
		 * Integer��������Զ�תΪint
		 */
		int num=Integer.valueOf("12");
		int num2=Integer.parseInt("12");
		String a1=String.valueOf("1234");//���������м����������κ�����
		String b=String.valueOf(true);
		String c=new Integer(12).toString();//ͨ����װ���toString()Ҳ����
		String d=new Double(2.3).toString();
		String str="123";
		int g=Integer.valueOf(str);
		System.out.println(g);
		System.out.println(result+":"+num+":"+num2+":"+a1+":"+b+":"+c+":"+d);
	}

}
