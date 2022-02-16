package learnGet_Post;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get_Post_Method
 */
public class Get_Post_Method extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get_Post_Method() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");	
	String lname = request.getParameter("lastName");
	PrintWriter out = response.getWriter();
	out.print("Hello!This is doGet Method");
	out.print("<br/> Hello " + lname);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	
		String fname = request.getParameter("fastName");
		PrintWriter out = response.getWriter();
		out.print("Hello!This is doPost Method");
		out.print("<br> Hello " + fname);
	}

}
