package com.example.springboot.jdbctojpa.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.springboot.jdbctojpa.databasedemo.entity.Person;

@Repository // it's talk to the database so it's a Repository - but it would also work with Component 
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//custom RowMapper
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));
			
			return person;
		}
	}
	
		//select * from person
		public List<Person> findAll(){
			return jdbcTemplate.query("select * from person", 
						new PersonRowMapper());
		}
	
		//select * from person where id=?
		public Person findById(Integer id){
			return jdbcTemplate.queryForObject("select * from person where id=?",
					new Object[] {id}, 
					new BeanPropertyRowMapper<Person>(Person.class));
		}
		
		//delete from person where id=?
		public int deleteById(Integer id){
			return jdbcTemplate.update("delete from person where id=?",
					new Object[] {id});
		}
	
		//insert into person(id, name, location, birth_date) values(?,?,?,?)
		public int insert(Person person){
			return jdbcTemplate.update("insert into person(id, name, location, birth_date)"+
					"values(?,?,?,?)",
					new Object[] { person.getId(), person.getName(), person.getLocation(),
							new Timestamp(person.getBirthDate().getTime()) });
		}
		
		//update person set name=?, location=?, birth_date=? where id=?" || watch fort the spaces!!
		public int update(Person person){
			return jdbcTemplate.update("update person "
					+" set name=?, location=?, birth_date=? "
					+" where id=?",
					new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()),
							person.getId() });
		}
}
