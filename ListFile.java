package com.operations;

import java.io.File;
import java.util.Arrays;

public class ListFile {

	// Option 1
	// Retrieve all the files from the mentioned directory in a sorted order.
	public void listFiles(String path) {

		File folder = new File(path);
		if (folder.isDirectory()) {
			File[] fileList = folder.listFiles();
			Arrays.sort(fileList);
			System.out.println("\nNumber of files in the directory is " + fileList.length);
			System.out.println("\n");
			for (File file : fileList) {
				System.out.println(file.getName());
			}
		}

	}
}
