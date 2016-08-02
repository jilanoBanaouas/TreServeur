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
@Table(name = "ACTIVITE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Activite.findAll", query = "SELECT a FROM Activite a"),
    @NamedQuery(name = "Activite.findByCodeActivite", query = "SELECT a FROM Activite a WHERE a.codeActivite = :codeActivite"),
    @NamedQuery(name = "Activite.findByLibActivite", query = "SELECT a FROM Activite a WHERE a.libActivite = :libActivite")})
public class Activite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ACTIVITE", nullable = false)
    private Integer codeActivite;
    @Size(max = 100)
    @Column(name = "LIB_ACTIVITE", length = 100)
    private String libActivite;

    public Activite() {
    }

    public Activite(Integer codeActivite) {
        this.codeActivite = codeActivite;
    }

    public Integer getCodeActivite() {
        return codeActivite;
    }

    public void setCodeActivite(Integer codeActivite) {
        this.codeActivite = codeActivite;
    }

    public String getLibActivite() {
        return libActivite;
    }

    public void setLibActivite(String libActivite) {
        this.libActivite = libActivite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeActivite != null ? codeActivite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activite)) {
            return false;
        }
        Activite other = (Activite) object;
        if ((this.codeActivite == null && other.codeActivite != null) || (this.codeActivite != null && !this.codeActivite.equals(other.codeActivite))) {
            return false;
        }
        return true;
    }

   
    @Override
    public String toString() {
        return "Stb.model.Ref.Activite[ codeActivite=" + codeActivite + " ]";
    }
    
}
