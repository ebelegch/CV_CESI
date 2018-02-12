package org.sid.web;

import java.util.List;

import org.sid.dao.AdminRepository;
import org.sid.dao.StudentRepository;
import org.sid.entities.Admin;
import org.sid.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminRestServices {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public List<Admin> getAdmins () {
		return adminRepository.findAll();
	}
	
	@RequestMapping(value="/admin/{id}",method=RequestMethod.GET)
	public Admin getAdmin(@PathVariable Long id) {
		return adminRepository.findOne(id);
	}
	
	@RequestMapping(value="/admins", produces = "application/json",method=RequestMethod.POST)
	public Admin save(@RequestBody Admin s) {
		return adminRepository.save(s);
	}

}
