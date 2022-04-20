package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1.추가 2.종료");
			System.out.println("선택");

			int menu = 0;
			
			try {
				Class.forName("java.lang.String"); // Exception
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
			try {
						// "10" => 10, "ten => 10 는 안됨
				menu = Integer.parseInt(scanner.next()); //scanner.nextInt(); // RuntimeException
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 범위 초과");
				scanner.nextLine();
			} catch (InputMismatchException | NumberFormatException e2) {
				System.out.println("숫자만 입력");
				scanner.nextLine();
			} catch(Exception e3) {
				System.out.println("알수 없는 예외 발생");
				
			} finally {
				System.out.println("예외처리에서 반드시 한번은 실행");
			}

			if (menu == 1) {
				System.out.println("추가작업");
			} else if (menu == 2) {
				break;
			}
		}
		System.out.println("end of prog");
	}

}
