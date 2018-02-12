package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
public class StudentSkills implements Serializable {
	@Id@GeneratedValue
	private Long id;
	public Skills getSkill() {
		return skill;
	}
	public void setSkill(Skills skill) {
		this.skill = skill;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Long getId() {
		return id;
	}
	@OneToOne()
	@JoinColumn(name="CODE_SK")
	private Skills skill;
	private float note;
	@OneToOne()
	
	@JoinColumn(name="CODE_ST")
	private Student student;
	public StudentSkills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentSkills(Skills skill, float note, Student student) {
		super();
		this.skill = skill;
		this.note = note;
		this.student = student;
	}
	
}
