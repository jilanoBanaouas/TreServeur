/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Domi;

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
 * @author slim
 */
@Embeddable
public class EmargementImputationTitrePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOM")
    private int numDom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TITRE")
    private short codeTitre;

    public EmargementImputationTitrePK() {
    }

    public EmargementImputationTitrePK(int numDom, Date dateDom, short codeTitre) {
        this.numDom = numDom;
        this.dateDom = dateDom;
        this.codeTitre = codeTitre;
    }

    public int getNumDom() {
        return numDom;
    }

    public void setNumDom(int numDom) {
        this.numDom = numDom;
    }

    public Date getDateDom() {
        return dateDom;
    }

    public void setDateDom(Date dateDom) {
        this.dateDom = dateDom;
    }

    public short getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(short codeTitre) {
        this.codeTitre = codeTitre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numDom;
        hash += (dateDom != null ? dateDom.hashCode() : 0);
        hash += (int) codeTitre;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmargementImputationTitrePK)) {
            return false;
        }
        EmargementImputationTitrePK other = (EmargementImputationTitrePK) object;
        if (this.numDom != other.numDom) {
            return false;
        }
        if ((this.dateDom == null && other.dateDom != null) || (this.dateDom != null && !this.dateDom.equals(other.dateDom))) {
            return false;
        }
        if (this.codeTitre != other.codeTitre) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Domi.EmargementImputationTitrePK[ numDom=" + numDom + ", dateDom=" + dateDom + ", codeTitre=" + codeTitre + " ]";
    }
    
}
