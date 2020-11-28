package com.elucidator.fanxing;

/**
 * 
 * @author Administrator
 * 泛型就是用类封装基本数据类型 如：Integer
 * 例如int与Integer的区别：
 * int 是基本数据类型
 * Integer是其包装类，注意是一个类。
 * 目的是为了在各种类型间转化，通过各种方法的调用。否则 你无法直接通过变量转化。
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		比如，现在int要转为String
		int a=0;
		String result=Integer.toString(a);
		/*
		 * Integer.parseInt(String s)将会返回int常量。
		 * Integer.valueOf(String s)将会返回Integer类型，如果存在缓存将会返回缓存中已有的对象。
		 * Integer对象可以自动转为int
		 */
		int num=Integer.valueOf("12");
		int num2=Integer.parseInt("12");
		String a1=String.valueOf("1234");//这里括号中几乎可以是任何类型
		String b=String.valueOf(true);
		String c=new Integer(12).toString();//通过包装类的toString()也可以
		String d=new Double(2.3).toString();
		String str="123";
		int g=Integer.valueOf(str);
		System.out.println(g);
		System.out.println(result+":"+num+":"+num2+":"+a1+":"+b+":"+c+":"+d);
	}

}
