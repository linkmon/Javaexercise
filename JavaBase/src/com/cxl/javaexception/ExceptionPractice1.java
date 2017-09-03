package com.cxl.javaexception;

import java.util.Scanner;

public class ExceptionPractice1 {
	private static Scanner input;
	private static int Age;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = input.nextInt();
		try {
			setAge(age);		
			System.out.println("输入正确,年龄是:" + age);
		} catch (Exception e) {	
			e.printStackTrace();
		}
		finally {
			System.out.println("欢迎提出建议");
		}
	}
	private static void setAge(int age) throws Exception {
		if(age<=0 || age>100) {		
			throw new Exception("年龄必须是0~100之间");	
		}else {
			
			Age = age;	
		}	
	}
}
