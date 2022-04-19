package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import friendtest.Friend;

// 컬렉션 ArrayList 활용
public class FriendServiceList implements FriendService {
	Scanner scanner = new Scanner(System.in);
	ArrayList friends = new ArrayList();

	@Override
	public void addFriend(Friend friend) {
			System.out.println("추가할 사람");
			String name = scanner.nextLine();
			System.out.println("추가할 번호");
			String phone = scanner.nextLine();
			friends.add(new Friend(name, phone));
	}

	@Override
	public void modFriend(Friend friend) {
		System.out.println("수정할 사람");
		String name = scanner.nextLine();
		System.out.println("수정할 번호");
		String phone = scanner.nextLine();
		for (int i = 0; i < friends.size(); i++) {
			Friend f2 = (Friend) friends.get(i);
			if (f2.getName().equals(name)) {
				f2.setName(name);
				f2.setPhone(phone);
			}
		}
	}

	@Override
	public void remFriend(String name) {
		System.out.println("삭제할 사람의 이름을 입력");
		String name1 = scanner.nextLine();
		for (int i = 0; i < friends.size(); i++) {
			Friend f2 = (Friend) friends.get(i);
			if (f2.getName().equals(name1)) {
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

}
