package nothing;

public class Student {
	private String fistName;
	private String lastName;
	private Address homeAddress;
	private Address schoolAddress;
	
	
	public Student() {
		super();
	}


	public Student(String fistName, String lastName, Address homeAddress, Address schoolAddress) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
	}


	public String getFistName() {
		return fistName;
	}


	public void setFistName(String fistName) {
		this.fistName = fistName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Address getHomeAddress() {
		return homeAddress;
	}


	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}


	public Address getSchoolAddress() {
		return schoolAddress;
	}


	public void setSchoolAddress(Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fistName+", "+lastName+"\nHome:"+homeAddress.toString()+"\n"+"School: "+ schoolAddress.toString();
	}
}
