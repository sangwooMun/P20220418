package co.edu.test;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		int max = num1;
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		
		
		System.out.println("3수 중에서 가장 큰 값은 " + max + "입니다.");
		
	}

}
