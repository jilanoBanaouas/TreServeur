/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.service.ref;

import Stb.dao.ref.ActiviteDao;
import Stb.model.Ref.Activite;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yayan
 */
public class ActiviteServicesImpl implements ActiviteServices {

    @Autowired
    ActiviteDao activiteDao;

    @Override
    public List<Activite> getAllActivite() {
        return activiteDao.getAllActivite();
    }

    @Override
    public Activite getActivite(Integer codeActivite) {
        return activiteDao.getActivite(codeActivite);
    }

}
