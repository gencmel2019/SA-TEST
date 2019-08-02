package com.sabrina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayCount
 */
@WebServlet("/DisplayCount")
public class DisplayCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServletContext context;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

		context = config.getServletContext();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String count = context.getAttribute("count").toString();
		out.print("<html><head><title> Display Count </title>");
		out.print("<body>");
		out.print("</body></html>");
		context.removeAttribute("count");

	}

}
