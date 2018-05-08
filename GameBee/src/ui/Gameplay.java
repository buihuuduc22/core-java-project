
package ui;

import java.util.ArrayList;
import java.util.Scanner;

import business.BeeHive;
import entity.Bee;

public class Gameplay {

	public static void main(String[] args) {
		BeeHive bh = null;
		boolean keepRunning = true;
		Scanner s = new Scanner(System.in);
		int choice;
		while (keepRunning) {
			// menu
			System.out.println("--------------Bee hive--------------");
			System.out.println("\t1 - Create bee list");
			System.out.println("\t2 - Attack bees");
			System.out.println("\t3 - Exit");
			System.out.print("Enter your choice (1, 2 or 3): ");
			choice = s.nextInt();
			ArrayList<Bee> bees;
			switch (choice) {
			case 1:
				bh = new BeeHive();
				bh.init();// create 10 bees
				bees = bh.getAllBees();
				System.out.println("Bees details at the beginning:");
				showBees(bees);
				break;
			case 2:
				if (bh == null) {
					System.out.println("No bee!");
				} else {
					bh.attackBees();// attach bees
					bees = bh.getAllBees();
					System.out.println("Bees details at the moment:");
					showBees(bees);
				}
				break;
			default:
				keepRunning = false;
			}
		}

	}

	public static void showBees(ArrayList<Bee> bees) {
		int i = 1;
		for (Bee b : bees) {
			System.out.printf("%-5d %10s\n", i, b);
			i++;
		}
	}

}
