package com.exluctor.basic01;

public class Basic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[100];//动态，由程序赋值
//		静态创建即确定
		float [] b=new float[] {0.1f,0.2f,0.3f};
		float [] c= {0.4f,0.5f,0.6f};
		System.out.println(a.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+","+c[i]);
		}
		//规定宽高的二维数组
		int[][] arr=new int[3][4];
//		动态变化宽的二维数组
		int[][] arr1=new int[3][];
		int[][] arr2= {{1,2},{1,2,3,4},{7,8,9}};
		System.out.println(arr2.length);
		//二维数组通过双重for循环遍历，内层循环使用arr[i].length条件
		for(int i=0;i<arr2.length;i++) {
			System.out.println();
			System.out.println(arr2[i].length);
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+",");
			}
		}
	}

}
