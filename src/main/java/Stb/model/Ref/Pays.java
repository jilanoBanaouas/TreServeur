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
@Table(name = "PAYS", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Pays.findAll", query = "SELECT p FROM Pays p"),
    @NamedQuery(name = "Pays.findByCodePays", query = "SELECT p FROM Pays p WHERE p.codePays = :codePays"),
    @NamedQuery(name = "Pays.findBySiglePays", query = "SELECT p FROM Pays p WHERE p.siglePays = :siglePays"),
    @NamedQuery(name = "Pays.findByLibPays", query = "SELECT p FROM Pays p WHERE p.libPays = :libPays"),
    @NamedQuery(name = "Pays.findByNationalite", query = "SELECT p FROM Pays p WHERE p.nationalite = :nationalite"),
    @NamedQuery(name = "Pays.findByCodePaysIso", query = "SELECT p FROM Pays p WHERE p.codePaysIso = :codePaysIso"),
    @NamedQuery(name = "Pays.findByCodeIso", query = "SELECT p FROM Pays p WHERE p.codeIso = :codeIso")})
public class Pays implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PAYS", nullable = false)
    private Short codePays;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "SIGLE_PAYS", nullable = false, length = 3)
    private String siglePays;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LIB_PAYS", nullable = false, length = 50)
    private String libPays;
    @Size(max = 20)
    @Column(name = "NATIONALITE", length = 20)
    private String nationalite;
    @Size(max = 2)
    @Column(name = "CODE_PAYS_ISO", length = 2)
    private String codePaysIso;
    @Size(max = 2)
    @Column(name = "CODE_ISO", length = 2)
    private String codeIso;

    public Pays() {
    }

    public Pays(Short codePays) {
        this.codePays = codePays;
    }

    public Pays(Short codePays, String siglePays, String libPays) {
        this.codePays = codePays;
        this.siglePays = siglePays;
        this.libPays = libPays;
    }

    public Short getCodePays() {
        return codePays;
    }

    public void setCodePays(Short codePays) {
        this.codePays = codePays;
    }

    public String getSiglePays() {
        return siglePays;
    }

    public void setSiglePays(String siglePays) {
        this.siglePays = siglePays;
    }

    public String getLibPays() {
        return libPays;
    }

    public void setLibPays(String libPays) {
        this.libPays = libPays;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getCodePaysIso() {
        return codePaysIso;
    }

    public void setCodePaysIso(String codePaysIso) {
        this.codePaysIso = codePaysIso;
    }

    public String getCodeIso() {
        return codeIso;
    }

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePays != null ? codePays.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.codePays == null && other.codePays != null) || (this.codePays != null && !this.codePays.equals(other.codePays))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Ref.Pays[ codePays=" + codePays + " ]";
    }
    
}
