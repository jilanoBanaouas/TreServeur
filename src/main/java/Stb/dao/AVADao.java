/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.dao;

import Stb.model.ava.Beneficiaires;
import Stb.model.ava.BeneficiairesMvt;
import Stb.model.ava.BeneficiairesMvtPK;
import Stb.model.ava.BeneficiairesPK;
import Stb.model.ava.OperationsDeleguees;
import Stb.model.ava.OperationsDelegueesMvt;
import Stb.model.ava.OperationsDelegueesMvtPK;
import Stb.model.ava.OperationsDelegueesPK;
import java.util.List;

/**
 *
 * @author yayan
 */
public interface AVADao {

    // Beneficiaires
    //    public void insertBeneficiaires(Beneficiaires beneficiaires);
    public Beneficiaires getBeneficiaires(BeneficiairesPK beneficiairesPK);

    public List<Beneficiaires> getAllBeneficiaires();

    //OperationsDeleguees
    //    public void insertOperationsDeleguees(OperationsDeleguees operationsDeleguees);
    public OperationsDeleguees getOperationsDeleguees(OperationsDelegueesPK operationsDelegueesPK);

    public List<OperationsDeleguees> getAllOperationsDeleguees();

    //    BeneficiaresMvt
    public void insertBeneficairesMvt(BeneficiairesMvt beneficiairesMvt);

    public List<BeneficiairesMvt> getAllBeneficiairesMvt();

    public BeneficiairesMvt getBeneficiairesMvt(BeneficiairesMvtPK beneficiairesMvtPK);

    public void updateBeneficiairesMvt(BeneficiairesMvt beneficiairesMvt);

    //  OperationsD�l�gu�esMVT
    public void insertOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt);

    public List<OperationsDelegueesMvt> getAllOperationsDelegueesMvt();

    public OperationsDelegueesMvt getOperationsDelegueesMvt(OperationsDelegueesMvtPK operationsDelegueesMvtPK);

    public void updateOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt);

}
