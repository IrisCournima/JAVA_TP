package com.formation.domaine;

import java.time.LocalDate;
import java.util.Date;

public class Conge {
	private int id;
	private int empId;
	private LocalDate debut;
	private LocalDate fin;
	private String etat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public LocalDate getDebut() {
		return debut;
	}
	public void setDebut(LocalDate dateDeb1) {
		this.debut = dateDeb1;
	}
	public LocalDate getFin() {
		return fin;
	}
	public void setFin(LocalDate dateDeb2) {
		this.fin = dateDeb2;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Conge(int id, int empId, LocalDate debut, LocalDate fin, String etat) {
		super();
		this.id = id;
		this.empId = empId;
		this.debut = debut;
		this.fin = fin;
		this.etat = etat;
	}
	
	public Conge() {
		super();
	}
	
	public Conge(int empId, LocalDate debut, LocalDate fin, String etat) {
		super();
		this.empId = empId;
		this.debut = debut;
		this.fin = fin;
		this.etat = etat;
	}
	
	
	@Override
	public String toString() {
		return "Conge [id=" + id + ", empId=" + empId + ", debut=" + debut + ", fin=" + fin + ", etat=" + etat + "]";
	}

	
	


	
	
}
