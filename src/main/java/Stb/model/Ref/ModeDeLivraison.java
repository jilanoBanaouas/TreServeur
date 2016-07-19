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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author slim
 */
@Entity
@Table(name = "mode_de_livraison")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModeDeLivraison.findAll", query = "SELECT m FROM ModeDeLivraison m"),
    @NamedQuery(name = "ModeDeLivraison.findByCodeModLiv", query = "SELECT m FROM ModeDeLivraison m WHERE m.codeModLiv = :codeModLiv"),
    @NamedQuery(name = "ModeDeLivraison.findByLibModLiv", query = "SELECT m FROM ModeDeLivraison m WHERE m.libModLiv = :libModLiv"),
    @NamedQuery(name = "ModeDeLivraison.findByLibModLivFr", query = "SELECT m FROM ModeDeLivraison m WHERE m.libModLivFr = :libModLivFr"),
    @NamedQuery(name = "ModeDeLivraison.findBySigle", query = "SELECT m FROM ModeDeLivraison m WHERE m.sigle = :sigle")})
public class ModeDeLivraison implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_MOD_LIV")
    private Integer codeModLiv;
    @Size(max = 50)
    @Column(name = "LIB_MOD_LIV")
    private String libModLiv;
    @Size(max = 50)
    @Column(name = "LIB_MOD_LIV_FR")
    private String libModLivFr;
    @Size(max = 3)
    @Column(name = "SIGLE")
    private String sigle;

    public ModeDeLivraison() {
    }

    public ModeDeLivraison(Integer codeModLiv) {
        this.codeModLiv = codeModLiv;
    }

    public Integer getCodeModLiv() {
        return codeModLiv;
    }

    public void setCodeModLiv(Integer codeModLiv) {
        this.codeModLiv = codeModLiv;
    }

    public String getLibModLiv() {
        return libModLiv;
    }

    public void setLibModLiv(String libModLiv) {
        this.libModLiv = libModLiv;
    }

    public String getLibModLivFr() {
        return libModLivFr;
    }

    public void setLibModLivFr(String libModLivFr) {
        this.libModLivFr = libModLivFr;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeModLiv != null ? codeModLiv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModeDeLivraison)) {
            return false;
        }
        ModeDeLivraison other = (ModeDeLivraison) object;
        if ((this.codeModLiv == null && other.codeModLiv != null) || (this.codeModLiv != null && !this.codeModLiv.equals(other.codeModLiv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ModeDeLivraison[ codeModLiv=" + codeModLiv + " ]";
    }
    
}
