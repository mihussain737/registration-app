package com.app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {

	private Connection con;
	private Statement stmnt;

	@Override
	public void connectDB() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "test");
			stmnt = con.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean verifycredentials(String email, String password) {

		try {
			
			ResultSet result = stmnt
					.executeQuery("select * from login where email='" + email + "' and password='" + password + "'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void saveReg(String name, String email, String city, String mobile) {
		try {
			stmnt.executeUpdate("insert into registration values('"+name+"', '"+city+"', '"+email+"','"+mobile+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteReg(String email) {
		// TODO Auto-generated method stub
		try {
			stmnt.executeUpdate("delete  from registration where email='"+email+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateReg(String email, String mobile) {

		try {
			stmnt.executeUpdate("Update registration set mobile='"+mobile+"' where email='"+email+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void closeDB() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public ResultSet getAllReg() {
		try {
			ResultSet resultSet = stmnt.executeQuery("select * from registration");
			return resultSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
