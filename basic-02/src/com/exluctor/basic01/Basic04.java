package com.exluctor.basic01;

public class Basic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[100];//��̬���ɳ���ֵ
//		��̬������ȷ��
		float [] b=new float[] {0.1f,0.2f,0.3f};
		float [] c= {0.4f,0.5f,0.6f};
		System.out.println(a.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+","+c[i]);
		}
		//�涨��ߵĶ�ά����
		int[][] arr=new int[3][4];
//		��̬�仯��Ķ�ά����
		int[][] arr1=new int[3][];
		int[][] arr2= {{1,2},{1,2,3,4},{7,8,9}};
		System.out.println(arr2.length);
		//��ά����ͨ��˫��forѭ���������ڲ�ѭ��ʹ��arr[i].length����
		for(int i=0;i<arr2.length;i++) {
			System.out.println();
			System.out.println(arr2[i].length);
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+",");
			}
		}
	}

}
