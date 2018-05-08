package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import entity.Book;
import entity.Document;
import entity.Journal;
import entity.Newspaper;

public class ManagementDocument {
	private ArrayList<Document> listD;
	public ManagementDocument() {
		//store documents
		listD = new ArrayList<>();
	}
	//create common detail of document
	private static void commonDetailDoc(Document d) {
		Scanner scan = new Scanner(System.in);
		//id
		System.out.print("ID: ");
		d.setId(scan.next());
		//name publisher
		System.out.print("publisher: ");
		scan = new Scanner(System.in);
		d.setNamePublisher(scan.nextLine());
		//number of release
		boolean checkEx = true;//check exception
		while (checkEx) {
			try {
				scan = new Scanner(System.in);
				System.out.print("Number of release: ");
				d.setNoRelease(scan.nextInt());
				checkEx = false;
			} catch (InputMismatchException e) {
				System.out.println("input a number");
			}
		}
	}
	public Document createDoc() {
		System.out.println("1=Book,2=journal,3=newspaper");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		if (choice==1) {
			//detail of book
			Book b = new Book();
			commonDetailDoc(b);//common details
			//name author
			System.out.print("Author: ");
			scan = new Scanner(System.in);
			b.setAuthor(scan.nextLine());
			//number of page
			boolean checkEx = true;//check exception
			while (checkEx) {
				try {
					System.out.print("Number of page: ");
					scan = new Scanner(System.in);
					b.setNoPage(scan.nextInt());
					checkEx = false;
				} catch (InputMismatchException e) {
					System.out.print("input a number");
				}
			}
			return b;
		}else if (choice==2) {
			//details of journal
			Journal j = new Journal();
			commonDetailDoc(j);//common details
			//id release
			boolean checkEx = true;
			while (checkEx) {
				try {
					scan = new Scanner(System.in);
					System.out.println("ID release: ");
					j.setIdRelease(scan.nextInt());
					checkEx = false;
				} catch (InputMismatchException e) {
					System.out.println("ID relsese is number");
				}
			}
			//month release
			scan = new Scanner(System.in);
			System.out.print("Month release: ");
			j.setMonthRele(scan.nextLine());
			return j;
		}else if (choice==3) {
			//newspaper detail
			Newspaper n = new Newspaper();
			commonDetailDoc(n);//common detail
			//date of release
			boolean checkEx = true;
			while (checkEx) {
				try {
					System.out.print("Date of release: ");
					scan = new Scanner(System.in);
					String dateStr = scan.nextLine();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
					Date date = sdf.parse(dateStr);
					n.setDateRele(sdf.format(date));
					checkEx = false;
				} catch (Exception e) {
					System.out.println("date format: dd/M//yyyy");
				}
			}
			return n;
		}
		return null;
	}
	//add document
	public void add(Document d) {
		listD.add(d);
	}
	//search by type
	public ArrayList<Document> searchByType(String type) {
		ArrayList<Document> fonundType = new ArrayList<Document>();
		if (type.equalsIgnoreCase("Book")) {
			for (Document d : listD) {
				if(d instanceof Book) fonundType.add(d);
			}
		}else if (type.equalsIgnoreCase("Journal")) {
			for (Document d : listD) {
				if(d instanceof Journal) fonundType.add(d);
			}
		}else if (type.equalsIgnoreCase("newspaper")) {
			for (Document d : listD) {
				if(d instanceof Newspaper) fonundType.add(d);
			}
		}
		return fonundType;
	}
		//save data to text file
		public void save(Document d, String fileName) throws IOException {
			File file = new File(fileName);
			if(!file.exists()) file.createNewFile();
			BufferedWriter bfw = new BufferedWriter(new FileWriter(file, true));
			if (d instanceof Book) {
				bfw.write("Book, "+d.toString());
				bfw.newLine();
			}
			if (d instanceof Journal) {
				bfw.write("Journal, "+d.toString());
				bfw.newLine();
			}
			if (d instanceof Newspaper) {
				bfw.write("Newspaper, "+d.toString());
				bfw.newLine();
			}
			bfw.close();
		}
		//load data from text file 
		public void load(String fileName) throws IOException {
			BufferedReader bfr = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line=bfr.readLine())!=null) {
				String[] data = line.split(", ");
				//load details of book
				if (data[0].equalsIgnoreCase("book")) {
					Book b = new Book();
					b.setId(data[1]);
					b.setNamePublisher(data[2]);
					int noRelease = Integer.parseInt(data[3]);
					b.setNoRelease(noRelease);
					b.setAuthor(data[4]);
					int noPage = Integer.parseInt(data[5]);
					b.setNoPage(noPage);
					listD.add(b);//add to list
					//load details of journal
				}else if (data[0].equalsIgnoreCase("journal")) {
					Journal j = new Journal();
					j.setId(data[1]);
					j.setNamePublisher(data[2]);
					int noRelease = Integer.parseInt(data[3]);
					j.setNoRelease(noRelease);
					int idRelease = Integer.parseInt(data[4]);
					j.setIdRelease(idRelease);
					j.setMonthRele(data[5]);
					listD.add(j);//add to list
					//load details newspaper
				}else if (data[0].equalsIgnoreCase("newspaper")) {
					Newspaper n = new Newspaper();
					n.setId(data[1]);
					n.setNamePublisher(data[2]);
					int noRelease = Integer.parseInt(data[3]);
					n.setNoRelease(noRelease);
					n.setDateRele(data[4]);
					listD.add(n);//add to list
				}
			}
			bfr.close();
		}
	//list all
	public ArrayList<Document> listAll() {
		Collections.sort(listD);
		return listD;
	}
}
