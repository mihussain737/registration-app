package com.app.model;

import java.sql.ResultSet;

public interface DAOService {
 
	public void connectDB();
	public boolean verifycredentials(String email, String password);
	public void saveReg(String name, String email, String city, String mobile);
	public void deleteReg(String email);
	public void updateReg(String email, String mobile);
	public void closeDB();
	public ResultSet getAllReg();
}
