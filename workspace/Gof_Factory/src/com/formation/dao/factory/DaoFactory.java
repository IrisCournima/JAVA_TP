package com.formation.dao.factory;

import java.sql.Connection;

import com.formation.dao.ClientDaoMysql;
import com.formation.dao.CongeDaoMysql;
import com.formation.dao.IClientDao;
import com.formation.dao.ICongeDao;
import com.formation.singleton.SingletonConnexion;

public class DaoFactory {
	protected static final Connection conn =
			SingletonConnexion.getInstance().getConnexion();
	
	public static IClientDao getClientDao(){
		return new ClientDaoMysql(conn);
	}
	
	public static ICongeDao getCongeDao(){
		return new CongeDaoMysql(conn);
	}
}
