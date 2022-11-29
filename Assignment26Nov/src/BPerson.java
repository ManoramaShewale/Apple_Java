/*Create class Person which has attributes (name, gender, age, Address).
 Address is class which has attributes (city, state, country). Display Persons data
Note. Containment using constructor and getter/setter*/

public class BPerson {
	int age;
	String name, gender, address;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Age:" + age + " Name:" + name + " Gender:" + gender + " Address:" + address;
	}

}
