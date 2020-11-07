package com.elucidator.jeko;
/**
 * 
 * @author Administrator
 *	接口可以有自己的属性，可以被访问，但是不能修改 final修饰
 *	接口中是抽象方法
 *	一个类可以继承多个接口
 */
public interface ChuShi {
	public final int TAG1=1;
	void chaoCai();
}
interface Driver {
	public final int TAG2=2;
	void drive();
}

class Student implements ChuShi,Driver{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chaoCai() {
		// TODO Auto-generated method stub
		
	}
	
}
