package com.exluctor.basic01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author Administrator
 * 利用字节IO流进行文件的复制读写
 * InputStream和OutputStream相当于两个管道
 */
public class Basic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirPath="D:\\astah-pro.jar";
		String destPath="F:\\copy\\astah-pro.jar";
		/**
		 * 这里分开写的原因是流对象在操作时会产生异常，
		 * 另外流在使用完后需要在finally中关闭，
		 * 此时会因为作用域的问题导致无法利用流对象关闭，故需要分开写，扩大对象的作用域
		 * 在java中实例对象当没有引用指向时，Java垃圾收集器会自动进行释放
		 * 但是流对象还涉及系统资源的占用，Java垃圾回收机制无法释放，
		 * 占用资源例如：端口、文件句柄等等
		 * 流对象为什么最后要在finally中释放：因为当程序产生异常时会直接跳转到catch中
		 * 而不会继续执行下面的代码，故可能导致资源无法释放，内存泄露
		 * 利用finally的特性，无论程序运行是否存在异常都会执行其中的代码块
		 */
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			//流在使用时，开始将资源读到程序中先开输入流，再开输出流
			//在关闭流时，先关输出流，再关输入流
			in=new FileInputStream(dirPath);
			out=new FileOutputStream(destPath);
			//用一个字节数组缓冲要读取的数据，提高读写效率
			byte[] bt=new byte[1024];
			//调用输入流中的read方法，指定一次读取的内容长度，并把内容存到数组中
			//返回读取长度
			int len=in.read(bt);
			while(len!=-1){//当文件读完之后会返回-1
				//输出字节中的内容，当读到最后一行，只输出0-len的内容
				out.write(bt,0,len);
				//继续读取下一个数组大小的内容，直到读完,动态改变Len的值，循环出口
				len=in.read(bt);
			}
			System.out.println("复制成功！");
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
