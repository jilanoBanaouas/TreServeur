/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Domi;

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
 * @author slim
 */
@Entity
@Table(catalog = "domi",name = "apurement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apurement.findAll", query = "SELECT a FROM Apurement a"),
    @NamedQuery(name = "Apurement.findByCodeApurement", query = "SELECT a FROM Apurement a WHERE a.apurementPK.codeApurement = :codeApurement"),
    @NamedQuery(name = "Apurement.findByLibApurement", query = "SELECT a FROM Apurement a WHERE a.libApurement = :libApurement"),
    @NamedQuery(name = "Apurement.findByEtat", query = "SELECT a FROM Apurement a WHERE a.etat = :etat"),
    @NamedQuery(name = "Apurement.findByMention", query = "SELECT a FROM Apurement a WHERE a.mention = :mention"),
    @NamedQuery(name = "Apurement.findByAdditif", query = "SELECT a FROM Apurement a WHERE a.additif = :additif"),
    @NamedQuery(name = "Apurement.findByNatureTitre", query = "SELECT a FROM Apurement a WHERE a.apurementPK.natureTitre = :natureTitre")})
public class Apurement implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApurementPK apurementPK;
    @Size(max = 50)
    @Column(name = "LIB_APUREMENT")
    private String libApurement;
    @Size(max = 1)
    @Column(name = "ETAT")
    private String etat;
    @Size(max = 40)
    @Column(name = "MENTION")
    private String mention;
    @Size(max = 40)
    @Column(name = "ADDITIF")
    private String additif;

    public Apurement() {
    }

    public Apurement(ApurementPK apurementPK) {
        this.apurementPK = apurementPK;
    }

    public Apurement(int codeApurement, int natureTitre) {
        this.apurementPK = new ApurementPK(codeApurement, natureTitre);
    }

    public ApurementPK getApurementPK() {
        return apurementPK;
    }

    public void setApurementPK(ApurementPK apurementPK) {
        this.apurementPK = apurementPK;
    }

    public String getLibApurement() {
        return libApurement;
    }

    public void setLibApurement(String libApurement) {
        this.libApurement = libApurement;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public String getAdditif() {
        return additif;
    }

    public void setAdditif(String additif) {
        this.additif = additif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apurementPK != null ? apurementPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apurement)) {
            return false;
        }
        Apurement other = (Apurement) object;
        if ((this.apurementPK == null && other.apurementPK != null) || (this.apurementPK != null && !this.apurementPK.equals(other.apurementPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Apurement[ apurementPK=" + apurementPK + " ]";
    }
    
}
