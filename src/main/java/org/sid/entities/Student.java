package org.sid.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Student implements Serializable {
	@Id@GeneratedValue
	private Long id; 
	public Student(String nom, String prenom, String telephone, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.mail = mail;
	}
	private String nom;
	private String prenom;
	private String telephone;
	private String mail;

//	@ManyToOne(fetch=FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	private StudentSkills skills[];
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
//	public StudentSkills[] getSkills() {
//		return skills;
//	}
//	public void setSkills(StudentSkills[] skills) {
//		this.skills = skills;
//	}
	public Long getId() {
		return id;
	}


}
