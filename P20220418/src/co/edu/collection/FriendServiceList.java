package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import friendtest.Friend;
import friendtest.Gender;

// 컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Friend> friends = new ArrayList<Friend>();

	@Override
	public void addFriend(Friend friend) {
//			System.out.println("추가할 사람");
//			String name = scanner.nextLine();
//			System.out.println("추가할 번호");
//			String phone = scanner.nextLine();
//			System.out.println("성별");
//			String gender = scanner.nextLine();
//			Gender gen = Gender.MEN;
//			if(gender.startsWith("남")) {
//				gen = Gender.MEN;
//			}else if(gender.startsWith("여")) {
//				gen = Gender.WOMEN;
//			}
//			friends.add(new Friend(name, phone, gen));
		friends.add(friend);
	}

	@Override
	public void modFriend(Friend friend) {
//		System.out.println("수정할 사람");
//		String name = scanner.nextLine();
//		System.out.println("수정할 번호");
//		String phone = scanner.nextLine();
		for (int i = 0; i < friends.size(); i++) {
			Friend f2 = (Friend) friends.get(i);
			if (f2.getName().equals(friend.getName())) {
				f2.setPhone(friend.getPhone());
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {
//		System.out.println("삭제할 사람의 이름을 입력");
//		String name1 = scanner.nextLine();
		for (int i = 0; i < friends.size(); i++) {
			Friend f2 = (Friend) friends.get(i);
			if (f2.getName().equals(name)) {
				friends.remove(i);
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i) != null) {
				System.out.println(friends.get(i));
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for(int i=0; i<friends.size(); i++) {
			if(friends.get(i).getGender() == gender) {
				// 열거형타입 클래스타입 같은 참조타입
				// 기본타입 == 비교연산자
				// 열거형 == 비교연산자
				list.add(friends.get(i));
			}
		}
		return list;
	}

}
