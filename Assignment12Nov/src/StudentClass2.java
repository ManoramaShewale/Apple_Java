import java.util.Scanner;

public class StudentClass2 {

	int s1, s2, s3, s4, s5;

//int marks		
	void marks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Five Subjects Marks");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();
		s5 = sc.nextInt();

		sc.close();
		// int total = s1 + s2 + s3 + s4 + s5;
		// return total;

	}

	float calculate() {
		// float percentage = total / 5;
		float percentage = (s1 + s2 + s3 + s4 + s5) / 5;
		System.out.println("\nPercentage is :" + percentage);
		return percentage;
	}

	void result(float percentage) {

		if (percentage >= 75) {
			System.out.println("Distinction");
		} else if (percentage >= 60) {
			System.out.println("First class");
		} else if (percentage >= 50) {
			System.out.println("Second class");
		} else if (percentage >= 35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass2 sc = new StudentClass2();
		sc.marks();
		float percentage = sc.calculate();
		sc.result(percentage);

	}

}
