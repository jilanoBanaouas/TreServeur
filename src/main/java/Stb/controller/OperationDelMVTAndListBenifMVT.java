/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.controller;

import Stb.model.ava.BeneficiairesMvt;
import Stb.model.ava.OperationsDelegueesMvt;
import java.util.List;

/**
 *
 * @author yayan
 */
public class OperationDelMVTAndListBenifMVT {
    private OperationsDelegueesMvt operationsDelegueesMvt;
    private List<BeneficiairesMvt> beneficiairesMvts;

    public OperationsDelegueesMvt getOperationsDelegueesMvt() {
        return operationsDelegueesMvt;
    }

    public void setOperationsDelegueesMvt(OperationsDelegueesMvt operationsDelegueesMvt) {
        this.operationsDelegueesMvt = operationsDelegueesMvt;
    }

    public List<BeneficiairesMvt> getBeneficiairesMvts() {
        return beneficiairesMvts;
    }

    public void setBeneficiairesMvts(List<BeneficiairesMvt> beneficiairesMvts) {
        this.beneficiairesMvts = beneficiairesMvts;
    }
    
    
    
    
    
}
