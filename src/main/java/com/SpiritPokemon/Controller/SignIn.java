package com.SpiritPokemon.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SpiritPokemon.Beans.register;
import com.SpiritPokemon.Model.UserDB;

/**
 * Servlet implementation class SignIn
 */
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
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
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		register user = new register();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		UserDB db = new UserDB();
		register s1 = db.getUser(user);
		
		if(s1!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("name", s1.getName());
			response.sendRedirect("http://localhost:8080/SpiritPokemon/welcome.jsp");
		}
		else {
			out.println("Wrong user name or password.");
			response.sendRedirect("http://localhost:8080/SpiritPokemon/signup.jsp");
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
