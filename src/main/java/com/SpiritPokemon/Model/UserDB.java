package com.SpiritPokemon.Model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.SpiritPokemon.Beans.register;

public class UserDB {
	String s1=null;
	public String insertUser(String name, int age, String email, String password, String country) {
		MyPokeDB db = new MyPokeDB();
		Connection con = db.getCon();
		try {
			java.sql.Statement stmt = con.createStatement();
			System.out.println("In insert.");
			stmt.executeUpdate("insert into register values('"+name+"',"+age+",'"+email+"','"+password+"','"+country+"');");
			System.out.println("Good insert.");
			
			s1 = "Data inserted";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
		
	}
	
	public register getUser(register user) {
		register ret = new register();
		MyPokeDB db = new MyPokeDB();
		ResultSet rs=null;
		boolean flag=false;
		Connection con = db.getCon();
		try {
			java.sql.Statement stmt = con.createStatement();
			System.out.println("In update.");
			rs = stmt.executeQuery("select name,email,password from register where email='" + user.getEmail() + "' and password='" + user.getPassword() + "';");
			System.out.println("Good update.");
			flag = rs.next();
			if(flag!=false)
			ret.setName(rs.getString("name"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag==false) return null;
		
		else return ret;
	}
}
