package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("imple")
public class Studentimpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
//    	insert query
    	String query="insert into student(ID,NAME,CITY) values(?,?,?)";
    	int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	public int update(Student student) {
//		update query
		String query="update student set name=?, city=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	public int delete(int id) {
//		delete query
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,id);
		return r;
	}

	public Student getStudent(int id) {
//		selecting single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperimple(); 
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,id);
		return student;
	}

	public List<Student> getAllStudents() {
//		selecting all students
		String query="select * from student";
		List<Student> students=this.jdbcTemplate.query(query,new RowMapperimple());
		return students;
	}
	
}
