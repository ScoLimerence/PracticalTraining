package com.elucidator.jeko;
/**
 * 
 * @author Administrator
 *	�ӿڿ������Լ������ԣ����Ա����ʣ����ǲ����޸� final����
 *	�ӿ����ǳ��󷽷�
 *	һ������Լ̳ж���ӿ�
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
