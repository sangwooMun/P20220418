package friendtest;

import java.util.Scanner;

public class friendList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Friend[] friends = new Friend[10];
		
		while(true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			System.out.println("원하는 번호를 입력하세요.");
			int menu = scanner.nextInt();
			scanner.nextLine();
			if(menu == 1) {
				Friend friend = null;
				System.out.println("원하는 친구등록 번호를 입력하세요.");
				System.out.println("1.일반친구 2.학교친구 3.회사친구");
				int menu1 = scanner.nextInt();
				scanner.nextLine();
				System.out.println("이름입력 :");
				String name = scanner.nextLine();
				System.out.println("전화번호 입력 : ");
				String phone = scanner.nextLine();
				if(menu1 == 1) {
					friend = new Friend(name, phone);
				}else if(menu1 == 2) {
					System.out.println("학교 이름을 입력하세요.");
					String univ = scanner.nextLine();
					System.out.println("전공을 입력하세요.");
					String major = scanner.nextLine();
					friend = new UnivFriend(name, phone, univ, major);
				}else if(menu1 == 3) {
					System.out.println("회사를 입력하세요.");
					String company = scanner.nextLine();
					System.out.println("부서를 입력하세요.");
					String dapartment = scanner.nextLine();
					friend = new ComFriend(name, phone, company, dapartment);
				}
				
			for(int i=0; i<friends.length; i++) {
				if(friends[i] == null) {
					friends[i] = friend;
					break;
				}
			}
				
			}else if(menu == 2) {
				for(Friend friend : friends){
					if(friend != null) {
						System.out.println("친구정보 : " + friend.toString());
						System.out.println("-----------------------------------------");
					}
				}
				
			}else if(menu == 3) {
				System.out.println("조회할 친구 이름을 입력하세요.");
				String name = scanner.nextLine();
				for(int i =0; i<friends.length; i++) {
					if(friends[i] != null && friends[i].getName().equals(name)) {
						System.out.println("-----------------------------------------");
						System.out.println("입력한 친구정보 : " + friends[i].toString());
						System.out.println("-----------------------------------------");
					}
				}
				
			}else if(menu == 4) {
				scanner.close();
				System.out.println("시스템 종료");	
				break;
			}
		}
	}

}
