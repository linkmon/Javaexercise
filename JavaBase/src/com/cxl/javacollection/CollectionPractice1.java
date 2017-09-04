package com.cxl.javacollection;

import java.util.HashMap;
import java.util.Map;

public class CollectionPractice1 {

	public static void main(String[] args) {

		Dog xiaobaiDog = new Dog("小白", "萨摩耶");
		Dog xiahuiDog = new Dog("小灰", "哈士奇");
		Dog xiaoheiDog = new Dog("小黑", "阿拉斯加");
		Dog xiaohuangDog = new Dog("小黄", "拉布拉多");
		Map<String, Dog> dogs = new HashMap<String, Dog>();
		dogs.put("小白", xiaobaiDog);
		dogs.put("小灰", xiahuiDog);
		dogs.put("小黑", xiaoheiDog);
		dogs.put("小黄", xiaohuangDog);
		if (dogs.containsKey("小白")) {
			Dog dog = (Dog) dogs.get("小白");
			System.out.println(dog);
		} else {
			System.out.println("小白丢失");
		}
	}
}
