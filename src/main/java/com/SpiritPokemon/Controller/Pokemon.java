package com.SpiritPokemon.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SpiritPokemon.Beans.poke;
import com.SpiritPokemon.Beans.register;
import com.SpiritPokemon.Model.UserDB;
import com.SpiritPokemon.Model.pokedex;

/**
 * Servlet implementation class Pokemon
 */
public class Pokemon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pokemon() {
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
		
		String element = request.getParameter("element");
		System.out.println(element);
		String wish = request.getParameter("wish");
		System.out.println(wish);
		String hate = request.getParameter("hate");
		System.out.println(hate);
		poke mon = new poke();
		mon.setType1(element);
		mon.setType2(wish);
		
		if(hate.equalsIgnoreCase("water")) mon.setAgainst_water(-1);
		else if(hate.equalsIgnoreCase("fire")) mon.setAgainst_fire(-1);
		else if(hate.equalsIgnoreCase("bug")) mon.setAgainst_bug(-1);
		else if(hate.equalsIgnoreCase("ghost")) mon.setAgainst_ghost(-1);
		
		
		pokedex db = new pokedex();
		poke s1 = db.getPoke(mon);
		if(s1!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("PokeName", s1.getName());
			response.sendRedirect("http://localhost:8080/SpiritPokemon/foundPoke.jsp");
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
