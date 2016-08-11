/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Tre;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author workstation djo
 */
@Entity
@Table(name = "TITRE_BP", catalog = "", schema = "TRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TitreBp.findAll", query = "SELECT t FROM TitreBp t"),
    @NamedQuery(name = "TitreBp.findByNumDossier", query = "SELECT t FROM TitreBp t WHERE t.numDossier = :numDossier"),
    @NamedQuery(name = "TitreBp.findByDateDossier", query = "SELECT t FROM TitreBp t WHERE t.dateDossier = :dateDossier"),
    @NamedQuery(name = "TitreBp.findByTypeDossier", query = "SELECT t FROM TitreBp t WHERE t.typeDossier = :typeDossier"),
    @NamedQuery(name = "TitreBp.findByCodeTitreBp", query = "SELECT t FROM TitreBp t WHERE t.codeTitreBp = :codeTitreBp"),
    @NamedQuery(name = "TitreBp.findByNumDomBp", query = "SELECT t FROM TitreBp t WHERE t.numDomBp = :numDomBp"),
    @NamedQuery(name = "TitreBp.findByDateDomBp", query = "SELECT t FROM TitreBp t WHERE t.dateDomBp = :dateDomBp"),
    @NamedQuery(name = "TitreBp.findByCodeDvsTitreBp", query = "SELECT t FROM TitreBp t WHERE t.codeDvsTitreBp = :codeDvsTitreBp"),
    @NamedQuery(name = "TitreBp.findByMntTitreBp", query = "SELECT t FROM TitreBp t WHERE t.mntTitreBp = :mntTitreBp"),
    @NamedQuery(name = "TitreBp.findByCodePaysTitreBp", query = "SELECT t FROM TitreBp t WHERE t.codePaysTitreBp = :codePaysTitreBp")})
public class TitreBp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOSSIER")
    private Long numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.DATE)
    private Date dateDossier;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Column(name = "CODE_TITRE_BP")
    private Short codeTitreBp;
    @Column(name = "NUM_DOM_BP")
    private Integer numDomBp;
    @Column(name = "DATE_DOM_BP")
    @Temporal(TemporalType.DATE)
    private Date dateDomBp;
    @Column(name = "CODE_DVS_TITRE_BP")
    private Short codeDvsTitreBp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_TITRE_BP")
    private BigDecimal mntTitreBp;
    @Column(name = "CODE_PAYS_TITRE_BP")
    private Short codePaysTitreBp;

    public TitreBp() {
    }

    public TitreBp(Long numDossier) {
        this.numDossier = numDossier;
    }

    public Long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Long numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Short getCodeTitreBp() {
        return codeTitreBp;
    }

    public void setCodeTitreBp(Short codeTitreBp) {
        this.codeTitreBp = codeTitreBp;
    }

    public Integer getNumDomBp() {
        return numDomBp;
    }

    public void setNumDomBp(Integer numDomBp) {
        this.numDomBp = numDomBp;
    }

    public Date getDateDomBp() {
        return dateDomBp;
    }

    public void setDateDomBp(Date dateDomBp) {
        this.dateDomBp = dateDomBp;
    }

    public Short getCodeDvsTitreBp() {
        return codeDvsTitreBp;
    }

    public void setCodeDvsTitreBp(Short codeDvsTitreBp) {
        this.codeDvsTitreBp = codeDvsTitreBp;
    }

    public BigDecimal getMntTitreBp() {
        return mntTitreBp;
    }

    public void setMntTitreBp(BigDecimal mntTitreBp) {
        this.mntTitreBp = mntTitreBp;
    }

    public Short getCodePaysTitreBp() {
        return codePaysTitreBp;
    }

    public void setCodePaysTitreBp(Short codePaysTitreBp) {
        this.codePaysTitreBp = codePaysTitreBp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numDossier != null ? numDossier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitreBp)) {
            return false;
        }
        TitreBp other = (TitreBp) object;
        if ((this.numDossier == null && other.numDossier != null) || (this.numDossier != null && !this.numDossier.equals(other.numDossier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Tre.TitreBp[ numDossier=" + numDossier + " ]";
    }
    
}
