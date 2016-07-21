/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;

import Stb.dao.AVADao;
import Stb.model.Ref.Activite;
import Stb.model.ava.Beneficiaires;
import Stb.model.ava.BeneficiairesMvt;
import Stb.model.ava.OperationsDeleguees;
import Stb.model.ava.OperationsDelegueesMvt;
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
    public Beneficiaires getBeneficiaires() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public OperationsDeleguees getOperationsDeleguees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BeneficiairesMvt getBeneficiairesMvt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBeneficiairesMvt(BeneficiairesMvt beneficiairesMvt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt) {
        session = sessionFactory.openSession();
        session.save(operationsDelegueesMvt);
        session.close();

    }

    @Override
    public List<OperationsDelegueesMvt> getAllOperationsDelegueesMvt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OperationsDelegueesMvt getOperationsDelegueesMvt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBeneficiairesMvt(OperationsDelegueesMvt beneficiairesMvt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertBeneficiaires(Beneficiaires beneficiaires) {
        session = sessionFactory.openSession();
        session.save(beneficiaires);
        session.close();

    }

    @Override
    public void insertOperationsDeleguees(OperationsDeleguees operationsDeleguees) {
        session = sessionFactory.openSession();
        session.save(operationsDeleguees);
        session.close();
    }

    @Override
    public void insertListBeneficiaires(List<Beneficiaires> beneficiaires) {
        session = sessionFactory.openSession();
        for (Beneficiaires beneficiaire : beneficiaires) {
            session.save(beneficiaire);
        }

        session.close();
    }

}
