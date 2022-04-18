package co.edu.friend;

import java.util.Scanner;

public class FriendList {

	public static void main(String[] args) {

//		final String val = "Hong";
//		val = "Hong2";

		Friend[] friends = new Friend[10];

//		friends[0] = new UnivFriend("홍길동","010-1111-1111", "대구대", "컴정");
//		friends[1] = new ComFriend("김길동","010-2222-2222", "네이버", "개발팀");
//		friends[2] = new Friend("박길동","010-3333-3333");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1.친구등록 2.리스트 3.조회(이름) 4.종료");
			int menu = scanner.nextInt();
			scanner.nextLine();
			if (menu == 1) {
				Friend friend = null;
				System.out.println("1.일반친구 2.학교친구 3.회사친구");
				int menu1 = scanner.nextInt(); // 1
				scanner.nextLine();
				System.out.println("이름");
				String name = scanner.nextLine();
				System.out.println("전화번호");
				String phone = scanner.nextLine();

				if (menu1 == 1) {
					friend = new Friend(name, phone);
				} else if (menu1 == 2) {
					System.out.println("학교이름");
					String unvi = scanner.nextLine();
					System.out.println("전공");
					String major = scanner.nextLine();
					friend = new UnivFriend(name, phone, unvi, major);
				} else if (menu1 == 3) {
					System.out.println("회사이름");
					String company = scanner.nextLine();
					System.out.println("부서");
					String department = scanner.nextLine();
					friend = new ComFriend(name, phone, company, department);
				}

				// 비어있ㅎ는 위치배열 저장
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
			} else if (menu == 2) {
				for (Friend friend : friends) {
					if (friend != null) { // null이 아닌 경우에만
						System.out.println("친구정보 : " + friend.toString());
					}
				}
			} else if (menu == 3) {
				System.out.println("조회할 사람의 이름을 입력하세요 : ");
				String name = scanner.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].getName().equals(name)) {
						System.out.println("정보 : " + friends[i].toString());
					}
				}
			} else if (menu == 4) {
				scanner.close();
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
