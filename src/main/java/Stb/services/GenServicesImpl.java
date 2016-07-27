///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Stb.services;
//
//import Stb.dao.GenDao;
//import Stb.model.Gen.MessageRecus;
//import Stb.model.Gen.MswMtxxx;
//import Stb.model.Gen.MswUtlField;
//import Stb.model.Gen.MswUtlMtxxx;
//import Stb.model.Gen.MswUtlSequence;
//import Stb.model.Gen.MswNomField;
//import Stb.model.Gen.MswRecepMsg;
//import Stb.model.Gen.OperationTitre;
//import Stb.model.Gen.SwiftRecus;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// *
// * @author slim
// */
//public class GenServicesImpl implements GenServices{
//
//    @Autowired
//    GenDao genDao;
//    
//  
//    
//    //MTXX
//   
//
//    @Override
//    public List<MswUtlMtxxx> Listmtxxenvoyes() throws Exception {
//    return genDao.Listmtxxenvoyes();    
//    }
//
//    @Override
//    public MswMtxxx gettypemtx(String mtxxx) throws Exception {
//        return genDao.gettypemtx(mtxxx);
//    }
//
//    //SEQUENCE
//    @Override
//    public List<MswUtlSequence> Listseqs(int numero,String nmesg) throws Exception {
//    return genDao.Listseqs(numero, nmesg);
//    }
//
//    //FIELD
//    @Override
//    public List<MswUtlField> allfield(int numero,String nmesg,int numSequence ) throws Exception {
//        return genDao.allfield(numero,nmesg,numSequence);
//              
//    }
//
//    @Override
//    public MswNomField getfieldbynom(String mtxxx, String seq, String field) throws Exception {
//    return genDao.getfieldbynom(mtxxx, seq, field);
//        }
//
//    
//    //Message Recus
//     @Override
//    public List<MessageRecus> Listmtxxrecues() throws Exception {
//        return genDao.Listmtxxrecues();
//    }
//
//    @Override
//    public List<MswRecepMsg> getdetailR(String mtxxx) throws Exception {
//    return genDao.getdetailR(mtxxx);    }
//
//    @Override
//    public SwiftRecus getSwiftRecues(String mtxxx) throws Exception {
//    return genDao.getSwiftRecues(mtxxx);    }
//
//    @Override
//    public void savetitre(OperationTitre p) {
//genDao.savetitre(p);
//    }
//    
//   
//}