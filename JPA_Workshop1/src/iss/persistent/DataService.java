package iss.persistent;

import java.util.List;

import javax.persistence.*;

public class DataService {
	protected EntityManager em;
	
	public DataService(EntityManager em) {
		this.em = em;
	}
	
	public Employee createEmployee(int id, String name, long salary) {
		Employee emp = new Employee(id);
		emp.setName(name);
		emp.setSalary(salary);
		em.persist(emp);
		
		return emp;
	}
	
	public Member createMember(int memberNumber, String surname, String firstName, String secondName) {
		Member member = new Member();
		member.setMemberNumber(memberNumber);
		member.setSurname(surname);
		member.setFirstName(firstName);
		member.setSecondName(secondName);
		em.persist(member);
		
		return member;
	}
	
	public Employee raiseEmployeeSalary(int id, long raise) {
		Employee emp = em.find(Employee.class, id);
		if (emp != null) {
			emp.setSalary(emp.getSalary() + raise);
		}
		
		return emp;
	}
	
	public Employee findEmployee(int id) {
		return em.find(Employee.class, id);
	}
	
	public List<Employee> findAllEmployees() {
		TypedQuery<Employee> query = em.createQuery(
				"SELECT e FROM Employee e", Employee.class);
		return query.getResultList();
	}
}
