package org.sid;

import org.sid.dao.AdminRepository;
import org.sid.dao.SkillsRepository;
import org.sid.dao.StudentRepository;
import org.sid.dao.StudentSkillsRepository;
import org.sid.entities.Admin;
import org.sid.entities.Skills;
import org.sid.entities.Student;
import org.sid.entities.StudentSkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvApplication  implements CommandLineRunner {
	@Autowired
	private SkillsRepository skillsRepository;
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentRepository studentRepository2;
	
	@Autowired
	private StudentRepository studentRepository3;
	
	@Autowired
	private StudentRepository studentRepository4;
	
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private StudentSkillsRepository studentSkillsRepository;
	
	@Autowired
	private StudentSkillsRepository studentSkillsRepository1;
	
	public static void main(String[] args) {
		SpringApplication.run(CvApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		Skills s1= skillsRepository.save(new Skills("JAVA"));
		Skills s2= skillsRepository.save(new Skills("PHP"));
		Skills s3= skillsRepository.save(new Skills("C#"));
		Skills s4= skillsRepository.save(new Skills("JEE"));
		Skills s5= skillsRepository.save(new Skills("DOTNET"));
		Skills s6= skillsRepository.save(new Skills("C"));
		Skills s7= skillsRepository.save(new Skills("PYTHON"));
		Skills s8= skillsRepository.save(new Skills("HTML"));
		Skills s9= skillsRepository.save(new Skills("CSS"));
		Skills s10= skillsRepository.save(new Skills("RUBY"));
		Skills s11= skillsRepository.save(new Skills("COBOL"));
		Skills s12= skillsRepository.save(new Skills("SCALA"));
		Skills s13= skillsRepository.save(new Skills("ARDUINO"));
		Skills s14= skillsRepository.save(new Skills("JAVASCRIPT"));
		Skills s15= skillsRepository.save(new Skills("ANGULARJS"));
		Skills s16= skillsRepository.save(new Skills("ANGULAR"));
		Skills s17= skillsRepository.save(new Skills("IONIC 1"));
		Skills s18= skillsRepository.save(new Skills("IONIC "));
		Skills s19= skillsRepository.save(new Skills("POWERSHELL"));

		

		Student st1 = studentRepository.save(new Student("Dupont", "Albert", "0643536345", "dupont@gmail.com"));
		Student st2 = studentRepository2.save(new Student("Renard", "Herve", "0643333345", "renard@gmail.com"));
		Student st3 = studentRepository3.save(new Student("Morvan", "Yann", "0643532131", "morvan@gmail.com"));
		Student st4 = studentRepository4.save(new Student("Morin", "Marc", "0643536345", "morin@gmail.com"));
		Student st5 = studentRepository.save(new Student("Denoyers", "Xavier", "064226345", "denoyers@gmail.com"));
		Student st6 = studentRepository.save(new Student("Laporte", "Bernard", "0643536345", "laporte@gmail.com"));
		
		Admin a1 = adminRepository.save(new Admin("admin", "admin"));
		Admin a2 = adminRepository.save(new Admin("root", "root"));
		
		StudentSkills ss1 = studentSkillsRepository.save(new StudentSkills(s11, 3, st1));
		StudentSkills ss2 = studentSkillsRepository.save(new StudentSkills(s12, 2, st1));
		StudentSkills ss3 = studentSkillsRepository.save(new StudentSkills(s13, 5, st1));
		StudentSkills ss4 = studentSkillsRepository.save(new StudentSkills(s14, 3, st1));
		StudentSkills ss5 = studentSkillsRepository.save(new StudentSkills(s5, 3, st1));
		StudentSkills ss6 = studentSkillsRepository.save(new StudentSkills(s6, 1, st1));
		StudentSkills ss7 = studentSkillsRepository.save(new StudentSkills(s7, 1, st1));
		StudentSkills ss8 = studentSkillsRepository.save(new StudentSkills(s8, 4, st1));
		StudentSkills ss9 = studentSkillsRepository.save(new StudentSkills(s9, 4, st1));
		StudentSkills ss10 = studentSkillsRepository.save(new StudentSkills(s10, 5, st1));
		StudentSkills ss11 = studentSkillsRepository.save(new StudentSkills(s11, 5, st1));
		StudentSkills ss12 = studentSkillsRepository.save(new StudentSkills(s12, 1, st1));
		StudentSkills ss13 = studentSkillsRepository.save(new StudentSkills(s13, 1, st1));
		StudentSkills ss14 = studentSkillsRepository.save(new StudentSkills(s14, 4, st1));
		StudentSkills ss15 = studentSkillsRepository.save(new StudentSkills(s15, 5, st1));
		StudentSkills ss16 = studentSkillsRepository.save(new StudentSkills(s16, 5, st1));
		StudentSkills ss17 = studentSkillsRepository.save(new StudentSkills(s17, 5, st1));
		StudentSkills ss18 = studentSkillsRepository.save(new StudentSkills(s18, 2, st1));
		StudentSkills ss19 = studentSkillsRepository.save(new StudentSkills(s19, 5, st1));
		
		StudentSkills ss20 = studentSkillsRepository1.save(new StudentSkills(s15, 3, st2));
		StudentSkills ss21 = studentSkillsRepository1.save(new StudentSkills(s16, 2, st2));
		StudentSkills ss22 = studentSkillsRepository1.save(new StudentSkills(s17, 5, st2));
		StudentSkills ss23 = studentSkillsRepository1.save(new StudentSkills(s18, 3, st2));
		StudentSkills ss24= studentSkillsRepository.save(new StudentSkills(s5, 3, st2));
		StudentSkills ss25= studentSkillsRepository.save(new StudentSkills(s6, 4, st2));
		StudentSkills ss26 = studentSkillsRepository.save(new StudentSkills(s7, 4, st2));
		StudentSkills ss27= studentSkillsRepository.save(new StudentSkills(s8, 2, st2));
		StudentSkills ss28= studentSkillsRepository.save(new StudentSkills(s9, 2, st2));
		StudentSkills ss29 = studentSkillsRepository.save(new StudentSkills(s10, 5, st2));
		StudentSkills ss30 = studentSkillsRepository.save(new StudentSkills(s11, 5, st2));
		StudentSkills ss31 = studentSkillsRepository.save(new StudentSkills(s12, 1, st2));
		StudentSkills ss32 = studentSkillsRepository.save(new StudentSkills(s13, 1, st2));
		StudentSkills ss33 = studentSkillsRepository.save(new StudentSkills(s14, 4, st2));
		StudentSkills ss34 = studentSkillsRepository.save(new StudentSkills(s15, 3, st2));
		StudentSkills ss35 = studentSkillsRepository.save(new StudentSkills(s16, 2, st2));
		StudentSkills ss36 = studentSkillsRepository.save(new StudentSkills(s17, 5, st2));
		StudentSkills ss37 = studentSkillsRepository.save(new StudentSkills(s18, 5, st2));
		StudentSkills ss38 = studentSkillsRepository.save(new StudentSkills(s19, 5, st2));

		
		
		StudentSkills ss39 = studentSkillsRepository.save(new StudentSkills(s1, 5, st3));
		StudentSkills ss40= studentSkillsRepository.save(new StudentSkills(s2, 5, st3));
		StudentSkills ss41= studentSkillsRepository.save(new StudentSkills(s3, 2, st3));
		StudentSkills ss42 = studentSkillsRepository.save(new StudentSkills(s4, 4, st3));
		StudentSkills ss443= studentSkillsRepository.save(new StudentSkills(s5, 4, st3));
		StudentSkills ss44= studentSkillsRepository.save(new StudentSkills(s6, 2, st3));
		StudentSkills ss45 = studentSkillsRepository.save(new StudentSkills(s7, 2, st3));
		StudentSkills ss46= studentSkillsRepository.save(new StudentSkills(s8, 4, st3));
		StudentSkills ss47= studentSkillsRepository.save(new StudentSkills(s9, 4, st3));
		StudentSkills ss48 = studentSkillsRepository.save(new StudentSkills(s10, 5, st3));
		StudentSkills ss49 = studentSkillsRepository.save(new StudentSkills(s11, 5, st3));
		StudentSkills ss50 = studentSkillsRepository.save(new StudentSkills(s12, 3, st3));
		StudentSkills ss51 = studentSkillsRepository.save(new StudentSkills(s13, 3, st3));
		StudentSkills ss52 = studentSkillsRepository.save(new StudentSkills(s14, 4, st3));
		StudentSkills ss53 = studentSkillsRepository.save(new StudentSkills(s15, 5, st3));
		StudentSkills ss54 = studentSkillsRepository.save(new StudentSkills(s16, 5, st3));
		StudentSkills ss55 = studentSkillsRepository.save(new StudentSkills(s17, 5, st3));
		StudentSkills ss56 = studentSkillsRepository.save(new StudentSkills(s18, 2, st3));
		StudentSkills ss57 = studentSkillsRepository.save(new StudentSkills(s19, 5, st3));
		
	}
}
