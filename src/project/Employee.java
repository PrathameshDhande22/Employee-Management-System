package project;

import java.util.HashMap;

/**
 * <b>Employee class</b> </br>
 * The main Work of this class is to store the employee details and hide it from
 * getting any details.
 * 
 * @author Prathamesh
 *
 */
public final class Employee {
	private String fname;
	private String mname;
	private String lname;
	private String address;
	private HashMap<String, Integer> dict;
	private int salary;
	private int age;
	private String posting;
	private String id;

	public Employee(String fname, String mname, String lname, String address, int salary, int age, String posting) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.address = address;
		this.salary = salary;
		this.age = age;
		this.posting = posting;
		dict = new HashMap<>();
		dict.put("Software Developer", 202);
		dict.put("Analyst", 203);
		dict.put("Devops Engineer", 204);
		dict.put("Computer Mechanics", 205);
		dict.put("web Developer", 206);
	}

	public Employee(String fname, String mname, String lname, String address, int salary, int age, String posting,
			String id) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.address = address;
		this.salary = salary;
		this.age = age;
		this.posting = posting;
		this.id = id;
		dict = new HashMap<>();
		dict.put("Software Developer", 202);
		dict.put("Analyst", 203);
		dict.put("Devops Engineer", 204);
		dict.put("Computer Mechanics", 205);
		dict.put("web Developer", 206);
	}

	public String getID() {
		return id;
	}

	public int getPostID() {
		return dict.get(posting);
	}

	public String getFname() {
		return fname;
	}

	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", address=" + address
				+ ", salary=" + salary + ", age=" + age + ", posting=" + posting + ", postid= " + getPostID() + ", id= "
				+ id + "]";
	}

}
