package com.digreene.localdatabaseaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
* Database Access Class
 */
public class DatabaseAccess {

	private static String dbName;

	static final String DRIVE_NAME = "com.mysql.jdbc.Driver";

	static String CONNECTION_URL = null; 

	static final String DB_CONNECTION_USERNAME = "root";

	static final String DB_CONNECTION_PASSWORD = "root";

	public DatabaseAccess(String databaseName) {
		dbName = databaseName;
		CONNECTION_URL = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=true";
	}

	/**
	 * Connection.
	 *
	 * @return Connection, containing reference to connection object created
	 */
	public Connection connect() {
		Connection con = null;
		try {
			// Class.forName(DRIVE_NAME);
			con = DriverManager.getConnection(CONNECTION_URL, DB_CONNECTION_USERNAME, DB_CONNECTION_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	} // end of connect

	/**
	 * Retrieve.
	 *
	 * @param con
	 *            The Connection
	 * @param query
	 *            The Query to Use in Database
	 * @return ResultSet, containing values retrieve using query
	 */
	public ResultSet retrieve(Connection con, String query) {
		ResultSet rset = null;
		try {
			Statement stmt = con.createStatement();

			rset = stmt.executeQuery(query);
			return rset;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rset;
	}// end of retrieve


	/**
	 * Update.
	 *
	 * @param con the connection
	 * @param query the query
	 * @return the rowsAffected
	 */
	public int update(Connection con, String query) {
		int rowsAffected = 0;
		try {
			Statement stmt = con.createStatement();
			rowsAffected = stmt.executeUpdate(query);
			return rowsAffected;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return rowsAffected;
		}
	}

}
