import java.util.Scanner;

public class VolumeOfBox {
	void Volume(int l, int w, int h) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Length: ");
		l = sc.nextInt();
		System.out.println("Enter the Width: ");
		w = sc.nextInt();
		System.out.println("Enter the Height: ");
		h = sc.nextInt();

		//int VolumeOfBox = l * w * h;
		//System.out.println("Volume of box is:" + VolumeOfBox);
         System.out.println("Volume of box is:" + (l * w * h));
	}

	public static void main(String[] args) {

		VolumeOfBox v1 = new VolumeOfBox();
		v1.Volume(0, 0, 0);

	}

}
