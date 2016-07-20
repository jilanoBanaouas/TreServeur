/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.ref;

import Stb.model.Ref.TPiece;
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
public class TPieceDaoImpl implements TPieceDao {

    @Autowired
    @Qualifier("sessionFactoryRef")
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<TPiece> getAllTPiece() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("TPiece.findAll");
        List<TPiece> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public TPiece getTPiece(Short codeTypePiece) {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("TPiece.findByCodeTypePiece");
        query.setParameter("codeTypePiece", codeTypePiece);
        TPiece tPiece = (TPiece) query.uniqueResult();
        session.close();
        return tPiece;
    }

}
