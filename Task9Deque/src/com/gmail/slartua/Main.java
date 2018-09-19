package com.gmail.slartua;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> bigBang = new ArrayDeque<String>();
		bigBang.push("Volovitc");
		bigBang.push("Kutrapalli");
		bigBang.push("Penny");
		bigBang.push("Sheldon");
		bigBang.push("Leonard");
		System.out.println(bigBang);
		cloneCola(bigBang, 4);
		System.out.println(bigBang);
		
	}
	public static void cloneCola(ArrayDeque<String> que, int colas) {
		for (int i = 0; i < colas; i++) {
			que.addLast(que.getFirst());
			que.addLast(que.pop());
		}
	}
}
