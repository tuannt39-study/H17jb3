package nothing;

public class Address {
	private  String  streetAddress;
	private String city;
	private String state;
	private long zipCode;
	
	
	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


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


	public long getZipCode() {
		return zipCode;
	}


	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}


	public Address(String streetAddress, String city, String state, long zipCode) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}


	public Address() {
		super();
	}


	@Override
	public String toString() {
		return streetAddress+", "+city+", "+state+", "+zipCode;
	}

}
