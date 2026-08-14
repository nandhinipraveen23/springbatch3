package springwithautowire;

public class Address {

	int doorno;
	String city;
	long pincode;
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
