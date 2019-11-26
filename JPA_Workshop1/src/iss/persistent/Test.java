package iss.persistent;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main (String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("JPA01");
		EntityManager em = emf.createEntityManager();
		DataService dataService = new DataService(em);
		
		// Create and persist a member
		createAndPersistMembers(em, dataService);
		
		
		
//		// Find all employees
//		List<Employee> emps = service.findAllEmployees();
//		for (Employee e : emps) {
//			System.out.println("Found employee: " + e);
//		}
//		
//		// Update an employee
//		em.getTransaction().begin();
//		Employee updatedEmp = service.raiseEmployeeSalary(158, 3000);
//		em.getTransaction().commit();
//		System.out.println("Updated " + updatedEmp);
//		
//		// Find an employee
//		Employee e = service.findEmployee(158);
//		System.out.println("Found employee: " + e);
	}
	
	private static void createAndPersistMembers(EntityManager em, DataService dataService) {
		em.getTransaction().begin();
		Member member1 = dataService.createMember(101, "Einstein", "Albert", null);
		Member member2 = dataService.createMember(102, "Picasso", "Pablo", "Ruiz");
		
		em.getTransaction().commit();
		System.out.println("Members have been persisted");
	}
}
