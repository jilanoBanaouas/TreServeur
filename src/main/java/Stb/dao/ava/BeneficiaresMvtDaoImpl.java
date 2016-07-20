/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.ava;

import Stb.model.ava.BeneficiairesMvt;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author yayan
 */
public class BeneficiaresMvtDaoImpl implements BeneficiairesMvtDao{
    
    
    
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    

    @Override
    public void ajouterBeneficairesMvt(BeneficiairesMvt beneficiairesMvt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BeneficiairesMvt> getAllBeneficiairesMvt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BeneficiairesMvt getBeneficiairesMvt(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBeneficiairesMvt(BeneficiairesMvt beneficiairesMvt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
