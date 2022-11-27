
package com.SpiritPokemon.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
public class MyPokeDB {
	
	Connection con = null;
	public Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("In Connection");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spirit_pokemon","root","chayanika@2508");
			System.out.println("con Done!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
