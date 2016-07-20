/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.ref;

import Stb.model.Ref.Agence;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AgenceDaoImpl implements AgenceDao{

    @Autowired
    @Qualifier("sessionFactoryRef")
    private SessionFactory sessionFactory;
    private Session session;
    
    @Override
    public List<Agence> getAllAgence() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Agence.findAll");
        List<Agence>  liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public Agence getAgence(short codeBanque, short codeAgenceBct) {
        
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Activite.findByCodeBanqueAndCodeAgence");
        query.setParameter("codeBanque", codeBanque);
        query.setParameter("codeAgenceBct", codeAgenceBct);
        Agence agence=(Agence) query.uniqueResult();
        session.close();
        return agence;
        
    }
    
}
