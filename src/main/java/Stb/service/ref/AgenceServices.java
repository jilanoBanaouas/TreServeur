/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.service.ref;

import Stb.model.Ref.Agence;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface AgenceServices {

    public List<Agence> getAllAgence();

    public Agence getAgence(short codeBanque, short codeAgenceBct);

}
