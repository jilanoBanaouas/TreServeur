/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.services;

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
public interface AVAServices {

    // Beneficiaires
    public Beneficiaires getBeneficiaires(BeneficiairesPK beneficiairesPK);
//    public void insertBeneficiaires(Beneficiaires beneficiaires);

    public List<Beneficiaires> getAllBeneficiaires();

    public OperationsDeleguees getOperationsDeleguees(OperationsDelegueesPK operationsDelegueesPK);

    public List<OperationsDeleguees> getAllOperationsDeleguees();

//    BeneficiaresMvt
    public void insertBeneficairesMvt(BeneficiairesMvt beneficiairesMvt);

    public List<BeneficiairesMvt> getAllBeneficiairesMvt();

    public BeneficiairesMvt getBeneficiairesMvt(BeneficiairesMvtPK beneficiairesMvtPK);

    public void updateBeneficiairesMvt(BeneficiairesMvt beneficiairesMvt);

    public void insertListBeneficairesMvt(List<BeneficiairesMvt> listesBeneficiairesMvt);

//  OperationsDéléguéesMVT
    public void insertOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt);

    public List<OperationsDelegueesMvt> getAllOperationsDelegueesMvt();

    public OperationsDelegueesMvt getOperationsDelegueesMvt(OperationsDelegueesMvtPK operationsDelegueesMvtPK);

    public void updateOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt);

}
