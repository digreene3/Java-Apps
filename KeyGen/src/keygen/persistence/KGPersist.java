package keygen.persistence;

import java.sql.Connection;
import java.sql.ResultSet;

import com.digreene.localdatabaseaccess.DatabaseAccess;

public class KGPersist {

	DatabaseAccess db;
	Connection con;
	
	public KGPersist(){
		db = new DatabaseAccess("keygen");
		con = db.connect();
	}
	
	public ResultSet getKeys(){
		String query = "SELECT * from keygen.keys";
		return db.retrieve(con, query);
	}
	
	public void newKey(String key, String username){
		String query = "INSERT INTO key (key,userID) VALUES ('" + key + "',' (SELECT id from user where username = '" + username  +"'))";
		db.update(con, query);
	}
	
	public ResultSet getUsers(){
		String query = "SELECT * from user";
		return db.retrieve(con, query);
	}
}
