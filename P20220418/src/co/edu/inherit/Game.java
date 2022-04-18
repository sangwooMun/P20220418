package co.edu.inherit;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ary[] = new int[5];
		// 배열 생성
		System.out.println("번호");

		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) (Math.random() * 5) + 1;
			// 랜덤 값 반환

			///////////
			for (int j = 0; j < i; j++) {
				if (ary[i] == ary[j]) {
					i--;
					break;
				}
			}
			////////////////// 중복 값 제거 1
		}
		for (int i = 0; i < ary.length; i++) {
//////			System.out.println(ary[i] + " ");
			System.out.print("[*]");
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.println(" = 1 ~ 5 의 별중 5가 들어있는 위치를 맞추세요.");
			int menu = scanner.nextInt();
			if (menu == 1) {
				System.out.println("[" + ary[0] + "]");
				if (ary[0] == 5) {
					System.out.println("맞췄습니다.");
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			} else if (menu == 2) {
				System.out.println("[" + ary[1] + "]");
				if (ary[1] == 5) {
					System.out.println("맞췄습니다.");
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			} else if (menu == 3) {
				System.out.println("[" + ary[2] + "]");
				if (ary[2] == 5) {
					System.out.println("맞췄습니다.");
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			} else if (menu == 4) {
				System.out.println("[" + ary[3] + "]");
				if (ary[3] == 5) {
					System.out.println("맞췄습니다.");
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			} else if (menu == 5) {
				System.out.println("[" + ary[4] + "]");
				if (ary[4] == 5) {
					System.out.println("맞췄습니다.");
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			} else {
				System.out.print("[*]");
			}
		}
	}
}
