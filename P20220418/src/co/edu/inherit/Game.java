package co.edu.inherit;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ary[] = new int[5];
		int[] star = new int[5];
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
//			System.out.println(ary[i] + " ");
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = i + 1;
		System.out.print("[*]");
		}
		for(int i =0; i < ary.length; i++) {
			int menu = scanner.nextInt();
			if(menu == 1) {
				System.out.println("[" + ary[i] + "]");
			}else if (menu == 2) {	
				System.out.println("[" + ary[i] + "]");
			}else if (menu == 3) {	
				System.out.println("[" + ary[i] + "]");
			}else if (menu == 4) {	
				System.out.println("[" + ary[i] + "]");
			}else if (menu == 5) {	
				System.out.println("[" + ary[i] + "]");
			}else {
				System.out.print("[*]");
			}
		}
	}
}
