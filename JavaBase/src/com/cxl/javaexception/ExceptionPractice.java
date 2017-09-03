package com.cxl.javaexception;

import java.util.Scanner;

public class ExceptionPractice {

	private static Scanner input;

	public static void main(String[] arhs) {
		input = new Scanner(System.in);
		try {
			System.out.println("请输入代号(1~3之间的数字)");
			int course = input.nextInt();
			switch (course) {
			case 1:
				System.out.println("语文");
				break;
			case 2:
				System.out.println("数学");
				break;
			case 3:
				System.out.println("英语");
				break;
			default:
				System.out.println("数字不是在1~3之间");
				break;
			}
		} catch (Exception e) {
			System.out.println("输入的不是数字");
		} finally {
			System.out.println("欢迎提出建议");
		}
	}
}
