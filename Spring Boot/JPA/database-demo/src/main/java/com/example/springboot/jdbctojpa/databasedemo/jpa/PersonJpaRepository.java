package com.example.springboot.jdbctojpa.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.springboot.jdbctojpa.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery = 
				entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}

	public Person findById(Integer id){
		return entityManager.find(Person.class, id);
	}
	
	public void deleteById(Integer id){
		Person person = findById(id);
		entityManager.remove(person);
	}


	public Person insert(Person person){
		return entityManager.merge(person);
	}
	

	public Person update(Person person){
		return entityManager.merge(person);
	}
	
	
}
