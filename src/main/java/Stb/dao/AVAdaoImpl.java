/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;

import Stb.model.ava.Beneficiaires;
import Stb.model.ava.BeneficiairesMvt;
import Stb.model.ava.BeneficiairesMvtPK;
import Stb.model.ava.BeneficiairesPK;
import Stb.model.ava.OperationsDeleguees;
import Stb.model.ava.OperationsDelegueesMvt;
import Stb.model.ava.OperationsDelegueesMvtPK;
import Stb.model.ava.OperationsDelegueesPK;
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
public class AVAdaoImpl implements AVADao {

    @Autowired
    @Qualifier("sessionFactoryAVA")
    private SessionFactory sessionFactory;

    private Session session;

    @Override
    public Beneficiaires getBeneficiaires(BeneficiairesPK beneficiairesPK) { // X
        session = sessionFactory.openSession();
        Beneficiaires ben = ((Beneficiaires) session.get(Beneficiaires.class, beneficiairesPK));
        return ben;
    }

    @Override
    public List<Beneficiaires> getAllBeneficiaires() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Beneficiaires.findAll");
        List<Beneficiaires> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public OperationsDeleguees getOperationsDeleguees(OperationsDelegueesPK operationsDelegueesPK) {
        session = sessionFactory.openSession();
        return ((OperationsDeleguees) session.get(OperationsDeleguees.class, operationsDelegueesPK));
    }

    @Override
    public List<OperationsDeleguees> getAllOperationsDeleguees() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("OperationsDeleguees.findAll");
        List<OperationsDeleguees> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public void insertBeneficairesMvt(BeneficiairesMvt beneficiairesMvt) {
        session = sessionFactory.openSession();
        
        session.save(beneficiairesMvt);
        session.close();
    }

    @Override
    public List<BeneficiairesMvt> getAllBeneficiairesMvt() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("BeneficiairesMvt.findAll");
        List<BeneficiairesMvt> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public BeneficiairesMvt getBeneficiairesMvt(BeneficiairesMvtPK beneficiairesMvtPK) {
        session = sessionFactory.openSession();
        return ((BeneficiairesMvt) session.get(BeneficiairesMvt.class, beneficiairesMvtPK));
    }

    @Override
    public void updateBeneficiairesMvt(BeneficiairesMvt beneficiairesMvt) {
        session = sessionFactory.openSession();
        session.merge(beneficiairesMvt);
        session.close();
    }

    @Override
    public void insertOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt) {
        session = sessionFactory.openSession();
        session.save(operationsDelegueesMvt);
        session.close();

    }

    @Override
    public List<OperationsDelegueesMvt> getAllOperationsDelegueesMvt() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("OperationsDelegueesMvt.findAll");
        List<OperationsDelegueesMvt> liste = query.list();
        session.close();
        return liste;
    }

    @Override
    public OperationsDelegueesMvt getOperationsDelegueesMvt(OperationsDelegueesMvtPK operationsDelegueesMvtPK) {
        session = sessionFactory.openSession();
        return ((OperationsDelegueesMvt) session.get(OperationsDelegueesMvt.class, operationsDelegueesMvtPK));
    }

    @Override
    public void updateOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt) {
        session = sessionFactory.openSession();
        session.merge(operationsDelegueesMvt);
        session.close();
    }

//    @Override
//    public void insertBeneficiaires(Beneficiaires beneficiaires) {
//        session = sessionFactory.openSession();
//        session.save(beneficiaires);
//        session.close();
//
//    }
//
//    @Override
//    public void insertOperationsDeleguees(OperationsDeleguees operationsDeleguees) {
//        session = sessionFactory.openSession();
//        session.save(operationsDeleguees);
//        session.close();
//    }
}