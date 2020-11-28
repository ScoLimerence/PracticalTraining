package com.elucidator.jeko;

import javax.management.ImmutableDescriptor;

/**
 * 
 * @author Administrator
 *	抽象和接口都不可实例化，包含未实现的方法，由子类实现
 *	抽象类用extends,接口使用implements
 *	抽象类中必须有方法体，接口中没有方法体
 *	抽象类中的方法体可以实现也不实现
 *	抽象中的方法可用，也可以不用，但接口中的方法必须实现
 */
public abstract class ChouXiang {
	
	void run() {
		
	}
	void print(){
		System.out.println("=======");
	}

}
class JuTi extends ChouXiang{
	
}
