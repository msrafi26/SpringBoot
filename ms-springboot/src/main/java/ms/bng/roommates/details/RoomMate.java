package ms.bng.roommates.details;

public class RoomMate {
	
	RoomMate(){
		super();
	}

	public RoomMate(String id, String name, String mobile, String city, String company, String designation,
			String salary) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.city = city;
		this.company = company;
		this.designation = designation;
		this.salary = salary;
	}

	private String id;

	private String name;
	private String mobile;
	private String city;
	private String company;
	private String designation;
	private String salary;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
