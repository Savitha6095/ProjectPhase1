package com.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		System.out.println("\n\n                            Welcome to LockersMe.com                      ");
		System.out.println("\n                                             By Savitha Krishnaswamy");
		System.out.println("\n\n\n ");
		String instructions = "-------------Choose any of the following options:--------------\n\n"
				+ "1. List                                :  to display the list the names of all files in system in ascending order\n"
				+ "2. Operations                          :  to create , delete and search a file\n"
				+ "3. exit                                :  to exit from the application\n\n";
		System.out.println(instructions);

		ListFile ls = new ListFile();
		FileCreation fc = new FileCreation();
		FileDeletion fd = new FileDeletion();
		FileSearch fs = new FileSearch();

		while (true) {
			System.out.print("\n>>> ");

			String[] s = br.readLine().split(" ");

			if (s[0].equals("List")) {
				System.out.print("\n>>> ");
				System.out.println("Enter the Directory path:");
				String dirPath = br.readLine();

				ls.listFiles(dirPath);
			}

			else if (s[0].equals("Operations")) {
				System.out.println("\n\n Select from the following options: \n");
				String ops = "Enter\n"
						+ "1. Create                              :  to create a new file to the existing directory list\n"
						+ "2. Delete                              :  to delete an exsiting file\n"
						+ "3. Search                              :  to search a file in the directory\n"
						+ "4. Back                                :  to go back to the previous menu\n";
				System.out.println(ops);

				while (true) {
					System.out.print("\n>>> ");

					String[] choice = br.readLine().split(" ");

					if (choice[0].equals("Create")) {
						fc.createFile();
					}

					else if (choice[0].equals("Delete")) {
						fd.deleteFile();
					}

					else if (choice[0].equals("Search")) {
						fs.searchFile();

					} else if (choice[0].equals("Back")) {
						System.out.println(instructions);
					}
				}

			} else if (s[0].equals("exit")) {
				System.exit(0);
			} else {
				System.out.println("Invalid command");
			}
		}

	}

}
