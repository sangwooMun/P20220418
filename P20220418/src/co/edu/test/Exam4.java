package co.edu.test;

public class Exam4 {
	private String name;
	private String birth;
	private String phone;
	
	
	
	public Exam4(String name, String birth, String phone) {
		super();
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	void showInfo() {
		System.out.printf("이름 : %4s \n생일 : %4s\n 전화번호 : %2s \n", name, birth, phone );
	}
	
	
	
}
