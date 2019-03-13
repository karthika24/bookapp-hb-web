package com.chainsys.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.chainsys.model.Book;
import com.chainsys.util.HibernateUtil;

public class BookDAO {

	static SessionFactory sessionFactory;
	static Session session;

	public BookDAO() {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
	}

	public void insert(Book book) {
		session.save(book);
		System.out.println("Inserted Successfully");
		session.getTransaction().commit();
	}

	public void update(Book book) {
		session.saveOrUpdate(book);
		System.out.println("Updated Successfully");
		session.getTransaction().commit();
	}

	public void delete(Book book) {
	    session.delete(book);
		session.getTransaction().commit();
	}

	public Book findById(Long id) {
		Book book = (Book) session.get(Book.class, id);
		return book;
	}

	public List<Book> select() {
		Query<Book> query = session.createQuery("from Book", Book.class);
		List<Book> books = query.list();
		return books;
	}
}
