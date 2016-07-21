/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.service.ref;

import Stb.dao.ref.AgenceDao;
import Stb.model.Ref.Agence;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yayan
 */
public class AgenceServicesImpl implements AgenceServices {

    @Autowired
    AgenceDao agenceDao;

    @Override
    public List<Agence> getAllAgence() {
        return agenceDao.getAllAgence();
    }

    @Override
    public Agence getAgence(short codeBanque, short codeAgenceBct) {
        return agenceDao.getAgence(codeBanque, codeAgenceBct);
    }

}
