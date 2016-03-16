package com.jkxy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import com.jkxy.dao.IOrderDAO;
import com.jkxy.model.Orders;

public class OrderDAO implements IOrderDAO {

	// private SessionFactory sessionFactory;
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Orders saveOrder(Orders order) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(order);
		ts.commit();
		session.close();
		return order;
	}

}
