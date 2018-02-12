package org.sid.web;

import java.util.List;

import org.sid.dao.SkillsRepository;
import org.sid.entities.Skills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsRestServices {
	
	@Autowired
	private SkillsRepository skillsRepository;
	
	@RequestMapping(value="/skills",method=RequestMethod.GET)
	public List<Skills> getSkills () {
		return skillsRepository.findAll();
	}
	
	@RequestMapping(value="/skills/{id}",method=RequestMethod.GET)
	public Skills getCompetence (@PathVariable Long id) {
		return skillsRepository.findOne(id);
	}
	
	@RequestMapping(value="/skills", method=RequestMethod.POST)
	public Skills save(@RequestBody Skills s) {
		return skillsRepository.save(s);
	}
	
}
