import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Forword  extends HttpServlet{
	
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
			String username=req.getParameter("username");
			String password=req.getParameter("pass word");
			
			PrintWriter pw=res.getWriter();
			pw.println("inside 1st servlet"+username+" "+password);
			
			RequestDispatcher  disp =req.getRequestDispatcher("/call2");
			disp.forward(req, res);	
			
			
			class launch extends HttpServlet{
				public void Service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{

					
					PrintWriter p=res.getWriter();
					p.print("inside 2nd servlet");
			}
			}
		}
}
	


