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
public class ImageDepotDomiciliationPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "REF_CONTRAT")
    private int refContrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNITE_CONTRAT")
    private int uniteContrat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_CONTRAT")
    @Temporal(TemporalType.DATE)
    private Date dateContrat;

    public ImageDepotDomiciliationPK() {
    }

    public ImageDepotDomiciliationPK(int refContrat, int uniteContrat, Date dateContrat) {
        this.refContrat = refContrat;
        this.uniteContrat = uniteContrat;
        this.dateContrat = dateContrat;
    }

    public int getRefContrat() {
        return refContrat;
    }

    public void setRefContrat(int refContrat) {
        this.refContrat = refContrat;
    }

    public int getUniteContrat() {
        return uniteContrat;
    }

    public void setUniteContrat(int uniteContrat) {
        this.uniteContrat = uniteContrat;
    }

    public Date getDateContrat() {
        return dateContrat;
    }

    public void setDateContrat(Date dateContrat) {
        this.dateContrat = dateContrat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) refContrat;
        hash += (int) uniteContrat;
        hash += (dateContrat != null ? dateContrat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageDepotDomiciliationPK)) {
            return false;
        }
        ImageDepotDomiciliationPK other = (ImageDepotDomiciliationPK) object;
        if (this.refContrat != other.refContrat) {
            return false;
        }
        if (this.uniteContrat != other.uniteContrat) {
            return false;
        }
        if ((this.dateContrat == null && other.dateContrat != null) || (this.dateContrat != null && !this.dateContrat.equals(other.dateContrat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ImageDepotDomiciliationPK[ refContrat=" + refContrat + ", uniteContrat=" + uniteContrat + ", dateContrat=" + dateContrat + " ]";
    }
    
}
