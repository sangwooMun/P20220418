package friendtest;

public class UnivFriend extends Friend{
	
	private String univ;
	private String major;
	
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}


	public String getUniv() {
		return univ;
	}


	public void setUniv(String univ) {
		this.univ = univ;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "UnivFriend [name = " + super.getName() + ", phone = " + super.getPhone() +" univ=" + univ + ", major=" + major + "]";
	}
	
	

}
