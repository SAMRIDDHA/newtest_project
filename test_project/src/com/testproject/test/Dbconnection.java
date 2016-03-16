package com.testproject.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Dbconnection {
 
public Connection getConnection() throws Exception
{
try
{
String connectionURL = "jdbc:mysql://188.166.17.52/java_test_1";
Connection connection = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
connection = DriverManager.getConnection(connectionURL, "test_user_1", "T3$t1ng");
return connection;
}
catch (SQLException e)
{
throw e;
}
catch (Exception e)
{
throw e;
}
}
 
}
