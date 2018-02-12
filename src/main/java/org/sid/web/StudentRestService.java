package org.sid.web;

import java.util.List;

import org.sid.dao.StudentRepository;
import org.sid.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestService {

	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping(value="/students",method=RequestMethod.GET)
	public List<Student> getStudents () {
		return studentRepository.findAll();
	}
	
	@RequestMapping(value="/student/{id}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable Long id) {
		return studentRepository.findOne(id);
	}
	
	@RequestMapping(value="/students", produces = "application/json",method=RequestMethod.POST)
	public Student save(@RequestBody Student s) {
		return studentRepository.save(s);
	}
	
	
}
