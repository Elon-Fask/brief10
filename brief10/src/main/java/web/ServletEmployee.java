package web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DaoImpl;
import model.Employee;

@WebServlet("/")
public class ServletEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DaoImpl daoImpl;
       
	public void init() {
		daoImpl = new DaoImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		try {
				switch(action) {
				case"/dashboard":
					showNewForm(request, response);
					break;
				case"/add":
					insertEmp(request, response);
					break;
				case"/delete":
					deletEmp(request, response);
					break;
				case"/update":
					showEditForm(request, response);
					break;
				default:
					getAllEmp(request, response);
					break;
				}
			} catch(SQLException ex) {
				throw new ServletException(ex);
			}
		
	}

	private void getAllEmp(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
			List<Employee> getAllEmp = daoImpl.getAllEmp();
			request.setAttribute("getAllEmp", getAllEmp);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Dashboard.jsp");
			dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
		
	}

	private void deletEmp(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void insertEmp(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
		String refernce = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		User newUser = new User(name, email, country);
		userDao.saveUser(newUser);
		response.sendRedirect("list");		
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard.jsp");
		dispatcher.forward(request, response);
		
	}


}
