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
public class AvoirTitrePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TITRE")
    private int codeTitre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOM")
    private int numDom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDom;

    public AvoirTitrePK() {
    }

    public AvoirTitrePK(short codeTitre, int numDom, Date dateDom) {
        this.codeTitre = codeTitre;
        this.numDom = numDom;
        this.dateDom = dateDom;
    }

    public int getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(int codeTitre) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeTitre;
        hash += (int) numDom;
        hash += (dateDom != null ? dateDom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvoirTitrePK)) {
            return false;
        }
        AvoirTitrePK other = (AvoirTitrePK) object;
        if (this.codeTitre != other.codeTitre) {
            return false;
        }
        if (this.numDom != other.numDom) {
            return false;
        }
        if ((this.dateDom == null && other.dateDom != null) || (this.dateDom != null && !this.dateDom.equals(other.dateDom))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Domi.AvoirTitrePK[ codeTitre=" + codeTitre + ", numDom=" + numDom + ", dateDom=" + dateDom + " ]";
    }
    
}
