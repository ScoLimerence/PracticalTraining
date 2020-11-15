package com.exluctor.basic01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author Administrator
 * �����ֽ�IO�������ļ��ĸ��ƶ�д
 * InputStream��OutputStream�൱�������ܵ�
 */
public class Basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath="D:\\astah-pro.jar";
		String destPath="F:\\copy\\astah-pro.jar";
		/**
		 * ����ֿ�д��ԭ�����������ڲ���ʱ������쳣��
		 * ��������ʹ�������Ҫ��finally�йرգ�
		 * ��ʱ����Ϊ����������⵼���޷�����������رգ�����Ҫ�ֿ�д����������������
		 * ��java��ʵ������û������ָ��ʱ��Java�����ռ������Զ������ͷ�
		 * �����������漰ϵͳ��Դ��ռ�ã�Java�������ջ����޷��ͷţ�
		 * ռ����Դ���磺�˿ڡ��ļ�����ȵ�
		 * ������Ϊʲô���Ҫ��finally���ͷţ���Ϊ����������쳣ʱ��ֱ����ת��catch��
		 * ���������ִ������Ĵ��룬�ʿ��ܵ�����Դ�޷��ͷţ��ڴ�й¶
		 * ����finally�����ԣ����۳��������Ƿ�����쳣����ִ�����еĴ����
		 */
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			//����ʹ��ʱ����ʼ����Դ�����������ȿ����������ٿ������
			//�ڹر���ʱ���ȹ���������ٹ�������
			in=new FileInputStream(dirPath);
			out=new FileOutputStream(destPath);
			//��һ���ֽ����黺��Ҫ��ȡ�����ݣ���߶�дЧ��
			byte[] bt=new byte[1024];
			//�����������е�read������ָ��һ�ζ�ȡ�����ݳ��ȣ��������ݴ浽������
			//���ض�ȡ����
			int len=in.read(bt);
			while(len!=-1){//���ļ�����֮��᷵��-1
				//����ֽ��е����ݣ����������һ�У�ֻ���0-len������
				out.write(bt,0,len);
				//������ȡ��һ�������С�����ݣ�ֱ������,��̬�ı�Len��ֵ��ѭ������
				len=in.read(bt);
			}
			System.out.println("���Ƴɹ���");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
