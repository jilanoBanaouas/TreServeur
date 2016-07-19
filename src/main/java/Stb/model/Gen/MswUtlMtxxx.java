/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Gen;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "MSW_UTL_MTXXX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MswUtlMtxxx.findAll", query = "SELECT m FROM MswUtlMtxxx m"),
    @NamedQuery(name = "MswUtlMtxxx.findByNumero", query = "SELECT m FROM MswUtlMtxxx m WHERE m.mswUtlMtxxxPK.numero = :numero"),
    @NamedQuery(name = "MswUtlMtxxx.findByDateJournee", query = "SELECT m FROM MswUtlMtxxx m WHERE m.dateJournee = :dateJournee"),
    @NamedQuery(name = "MswUtlMtxxx.findByNmesg", query = "SELECT m FROM MswUtlMtxxx m WHERE m.mswUtlMtxxxPK.nmesg = :nmesg"),
    @NamedQuery(name = "MswUtlMtxxx.findByCodeService", query = "SELECT m FROM MswUtlMtxxx m WHERE m.codeService = :codeService"),
    @NamedQuery(name = "MswUtlMtxxx.findByNumDossier", query = "SELECT m FROM MswUtlMtxxx m WHERE m.numDossier = :numDossier"),
    @NamedQuery(name = "MswUtlMtxxx.findByDateDossier", query = "SELECT m FROM MswUtlMtxxx m WHERE m.dateDossier = :dateDossier"),
    @NamedQuery(name = "MswUtlMtxxx.findByRefOperation", query = "SELECT m FROM MswUtlMtxxx m WHERE m.refOperation = :refOperation"),
    @NamedQuery(name = "MswUtlMtxxx.findByDateOperation", query = "SELECT m FROM MswUtlMtxxx m WHERE m.dateOperation = :dateOperation"),
    @NamedQuery(name = "MswUtlMtxxx.findByUniteOperation", query = "SELECT m FROM MswUtlMtxxx m WHERE m.uniteOperation = :uniteOperation"),
    @NamedQuery(name = "MswUtlMtxxx.findByDateGeneration", query = "SELECT m FROM MswUtlMtxxx m WHERE m.dateGeneration = :dateGeneration"),
    @NamedQuery(name = "MswUtlMtxxx.findByEtat", query = "SELECT m FROM MswUtlMtxxx m WHERE m.etat = :etat"),
    @NamedQuery(name = "MswUtlMtxxx.findByMtxxx", query = "SELECT m FROM MswUtlMtxxx m WHERE m.mtxxx = :mtxxx"),
    @NamedQuery(name = "MswUtlMtxxx.findByTypeBnqDest", query = "SELECT m FROM MswUtlMtxxx m WHERE m.typeBnqDest = :typeBnqDest"),
    @NamedQuery(name = "MswUtlMtxxx.findByCodeBnqDest", query = "SELECT m FROM MswUtlMtxxx m WHERE m.codeBnqDest = :codeBnqDest"),
    @NamedQuery(name = "MswUtlMtxxx.findByCodeAgDest", query = "SELECT m FROM MswUtlMtxxx m WHERE m.codeAgDest = :codeAgDest"),
    @NamedQuery(name = "MswUtlMtxxx.findByAdrSwift", query = "SELECT m FROM MswUtlMtxxx m WHERE m.adrSwift = :adrSwift"),
    @NamedQuery(name = "MswUtlMtxxx.findByFichier", query = "SELECT m FROM MswUtlMtxxx m WHERE m.fichier = :fichier"),
    @NamedQuery(name = "MswUtlMtxxx.findByTrn", query = "SELECT m FROM MswUtlMtxxx m WHERE m.trn = :trn"),
    @NamedQuery(name = "MswUtlMtxxx.findByStatus", query = "SELECT m FROM MswUtlMtxxx m WHERE m.status = :status")})
