package com.formation.domaine;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String login;
	private String passwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public Client(int id, String nom, String prenom, String login, String passwd) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.passwd = passwd;
	}
	
	
	
	public Client(String nom, String prenom, String login, String passwd) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.passwd = passwd;
	}
	public Client() {
		super();
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", passwd=" + passwd
				+ "]";
	}
	
	
	
	
}
