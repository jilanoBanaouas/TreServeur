/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.services;

import Stb.dao.AVADao;
import Stb.model.ava.Beneficiaires;
import Stb.model.ava.BeneficiairesMvt;
import Stb.model.ava.BeneficiairesMvtPK;
import Stb.model.ava.BeneficiairesPK;
import Stb.model.ava.OperationsDeleguees;
import Stb.model.ava.OperationsDelegueesMvt;
import Stb.model.ava.OperationsDelegueesMvtPK;
import Stb.model.ava.OperationsDelegueesPK;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author yayan
 */
public class AVAServicesImpl implements AVAServices {

    @Autowired
    AVADao aVADao;

    @Override
    public void insertBeneficairesMvt(BeneficiairesMvt beneficiairesMvt) {
        aVADao.insertBeneficairesMvt(beneficiairesMvt);
    }

    @Override
    public void insertOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt) {
        aVADao.insertOperationsDelegueesMvt(operationsDelegueesMvt);
    }

    @Override
    public void insertListBeneficairesMvt(List<BeneficiairesMvt> listesBeneficiairesMvt) {

        for (BeneficiairesMvt beneficiairesMvt : listesBeneficiairesMvt) {
            aVADao.insertBeneficairesMvt(beneficiairesMvt);
        }

    }

    @Override
    public List<Beneficiaires> getAllBeneficiaires() {
        return aVADao.getAllBeneficiaires();
    }

    @Override
    public List<BeneficiairesMvt> getAllBeneficiairesMvt() {
        return aVADao.getAllBeneficiairesMvt();
    }

    @Override
    public void updateBeneficiairesMvt(BeneficiairesMvt beneficiairesMvt) {
        aVADao.updateBeneficiairesMvt(beneficiairesMvt);
    }

    @Override
    public List<OperationsDelegueesMvt> getAllOperationsDelegueesMvt() {
        return aVADao.getAllOperationsDelegueesMvt();
    }

    @Override
    public void updateOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt) {
        aVADao.updateOperationsDelegueesMvt(operationsDelegueesMvt);
    }

    @Override
    public Beneficiaires getBeneficiaires(BeneficiairesPK beneficiairesPK) {
        return aVADao.getBeneficiaires(beneficiairesPK);
    }

    @Override
    public OperationsDeleguees getOperationsDeleguees(OperationsDelegueesPK operationsDelegueesPK) {
        return aVADao.getOperationsDeleguees(operationsDelegueesPK);
    }

    @Override
    public List<OperationsDeleguees> getAllOperationsDeleguees() {
        return aVADao.getAllOperationsDeleguees();
    }

    @Override
    public BeneficiairesMvt getBeneficiairesMvt(BeneficiairesMvtPK beneficiairesMvtPK) {
        return aVADao.getBeneficiairesMvt(beneficiairesMvtPK);
    }

    @Override
    public OperationsDelegueesMvt getOperationsDelegueesMvt(OperationsDelegueesMvtPK operationsDelegueesMvtPK) {
        return aVADao.getOperationsDelegueesMvt(operationsDelegueesMvtPK);
    }

}
