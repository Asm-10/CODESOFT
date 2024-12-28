package studentgrade;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1, s2, s3, s4, s5, s6;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter first marks");
		s1 = scan.nextInt();
		System.out.print("enter second marks");
		s2 = scan.nextInt();
		System.out.print("enter third  marks");
		s3 = scan.nextInt();
		System.out.print("enter fourth marks");
		s4 = scan.nextInt();
		System.out.print("enter fifth marks");
		s5 = scan.nextInt();
		System.out.print("enter sixth marks");
		s6 = scan.nextInt();
		System.out.printf("sum is : %d\n", s1 + s2 + s3 + s4 + s5 + s6);
		float avg = (s1 + s2 + s3 + s4 + s5 + s6) / 6;

		System.out.printf("average is : %.1f\n", avg);
		if (avg <= 40) {
			System.out.println("Grade is D");
		} else if (avg >= 41 && avg < 60) {
			System.out.println("Grade is C");
		} else if (avg >= 61 && avg <= 89) {
			System.out.println("Grade is B");
		} else {
			System.out.println("Grade is A");
		}

	}

}
