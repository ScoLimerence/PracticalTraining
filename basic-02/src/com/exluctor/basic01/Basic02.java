package com.exluctor.basic01;

public class Basic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="027-89861234";
		String str2="红明小";
		String reg="[\u4e00-\u9fa5]*小+[\u4e00-\u9fa5]*红+[\u4e00-\u9fa5]*|[\u4e00-\u9fa5]*红+[\u4e00-\u9fa5]*小+[\u4e00-\u9fa5]*";
		System.out.println(str2.matches(reg));
		System.out.println(str.matches("^027\\-8986\\d{4}$"));
		
	}

}
