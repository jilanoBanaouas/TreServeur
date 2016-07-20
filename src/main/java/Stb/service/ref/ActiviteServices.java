/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.service.ref;

import Stb.model.Ref.Activite;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface ActiviteServices {

    public List<Activite> getAllActivite();

    public Activite getActivite(Integer codeActivite);

    //MéthodeRechercher à implementer
}
