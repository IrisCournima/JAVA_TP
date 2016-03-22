package com.formation.test;

import static org.junit.Assert.*;
import org.junit.Test;

import java.text.ParseException;
import java.util.List;
import com.formation.dao.IClientDao;
import com.formation.dao.ICongeDao;
import com.formation.dao.factory.DaoFactory;
import com.formation.domaine.Client;
import com.formation.domaine.Conge;

public class FactoryTest {

	public static void main(String[] args) throws ParseException {
		IClientDao clientDao = DaoFactory.getClientDao();
		ICongeDao congeDao = DaoFactory.getCongeDao();
		List<Client> clients = clientDao.getAllClient();
		System.out.println("\n-----------------------Get all Clients--------------------------");
		for (Client empl : clients) {
			System.out.print(empl);
			System.out.println("\n--------------------------------------------------");
		}
		
		List<Conge> conges = congeDao.getAllConges();
		System.out.println("\n----------------------Get all conges---------------------------");
		for (Conge conge : conges) {
			System.out.print(conge);
			System.out.println("\n--------------------------------------------------");
		}
	}

}
