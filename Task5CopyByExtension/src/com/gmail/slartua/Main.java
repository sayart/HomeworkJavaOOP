package com.gmail.slartua;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ExtentionFileFilter eFF = new ExtentionFileFilter("avi");
		File folder = new File("C://Users/Artem/Downloads");
		File folderTo = new File("D://Films");
		File[] fileList = folder.listFiles(eFF);
		for (File file : fileList) {
			System.out.println(file);
		}
		for (int i = 0; i < fileList.length; i++) {
			File in = new File("" + fileList[i] + "");
			File out = new File(folderTo + "/" + in.getName());
			try {
				StreamWork.copyFile(in, out);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
