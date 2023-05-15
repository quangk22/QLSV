package quang.dev.model;

public class Student {
	private String name;
	private int age;
	private String id;
	private String address;
	private Double point;

	public Student(String name, int age, String id, String address, Double point) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.address = address;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getPoint() {
		return point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-10s%-10d%-10s%-10.1f\n",id,name,age,address,point);
	}
	
}
