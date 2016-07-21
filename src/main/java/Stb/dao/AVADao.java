/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;

import Stb.model.ava.Beneficiaires;
import Stb.model.ava.BeneficiairesMvt;
import Stb.model.ava.OperationsDeleguees;
import Stb.model.ava.OperationsDelegueesMvt;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface AVADao {

    // Beneficiaires
    public Beneficiaires getBeneficiaires();//selon quoi
    public void insertBeneficiaires(Beneficiaires beneficiaires);
    public void insertListBeneficiaires(List<Beneficiaires> beneficiaires);

    public List<Beneficiaires> getAllBeneficiaires();

    //OperationsDeleguees
    public OperationsDeleguees getOperationsDeleguees();//selon quoi
    public void insertOperationsDeleguees(OperationsDeleguees operationsDeleguees);

    public List<OperationsDeleguees> getAllOperationsDeleguees();

//    BeneficiaresMvt
    public void insertBeneficairesMvt(BeneficiairesMvt beneficiairesMvt);

    public List<BeneficiairesMvt> getAllBeneficiairesMvt();

    public BeneficiairesMvt getBeneficiairesMvt();

    public void updateBeneficiairesMvt(BeneficiairesMvt beneficiairesMvt);

//  OperationsDéléguées
    public void insertOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt);

    public List<OperationsDelegueesMvt> getAllOperationsDelegueesMvt();

    public OperationsDelegueesMvt getOperationsDelegueesMvt();

    public void updateBeneficiairesMvt(OperationsDelegueesMvt beneficiairesMvt);

}
