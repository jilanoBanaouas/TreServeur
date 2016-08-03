/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;


import Stb.model.Gen.Documents;
import Stb.model.Gen.DocumentsPK;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


/**
 *
 * @author slim
 */
@Repository("GenDao")
public class GenDaoImpl implements  GenDao{

      @Autowired
    @Qualifier("sessionFactoryGen")
    private SessionFactory sessionFactory;

    private Session session;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    
    @Override
    public void insertDocuments(Documents documents) {
     session = sessionFactory.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(documents);
        
        tx.commit();
        session.close(); }

    @Override
    public List<Documents> getAllDocuments() {
     session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Documents.findAll");
        List<Documents> liste = query.list();
        session.close();
        return liste;}

    @Override
    public Documents getDocuments(DocumentsPK documentsPK) {
        session = sessionFactory.openSession();
        Documents ben = ((Documents) session.get(Documents.class, documentsPK));
         session.close();
        return ben; }

    @Override
    public void updateDocuments(Documents documents) {
           session = sessionFactory.openSession();
//        Transaction tx = session.beginTransaction();
        session.update(documents);
//        tx.commit();
        session.close(); }

}