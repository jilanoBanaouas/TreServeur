/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.ref;

import Stb.model.Ref.TypeDossierAva;
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
public class TypeDossierAvaDaoImpl implements TypeDossierAvaDao {

    @Autowired
    @Qualifier("sessionFactoryRef")
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<TypeDossierAva> getAllTypeDossierAva() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("TypeDossierAva.findAll");
        List<TypeDossierAva> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public TypeDossierAva getTypeDossierAva(Short codeTypeDosAva) {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("TypeDossierAva.findByCodeTypeDosAva");
        query.setParameter("codeTypeDosAva", codeTypeDosAva);
        TypeDossierAva typeDossierAva = (TypeDossierAva) query.uniqueResult();
        session.close();
        return typeDossierAva;
    }

}
