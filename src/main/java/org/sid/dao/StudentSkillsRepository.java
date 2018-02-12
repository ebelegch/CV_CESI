package org.sid.dao;

import java.util.List;

import org.sid.entities.StudentSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentSkillsRepository extends JpaRepository<StudentSkills, Long> {
//	@Query("selet ss from student_skills ss where ss.student.id=:x")
//	public List <StudentSkills> listSkills(@Param("x") Long id);
}
