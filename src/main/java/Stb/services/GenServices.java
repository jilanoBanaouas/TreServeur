/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.services;


import Stb.model.Gen.Documents;
import Stb.model.Gen.DocumentsPK;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author slim
 */
public interface GenServices {

    //documents
     public void insertDocuments(Documents documents);

    public List<Documents> getAllDocuments();

    public Documents getDocuments(DocumentsPK documentsPK);

    public void updateDocuments(Documents documents);


}
