package co.edu.collection.generic;

import java.util.ArrayList;

import friendtest.Friend;

class Orange extends Object {

}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setField("Orange");
		String result = box.getField(); // Object 파일을 String으로 받고싶으면 형변환이 필요함
		
		Box<Integer> box2 = new Box<Integer>();
		box2.setField(10);
		Integer result2 = box2.getField();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍홍홍");
		list.add("길길길");
		
		ArrayList<Friend> friend = new ArrayList<Friend>();
//		friend.add(new Friend("동동동", "010-2222", "남"));
		
//		Orange orange = (Orange) box.getField(); // Object > Orange
		
		System.out.println("ent of prog");
	}

}
