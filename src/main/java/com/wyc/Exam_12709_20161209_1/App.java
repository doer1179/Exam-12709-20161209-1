package com.wyc.Exam_12709_20161209_1;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		int count = 0;		//计数器
		for (int i = 101; i < 200; i++) {		//判断101到200之间的所有数，将素数放到list中
			if (isPrime(i)) {
				count++;
				list.add(i);
			}
		}
		System.out.print("101到200间总共有" + count + "个素数，分别是：");
		for (int j = 0; j < list.size(); j++) {	//输出list中的所有元素
			System.out.print(list.get(j) + "  ");
		}
	}
	public static boolean isPrime(int a) {
		boolean flag = true;
		if (a < 2) {// 素数不小于2
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {// 若能被整除，则说明不是素数，返回false
					flag = false;
					break;// 跳出循环
				}
			}
		}
		return flag;
	}
}

