package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import friendtest.Friend;
import friendtest.Gender;

// 배열의 기능 활용
public class FriendServiceArray implements FriendService {
	Scanner scanner = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
//			System.out.println("추가할 사람");
//			String name = scanner.nextLine();
//			System.out.println("전화번호");
//			String phone = scanner.nextLine();
//			friends[i] = new Friend(name, phone);
		}
	}

	@Override
	public void modFriend(Friend friend) {
//		System.out.println("수정할 사람");
//		String name = scanner.nextLine();
//		System.out.println("수정할 번호");
//		String phone = scanner.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(friend.getName())) {
				friends[i].setPhone(friend.getPhone());
				break;
//				friends[i].setName(name);
//				friends[i].setPhone(phone);
			}
		}
	}

	@Override
	public void remFriend(String name) {
//		System.out.println("삭제할 사람의 이름을 입력");
//		String name1 = scanner.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null && friends[i].getName().equals(name)) {
				friends[i] = null;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for(int i=0; i<friends.length; i++) {
			if(friends[i].getGender() == gender) {
				list.add(friends[i]);
			}
		}
		return list;
	}

}
