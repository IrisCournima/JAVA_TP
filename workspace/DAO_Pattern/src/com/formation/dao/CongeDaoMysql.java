package com.formation.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.formation.domaine.Client;
import com.formation.domaine.Conge;

public class CongeDaoMysql implements ICongeDao {
	
	private Connection conn =null;
	private Statement state = null;
	private ResultSet result = null;

	public CongeDaoMysql(Connection conn2) {
		this.conn=conn2;
	}

	@Override
	public void insertConge(Conge Conge) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateConge(Conge Conge) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeConge(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Conge getConge(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Conge> getAllConges() throws ParseException {
		List<Conge> listConges=new ArrayList<>();
		 Conge conge=null;
		 /*try {

		 state = conn.createStatement();
		 result = state.executeQuery("SELECT * FROM client");
		 while (result.next()) {
			 conge=new Conge();
			 conge.setId(result.getInt("id"));
			 conge.setEmpId(result.getInt("empId"));
			 conge.setDebut(result.getDate("debut"));
			 conge.setFin(result.getDate("fin"));
			 conge.setEtat(result.getString("etat"));
			 listConges.add(conge);
		 }
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }*/
		 
		 final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		 
		
		 final String date1 = "01-07-2015";
		 final String date2 = "01-09-2015";
		 final String date3 = "04-08-2015";
		 final String date4 = "08-04-2016";
		 final LocalDate localDate = LocalDate.parse(date1, DATE_FORMAT);
		 final LocalDate localDate2 = LocalDate.parse(date2, DATE_FORMAT);
		 final LocalDate localDate3 = LocalDate.parse(date3, DATE_FORMAT);
		 final LocalDate localDate4 = LocalDate.parse(date4, DATE_FORMAT);
		 
			 LocalDate dateDeb1 = localDate;
			 LocalDate dateDeb2 = localDate2;
			 LocalDate dateDeb3 = localDate3;
			 LocalDate dateDeb4 = localDate4;
	
		 
		 conge=new Conge();
		 conge.setId(1);
		 conge.setEmpId(01);
		 conge.setDebut(dateDeb1);
		 conge.setFin(dateDeb2);
		 conge.setEtat("ok");
		 listConges.add(conge);
		 
		 conge.setId(2);
		 conge.setEmpId(02);
		 conge.setDebut(dateDeb3);
		 conge.setFin(dateDeb4);
		 conge.setEtat("nope");
		 listConges.add(conge);
		 
		return listConges;
	}

}
