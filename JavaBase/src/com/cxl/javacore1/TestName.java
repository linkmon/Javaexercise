package com.cxl.javacore1;

import java.util.Scanner;

public class TestName {

	private static Scanner sc;

	public static void main(String[] args) {
       System.out.println("请输入你的名字:");
       sc = new Scanner(System.in);
       String name = sc.nextLine();
       System.out.println("你的名字是:" + name);
	}

}
