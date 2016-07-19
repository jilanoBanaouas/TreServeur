/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Domi;

import java.util.Date;

/**
 *
 * @author slim
 */
public class DetailDom {
    
private String numDom;
private String dateDom;
private String codeTitre;
private String codeDevise;
private String codeModLiv;
private String mntDvsPtfnFact;
private String nomFournisseur;
private String dateApurement;
private String totMntRegle;
private String numeroDossier;
private String libTitre;
private String etat;
private String totMntImpute;
private String codeAgenceBct;
private String mntTndPtfn;
private String racineCompte;
private String cleRib;

    public DetailDom(String numDom, String dateDom, String codeTitre, String codeDevise, String codeModLiv, String mntDvsPtfnFact, String nomFournisseur, String dateApurement, String totMntRegle, String numeroDossier, String libTitre, String etat, String totMntImpute, String codeAgenceBct, String mntTndPtfn, String racineCompte, String cleRib) {
        this.numDom = numDom;
        this.dateDom = dateDom;
        this.codeTitre = codeTitre;
        this.codeDevise = codeDevise;
        this.codeModLiv = codeModLiv;
        this.mntDvsPtfnFact = mntDvsPtfnFact;
        this.nomFournisseur = nomFournisseur;
        this.dateApurement = dateApurement;
        this.totMntRegle = totMntRegle;
        this.numeroDossier = numeroDossier;
        this.libTitre = libTitre;
        this.etat = etat;
        this.totMntImpute = totMntImpute;
        this.codeAgenceBct = codeAgenceBct;
        this.mntTndPtfn = mntTndPtfn;
        this.racineCompte = racineCompte;
        this.cleRib = cleRib;
    }

    public DetailDom() {
    }

    
    

    public String getNumDom() {
        return numDom;
    }

    public void setNumDom(String numDom) {
        this.numDom = numDom;
    }

    public String getDateDom() {
        return dateDom;
    }

    public void setDateDom(String dateDom) {
        this.dateDom = dateDom;
    }

    public String getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(String codeTitre) {
        this.codeTitre = codeTitre;
    }

    public String getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(String codeDevise) {
        this.codeDevise = codeDevise;
    }

    public String getCodeModLiv() {
        return codeModLiv;
    }

    public void setCodeModLiv(String codeModLiv) {
        this.codeModLiv = codeModLiv;
    }

    public String getMntDvsPtfnFact() {
        return mntDvsPtfnFact;
    }

    public void setMntDvsPtfnFact(String mntDvsPtfnFact) {
        this.mntDvsPtfnFact = mntDvsPtfnFact;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public String getDateApurement() {
        return dateApurement;
    }

    public void setDateApurement(String dateApurement) {
        this.dateApurement = dateApurement;
    }

    public String getTotMntRegle() {
        return totMntRegle;
    }

    public void setTotMntRegle(String totMntRegle) {
        this.totMntRegle = totMntRegle;
    }

    public String getNumeroDossier() {
        return numeroDossier;
    }

    public void setNumeroDossier(String numeroDossier) {
        this.numeroDossier = numeroDossier;
    }

    public String getLibTitre() {
        return libTitre;
    }

    public void setLibTitre(String libTitre) {
        this.libTitre = libTitre;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getTotMntImpute() {
        return totMntImpute;
    }

    public void setTotMntImpute(String totMntImpute) {
        this.totMntImpute = totMntImpute;
    }

    public String getCodeAgenceBct() {
        return codeAgenceBct;
    }

    public void setCodeAgenceBct(String codeAgenceBct) {
        this.codeAgenceBct = codeAgenceBct;
    }

    public String getMntTndPtfn() {
        return mntTndPtfn;
    }

    public void setMntTndPtfn(String mntTndPtfn) {
        this.mntTndPtfn = mntTndPtfn;
    }

    public String getRacineCompte() {
        return racineCompte;
    }

    public void setRacineCompte(String racineCompte) {
        this.racineCompte = racineCompte;
    }

    public String getCleRib() {
        return cleRib;
    }

    public void setCleRib(String cleRib) {
        this.cleRib = cleRib;
    }
 
    
}
