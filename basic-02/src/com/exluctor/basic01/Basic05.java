package com.exluctor.basic01;
/**
 * 
 * @author Administrator
 *	this 关键字的三种使用方式
 *	访问成员变量、调用本类中的方法（可省略）、构造方法的嵌套调用
 */
class People{
	int age;
//	使用情况三
	public People(int age) {
		this.age = age;
		System.out.println("有参构造器");
	}
	public People() {
		this(10);
		System.out.println("无参构造器");
	}

//	使用情况一
	public int getAge() {
		return this.age;
	}
//	使用情况二
	public void open() {
		System.out.println("open方法");
	}
	public void speak() {
		this.open();
		open();
	}

}
public class Basic05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		people.speak();
		System.out.println(people.getAge());
	}

}
