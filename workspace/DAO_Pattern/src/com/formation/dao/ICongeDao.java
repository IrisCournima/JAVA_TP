package com.formation.dao;

import java.text.ParseException;
import java.util.List;

import com.formation.domaine.Client;
import com.formation.domaine.Conge;

public interface ICongeDao {
	public void insertConge(Conge Conge);
	public void updateConge(Conge Conge);
	public void removeConge(int id);
	public Conge getConge(int id);
	public List<Conge> getAllConges() throws ParseException;
}
