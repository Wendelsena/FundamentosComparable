package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override // serve para comparar um objeto com o outro. 
	public int compareTo(Employee other) { // compara um funcionario ao outro (Ordenção por nome)
		return -salary.compareTo(other.getSalary()); // dessa forma, aproveito a classe string que já existe. (- altera a ordem do maior pro menor)
	}
	
	
}
