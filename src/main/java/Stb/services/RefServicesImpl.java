/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.services;

import Stb.dao.RefDao;
import Stb.model.Ref.Activite;
import Stb.model.Ref.Agence;
import Stb.model.Ref.Devise;
import Stb.model.Ref.Pays;
import Stb.model.Ref.TPiece;
import Stb.model.Ref.TypeDossierAva;
//import Stb.model.Ref.ModeDeLivraison;
//import Stb.model.Ref.CoursJoursDeviseBb;
//import Stb.model.Ref.ModeDeReglement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author slim
 */

@Service("RefServices")
@Transactional("transactionManagerRef")
public class RefServicesImpl implements RefServices {

    @Autowired
    RefDao refDao;

    @Override
    public String oneBanque(Short codeBanque) throws Exception {
        return refDao.oneBanque(codeBanque);
    }

    @Override
    public String oneAgence(Short codeAgenceBct, Short codeBanque) throws Exception {
        return refDao.oneAgence(codeAgenceBct, codeBanque);
    }

//    @Override
//    public String oneBanqueEtr(int codeBnqEtr) throws Exception {
//        return refDao.oneBanqueEtr(codeBnqEtr);
//    }
//
//    @Override
//    public String oneAgenceEtr(int codeAgenceEtr, int codeBanqueEtr) throws Exception {
//        return refDao.oneAgenceEtr(codeAgenceEtr, codeBanqueEtr);
//    }
    @Override
    public List<Devise> allDevise() throws Exception {
        return refDao.allDevise();
    }

    @Override
    public Devise sigleDevise(Integer codeDevise) throws Exception {
        return refDao.sigleDevise(codeDevise);
    }

    @Override
    public List<Pays> allPays() throws Exception {
        return refDao.allPays();
    }

//    @Override
//    public ModeDeReglement oneModeReglement(Integer codeModReg) throws Exception {
//        return refDao.oneModeReglement(codeModReg);
//    }
//
//    @Override
//    public List<ModeDeLivraison> allModeLivraison() throws Exception {
//        return refDao.allModeLivraison();
//    }
//
//    @Override
//    public ModeDeLivraison oneModeLivraison(Integer codeModLiv) throws Exception {
//        return refDao.oneModeLivraison(codeModLiv);
//    }
//
//    @Override
//    public CoursJoursDeviseBb coursJourDevise(Short codeDevise) throws Exception {
//        return refDao.coursJourDevise(codeDevise);
//    }
    //MAJ
    @Override
    public List<Activite> getAllActivite() {
        return refDao.getAllActivite();
    }

    @Override
    public Activite getActivite(Integer codeActivite) {
        return refDao.getActivite(codeActivite);
    }

    @Override
    public List<Agence> getAllAgence() {
        return refDao.getAllAgence();
    }

    @Override
    public Agence getAgence(short codeBanque, short codeAgenceBct) {
        return refDao.getAgence(codeBanque, codeAgenceBct);
    }

    @Override
    public List<TPiece> getAllTPiece() {
        return refDao.getAllTPiece();
    }

    @Override
    public TPiece getTPiece(Short codeTypePiece) {
        return refDao.getTPiece(codeTypePiece);
    }

    @Override
    public List<TypeDossierAva> getAllTypeDossierAva() {
        return refDao.getAllTypeDossierAva();
    }

    @Override
    public TypeDossierAva getTypeDossierAva(Short codeTypeDosAva) {
        return refDao.getTypeDossierAva(codeTypeDosAva);
    }

}
