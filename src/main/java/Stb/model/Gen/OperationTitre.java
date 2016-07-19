/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Gen;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author slim
 */
@Entity
@Table(name = "OPERATION_TITRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OperationTitre.findAll", query = "SELECT o FROM OperationTitre o"),
    @NamedQuery(name = "OperationTitre.findByCodeProduitService", query = "SELECT o FROM OperationTitre o WHERE o.operationTitrePK.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "OperationTitre.findByCodeOperation", query = "SELECT o FROM OperationTitre o WHERE o.operationTitrePK.codeOperation = :codeOperation"),
    @NamedQuery(name = "OperationTitre.findByRefOperation", query = "SELECT o FROM OperationTitre o WHERE o.operationTitrePK.refOperation = :refOperation"),
    @NamedQuery(name = "OperationTitre.findByDateOperation", query = "SELECT o FROM OperationTitre o WHERE o.operationTitrePK.dateOperation = :dateOperation"),
    @NamedQuery(name = "OperationTitre.findByUniteOperation", query = "SELECT o FROM OperationTitre o WHERE o.operationTitrePK.uniteOperation = :uniteOperation"),
    @NamedQuery(name = "OperationTitre.findByNumDossier", query = "SELECT o FROM OperationTitre o WHERE o.numDossier = :numDossier"),
    @NamedQuery(name = "OperationTitre.findByDateDossier", query = "SELECT o FROM OperationTitre o WHERE o.dateDossier = :dateDossier"),
    @NamedQuery(name = "OperationTitre.findByTypeDossier", query = "SELECT o FROM OperationTitre o WHERE o.typeDossier = :typeDossier"),
    @NamedQuery(name = "OperationTitre.findByCodeTitre", query = "SELECT o FROM OperationTitre o WHERE o.operationTitrePK.codeTitre = :codeTitre"),
    @NamedQuery(name = "OperationTitre.findByNumDom", query = "SELECT o FROM OperationTitre o WHERE o.operationTitrePK.numDom = :numDom"),
    @NamedQuery(name = "OperationTitre.findByDateDom", query = "SELECT o FROM OperationTitre o WHERE o.operationTitrePK.dateDom = :dateDom"),
    @NamedQuery(name = "OperationTitre.findByMntTitre", query = "SELECT o FROM OperationTitre o WHERE o.mntTitre = :mntTitre"),
    @NamedQuery(name = "OperationTitre.findByMntFrais", query = "SELECT o FROM OperationTitre o WHERE o.mntFrais = :mntFrais"),
    @NamedQuery(name = "OperationTitre.findByMntFraisTnd", query = "SELECT o FROM OperationTitre o WHERE o.mntFraisTnd = :mntFraisTnd"),
    @NamedQuery(name = "OperationTitre.findByCodeDeviseTitre", query = "SELECT o FROM OperationTitre o WHERE o.codeDeviseTitre = :codeDeviseTitre"),
    @NamedQuery(name = "OperationTitre.findByContreValeurTnd", query = "SELECT o FROM OperationTitre o WHERE o.contreValeurTnd = :contreValeurTnd"),
    @NamedQuery(name = "OperationTitre.findByCodeSup", query = "SELECT o FROM OperationTitre o WHERE o.codeSup = :codeSup"),
    @NamedQuery(name = "OperationTitre.findByMntPaye", query = "SELECT o FROM OperationTitre o WHERE o.mntPaye = :mntPaye"),
    @NamedQuery(name = "OperationTitre.findByMntPayeTnd", query = "SELECT o FROM OperationTitre o WHERE o.mntPayeTnd = :mntPayeTnd"),
    @NamedQuery(name = "OperationTitre.findByStatus", query = "SELECT o FROM OperationTitre o WHERE o.status = :status")})
public class OperationTitre implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OperationTitrePK operationTitrePK;
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_TITRE")
    private BigDecimal mntTitre;
    @Column(name = "MNT_FRAIS")
    private BigDecimal mntFrais;
    @Column(name = "MNT_FRAIS_TND")
    private BigDecimal mntFraisTnd;
    @Column(name = "CODE_DEVISE_TITRE")
    private Short codeDeviseTitre;
    @Column(name = "CONTRE_VALEUR_TND")
    private BigDecimal contreValeurTnd;
    @Size(max = 1)
    @Column(name = "CODE_SUP")
    private String codeSup;
    @Column(name = "MNT_PAYE")
    private BigDecimal mntPaye;
    @Column(name = "MNT_PAYE_TND")
    private BigDecimal mntPayeTnd;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;

    public OperationTitre() {
    }

    public OperationTitre(OperationTitrePK operationTitrePK) {
        this.operationTitrePK = operationTitrePK;
    }

    public OperationTitre(short codeProduitService, short codeOperation, int refOperation, Date dateOperation, short uniteOperation, short codeTitre, int numDom, Date dateDom) {
        this.operationTitrePK = new OperationTitrePK(codeProduitService, codeOperation, refOperation, dateOperation, uniteOperation, codeTitre, numDom, dateDom);
    }

    public OperationTitrePK getOperationTitrePK() {
        return operationTitrePK;
    }

    public void setOperationTitrePK(OperationTitrePK operationTitrePK) {
        this.operationTitrePK = operationTitrePK;
    }

    public Integer getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Integer numDossier) {
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

    public BigDecimal getMntTitre() {
        return mntTitre;
    }

    public void setMntTitre(BigDecimal mntTitre) {
        this.mntTitre = mntTitre;
    }

    public BigDecimal getMntFrais() {
        return mntFrais;
    }

    public void setMntFrais(BigDecimal mntFrais) {
        this.mntFrais = mntFrais;
    }

    public BigDecimal getMntFraisTnd() {
        return mntFraisTnd;
    }

    public void setMntFraisTnd(BigDecimal mntFraisTnd) {
        this.mntFraisTnd = mntFraisTnd;
    }

    public Short getCodeDeviseTitre() {
        return codeDeviseTitre;
    }

    public void setCodeDeviseTitre(Short codeDeviseTitre) {
        this.codeDeviseTitre = codeDeviseTitre;
    }

    public BigDecimal getContreValeurTnd() {
        return contreValeurTnd;
    }

    public void setContreValeurTnd(BigDecimal contreValeurTnd) {
        this.contreValeurTnd = contreValeurTnd;
    }

    public String getCodeSup() {
        return codeSup;
    }

    public void setCodeSup(String codeSup) {
        this.codeSup = codeSup;
    }

    public BigDecimal getMntPaye() {
        return mntPaye;
    }

    public void setMntPaye(BigDecimal mntPaye) {
        this.mntPaye = mntPaye;
    }

    public BigDecimal getMntPayeTnd() {
        return mntPayeTnd;
    }

    public void setMntPayeTnd(BigDecimal mntPayeTnd) {
        this.mntPayeTnd = mntPayeTnd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operationTitrePK != null ? operationTitrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperationTitre)) {
            return false;
        }
        OperationTitre other = (OperationTitre) object;
        if ((this.operationTitrePK == null && other.operationTitrePK != null) || (this.operationTitrePK != null && !this.operationTitrePK.equals(other.operationTitrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Gen.OperationTitre[ operationTitrePK=" + operationTitrePK + " ]";
    }
    
}
