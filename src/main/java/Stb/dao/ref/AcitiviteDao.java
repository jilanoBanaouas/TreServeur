/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao.ref;

import Stb.model.Ref.Activite;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface AcitiviteDao {
    
      public List<Activite> getAllActivite();
    
    public Activite gteActivite(Integer codeActivite);
    
    //M�thodeRechercher � implementer
    
}