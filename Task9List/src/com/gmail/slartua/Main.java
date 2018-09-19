package com.gmail.slartua;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		fillList(a, 10);
		System.out.println(a);
		removeFromList(a, 2, 1);
		System.out.println(a);
	}

	public static void fillList(List<Integer> list, int length) {
		for (int i = 0; i < length; i++) {
			list.add((int) (Math.random() * 10000));
		}
	}

	public static void removeFromList(List<Integer> list, int fromBegin, int fromEnd) {
		if (fromBegin + fromEnd > list.size()) {
			list.clear();
			return;
		}
		for (int i = 0; i < fromBegin; i++) {
			list.remove(0);
		}
		for (int i = 0; i < fromEnd; i++) {
			list.remove(list.size() - 1);
		}
	}

}
