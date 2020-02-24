public class Employee {
	String name;
	int id;
	double salary;
	Address add;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public Address getAdd() {
		return add;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", add=" + add + "]";
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public void show() {
		System.out.println(name + " : " + id + " : " + salary + " : "+add );
	}

}