package lab_31_36;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge_33_JavaComparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input number of Player: ");
		int n = scan.nextInt();
		Player[] listP = new Player[n];//store player
		Checker checker = new Checker();//compare player
		//create Player
		for (int i = 0; i < n; i++) {
			System.out.println("create player "+(i+1));
			listP[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();
		Arrays.sort(listP, checker);//sort player
		for (int i = 0; i < listP.length; i++) {
			System.out.printf("%s %s\n", listP[i].name, listP[i].score);
		}
	}
}

class Player {
	String name;
	int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
//compare two player for sort descending
class Checker implements Comparator<Player> {
	public int compare(Player a, Player b) {
		if (a.score == b.score) {
			return a.name.compareTo(b.name);
		} else if (a.score > b.score) {
			return -1;
		} else {
			return 1;
		}
	}

}
