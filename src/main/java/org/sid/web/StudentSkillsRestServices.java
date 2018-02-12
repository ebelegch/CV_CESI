package org.sid.web;

import java.util.List;

import org.sid.dao.StudentSkillsRepository;
import org.sid.entities.StudentSkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentSkillsRestServices {
	
	@Autowired
	private StudentSkillsRepository studentSkillsRepository;
	
	@RequestMapping(value="/studentsskills",method=RequestMethod.GET)
	public List<StudentSkills> getStudents () {
		return studentSkillsRepository.findAll();
	}
	
	@RequestMapping(value="/studentsskills/{id}",method=RequestMethod.GET)
	public StudentSkills getStudent(@PathVariable Long id) {
		return studentSkillsRepository.findOne(id);
	}
	
	@RequestMapping(value="/studentsskills", produces = "application/json",method=RequestMethod.POST)
	public StudentSkills save(@RequestBody StudentSkills s) {
		return studentSkillsRepository.save(s);
	}
}
