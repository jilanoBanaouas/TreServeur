/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Domi;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author slim
 */
@Entity
@Table(name = "EMARGEMENT_IMPUTATION_TITRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmargementImputationTitre.findAll", query = "SELECT e FROM EmargementImputationTitre e"),
    @NamedQuery(name = "EmargementImputationTitre.findByNumDom", query = "SELECT e FROM EmargementImputationTitre e WHERE e.emargementImputationTitrePK.numDom = :numDom"),
    @NamedQuery(name = "EmargementImputationTitre.findByDateDom", query = "SELECT e FROM EmargementImputationTitre e WHERE e.emargementImputationTitrePK.dateDom = :dateDom"),
    @NamedQuery(name = "EmargementImputationTitre.findByCodeTitre", query = "SELECT e FROM EmargementImputationTitre e WHERE e.emargementImputationTitrePK.codeTitre = :codeTitre"),
    @NamedQuery(name = "EmargementImputationTitre.findByCodeDevise", query = "SELECT e FROM EmargementImputationTitre e WHERE e.codeDevise = :codeDevise"),
    @NamedQuery(name = "EmargementImputationTitre.findByMntDevise", query = "SELECT e FROM EmargementImputationTitre e WHERE e.mntDevise = :mntDevise"),
    @NamedQuery(name = "EmargementImputationTitre.findByMntTnd", query = "SELECT e FROM EmargementImputationTitre e WHERE e.mntTnd = :mntTnd"),
    @NamedQuery(name = "EmargementImputationTitre.findByNumDeclaration", query = "SELECT e FROM EmargementImputationTitre e WHERE e.numDeclaration = :numDeclaration"),
    @NamedQuery(name = "EmargementImputationTitre.findByDateDeclaration", query = "SELECT e FROM EmargementImputationTitre e WHERE e.dateDeclaration = :dateDeclaration"),
    @NamedQuery(name = "EmargementImputationTitre.findByDateOperation", query = "SELECT e FROM EmargementImputationTitre e WHERE e.dateOperation = :dateOperation")})
public class EmargementImputationTitre implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmargementImputationTitrePK emargementImputationTitrePK;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_DEVISE")
    private BigDecimal mntDevise;
    @Column(name = "MNT_TND")
    private BigDecimal mntTnd;
    @Column(name = "NUM_DECLARATION")
    private Long numDeclaration;
    @Column(name = "DATE_DECLARATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDeclaration;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;

    public EmargementImputationTitre() {
    }

    public EmargementImputationTitre(EmargementImputationTitrePK emargementImputationTitrePK) {
        this.emargementImputationTitrePK = emargementImputationTitrePK;
    }

    public EmargementImputationTitre(int numDom, Date dateDom, short codeTitre) {
        this.emargementImputationTitrePK = new EmargementImputationTitrePK(numDom, dateDom, codeTitre);
    }

    public EmargementImputationTitrePK getEmargementImputationTitrePK() {
        return emargementImputationTitrePK;
    }

    public void setEmargementImputationTitrePK(EmargementImputationTitrePK emargementImputationTitrePK) {
        this.emargementImputationTitrePK = emargementImputationTitrePK;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public BigDecimal getMntDevise() {
        return mntDevise;
    }

    public void setMntDevise(BigDecimal mntDevise) {
        this.mntDevise = mntDevise;
    }

    public BigDecimal getMntTnd() {
        return mntTnd;
    }

    public void setMntTnd(BigDecimal mntTnd) {
        this.mntTnd = mntTnd;
    }

    public Long getNumDeclaration() {
        return numDeclaration;
    }

    public void setNumDeclaration(Long numDeclaration) {
        this.numDeclaration = numDeclaration;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emargementImputationTitrePK != null ? emargementImputationTitrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmargementImputationTitre)) {
            return false;
        }
        EmargementImputationTitre other = (EmargementImputationTitre) object;
        if ((this.emargementImputationTitrePK == null && other.emargementImputationTitrePK != null) || (this.emargementImputationTitrePK != null && !this.emargementImputationTitrePK.equals(other.emargementImputationTitrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Domi.EmargementImputationTitre[ emargementImputationTitrePK=" + emargementImputationTitrePK + " ]";
    }
    
}
