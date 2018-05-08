package ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import business.ManagementDocument;
import entity.Book;
import entity.Document;
import entity.Journal;
import entity.Newspaper;

public class User {
	//display documents
	public static void display(ArrayList<Document> listD) {
		for (Document d : listD) {
			if(d instanceof Book) System.out.println("Book-"+d);
			if(d instanceof Journal) System.out.println("Journal-"+d);
			if(d instanceof Newspaper) System.out.println("Newspaper-"+d);
		}
	}
	
	public static void main(String[] args) throws IOException {
		ManagementDocument man = new ManagementDocument();
		Scanner scan = new Scanner(System.in);
		boolean keepRuning = true;
		while (keepRuning) {
			//check text file exit
			String fileName = "data.txt";
			File file = new File(fileName);
			if (file.exists() && man.listAll().isEmpty()) {
				man.load(fileName);
			}
			if (!file.exists()) {
				System.out.println("***Load data is not found");
			}
			//menu
			System.out.println("LIBRARY MANAGEMENT 1.0");
			System.out.println("\t1.Add document");
			System.out.println("\t2.search by type");
			System.out.println("\t3.display document");
			System.out.println("\t4.exit");
			System.out.println("---------------------------------------------------------");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				Document d = man.createDoc();
				man.add(d);
				man.save(d, fileName);
				System.out.println("---------------------------------------------------------");
				break;
			case 2:
				System.out.print("Enter type: ");
				scan = new Scanner(System.in);
				String type = scan.next();
				ArrayList<Document> foundType = man.searchByType(type);
				display(foundType);
				System.out.println("---------------------------------------------------------");
				break;
			case 3:
				ArrayList<Document> listD = man.listAll();
				System.out.println("Book-ID, publisher, number of release, author, number of page");
				System.out.println("Journal-ID, publisher, number of release, ID release, month release");
				System.out.println("Newspaper-ID, publisher, number of release, date release");
				System.out.println("=========================================================");
				
				display(listD);
				System.out.println("---------------------------------------------------------");
				break;
			case 4: keepRuning = false;
			}
		}
		
	}
}
