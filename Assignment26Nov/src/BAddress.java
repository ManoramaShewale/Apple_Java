
public class BAddress {
       String city,state,contry;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getcontry() {
		return contry;
	}

	public void setcontry(String contry) {
		this.contry=contry ;
	}


	public String toString() {
		return "city:" + city + " state:" + state + " contry:" + contry ;
	}
}
