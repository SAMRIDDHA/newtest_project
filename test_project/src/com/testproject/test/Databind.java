package com.testproject.test;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Databind {

	private String name;
	private String profession;
	private String country;
	private String phone;
	private String email;
	 
	public Databind()
	{
	 
	}
	 
	public Databind(String name, String profession,String country, String phone, String email)
	{
	
	this.name = name;
	this.profession = profession;
	this.country = country;
	this.phone = phone;
	this.email = email;
	}
	 
	public String getname()
	{
	return name;
	}
	 
	public void setname(String name)
	{
	this.name = name;
	}
	 
	public String getprofession()
	{
	return profession;
	}
	 
	public void setprofession(String profession)
	{
	this.profession = profession;
	}
	 
	public String getcountry()
	{
	return country;
	}
	 
	public void setcountry(String country)
	{
	this.country = country;
	}
	
	public String getphone()
	{
	return phone;
	}
	 
	public void setphone(String phone)
	{
	this.phone = phone;
	}
	 
	public String getemail()
	{
	return email;
	}
	 
	public void setemail(String email)
	{
	this.email = email;
	}
	
}
