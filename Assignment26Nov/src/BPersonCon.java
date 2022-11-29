
public class BPersonCon {
	int age;
	String name,gender,address;
	
	BPersonCon(int age, String name,String gender,String address)
	{
		this.age=age;
		this.name=name;
		this.gender=gender;
		this.address=address;
	}
	public String toString()
	{
		return "Age:"+age+" Name:"+name+" Gender:"+gender+" Address:"+address;
	}
	
}
