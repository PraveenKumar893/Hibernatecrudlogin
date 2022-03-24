package com.Hibernatecrudlogin.Hibernatecrud.DaoImpl;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Hibernatecrudlogin.Hibernatecrud.Model.Modelreg;

@Repository
public class Regdao 
{
	
@Autowired
    SessionFactory sessionFactory ;

    public void saveCustomer(Modelreg reg) 
    {
    	System.out.println("Entering to insert data ");
        //Session currentSession = sessionFactory.getCurrentSession();
      Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();
        currentSession.saveOrUpdate(reg);
        currentSession.getTransaction().commit();
        sessionFactory.close();

    }



}
