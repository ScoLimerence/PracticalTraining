package com.exluctor.basic01;
/**
 * 
 * @author Administrator
 *	this �ؼ��ֵ�����ʹ�÷�ʽ
 *	���ʳ�Ա���������ñ����еķ�������ʡ�ԣ������췽����Ƕ�׵���
 */
class People{
	int age;
//	ʹ�������
	public People(int age) {
		this.age = age;
		System.out.println("�вι�����");
	}
	public People() {
		this(10);
		System.out.println("�޲ι�����");
	}

//	ʹ�����һ
	public int getAge() {
		return this.age;
	}
//	ʹ�������
	public void open() {
		System.out.println("open����");
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
