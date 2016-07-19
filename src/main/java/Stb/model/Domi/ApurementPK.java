/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Domi;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author slim
 */
@Embeddable
public class ApurementPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_APUREMENT")
    private int codeApurement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NATURE_TITRE")
    private int natureTitre;

    public ApurementPK() {
    }

    public ApurementPK(int codeApurement, int natureTitre) {
        this.codeApurement = codeApurement;
        this.natureTitre = natureTitre;
    }

    public int getCodeApurement() {
        return codeApurement;
    }

    public void setCodeApurement(int codeApurement) {
        this.codeApurement = codeApurement;
    }

    public int getNatureTitre() {
        return natureTitre;
    }

    public void setNatureTitre(int natureTitre) {
        this.natureTitre = natureTitre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeApurement;
        hash += (int) natureTitre;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApurementPK)) {
            return false;
        }
        ApurementPK other = (ApurementPK) object;
        if (this.codeApurement != other.codeApurement) {
            return false;
        }
        if (this.natureTitre != other.natureTitre) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ApurementPK[ codeApurement=" + codeApurement + ", natureTitre=" + natureTitre + " ]";
    }
    
}
