package com.HibernateAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

	SessionFactory factory = meta.getSessionFactoryBuilder().build();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();

	public static void main(String[] args) {

		StoreData storeData = new StoreData();
		storeData.createEmployeeTable();
		storeData.insertEmployeeTable();
		storeData.updateEmployeeTable();
		storeData.deleteEmployeeTable();
	}

	public void createEmployeeTable() {
		// https://stackoverflow.com/questions/31381992/java-equivalent-of-where-clause-in-c-sharp-linq
		// use StreamAPI <==> Linq in C#. 
		
		
		/*LambdaJ
		
		Quaere: http://quaere.codehaus.org
			JaQu: http://www.h2database.com/html/jaqu.html
			Linq4j: https://github.com/julianhyde/linq4j
			Slick: http://slick.typesafe.com/
				*/
	}

	public void insertEmployeeTable() {

		Employee empl = new Employee();
		empl.setId(2);
		empl.setFirstName("Ashutosh");
		empl.setLastName("Chittora");

		try {
			session.save(empl);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		tearDown();

	}

	public void updateEmployeeTable() {

	}

	public void deleteEmployeeTable() {

	}

	public void tearDown() {

		transaction.commit();
		System.out.println("Query Completed successfully ... ");
		factory.close();
		session.close();

	}

}