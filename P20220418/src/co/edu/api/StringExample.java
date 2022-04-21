package co.edu.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class StringExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 주민번호 > 생년월일-성별 구분기능
		
		// 950405-1234567 > 95년 4월 5일 생, 남자입니다.
		// 991001-2345678 > 99년 10월 1일 생, 여자입니다.
		// 9804051234567 > 97년 4월 5일 생, 남자입니다.
		// 0505053456789 > 05년 5월 5일 생, 남자입니다.
//		String jumin = checkInfo(info);
//		System.out.println(jumin);
		String jumin = scanner.nextLine();
		char sex = jumin.charAt(7);
		if (sex == '1' || sex == '3') {
			String firstNum = jumin.substring(0, 2);
			String firstNum1 = jumin.substring(3, 4);
			String firstNum2 = jumin.substring(5, 6);
			System.out.println(firstNum + "년 " + firstNum1+ "월 " + firstNum2 + "일생 ");
			System.out.println("남자입니다.");
		} else if (sex == '2' || sex == '4') {
			String firstNum = jumin.substring(0, 2);
			String firstNum1 = jumin.substring(3, 4);
			String firstNum2 = jumin.substring(5, 6);
			System.out.println(firstNum + "년 " + firstNum1+ "월 " + firstNum2 + "일생 ");
			System.out.println("여자입니다.");
		}

	}

	public static String checkInfo(String jumin) {
		
		String jumins[] = new String[2];
		
		char sex = jumin.charAt(7);
		if (sex == 1 || sex == 3) {
			String firstNum = jumin.substring(0, 2);
			String firstNum1 = jumin.substring(3, 4);
			String firstNum2 = jumin.substring(5, 6);
			System.out.println(firstNum + "년 " + firstNum1+ "월 " + firstNum2 + "일생 ");
			System.out.println("남자입니다.");
		} else if (sex == 2 || sex == 4) {
			String firstNum = jumin.substring(0, 2);
			String firstNum1 = jumin.substring(3, 4);
			String firstNum2 = jumin.substring(5, 6);
			System.out.println(firstNum + "년 " + firstNum1+ "월 " + firstNum2 + "일생 ");
			System.out.println("여자입니다.");
		}
	
		return jumin;

	}
}
