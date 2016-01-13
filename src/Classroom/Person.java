package Classroom;


public abstract class Person implements Iperson{
	private String firstName="name1";
	private String lastName="name1";
	private int age;
	private Gender gender;
	private String address;
	private String phone;
	private String parentFName=null;
	private String parentLName=null;
	
		
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return this.address;
		//"This is a super class method";//address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getParentFName() {
		return parentFName;
	}

	public void setParentFName(String parentFName) {
		this.parentFName = parentFName;
	}

	public String getParentLName() {
		return parentLName;
	}

	public void setParentLName(String parentLName) {
		this.parentLName = parentLName;
	}
}
