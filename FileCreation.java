package com.operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCreation {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// File Operations - Create
	public void createFile() throws IOException {

		System.out.println("Enter the file to be added : ");
		System.out.print("\n>>> ");
		String file = br.readLine();

		System.out.println("Enter the directory  : ");
		System.out.print("\n\n>>> ");
		String directory = br.readLine();
		String path = directory + file;

		File myFile = new File(path);
		myFile.getParentFile().mkdirs();

		if (myFile.createNewFile()) {

			System.out.println("File " + file + " has been created Successfully");
		} else {
			System.out.println("Error creating the file");
		}

	}
}
