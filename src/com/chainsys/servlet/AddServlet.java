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
import com.chainsys.model.Author;
import com.chainsys.model.Book;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String aname = request.getParameter("aname");
		Book book = new Book();
		book.setName(name);
		Author author = new Author();
		author.setName(aname);
		book.setAuthor(author);
		BookDAO dao = new BookDAO();
		dao.insert(book);
		List<Book> list = dao.select();
		request.setAttribute("BOOK", list);
		RequestDispatcher rd = request.getRequestDispatcher("listofbooks.jsp");
		rd.forward(request, response);
	}

}
