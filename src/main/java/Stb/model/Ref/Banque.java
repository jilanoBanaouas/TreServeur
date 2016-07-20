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
@Table(name = "BANQUE", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "Banque.findAll", query = "SELECT b FROM Banque b"),
    @NamedQuery(name = "Banque.findByCodeBanque", query = "SELECT b FROM Banque b WHERE b.codeBanque = :codeBanque"),
    @NamedQuery(name = "Banque.findByLibBanque", query = "SELECT b FROM Banque b WHERE b.libBanque = :libBanque"),
    @NamedQuery(name = "Banque.findBySigleBanque", query = "SELECT b FROM Banque b WHERE b.sigleBanque = :sigleBanque"),
    @NamedQuery(name = "Banque.findByResidenceBanque", query = "SELECT b FROM Banque b WHERE b.residenceBanque = :residenceBanque"),
    @NamedQuery(name = "Banque.findByNumeroResidenceBanque", query = "SELECT b FROM Banque b WHERE b.numeroResidenceBanque = :numeroResidenceBanque"),
    @NamedQuery(name = "Banque.findByCiteResidenceBanque", query = "SELECT b FROM Banque b WHERE b.citeResidenceBanque = :citeResidenceBanque"),
    @NamedQuery(name = "Banque.findByCodePostal", query = "SELECT b FROM Banque b WHERE b.codePostal = :codePostal"),
    @NamedQuery(name = "Banque.findByTel", query = "SELECT b FROM Banque b WHERE b.tel = :tel"),
    @NamedQuery(name = "Banque.findByNumSwift", query = "SELECT b FROM Banque b WHERE b.numSwift = :numSwift"),
    @NamedQuery(name = "Banque.findByPersonneAContacter", query = "SELECT b FROM Banque b WHERE b.personneAContacter = :personneAContacter"),
    @NamedQuery(name = "Banque.findByPersonnePourCorrespondance", query = "SELECT b FROM Banque b WHERE b.personnePourCorrespondance = :personnePourCorrespondance")})
public class Banque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_BANQUE", nullable = false)
    private Short codeBanque;
    @Size(max = 50)
    @Column(name = "LIB_BANQUE", length = 50)
    private String libBanque;
    @Size(max = 20)
    @Column(name = "SIGLE_BANQUE", length = 20)
    private String sigleBanque;
    @Size(max = 30)
    @Column(name = "RESIDENCE_BANQUE", length = 30)
    private String residenceBanque;
    @Size(max = 30)
    @Column(name = "NUMERO_RESIDENCE_BANQUE", length = 30)
    private String numeroResidenceBanque;
    @Size(max = 30)
    @Column(name = "CITE_RESIDENCE_BANQUE", length = 30)
    private String citeResidenceBanque;
    @Column(name = "CODE_POSTAL")
    private Short codePostal;
    @Size(max = 12)
    @Column(name = "TEL", length = 12)
    private String tel;
    @Size(max = 12)
    @Column(name = "NUM_SWIFT", length = 12)
    private String numSwift;
    @Size(max = 50)
    @Column(name = "PERSONNE_A_CONTACTER", length = 50)
    private String personneAContacter;
    @Size(max = 50)
    @Column(name = "PERSONNE_POUR_CORRESPONDANCE", length = 50)
    private String personnePourCorrespondance;

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

    public String getSigleBanque() {
        return sigleBanque;
    }

    public void setSigleBanque(String sigleBanque) {
        this.sigleBanque = sigleBanque;
    }

    public String getResidenceBanque() {
        return residenceBanque;
    }

    public void setResidenceBanque(String residenceBanque) {
        this.residenceBanque = residenceBanque;
    }

    public String getNumeroResidenceBanque() {
        return numeroResidenceBanque;
    }

    public void setNumeroResidenceBanque(String numeroResidenceBanque) {
        this.numeroResidenceBanque = numeroResidenceBanque;
    }

    public String getCiteResidenceBanque() {
        return citeResidenceBanque;
    }

    public void setCiteResidenceBanque(String citeResidenceBanque) {
        this.citeResidenceBanque = citeResidenceBanque;
    }

    public Short getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Short codePostal) {
        this.codePostal = codePostal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(String numSwift) {
        this.numSwift = numSwift;
    }

    public String getPersonneAContacter() {
        return personneAContacter;
    }

    public void setPersonneAContacter(String personneAContacter) {
        this.personneAContacter = personneAContacter;
    }

    public String getPersonnePourCorrespondance() {
        return personnePourCorrespondance;
    }

    public void setPersonnePourCorrespondance(String personnePourCorrespondance) {
        this.personnePourCorrespondance = personnePourCorrespondance;
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
        return "Stb.model.Ref.Banque[ codeBanque=" + codeBanque + " ]";
    }
    
}
