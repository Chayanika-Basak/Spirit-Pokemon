package com.SpiritPokemon.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SpiritPokemon.Beans.poke;
import com.SpiritPokemon.Model.pokedex;

/**
 * Servlet implementation class Pokedex
 */
public class Pokedex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pokedex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		name = name.toLowerCase();
		System.out.println(name);
		poke mon = new poke();
		mon.setName(name);		
		
		pokedex db = new pokedex();
		poke s1 = db.getMyPoke(mon);
		if(s1!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("name", s1.getName());
			session.setAttribute("type1", s1.getType1());
			session.setAttribute("type2", s1.getType2());
			session.setAttribute("abilities", s1.getAbilities());
			session.setAttribute("against_bug", s1.getAgainst_bug());
			session.setAttribute("against_dark", s1.getAgainst_dark());
			session.setAttribute("against_dragon", s1.getAgainst_dragon());
			session.setAttribute("against_electric", s1.getAgainst_electric());
			session.setAttribute("against_fairy", s1.getAgainst_fairy());
			session.setAttribute("against_fight", s1.getAgainst_fight());
			session.setAttribute("against_fire", s1.getAgainst_fire());
			session.setAttribute("against_flying", s1.getAgainst_flying());
			session.setAttribute("against_ghost", s1.getAgainst_ghost());
			session.setAttribute("against_grass", s1.getAgainst_grass());
			session.setAttribute("against_ground", s1.getAgainst_ground());
			session.setAttribute("against_ice", s1.getAgainst_ice());
			session.setAttribute("against_normal", s1.getAgainst_normal());
			session.setAttribute("against_poison", s1.getAgainst_poison());
			session.setAttribute("against_psychic", s1.getAgainst_psychic());
			session.setAttribute("against_rock", s1.getAgainst_rock());
			session.setAttribute("against_steel", s1.getAgainst_steel());
			session.setAttribute("against_water", s1.getAgainst_water());
			response.sendRedirect("http://localhost:8080/SpiritPokemon/PokeResult.jsp");
		}
		else {
			out.println("Couldn't find a match. :(");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
