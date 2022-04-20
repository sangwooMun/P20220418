package co.edu.collection;

import java.util.ArrayList;

import friendtest.Friend;
import friendtest.Gender;

public interface FriendService {
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int MEN = 5;
	public int WOMEN = 6;
	// 추가, 수정, 삭제, 조회
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
//	public void modFriend(String name, String phone);
	public void remFriend(String name);
	public Friend findFriend(String name);
//	public void modFriend(Friend friend);
	public ArrayList<Friend> findGender(Gender gender);
}
