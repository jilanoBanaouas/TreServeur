/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.ava;

import Stb.model.ava.BeneficiairesMvt;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface BeneficiairesMvtDao {
    
    public void ajouterBeneficairesMvt(BeneficiairesMvt beneficiairesMvt);
    
    public List<BeneficiairesMvt> getAllBeneficiairesMvt();
    
    public BeneficiairesMvt getBeneficiairesMvt(long id);
    
    public void updateBeneficiairesMvt(BeneficiairesMvt beneficiairesMvt);
    
}
