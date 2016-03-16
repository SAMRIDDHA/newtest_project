package com.testproject.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Access 
{

	public ArrayList<Databind> getdetails(Connection con) throws Exception
	{
	ArrayList<Databind> all = new ArrayList<Databind>();
	PreparedStatement stmt = con.prepareStatement("SELECT * FROM test_table");
	ResultSet rs = stmt.executeQuery();
	try
	{
	while(rs.next())
	{
	Databind Obj = new Databind();
	Obj.setname(rs.getString("name"));
	Obj.setprofession(rs.getString("profession"));
	Obj.setcountry(rs.getString("country"));
	Obj.setphone(rs.getString("phone"));
	Obj.setemail(rs.getString("email"));
	all.add(Obj);
	}
	} catch (SQLException e)
	{
	throw e;
	}
	return all;
	 
	}

}
