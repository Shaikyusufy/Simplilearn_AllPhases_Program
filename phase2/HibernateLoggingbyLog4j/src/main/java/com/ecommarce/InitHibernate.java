package com.ecommarce;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitHibernate
 */
@WebServlet("/InitHibernate")
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InitHibernate() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");

            SessionFactory factory = HibernateUtil.getSessionFactory();
                   
            Session session = factory.openSession();
            out.println("Hibernate Session opened.<br>");
            session.close();
            out.println("Hibernate Session closed.<br>");
                   
            out.println("</body></html>");
               
                
            } catch (Exception ex) {
                    throw ex;
            }

}

	ss

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
