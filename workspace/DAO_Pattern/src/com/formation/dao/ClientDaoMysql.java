package com.formation.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.formation.domaine.Client;

public class ClientDaoMysql implements IClientDao{
	
	private Connection conn =null;
	private Statement state = null;
	private ResultSet result = null;
	
	public ClientDaoMysql(Connection connection){
		this.conn=connection;
	}

	@Override
	public void insertClient(Client Client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClient(Client Client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeClient(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client getClient(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client login(String login, String passwd) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> getAllClient() {
		List<Client> employes=new ArrayList<>();
		 Client client=null;
		/* try {

		 state = conn.createStatement();
		 result = state.executeQuery("SELECT * FROM client");
		 while (result.next()) {
		 client=new Client();
		 client.setId(result.getInt("id"));
		 client.setNom(result.getString("nom"));
		 client.setPrenom(result.getString("prenom"));
		 employes.add(client);
		 }
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }*/
		 client = new Client();
			client.setId(1);
			client.setNom("Joe");
			client.setPrenom("Junior");
			
			employes.add(client);
			
			client.setId(2);
			client.setNom("Johnson");
			client.setPrenom("Dave");
			
			employes.add(client);
		 return employes;
	}
	
}
