package com.rmcet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		HttpSession session=request.getSession();		
		String Name=request.getParameter("username");
		session.setAttribute("Fusername",Name);	
		out.println("First Name="+session.getAttribute("Firstname"));
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=2Servlet>");
		out.println("Enter Lastname:");
		out.println("<input type=text name=Lastname/><br>");
		out.println("<input type=submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		String lastname=request.getParameter("Lastname");
		session.setAttribute("Lastname", lastname);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
