/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.ava;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yayan
 */
@Embeddable
public class BeneficiairesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOSSIER", nullable = false)
    private int numDossier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DOSSIER", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateDossier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TYPE_DOS", nullable = false)
    private short codeTypeDos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "NO_PIECE_BENEF", nullable = false, length = 13)
    private String noPieceBenef;

    public BeneficiairesPK() {
    }

    public BeneficiairesPK(int numDossier, Date dateDossier, short codeTypeDos, String noPieceBenef) {
        this.numDossier = numDossier;
        this.dateDossier = dateDossier;
        this.codeTypeDos = codeTypeDos;
        this.noPieceBenef = noPieceBenef;
    }

    public int getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(int numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public short getCodeTypeDos() {
        return codeTypeDos;
    }

    public void setCodeTypeDos(short codeTypeDos) {
        this.codeTypeDos = codeTypeDos;
    }

    public String getNoPieceBenef() {
        return noPieceBenef;
    }

    public void setNoPieceBenef(String noPieceBenef) {
        this.noPieceBenef = noPieceBenef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numDossier;
        hash += (dateDossier != null ? dateDossier.hashCode() : 0);
        hash += (int) codeTypeDos;
        hash += (noPieceBenef != null ? noPieceBenef.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficiairesPK)) {
            return false;
        }
        BeneficiairesPK other = (BeneficiairesPK) object;
        if (this.numDossier != other.numDossier) {
            return false;
        }
        if ((this.dateDossier == null && other.dateDossier != null) || (this.dateDossier != null && !this.dateDossier.equals(other.dateDossier))) {
            return false;
        }
        if (this.codeTypeDos != other.codeTypeDos) {
            return false;
        }
        if ((this.noPieceBenef == null && other.noPieceBenef != null) || (this.noPieceBenef != null && !this.noPieceBenef.equals(other.noPieceBenef))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.ava.BeneficiairesPK[ numDossier=" + numDossier + ", dateDossier=" + dateDossier + ", codeTypeDos=" + codeTypeDos + ", noPieceBenef=" + noPieceBenef + " ]";
    }
    
}
