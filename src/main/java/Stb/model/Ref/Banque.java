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
@Table(name = "BANQUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Banque.findAll", query = "SELECT b FROM Banque b"),
    @NamedQuery(name = "Banque.findByCodeBanque", query = "SELECT b FROM Banque b WHERE b.codeBanque = :codeBanque"),
    @NamedQuery(name = "Banque.findByLibBanque", query = "SELECT b FROM Banque b WHERE b.libBanque = :libBanque"),
    @NamedQuery(name = "Banque.findByNumSwift", query = "SELECT b FROM Banque b WHERE b.numSwift = :numSwift")})
public class Banque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_BANQUE")
    private Short codeBanque;
    @Size(max = 50)
    @Column(name = "LIB_BANQUE")
    private String libBanque;
    @Size(max = 12)
    @Column(name = "NUM_SWIFT")
    private String numSwift;

    public Banque() {
    }

    public Banque(Short codeBanque) {
        this.codeBanque = codeBanque;
    }

    public Short getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Short codeBanque) {
        this.codeBanque = codeBanque;
    }

    public String getLibBanque() {
        return libBanque;
    }

    public void setLibBanque(String libBanque) {
        this.libBanque = libBanque;
    }

    public String getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(String numSwift) {
        this.numSwift = numSwift;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeBanque != null ? codeBanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banque)) {
            return false;
        }
        Banque other = (Banque) object;
        if ((this.codeBanque == null && other.codeBanque != null) || (this.codeBanque != null && !this.codeBanque.equals(other.codeBanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Ref.Banque[ codeBanque=" + codeBanque + " ]";
    }
    
}
