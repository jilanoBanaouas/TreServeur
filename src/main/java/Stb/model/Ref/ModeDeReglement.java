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
@Table(name = "MODE_DE_REGLEMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModeDeReglement.findAll", query = "SELECT m FROM ModeDeReglement m"),
    @NamedQuery(name = "ModeDeReglement.findByCodeModReg", query = "SELECT m FROM ModeDeReglement m WHERE m.codeModReg = :codeModReg"),
    @NamedQuery(name = "ModeDeReglement.findByLibModReg", query = "SELECT m FROM ModeDeReglement m WHERE m.libModReg = :libModReg")})
public class ModeDeReglement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_MOD_REG")
    private Short codeModReg;
    @Size(max = 50)
    @Column(name = "LIB_MOD_REG")
    private String libModReg;

    public ModeDeReglement() {
    }

    public ModeDeReglement(Short codeModReg) {
        this.codeModReg = codeModReg;
    }

    public Short getCodeModReg() {
        return codeModReg;
    }

    public void setCodeModReg(Short codeModReg) {
        this.codeModReg = codeModReg;
    }

    public String getLibModReg() {
        return libModReg;
    }

    public void setLibModReg(String libModReg) {
        this.libModReg = libModReg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeModReg != null ? codeModReg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModeDeReglement)) {
            return false;
        }
        ModeDeReglement other = (ModeDeReglement) object;
        if ((this.codeModReg == null && other.codeModReg != null) || (this.codeModReg != null && !this.codeModReg.equals(other.codeModReg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Ref.ModeDeReglement[ codeModReg=" + codeModReg + " ]";
    }
    
}