public class MswUtlMtxxx implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MswUtlMtxxxPK mswUtlMtxxxPK;
    @Column(name = "DATE_JOURNEE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateJournee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_SERVICE")
    private short codeService;
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Column(name = "REF_OPERATION")
    private Integer refOperation;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;
    @Column(name = "UNITE_OPERATION")
    private Short uniteOperation;
    @Column(name = "DATE_GENERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateGeneration;
    @Column(name = "ETAT")
    private Character etat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "MTXXX")
    private String mtxxx;
    @Column(name = "TYPE_BNQ_DEST")
    private Character typeBnqDest;
    @Column(name = "CODE_BNQ_DEST")
    private Integer codeBnqDest;
    @Column(name = "CODE_AG_DEST")
    private Short codeAgDest;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "ADR_SWIFT")
    private String adrSwift;
    @Size(max = 20)
    @Column(name = "FICHIER")
    private String fichier;
    @Size(max = 16)
    @Column(name = "TRN")
    private String trn;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;
    
    

    public MswUtlMtxxx() {
    }

    public MswUtlMtxxx(MswUtlMtxxxPK mswUtlMtxxxPK) {
        this.mswUtlMtxxxPK = mswUtlMtxxxPK;
    }

    public MswUtlMtxxx(MswUtlMtxxxPK mswUtlMtxxxPK, short codeService, String mtxxx, String adrSwift) {
        this.mswUtlMtxxxPK = mswUtlMtxxxPK;
        this.codeService = codeService;
        this.mtxxx = mtxxx;
        this.adrSwift = adrSwift;
    }

    public MswUtlMtxxx(int numero, String nmesg) {
        this.mswUtlMtxxxPK = new MswUtlMtxxxPK(numero, nmesg);
    }

    public MswUtlMtxxxPK getMswUtlMtxxxPK() {
        return mswUtlMtxxxPK;
    }

    public void setMswUtlMtxxxPK(MswUtlMtxxxPK mswUtlMtxxxPK) {
        this.mswUtlMtxxxPK = mswUtlMtxxxPK;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
    }

    public short getCodeService() {
        return codeService;
    }

    public void setCodeService(short codeService) {
        this.codeService = codeService;
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

    public Integer getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(Integer refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Short getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(Short uniteOperation) {
        this.uniteOperation = uniteOperation;
    }

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public Character getEtat() {
        return etat;
    }

    public void setEtat(Character etat) {
        this.etat = etat;
    }

    public String getMtxxx() {
        return mtxxx;
    }

    public void setMtxxx(String mtxxx) {
        this.mtxxx = mtxxx;
    }

    public Character getTypeBnqDest() {
        return typeBnqDest;
    }

    public void setTypeBnqDest(Character typeBnqDest) {
        this.typeBnqDest = typeBnqDest;
    }

    public Integer getCodeBnqDest() {
        return codeBnqDest;
    }

    public void setCodeBnqDest(Integer codeBnqDest) {
        this.codeBnqDest = codeBnqDest;
    }

    public Short getCodeAgDest() {
        return codeAgDest;
    }

    public void setCodeAgDest(Short codeAgDest) {
        this.codeAgDest = codeAgDest;
    }

    public String getAdrSwift() {
        return adrSwift;
    }

    public void setAdrSwift(String adrSwift) {
        this.adrSwift = adrSwift;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public String getTrn() {
        return trn;
    }

    public void setTrn(String trn) {
        this.trn = trn;
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
        hash += (mswUtlMtxxxPK != null ? mswUtlMtxxxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswUtlMtxxx)) {
            return false;
        }
        MswUtlMtxxx other = (MswUtlMtxxx) object;
        if ((this.mswUtlMtxxxPK == null && other.mswUtlMtxxxPK != null) || (this.mswUtlMtxxxPK != null && !this.mswUtlMtxxxPK.equals(other.mswUtlMtxxxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswUtlMtxxx[ mswUtlMtxxxPK=" + mswUtlMtxxxPK + " ]";
    }
    
}
