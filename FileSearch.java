package com.operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileSearch {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// File Operations - Search
	public void searchFile() throws IOException {

		System.out.println("Enter the file (with extension) to be searched: ");
		System.out.print("\n\n>>> ");
		String fileName = br.readLine();

		System.out.println("Enter the directory  : ");
		System.out.print("\n\n>>> ");
		String directory = br.readLine();
		File file = new File(directory);
		File fs = new File(directory + fileName);
		String[] flist = file.list();
		int flag = 0;
		if (flist == null) {
			System.out.println("Directory is empty!!");
		} else {
			// Linear search in the array
			for (int i = 0; i < flist.length; i++) {
				String fname = flist[i];
				// Case sensiitive check on the file name
				if (fname.equalsIgnoreCase(fileName) && fs.getCanonicalFile().getName().equals(fileName)) {
					System.out.println("The file " + fileName + " Found");
					flag = 1;
				}

			}
		}
		if (flag == 0) {
			System.out.println("File Not Found");
		}
	}

}
