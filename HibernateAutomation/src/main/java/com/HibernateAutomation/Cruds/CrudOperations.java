package com.HibernateAutomation.Cruds;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudOperations {

	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		// i have used the added the "hibernate.cfg.xml" in <resources> of pom.xml hence
		// no need to provide in configure().
		sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("CFG and HBM loaded successfully ...");

		CrudOperations cud = new CrudOperations();

		Integer contactId1 = cud.addContact(100, "Lata", "Mangeshkar");
		Integer contactId2 = cud.addContact(101, "Sachin", "Tendulkar");
		Integer contactId3 = cud.addContact(102, "Asha", "Bhonsle");

	}

	public Integer addContact(Integer id, String fname, String lname) {

		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer contactId = null;
		try {
			tx = session.beginTransaction();
			Contacts contact = new Contacts(id, fname, lname);
			contactId = (Integer) session.save(contact);
			tx.commit();
		} catch (HibernateException e) {

			if (tx != null)
				tx.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}

		return contactId;
	}

	public void updateContact(Integer contactId , String fname , String lname) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Contacts contact = (Contacts)session.get(Contacts.class, contactId);
			contact.setFname(fname);
			contact.setLname(lname);
			session.update(contact);
			tx.commit();
		} catch (HibernateException e) {

			if (tx != null)
				tx.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
	}
	
	public void deleteContact(Integer contactId) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Contacts contact = (Contacts)session.get(Contacts.class, contactId);
			session.delete(contact);
			tx.commit();
		} catch (HibernateException e) {

			if (tx != null)
				tx.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
	}
	
	public void listContacts(Integer contactId) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Contacts contact = (Contacts)session.get(Contacts.class, contactId);
			session.delete(contact);
			tx.commit();			
		} catch (HibernateException e) {

			if (tx != null)
				tx.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
	}
	
	/*public void helper() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Contacts.class);
		criteria.add(Projections.)
	}
*/
}
