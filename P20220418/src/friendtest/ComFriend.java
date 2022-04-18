package friendtest;

public class ComFriend extends Friend{

	private String company;
	private String department;
	
	public ComFriend(String name, String phone, String Company, String department) {
		super(name, phone);
		this.company = Company;
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComFriend [name= " + super.getName() + ", phone= " + super.getPhone() + " Company=" + company + ", department=" + department + "]";
	}
	
	

}
