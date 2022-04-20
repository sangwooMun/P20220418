package co.edu.collection.generic;

public class Box<T> {
	T field; // 기본 클래스의 부모클래스
	
	public void setField(T field) {
		this.field = field;
	}
	
	
	public T getField() {
		return field;
	}
	
}
