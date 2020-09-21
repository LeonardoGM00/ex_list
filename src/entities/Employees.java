package entities;

public class Employees {
		
	private String name;
	private Integer id;
	private Double salary;
	
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id; 
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Employees (String name, Double salary, Integer id) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void increaseSalary (Double percentage) {
		this.salary += salary * (percentage / 100);
	}
	
	public String toString() {
		return id 
			+ ", "
			+ name
			+ ", "
			+ salary;
	}
	
	
}
