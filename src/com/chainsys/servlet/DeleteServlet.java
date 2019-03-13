package com.chainsys.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.BookDAO;
import com.chainsys.model.Book;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		BookDAO dao = new BookDAO();
		Book book = dao.findById(id);
		if (book != null) {
			book.setId(id);

			dao.delete(book);
			List<Book> list = dao.select();
			request.setAttribute("BOOK", list);
			RequestDispatcher rd = request
					.getRequestDispatcher("listofbooks.jsp");
			rd.forward(request, response);
		}
		else{
			
		}
	}

}
