package com.gmail.slartua;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		RepetitiveWords.createRepetitiveWordsFile(new File("a.txt"), new File("b.txt"), new File("c.txt"));

	}

}
