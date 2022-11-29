import java.util.Scanner;

public class FunctionsCompare {
	void compare(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	void compare(char a, char b) {
		int x = (int) a;
		int y = (int) b;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		FunctionsCompare fc = new FunctionsCompare();

		System.out.println("Enter 1st Integer Number");
		int num1 = sc.nextInt();

		System.out.println("Enter 2nd Integer Number");
		int num2 = sc.nextInt();

		System.out.println("Greater Value");
		fc.compare(num1, num2);

		System.out.println("\nEnter 1st Character Value ");
		char num3 = sc.next().charAt(0);

		System.out.println("Enter 2nd Character Value ");
		char num4 = sc.next().charAt(0);

		System.out.println("Higher Character");
		fc.compare(num3, num4);

		sc.close();

	}

}
