package com.cxl.javacollection;

import java.util.ArrayList;

public class CollectionPractice {

	public static void main(String[] args) {

		Dog xiaobaiDog = new Dog("小白", "萨摩耶");
		Dog xiahuiDog = new Dog("小灰", "哈士奇");
		Dog xiaoheiDog = new Dog("小黑", "阿拉斯加");
		Dog xiaohuangDog = new Dog("小黄", "拉布拉多");
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(xiaobaiDog);
		dogs.add(xiahuiDog);
		dogs.add(xiaoheiDog);
		dogs.add(xiaohuangDog);
		System.out.println("共有" + dogs.size() + "条狗");
		System.out.println("分别是");
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog = (Dog) dogs.get(i);
			System.out.println(dog);
		}
		if (dogs.contains(xiaobaiDog)) {
			System.out.println("小白存在");
		} else {
			System.out.println("小白丢失");
		}
		dogs.remove(0);
		dogs.remove(xiaohuangDog);
		System.out.println("分别是");
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog = (Dog) dogs.get(i);
			System.out.println(dog);
	}
	}
}
