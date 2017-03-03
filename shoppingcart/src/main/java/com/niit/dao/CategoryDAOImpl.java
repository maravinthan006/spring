package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.CategoryModel;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void addCategory(CategoryModel category) {
		
		
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.save(category);
			trans.commit();
			session.flush();
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println("Error="+ex);
		}
	}

}
