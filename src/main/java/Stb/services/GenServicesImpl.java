/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.services;

import Stb.dao.GenDao;
import Stb.model.Gen.Documents;
import Stb.model.Gen.DocumentsPK;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author slim
 */
@Service("GenServices")
@Transactional("transactionManagerGen")
public class GenServicesImpl implements GenServices {
    
    @Autowired
    GenDao genDao;
    
    @Override
    public void insertDocuments(Documents documents) {
        genDao.insertDocuments(documents);
    }
    
    @Override
    public List<Documents> getAllDocuments() {
        return genDao.getAllDocuments();
    }
    
    @Override
    public Documents getDocuments(DocumentsPK documentsPK) {
        return genDao.getDocuments(documentsPK);
    }
    
    @Override
    public void updateDocuments(Documents documents) {
        genDao.updateDocuments(documents);
    }
    
}
