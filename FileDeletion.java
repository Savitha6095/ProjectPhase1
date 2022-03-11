package com.operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDeletion {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// File Operations - Delete
	public void deleteFile() throws IOException {

		System.out.println("Enter the file : ");
		System.out.print("\n>>> ");
		String file = br.readLine();

		File fileToDelete = new File("C:\\Users\\savit\\Desktop\\Savitha Documents\\photo\\" + file);

		try {
			// case sensitivity check on the file name in order to ensure that the right
			// file is deleted from the directory list
			if (fileToDelete.exists() && fileToDelete.getCanonicalFile().getName().equals(file)) {
				fileToDelete.delete();
				System.out.println("File Deleted Successfully");

			} else {
				System.out.println("File Not Found");
			}

		} catch (Exception e) {

		}

	}
}
