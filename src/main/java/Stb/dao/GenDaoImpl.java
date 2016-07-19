/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;

import Stb.model.Gen.MessageRecus;
import Stb.model.Gen.MswMtxxx;
import Stb.model.Gen.MswNomField;
import Stb.model.Gen.MswRecepMsg;
import Stb.model.Gen.MswUtlField;
import Stb.model.Gen.MswUtlMtxxx;
import Stb.model.Gen.MswUtlSequence;
import Stb.model.Gen.OperationTitre;
import Stb.model.Gen.SwiftRecus;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author slim
 */
public class GenDaoImpl implements  GenDao{

    @Autowired
    @Qualifier("sessionFactoryGen")
    private SessionFactory sessionFactory;

    private Session session3;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
         session3 = sessionFactory.openSession();
    }
    
    @Override
    public List<MswUtlField> allfield(int numero, String nmesg, int numSequence) {

        if (session3.isConnected()) {
            System.out.println("connect� field");

        } else {
            System.out.println("non connect� field");
        }
        Query query = session3.createQuery("SELECT m FROM MswUtlField m WHERE m.mswUtlFieldPK.numero = :numero AND m.mswUtlFieldPK.nmesg = :nmesg AND m.mswUtlFieldPK.numSequence = :numSequence ORDER BY m.mswUtlFieldPK.numero,m.mswUtlFieldPK.numField");
        query.setParameter("numero", numero);
        query.setParameter("nmesg", nmesg);
        query.setParameter("numSequence", numSequence);
        List<MswUtlField> lfield = query.list();
        //session3.close();
        return lfield;
    }

    @Override
    public MswNomField getfieldbynom(String mtxxx, String seq, String field) {
        //Session session3 = sessionFactory.openSession();
        if (session3.isConnected()) {
            System.out.println("connect� field");
        } else {
            System.out.println("non connect� field");
        }
        Query query = session3.createQuery("SELECT m FROM MswNomField m WHERE m.mswNomFieldPK.mtxxx = :mtxxx AND m.mswNomFieldPK.seq = :seq AND m.mswNomFieldPK.field = :field");
        query.setParameter("mtxxx", mtxxx);
        query.setParameter("seq", seq);
        query.setParameter("field", field);
        MswNomField lib = (MswNomField) query.uniqueResult();
        //session3.close();
        return lib;
    }

  @Override
    public List<MessageRecus> Listmtxxrecues() throws Exception {
        

       if (session3.isConnected())
       {
        System.out.println("connect�");
        
       }
       else{
           System.out.println("non connect�");
       }
       Query query = session3.createQuery("SELECT m FROM MessageRecus m");
        List<MessageRecus> lmtxr = query.list();
         return lmtxr;
    }

    @Override
    public List<MswRecepMsg> getdetailR(String mtxxx) throws Exception {
        if (session3.isConnected())
       {
        Query query = session3.createQuery("SELECT m FROM MswRecepMsg m WHERE m.mswRecepMsgPK.mtxxx = :mtxxx");
        query.setParameter("mtxxx",mtxxx);
        List<MswRecepMsg> detail=  query.list();
        return detail;
       }
       else{
           System.out.println("non connect�");
           return null;
       }
    
}

     @Override
    public List<MswUtlMtxxx> Listmtxxenvoyes() throws Exception {
        if (session3.isConnected()) {
            System.out.println("connect�");

        } else {
            System.out.println("non connect�");
        }
        Query query = session3.createQuery("SELECT m FROM MswUtlMtxxx m");
        List<MswUtlMtxxx> lmtxe = query.list();
        //session3.close();
        return lmtxe;

    }

    @Override
    public MswMtxxx gettypemtx(String mtxxx) throws Exception {
        //   Session session3 = sessionFactory.openSession();
        if (session3.isConnected()) {
            System.out.println("connect�");
            Query query = session3.createQuery("SELECT m FROM MswMtxxx m WHERE m.mtxxx = :mtxxx");
            query.setParameter("mtxxx", mtxxx);
            MswMtxxx lib = (MswMtxxx) query.uniqueResult();
            //session3.close();
            return lib;
        } else {
            System.out.println("non connect�");
            return null;
        }

    }

    @Override
    public List<MswUtlSequence> Listseqs(int numero, String nmesg) throws Exception {

        //Session session3 =sessionFactory.getCurrentSession();
        System.out.println(sessionFactory.getReference() + " reff");
        if (session3.isConnected()) {
            System.out.println("connect� seq");
            Query query = session3.createQuery("SELECT m FROM MswUtlSequence m WHERE m.mswUtlSequencePK.numero = :numero AND m.mswUtlSequencePK.nmesg = :nmesg ");
            query.setParameter("numero", numero);
            query.setParameter("nmesg", nmesg);
            System.out.println("requete=======>" + query.getTimeout());
            List<MswUtlSequence> lseq = query.list();
            //session3.close();
            return lseq;
        } else {
            System.out.println("non connect� seq");
            return null;
        }

    }

    @Override
    public SwiftRecus getSwiftRecues(String mtxxx) throws Exception {
        Query query = session3.createQuery("SELECT s FROM SwiftRecus s WHERE s.swiftRecusPK.mtxxx = :mtxxx");
        query.setParameter("mtxxx", mtxxx);
        SwiftRecus lfield = (SwiftRecus) query.uniqueResult();
        return lfield;
    }

    @Override
    public void savetitre(OperationTitre p) {
        System.out.println("debut insertion");
        session3 = this.sessionFactory.openSession();
        Transaction tx = session3.beginTransaction();
        System.out.println(p.toString()+" voici l'objet");
        session3.persist(p);
        tx.commit();
     
    }
}
