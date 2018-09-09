package com.gmail.slartua;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class RepetitiveWords {

	public static String getStringFromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
			String str = "";
			for (; (str = bf.readLine()) != null;) {
				sb.append(str);
				sb.append(System.lineSeparator());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("ERROR");
		}
		return sb.toString();
	}

	public static String[] getWordsFromString(String s) {
		s = s.toLowerCase();
		String[] arr = s.split("[ .,\n!]");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr[j] = null;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static void createRepetitiveWordsFile(File a, File b, File result) {
		if (a == null || b == null || result == null) {
			throw new IllegalArgumentException("Need file");
		}
		String[] arrA = getWordsFromString(getStringFromFile(a));
		String[] arrB = getWordsFromString(getStringFromFile(b));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrB.length; j++) {
				if (arrA[i] == null || arrB[j] == null) {
					continue;
				}
				if (arrA[i].equals(arrB[j])) {
					sb.append(arrA[i] + " ");
				}
			}
		}
		createFile(sb.toString(), result);
	}

	public static void createFile(String s, File file) {
		if (file == null || s == null) {
			throw new IllegalArgumentException("Null pointer");
		}
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(s);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
