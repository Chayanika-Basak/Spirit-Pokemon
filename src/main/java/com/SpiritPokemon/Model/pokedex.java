package com.SpiritPokemon.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.SpiritPokemon.Beans.poke;

public class pokedex {
	public poke getPoke(poke mon) {
		poke ret = new poke();
		MyPokeDB db = new MyPokeDB();
		ResultSet rs=null;
		Connection con = db.getCon();
		try {
			java.sql.Statement stmt = con.createStatement();
			System.out.println("In pokedex retrieve.");
			if(mon.getAgainst_water()==-1)
				rs = stmt.executeQuery("select * from abilities where type1='" + mon.getType1() + "' and type2='" + mon.getType2() + "' and against_water=1;");
			else if(mon.getAgainst_fire()==-1)
				rs = stmt.executeQuery("select * from abilities where type1='" + mon.getType1() + "' and type2='" + mon.getType2() + "' and against_fire=1;");
			else if(mon.getAgainst_bug()==-1)
				rs = stmt.executeQuery("select * from abilities where type1='" + mon.getType1() + "' and type2='" + mon.getType2() + "' and against_bug=1;");
			else if(mon.getAgainst_ghost()==-1)
				rs = stmt.executeQuery("select * from abilities where type1='" + mon.getType1() + "' and type2='" + mon.getType2() + "' and against_ghost=1;");
			System.out.println("Good pokedex retrieve.");
			rs.next();
			ret.setName(rs.getString("name"));
			ret.setAbilities(rs.getString("abilities"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ret;
	}
	
	public poke getMyPoke(poke mon) {
		poke ret = new poke();
		MyPokeDB db = new MyPokeDB();
		ResultSet rs=null;
		Connection con = db.getCon();
		try {
			java.sql.Statement stmt = con.createStatement();
			System.out.println("In pokedex retrieve.");
			rs = stmt.executeQuery("select * from abilities where name='" + mon.getName() + "';");
			System.out.println("Good pokedex retrieve.");
			rs.next();
			ret.setName(rs.getString("name"));
			ret.setType1(rs.getString("type1"));
			ret.setType2(rs.getString("type2"));
			ret.setAbilities(rs.getString("abilities"));
			ret.setAgainst_bug(rs.getDouble("against_bug"));
			ret.setAgainst_dark(rs.getDouble("against_dark"));
			ret.setAgainst_dragon(rs.getDouble("against_dragon"));
			ret.setAgainst_electric(rs.getDouble("against_electric"));
			ret.setAgainst_fairy(rs.getDouble("against_fairy"));
			ret.setAgainst_fight(rs.getDouble("against_fight"));
			ret.setAgainst_fire(rs.getDouble("against_fire"));
			ret.setAgainst_flying(rs.getDouble("against_flying"));
			ret.setAgainst_ghost(rs.getDouble("against_ghost"));
			ret.setAgainst_grass(rs.getDouble("against_grass"));
			ret.setAgainst_ground(rs.getDouble("against_ground"));
			ret.setAgainst_ice(rs.getDouble("against_ice"));
			ret.setAgainst_normal(rs.getDouble("against_normal"));
			ret.setAgainst_poison(rs.getDouble("against_poison"));
			ret.setAgainst_psychic(rs.getDouble("against_psychic"));
			ret.setAgainst_rock(rs.getDouble("against_rock"));
			ret.setAgainst_steel(rs.getDouble("against_steel"));
			ret.setAgainst_water(rs.getDouble("against_water"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ret;
	}
}
