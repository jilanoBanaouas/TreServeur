/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Ref;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ZEMNI
 */
@Entity
@Table(name = "AGENCE_ETRANGERE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgenceEtrangere.findAll", query = "SELECT a FROM AgenceEtrangere a"),
    @NamedQuery(name = "AgenceEtrangere.findByCodeBnqEtr", query = "SELECT a FROM AgenceEtrangere a WHERE a.agenceEtrangerePK.codeBnqEtr = :codeBnqEtr"),
    @NamedQuery(name = "AgenceEtrangere.findByCodeAgenceEtr", query = "SELECT a FROM AgenceEtrangere a WHERE a.agenceEtrangerePK.codeAgenceEtr = :codeAgenceEtr"),
    @NamedQuery(name = "AgenceEtrangere.findByCite", query = "SELECT a FROM AgenceEtrangere a WHERE a.cite = :cite"),
    @NamedQuery(name = "AgenceEtrangere.findByCite1", query = "SELECT a FROM AgenceEtrangere a WHERE a.cite1 = :cite1"),
    @NamedQuery(name = "AgenceEtrangere.findByCite2", query = "SELECT a FROM AgenceEtrangere a WHERE a.cite2 = :cite2"),
    @NamedQuery(name = "AgenceEtrangere.findByCite3", query = "SELECT a FROM AgenceEtrangere a WHERE a.cite3 = :cite3"),
    @NamedQuery(name = "AgenceEtrangere.findByCleSwift", query = "SELECT a FROM AgenceEtrangere a WHERE a.cleSwift = :cleSwift"),
    @NamedQuery(name = "AgenceEtrangere.findByCodeDevise", query = "SELECT a FROM AgenceEtrangere a WHERE a.codeDevise = :codeDevise"),
    @NamedQuery(name = "AgenceEtrangere.findByCodePays", query = "SELECT a FROM AgenceEtrangere a WHERE a.codePays = :codePays"),
    @NamedQuery(name = "AgenceEtrangere.findByLibAgenceEtr", query = "SELECT a FROM AgenceEtrangere a WHERE a.libAgenceEtr = :libAgenceEtr"),
    @NamedQuery(name = "AgenceEtrangere.findByNumSwift", query = "SELECT a FROM AgenceEtrangere a WHERE a.numSwift = :numSwift"),
    @NamedQuery(name = "AgenceEtrangere.findByRue", query = "SELECT a FROM AgenceEtrangere a WHERE a.rue = :rue"),
    @NamedQuery(name = "AgenceEtrangere.findByRue1", query = "SELECT a FROM AgenceEtrangere a WHERE a.rue1 = :rue1"),
    @NamedQuery(name = "AgenceEtrangere.findByRue2", query = "SELECT a FROM AgenceEtrangere a WHERE a.rue2 = :rue2"),
    @NamedQuery(name = "AgenceEtrangere.findByRue3", query = "SELECT a FROM AgenceEtrangere a WHERE a.rue3 = :rue3"),
    @NamedQuery(name = "AgenceEtrangere.findByVille", query = "SELECT a FROM AgenceEtrangere a WHERE a.ville = :ville")})
public class AgenceEtrangere implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgenceEtrangerePK agenceEtrangerePK;
    @Size(max = 20)
    @Column(name = "CITE")
    private String cite;
    @Size(max = 20)
    @Column(name = "CITE1")
    private String cite1;
    @Size(max = 20)
    @Column(name = "CITE2")
    private String cite2;
    @Size(max = 20)
    @Column(name = "CITE3")
    private String cite3;
    @Size(max = 1)
    @Column(name = "CLE_SWIFT")
    private String cleSwift;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    @Column(name = "CODE_PAYS")
    private Short codePays;
    @Size(max = 40)
    @Column(name = "LIB_AGENCE_ETR")
    private String libAgenceEtr;
    @Size(max = 13)
    @Column(name = "NUM_SWIFT")
    private String numSwift;
    @Size(max = 29)
    @Column(name = "RUE")
    private String rue;
    @Size(max = 29)
    @Column(name = "RUE1")
    private String rue1;
    @Size(max = 29)
    @Column(name = "RUE2")
    private String rue2;
    @Size(max = 29)
    @Column(name = "RUE3")
    private String rue3;
    @Size(max = 200)
    @Column(name = "VILLE")
    private String ville;

    public AgenceEtrangere() {
    }

    public AgenceEtrangere(AgenceEtrangerePK agenceEtrangerePK) {
        this.agenceEtrangerePK = agenceEtrangerePK;
    }

    public AgenceEtrangere(int codeBnqEtr, int codeAgenceEtr) {
        this.agenceEtrangerePK = new AgenceEtrangerePK(codeBnqEtr, codeAgenceEtr);
    }

    public AgenceEtrangerePK getAgenceEtrangerePK() {
        return agenceEtrangerePK;
    }

    public void setAgenceEtrangerePK(AgenceEtrangerePK agenceEtrangerePK) {
        this.agenceEtrangerePK = agenceEtrangerePK;
    }

    public String getCite() {
        return cite;
    }

    public void setCite(String cite) {
        this.cite = cite;
    }

    public String getCite1() {
        return cite1;
    }

    public void setCite1(String cite1) {
        this.cite1 = cite1;
    }

    public String getCite2() {
        return cite2;
    }

    public void setCite2(String cite2) {
        this.cite2 = cite2;
    }

    public String getCite3() {
        return cite3;
    }

    public void setCite3(String cite3) {
        this.cite3 = cite3;
    }

    public String getCleSwift() {
        return cleSwift;
    }

    public void setCleSwift(String cleSwift) {
        this.cleSwift = cleSwift;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Short getCodePays() {
        return codePays;
    }

    public void setCodePays(Short codePays) {
        this.codePays = codePays;
    }

    public String getLibAgenceEtr() {
        return libAgenceEtr;
    }

    public void setLibAgenceEtr(String libAgenceEtr) {
        this.libAgenceEtr = libAgenceEtr;
    }

    public String getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(String numSwift) {
        this.numSwift = numSwift;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getRue1() {
        return rue1;
    }

    public void setRue1(String rue1) {
        this.rue1 = rue1;
    }

    public String getRue2() {
        return rue2;
    }

    public void setRue2(String rue2) {
        this.rue2 = rue2;
    }

    public String getRue3() {
        return rue3;
    }

    public void setRue3(String rue3) {
        this.rue3 = rue3;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agenceEtrangerePK != null ? agenceEtrangerePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenceEtrangere)) {
            return false;
        }
        AgenceEtrangere other = (AgenceEtrangere) object;
        if ((this.agenceEtrangerePK == null && other.agenceEtrangerePK != null) || (this.agenceEtrangerePK != null && !this.agenceEtrangerePK.equals(other.agenceEtrangerePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Ref.AgenceEtrangere[ agenceEtrangerePK=" + agenceEtrangerePK + " ]";
    }
    
}
