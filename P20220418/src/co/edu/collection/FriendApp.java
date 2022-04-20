package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import friendtest.Gender;
import friendtest.Friend;

// 친구목록을 저장하기 위한 App
// 추가, 수정, 삭제, 조회
// 1 > 배열, 2 > 컬렉션   <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		FriendService service = new FriendServiceArray();
		FriendService service = new FriendServiceList();
		// 추가, 수정, 삭제, 조회 => 컨트롤 역할
		
		while(true) {
			System.out.println("1.추가, 2.수정, 3.삭제, 4.조회 5.남자 6.여자");
			int menu = scanner.nextInt();
			scanner.nextLine();
			if(menu == FriendService.ADD) {
				System.out.println("추가할 사람");
				String name = scanner.nextLine();
				System.out.println("추가할 번호");
				String phone = scanner.nextLine();
				System.out.println("성별(MEN / WOMEN");
				String gender = scanner.nextLine();
				Gender gen = Gender.MEN;
				if(gender.startsWith("남")) {
					gen = Gender.MEN;
				}else if(gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone, gen);
				service.addFriend(friend);;
			}else if(menu == FriendService.MOD) {
				System.out.println("수정할 사람");
				String name = scanner.nextLine();
				System.out.println("수정할 번호");
				String phone = scanner.nextLine();
				System.out.println("성별 남 / 여");
				String gender = scanner.nextLine();
				Gender gen = Gender.MEN;
				if(gender.startsWith("남")) {
					gen = Gender.MEN;
				}else if(gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(name, phone, gen);
				service.modFriend(friend);
			}else if(menu == FriendService.DEL) {
				System.out.println("삭제할 사람의 이름을 입력");
				String name = scanner.nextLine();
				service.remFriend(name);
			}else if(menu == FriendService.SEARCH) {
				service.findFriend(null);
			}else if(menu == FriendService.MEN){
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
			}else if(menu == FriendService.WOMEN) {
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for(Friend friend : list) {
					System.out.println(friend.toString());
				}
			}else {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
