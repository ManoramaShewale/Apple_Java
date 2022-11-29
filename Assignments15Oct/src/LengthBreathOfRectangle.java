import java.util.Scanner;

public class LengthBreathOfRectangle {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in)) {
			float l, b, p;

			System.out.println("Enter the length ");
			l = sc.nextFloat();

			System.out.println("Enter the Breadth ");
			b = sc.nextFloat();

			p = 2 * (l + b);
			System.out.println("Perimeter of rectangle= " + p);
		}
	}
}