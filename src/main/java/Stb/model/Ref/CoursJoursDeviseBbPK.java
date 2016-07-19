/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Ref;

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
public class CoursJoursDeviseBbPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_COURS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_DEVISE")
    private short codeDevise;

    public CoursJoursDeviseBbPK() {
    }

    public CoursJoursDeviseBbPK(Date dateCours, short codeDevise) {
        this.dateCours = dateCours;
        this.codeDevise = codeDevise;
    }

    public Date getDateCours() {
        return dateCours;
    }

    public void setDateCours(Date dateCours) {
        this.dateCours = dateCours;
    }

    public short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(short codeDevise) {
        this.codeDevise = codeDevise;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dateCours != null ? dateCours.hashCode() : 0);
        hash += (int) codeDevise;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoursJoursDeviseBbPK)) {
            return false;
        }
        CoursJoursDeviseBbPK other = (CoursJoursDeviseBbPK) object;
        if ((this.dateCours == null && other.dateCours != null) || (this.dateCours != null && !this.dateCours.equals(other.dateCours))) {
            return false;
        }
        if (this.codeDevise != other.codeDevise) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Ref.CoursJoursDeviseBbPK[ dateCours=" + dateCours + ", codeDevise=" + codeDevise + " ]";
    }
    
}
