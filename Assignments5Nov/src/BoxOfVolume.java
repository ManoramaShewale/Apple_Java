import java.util.Scanner;
//1.	Create class Box and calculate the volume of box 
//volume=length x width x height (create separate method for volume).

public class BoxOfVolume {
	void Volume(int l, int w, int h) {
		System.out.println("Volume of box is:" + (l * w * h));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, w, h;
		System.out.println("Enter the Length: ");
		l = sc.nextInt();

		System.out.println("Enter the Width: ");
		w = sc.nextInt();

		System.out.println("Enter the Height: ");
		h = sc.nextInt();

		BoxOfVolume c1 = new BoxOfVolume();
		c1.Volume(l, w, h);
		sc.close();
	}

}
