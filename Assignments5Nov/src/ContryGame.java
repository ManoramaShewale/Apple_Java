import java.util.Scanner;

public class ContryGame {
	void nationalgame(String game) {
 		switch (game) {

		case "India":
			System.out.println("Hockey");
			break;

		case "Chaina":
			System.out.println("Tennis");
			break;

		case "Bangladesh":
			System.out.println("Kabaddi");
			break;

		case "Italy":
			System.out.println("Football");
			break;

		case "United States":
			System.out.println("Baseball");
			break;

		default:
			System.out.println("Enter correct contry name");

		}
	}

	public static void main(String[] args) {
		System.out.println("Select contry names from list:");
		System.out.println("India,Chaina,Bangladesh,Italy,United States");
		System.out.println("\nEnter Contry Name");
		String game;
		Scanner sc = new Scanner(System.in);
		game = sc.nextLine();

		ContryGame cg = new ContryGame();
		System.out.println("\nContry's National Game Is:");

		cg.nationalgame(game);
		game = game.toLowerCase();
		sc.close();

	}

}
