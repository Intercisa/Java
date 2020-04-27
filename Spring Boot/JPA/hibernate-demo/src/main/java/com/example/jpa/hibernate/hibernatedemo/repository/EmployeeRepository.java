package com.example.jpa.hibernate.hibernatedemo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.hibernate.hibernatedemo.entity.Employee;
import com.example.jpa.hibernate.hibernatedemo.entity.FullTimeEmployee;
import com.example.jpa.hibernate.hibernatedemo.entity.PartTimeEmployee;

@Repository
@Transactional
public class EmployeeRepository {
	
	private Logger log = 
			LoggerFactory.getLogger(this.getClass());
	
	@PersistenceContext
	EntityManager em;
	
	
	public void insert(Employee employee) {
		em.persist(employee);
	}
	
	public List<Employee> retrieveAllEmployees(){
		return em.createQuery(
				"SELECT e  FROM Employee e", Employee.class)
				.getResultList();
	}
	
	public List<PartTimeEmployee> retrieveAllPartTimEmployees(){
		return em.createQuery(
				"SELECT e  FROM PartTimeEmployee e", PartTimeEmployee.class)
				.getResultList();
	}
	
	public List<FullTimeEmployee> retrieveAllFullTimeEmployees(){
		return em.createQuery(
				"SELECT e  FROM FullTimeEmployee e", FullTimeEmployee.class)
				.getResultList();
	}
	
	
}
