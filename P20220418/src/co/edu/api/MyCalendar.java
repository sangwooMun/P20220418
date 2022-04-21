package co.edu.api;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		int year = 0;
		int month = 0;
		
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("년도를 입력하세요");
		year = Integer.parseInt(scanner.nextLine());
		System.out.println("월을 입력하세요");
		month = Integer.parseInt(scanner.nextLine());
		
		cal.set(year, month-1, 1);
		
		System.out.println(year + "년도 " + month + "달");
		
		for(String n:days) {
			System.out.print(n + "\t");
		}
		System.out.println();
		
		int week=cal.get(Calendar.DAY_OF_WEEK); // 3
//		System.out.println(week);
		int first_day=cal.get(Calendar.DAY_OF_MONTH); //첫날
		int last_day=cal.getActualMaximum(Calendar.DATE); //마지막날
		int count=0; //찍는 횟수
		int i=0;
		
		while(first_day<=last_day) {
			i++;
			
			if(first_day > last_day) {
				break;
			}
			if(count%7==0) {
				System.out.println();
				count=0;
			}
			if(i>=week) {
				System.out.print(first_day + "\t");
				++first_day;
			}else {
				System.out.print(" \t");
			}
			++count;
		}
		scanner.close();
	}

}
