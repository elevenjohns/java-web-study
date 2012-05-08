package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookDao;
import com.domain.Book;

public class BookController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String szArg = req.getParameter("arg");
		int arg=1;
		if (szArg == "" || szArg == null)
			arg = 1;
		else
			arg = Integer.parseInt(req.getParameter("arg"));
		switch (arg) {
		case 1:
			this.findAllBooks(req, resp);
			break;
		case 2:
			this.saveBooks(req, resp);
			break;
		}
	}

	public void findAllBooks(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		BookDao bookDao = new BookDao();
		List list = bookDao.findAllBooks();
		req.setAttribute("booklist", list);
		RequestDispatcher rdt = req.getRequestDispatcher("showAllBooks.jsp");
		rdt.forward(req, resp);
	}

	public void saveBooks(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("gb2312");
		String name = (String) req.getParameter("name");
		double price = 0.0;
		if (!req.getParameter("price").equals("")
				&& req.getParameter("price") != null)
			price = Double.parseDouble(req.getParameter("price"));
		String author = (String) req.getParameter("author");
		String bookConcern = (String) req.getParameter("concern");
		int counts = 0;
		if (!req.getParameter("counts").equals("")
				&& req.getParameter("counts") != null)
			counts = Integer.parseInt(req.getParameter("counts"));
		Book book = new Book();
		book.setName(name);
		book.setAuthor(author);
		book.setBookConcern(bookConcern);
		book.setPrice(price);
		book.setCounts(counts);
		BookDao bookDao = new BookDao();
		try {
			bookDao.saveUser(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.findAllBooks(req, resp);

	}
}
