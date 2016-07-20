/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.ref;

import Stb.model.Ref.Agence;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface AgenceDao {
    
    public List<Agence> getAllAgence();
    
    public Agence gteAgence(short codeBanque , short codeAgenceBct);
    
}
