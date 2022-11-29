
public class BPersonAddressMain {

	public static void main(String[] args) {

		BPerson p = new BPerson();
		p.setAge(25);
		p.setName("Manu");
		p.setGender("f");
		p.setAddress("Dp road");

		BAddress a = new BAddress();
		a.setCity("pune");
		a.setState("MAHARASHTRA");
		a.setcontry("INDIA");

		System.out.println("Information of person is\n" + p);
		System.out.println("\n" + a);

	}

}
