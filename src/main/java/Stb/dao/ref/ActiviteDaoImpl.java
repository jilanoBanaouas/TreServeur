/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.ref;

import Stb.model.Ref.Activite;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author yayan
 */
public class ActiviteDaoImpl implements ActiviteDao {

    @Autowired
    @Qualifier("sessionFactoryRef")
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<Activite> getAllActivite() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Activite.findAll");
        List<Activite> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public Activite getActivite(Integer codeActivite) {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Activite.findByCodeActivite");
        query.setParameter("codeActivite", codeActivite);
        Activite ativite = (Activite) query.uniqueResult();
        session.close();
        return ativite;
    }

}
