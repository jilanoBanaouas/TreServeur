/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.service.ref;

import Stb.dao.ref.TypeDossierAvaDao;
import Stb.model.Ref.TypeDossierAva;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yayan
 */
public class TypeDossierAvaServicesImpl implements TypeDossierAvaServices {

    @Autowired
    TypeDossierAvaDao typeDossierAvaDao;

    @Override
    public List<TypeDossierAva> getAllTypeDossierAva() {
        return typeDossierAvaDao.getAllTypeDossierAva();
    }

    @Override
    public TypeDossierAva getTypeDossierAva(Short codeTypeDosAva) {
        return typeDossierAvaDao.getTypeDossierAva(codeTypeDosAva);
    }

}
