package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin implements Serializable  {
	public Admin(String login, String mdp) {
		super();
		this.login = login;
		this.mdp = mdp;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Long getId() {
		return id;
	}
	@Id@GeneratedValue
	private Long id;
	private String login;
	private String mdp;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
}
