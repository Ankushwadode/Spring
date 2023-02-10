package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
    public static void main( String[] args ){
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(jdbcconfig.class);
    	StudentDao studentDao = context.getBean("imple",StudentDao.class);
    	
    	Student student=new Student();
    	
//    	inserting........
//    	student.setId(3);
//    	student.setName("Ankush");
//    	student.setCity("Nagpur");
//    	
//    	int result = studentDao.insert(student);
//    	System.out.println("Number of Student added: "+result);
    	
//    	updating.........
//    	student.setId(3);
//    	student.setName("Tanmay");
//    	student.setCity("Bangalore");
//    	
//    	int result=studentDao.update(student);
//    	System.out.println("Data updated: "+result);
    	
//    	deleting.........
//    	System.out.println("Enter Student ID:");
//    	Scanner s=new Scanner(System.in);
//    	int x=s.nextInt();
//    	s.close();
//    	
//    	int result=studentDao.delete(x);
//    	System.out.println("Rows deleted: "+result);
    	
//    	single students details
//    	Student student2=studentDao.getStudent(3);
//    	System.out.println(student2);
    	
//    	multiple students details
    	List<Student> AS = studentDao.getAllStudents();
    	for(Student student2:AS ){
    		System.out.println(student2);
    	}
    }
}
