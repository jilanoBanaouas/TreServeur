/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Gen;

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
 * @author slim
 */
@Entity
@Table(name = "MESSAGE_RECUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MessageRecus.findAll", query = "SELECT m FROM MessageRecus m"),
    @NamedQuery(name = "MessageRecus.findByRefSwift", query = "SELECT m FROM MessageRecus m WHERE m.refSwift = :refSwift"),
    @NamedQuery(name = "MessageRecus.findByDateGeneration", query = "SELECT m FROM MessageRecus m WHERE m.dateGeneration = :dateGeneration"),
    @NamedQuery(name = "MessageRecus.findByMtxxx", query = "SELECT m FROM MessageRecus m WHERE m.mtxxx = :mtxxx"),
    @NamedQuery(name = "MessageRecus.findByNumSwift", query = "SELECT m FROM MessageRecus m WHERE m.numSwift = :numSwift"),
    @NamedQuery(name = "MessageRecus.findByRefOperation", query = "SELECT m FROM MessageRecus m WHERE m.refOperation = :refOperation"),
    @NamedQuery(name = "MessageRecus.findByDateOperation", query = "SELECT m FROM MessageRecus m WHERE m.dateOperation = :dateOperation"),
    @NamedQuery(name = "MessageRecus.findByCodeProduitService", query = "SELECT m FROM MessageRecus m WHERE m.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "MessageRecus.findByCodeOperation", query = "SELECT m FROM MessageRecus m WHERE m.codeOperation = :codeOperation"),
    @NamedQuery(name = "MessageRecus.findByUniteOperation", query = "SELECT m FROM MessageRecus m WHERE m.uniteOperation = :uniteOperation"),
    @NamedQuery(name = "MessageRecus.findByNumDossier", query = "SELECT m FROM MessageRecus m WHERE m.numDossier = :numDossier"),
    @NamedQuery(name = "MessageRecus.findByDateDossier", query = "SELECT m FROM MessageRecus m WHERE m.dateDossier = :dateDossier"),
    @NamedQuery(name = "MessageRecus.findByTypeDossier", query = "SELECT m FROM MessageRecus m WHERE m.typeDossier = :typeDossier"),
    @NamedQuery(name = "MessageRecus.findByRejeterON", query = "SELECT m FROM MessageRecus m WHERE m.rejeterON = :rejeterON"),
    @NamedQuery(name = "MessageRecus.findByMotifRejet", query = "SELECT m FROM MessageRecus m WHERE m.motifRejet = :motifRejet"),
    @NamedQuery(name = "MessageRecus.findByTraiterON", query = "SELECT m FROM MessageRecus m WHERE m.traiterON = :traiterON"),
    @NamedQuery(name = "MessageRecus.findByRefValidation", query = "SELECT m FROM MessageRecus m WHERE m.refValidation = :refValidation"),
    @NamedQuery(name = "MessageRecus.findByDateJourneeAccept", query = "SELECT m FROM MessageRecus m WHERE m.dateJourneeAccept = :dateJourneeAccept"),
    @NamedQuery(name = "MessageRecus.findByDvsSwift", query = "SELECT m FROM MessageRecus m WHERE m.dvsSwift = :dvsSwift"),
    @NamedQuery(name = "MessageRecus.findByMntSwift", query = "SELECT m FROM MessageRecus m WHERE m.mntSwift = :mntSwift"),
    @NamedQuery(name = "MessageRecus.findByDateValSwift", query = "SELECT m FROM MessageRecus m WHERE m.dateValSwift = :dateValSwift")})
public class MessageRecus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "REF_SWIFT")
    private Long refSwift;
    @Column(name = "DATE_GENERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateGeneration;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "MTXXX")
    private String mtxxx;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_SWIFT")
    private int numSwift;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REF_OPERATION")
    private int refOperation;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private short codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_OPERATION")
    private short codeOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNITE_OPERATION")
    private int uniteOperation;
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Size(max = 1)
    @Column(name = "REJETER_O_N")
    private String rejeterON;
    @Size(max = 200)
    @Column(name = "MOTIF_REJET")
    private String motifRejet;
    @Size(max = 1)
    @Column(name = "TRAITER_O_N")
    private String traiterON;
    @Column(name = "REF_VALIDATION")
    private Integer refValidation;
    @Column(name = "DATE_JOURNEE_ACCEPT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateJourneeAccept;
    @Column(name = "DVS_SWIFT")
    private Short dvsSwift;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_SWIFT")
    private BigDecimal mntSwift;
    @Column(name = "DATE_VAL_SWIFT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateValSwift;

    public MessageRecus() {
    }

    public MessageRecus(Long refSwift) {
        this.refSwift = refSwift;
    }

    public MessageRecus(Long refSwift, String mtxxx, int numSwift, int refOperation, short codeProduitService, short codeOperation, int uniteOperation) {
        this.refSwift = refSwift;
        this.mtxxx = mtxxx;
        this.numSwift = numSwift;
        this.refOperation = refOperation;
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
        this.uniteOperation = uniteOperation;
    }

    public Long getRefSwift() {
        return refSwift;
    }

    public void setRefSwift(Long refSwift) {
        this.refSwift = refSwift;
    }

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public String getMtxxx() {
        return mtxxx;
    }

    public void setMtxxx(String mtxxx) {
        this.mtxxx = mtxxx;
    }

    public int getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(int numSwift) {
        this.numSwift = numSwift;
    }

    public int getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(int refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public int getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(int uniteOperation) {
        this.uniteOperation = uniteOperation;
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

    public String getRejeterON() {
        return rejeterON;
    }

    public void setRejeterON(String rejeterON) {
        this.rejeterON = rejeterON;
    }

    public String getMotifRejet() {
        return motifRejet;
    }

    public void setMotifRejet(String motifRejet) {
        this.motifRejet = motifRejet;
    }

    public String getTraiterON() {
        return traiterON;
    }

    public void setTraiterON(String traiterON) {
        this.traiterON = traiterON;
    }

    public Integer getRefValidation() {
        return refValidation;
    }

    public void setRefValidation(Integer refValidation) {
        this.refValidation = refValidation;
    }

    public Date getDateJourneeAccept() {
        return dateJourneeAccept;
    }

    public void setDateJourneeAccept(Date dateJourneeAccept) {
        this.dateJourneeAccept = dateJourneeAccept;
    }

    public Short getDvsSwift() {
        return dvsSwift;
    }

    public void setDvsSwift(Short dvsSwift) {
        this.dvsSwift = dvsSwift;
    }

    public BigDecimal getMntSwift() {
        return mntSwift;
    }

    public void setMntSwift(BigDecimal mntSwift) {
        this.mntSwift = mntSwift;
    }

    public Date getDateValSwift() {
        return dateValSwift;
    }

    public void setDateValSwift(Date dateValSwift) {
        this.dateValSwift = dateValSwift;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refSwift != null ? refSwift.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MessageRecus)) {
            return false;
        }
        MessageRecus other = (MessageRecus) object;
        if ((this.refSwift == null && other.refSwift != null) || (this.refSwift != null && !this.refSwift.equals(other.refSwift))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MessageRecus[ refSwift=" + refSwift + " ]";
    }
    
}
