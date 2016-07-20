/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Ref;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author yayan
 */
@Entity
@Table(name = "AGENCE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Agence.findAll", query = "SELECT a FROM Agence a"),
    @NamedQuery(name = "Agence.findByCodeBanque", query = "SELECT a FROM Agence a WHERE a.agencePK.codeBanque = :codeBanque"),
    @NamedQuery(name = "Agence.findByCodeAgenceBct", query = "SELECT a FROM Agence a WHERE a.agencePK.codeAgenceBct = :codeAgenceBct"),
    @NamedQuery(name = "Agence.findByLibAgence", query = "SELECT a FROM Agence a WHERE a.libAgence = :libAgence"),
    @NamedQuery(name = "Agence.findByAdresseAgence", query = "SELECT a FROM Agence a WHERE a.adresseAgence = :adresseAgence"),
    @NamedQuery(name = "Agence.findByIndicatifTel", query = "SELECT a FROM Agence a WHERE a.indicatifTel = :indicatifTel"),
    @NamedQuery(name = "Agence.findByNumeroTel", query = "SELECT a FROM Agence a WHERE a.numeroTel = :numeroTel"),
    @NamedQuery(name = "Agence.findByCodeAgenceBna", query = "SELECT a FROM Agence a WHERE a.codeAgenceBna = :codeAgenceBna"),
    @NamedQuery(name = "Agence.findByNumAgent", query = "SELECT a FROM Agence a WHERE a.numAgent = :numAgent"),
    @NamedQuery(name = "Agence.findByCodeBanqueAndCodeAgence", query = "SELECT a FROM Agence a WHERE a.agencePK.codeBanque = :codeBanque AND a.agencePK.codeAgenceBct = :codeAgenceBct")})
public class Agence implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgencePK agencePK;
    @Size(max = 20)
    @Column(name = "LIB_AGENCE", length = 20)
    private String libAgence;
    @Size(max = 30)
    @Column(name = "ADRESSE_AGENCE", length = 30)
    private String adresseAgence;
    @Column(name = "INDICATIF_TEL")
    private Short indicatifTel;
    @Column(name = "NUMERO_TEL")
    private Integer numeroTel;
    @Column(name = "CODE_AGENCE_BNA")
    private Short codeAgenceBna;
    @Column(name = "NUM_AGENT")
    private Integer numAgent;

    public Agence() {
    }

    public Agence(AgencePK agencePK) {
        this.agencePK = agencePK;
    }

    public Agence(short codeBanque, short codeAgenceBct) {
        this.agencePK = new AgencePK(codeBanque, codeAgenceBct);
    }

    public AgencePK getAgencePK() {
        return agencePK;
    }

    public void setAgencePK(AgencePK agencePK) {
        this.agencePK = agencePK;
    }

    public String getLibAgence() {
        return libAgence;
    }

    public void setLibAgence(String libAgence) {
        this.libAgence = libAgence;
    }

    public String getAdresseAgence() {
        return adresseAgence;
    }

    public void setAdresseAgence(String adresseAgence) {
        this.adresseAgence = adresseAgence;
    }

    public Short getIndicatifTel() {
        return indicatifTel;
    }

    public void setIndicatifTel(Short indicatifTel) {
        this.indicatifTel = indicatifTel;
    }

    public Integer getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(Integer numeroTel) {
        this.numeroTel = numeroTel;
    }

    public Short getCodeAgenceBna() {
        return codeAgenceBna;
    }

    public void setCodeAgenceBna(Short codeAgenceBna) {
        this.codeAgenceBna = codeAgenceBna;
    }

    public Integer getNumAgent() {
        return numAgent;
    }

    public void setNumAgent(Integer numAgent) {
        this.numAgent = numAgent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agencePK != null ? agencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agence)) {
            return false;
        }
        Agence other = (Agence) object;
        if ((this.agencePK == null && other.agencePK != null) || (this.agencePK != null && !this.agencePK.equals(other.agencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Ref.Agence[ agencePK=" + agencePK + " ]";
    }

}
