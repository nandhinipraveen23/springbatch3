package springwithautowirecons;

public class Employee {

	
	int id;
	String name;
	 
	float salary;
	Address address;
	
	
	public Employee(int id, String name, float salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address ;
	}
	 
	 
}
