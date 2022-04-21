package co.edu.test;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Exam4[] members = new Exam4[10];
		
		while(true) {
			System.out.println("1.추가 2.수정 3.삭제. 4.조회 5.종료");
			System.out.println("선택");
			int menu = scanner.nextInt();
			scanner.nextLine();
			if(menu == 1) {
				System.out.println("추가할 사람 이름");
				String name = scanner.nextLine();
				System.out.println("추가할 생일");
				String birth = scanner.nextLine();
				System.out.println("추가할 전화번호");
				String phone = scanner.nextLine();
				Exam4 member = new Exam4(name, birth, phone);
				
				for(int i=0; i<members.length; i++) {
					if(members[i] == null) {
						members[i] = member;
						break;
					}
				}
			}else if(menu == 2) {
				System.out.println("이름");
				String name = scanner.nextLine();
				System.out.println("전화번호");
				String phone = scanner.nextLine();
				for(int i=0; i<members.length; i++) {
					if(members[i] != null && members[i].getName().equals(name)) {
						members[i].setPhone(phone);
					}
				}
				
			}else if(menu == 3) {
				System.out.println("삭제할 사람 이름");
				String name = scanner.nextLine();
				for(int i =0; i<members.length; i++) {
					if(members[i] != null && members[i].getName().equals(name)) {
						members[i] = null;
					}
				}
				
			}else if(menu == 4) {
				System.out.println("조회할 사람 이름");
				String name = scanner.nextLine();
				for(int i=0; i<members.length; i++) {
					if(members[i] != null && members[i].getName().equals(name)) {
						members[i].showInfo();
					}
				}
				
			}else if(menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				break;
			}
		}
		
	}

}
