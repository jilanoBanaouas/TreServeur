/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Ref;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yayan
 */
@Entity
@Table(name = "MODE_PAIEMENT", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "ModePaiement.findAll", query = "SELECT m FROM ModePaiement m"),
    @NamedQuery(name = "ModePaiement.findByCodeModePaiement", query = "SELECT m FROM ModePaiement m WHERE m.codeModePaiement = :codeModePaiement"),
    @NamedQuery(name = "ModePaiement.findByLibModePaiement", query = "SELECT m FROM ModePaiement m WHERE m.libModePaiement = :libModePaiement")})
public class ModePaiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "CODE_MODE_PAIEMENT", nullable = false, length = 2)
    private String codeModePaiement;
    @Size(max = 50)
    @Column(name = "LIB_MODE_PAIEMENT", length = 50)
    private String libModePaiement;

    public ModePaiement() {
    }

    public ModePaiement(String codeModePaiement) {
        this.codeModePaiement = codeModePaiement;
    }

    public String getCodeModePaiement() {
        return codeModePaiement;
    }

    public void setCodeModePaiement(String codeModePaiement) {
        this.codeModePaiement = codeModePaiement;
    }

    public String getLibModePaiement() {
        return libModePaiement;
    }

    public void setLibModePaiement(String libModePaiement) {
        this.libModePaiement = libModePaiement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeModePaiement != null ? codeModePaiement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModePaiement)) {
            return false;
        }
        ModePaiement other = (ModePaiement) object;
        if ((this.codeModePaiement == null && other.codeModePaiement != null) || (this.codeModePaiement != null && !this.codeModePaiement.equals(other.codeModePaiement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Ref.ModePaiement[ codeModePaiement=" + codeModePaiement + " ]";
    }
    
}
