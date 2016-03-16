package com.testproject.servicehandler;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.testproject.test.Access;
import com.testproject.test.Databind;

import com.testproject.test.Dbconnection;

@Path("/service")
public class Service 
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Databind> getconnect() throws Exception
	{
	ArrayList<Databind> List = new ArrayList<Databind>();

	try {
		Dbconnection db= new Dbconnection();
		Connection con = db.getConnection();
		Access access= new Access();
		List= access.getdetails(con);
		 
		} 
		catch (SQLException e) 
		{
		throw e;
		}
		return List;
		}
		 
}
