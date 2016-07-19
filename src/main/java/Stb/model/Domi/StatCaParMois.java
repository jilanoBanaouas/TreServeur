/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Domi;

import java.math.BigDecimal;

/**
 *
 * @author ZEMNI
 */
public class StatCaParMois {
    private Short codeDevise;
    private String moisAnnee;
    private BigDecimal totMntDvs;
    private BigDecimal totMntTns;
    
    public StatCaParMois(){
    }

    public StatCaParMois(Short codeDevise, String moisAnnee, BigDecimal totMntDvs, BigDecimal totMntTns) {
        this.codeDevise = codeDevise;
        this.moisAnnee = moisAnnee;
        this.totMntDvs = totMntDvs;
        this.totMntTns = totMntTns;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public void setMoisAnnee(String moisAnnee) {
        this.moisAnnee = moisAnnee;
    }

    public void setTotMntDvs(BigDecimal totMntDvs) {
        this.totMntDvs = totMntDvs;
    }

    public void setTotMntTns(BigDecimal totMntTns) {
        this.totMntTns = totMntTns;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public String getMoisAnnee() {
        return moisAnnee;
    }

    public BigDecimal getTotMntDvs() {
        return totMntDvs;
    }

    public BigDecimal getTotMntTns() {
        return totMntTns;
    }
}
