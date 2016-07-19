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

/**
 *
 * @author yayan
 */
@Embeddable
public class OperationsDelegueesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOSSIER", nullable = false)
    private long numDossier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DOSSIER", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateDossier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_AGENCE_AVA", nullable = false)
    private short codeAgenceAva;

    public OperationsDelegueesPK() {
    }

    public OperationsDelegueesPK(long numDossier, Date dateDossier, short codeAgenceAva) {
        this.numDossier = numDossier;
        this.dateDossier = dateDossier;
        this.codeAgenceAva = codeAgenceAva;
    }

    public long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(long numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public short getCodeAgenceAva() {
        return codeAgenceAva;
    }

    public void setCodeAgenceAva(short codeAgenceAva) {
        this.codeAgenceAva = codeAgenceAva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numDossier;
        hash += (dateDossier != null ? dateDossier.hashCode() : 0);
        hash += (int) codeAgenceAva;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperationsDelegueesPK)) {
            return false;
        }
        OperationsDelegueesPK other = (OperationsDelegueesPK) object;
        if (this.numDossier != other.numDossier) {
            return false;
        }
        if ((this.dateDossier == null && other.dateDossier != null) || (this.dateDossier != null && !this.dateDossier.equals(other.dateDossier))) {
            return false;
        }
        if (this.codeAgenceAva != other.codeAgenceAva) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.ava.OperationsDelegueesPK[ numDossier=" + numDossier + ", dateDossier=" + dateDossier + ", codeAgenceAva=" + codeAgenceAva + " ]";
    }
    
}
