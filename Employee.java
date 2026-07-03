public class Employee {
	
	//properties
	//access specifier , data type , variable name
	
	public String ename;
	private int eid;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", salary=" + salary + "]";
	}
}