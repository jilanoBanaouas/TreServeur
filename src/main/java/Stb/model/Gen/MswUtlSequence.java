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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author slim
 */
@Entity
@Table(name = "MSW_UTL_SEQUENCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MswUtlSequence.findseq", query = "SELECT m FROM MswUtlSequence m WHERE m.mswUtlSequencePK.numero = :numero AND m.mswUtlSequencePK.nmesg = :nmesg" ),
    @NamedQuery(name = "MswUtlSequence.findAll", query = "SELECT m FROM MswUtlSequence m"),
    @NamedQuery(name = "MswUtlSequence.findByNumero", query = "SELECT m FROM MswUtlSequence m WHERE m.mswUtlSequencePK.numero = :numero"),
    @NamedQuery(name = "MswUtlSequence.findByCodeService", query = "SELECT m FROM MswUtlSequence m WHERE m.codeService = :codeService"),
    @NamedQuery(name = "MswUtlSequence.findByNumDossier", query = "SELECT m FROM MswUtlSequence m WHERE m.numDossier = :numDossier"),
    @NamedQuery(name = "MswUtlSequence.findByDateDossier", query = "SELECT m FROM MswUtlSequence m WHERE m.dateDossier = :dateDossier"),
    @NamedQuery(name = "MswUtlSequence.findByRefOperation", query = "SELECT m FROM MswUtlSequence m WHERE m.refOperation = :refOperation"),
    @NamedQuery(name = "MswUtlSequence.findByDateOperation", query = "SELECT m FROM MswUtlSequence m WHERE m.dateOperation = :dateOperation"),
    @NamedQuery(name = "MswUtlSequence.findByUniteOperation", query = "SELECT m FROM MswUtlSequence m WHERE m.uniteOperation = :uniteOperation"),
    @NamedQuery(name = "MswUtlSequence.findByNmesg", query = "SELECT m FROM MswUtlSequence m WHERE m.mswUtlSequencePK.nmesg = :nmesg"),
    @NamedQuery(name = "MswUtlSequence.findByNumSequence", query = "SELECT m FROM MswUtlSequence m WHERE m.mswUtlSequencePK.numSequence = :numSequence"),
    @NamedQuery(name = "MswUtlSequence.findBySeq", query = "SELECT m FROM MswUtlSequence m WHERE m.mswUtlSequencePK.seq = :seq")})
public class MswUtlSequence implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MswUtlSequencePK mswUtlSequencePK;
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
    
    

    public MswUtlSequence() {
    }

    public MswUtlSequence(MswUtlSequencePK mswUtlSequencePK) {
        this.mswUtlSequencePK = mswUtlSequencePK;
    }

    public MswUtlSequence(MswUtlSequencePK mswUtlSequencePK, short codeService) {
        this.mswUtlSequencePK = mswUtlSequencePK;
        this.codeService = codeService;
    }

    public MswUtlSequence(int numero, String nmesg, short numSequence, String seq) {
        this.mswUtlSequencePK = new MswUtlSequencePK(numero, nmesg, numSequence, seq);
    }

    public MswUtlSequencePK getMswUtlSequencePK() {
        return mswUtlSequencePK;
    }

    public void setMswUtlSequencePK(MswUtlSequencePK mswUtlSequencePK) {
        this.mswUtlSequencePK = mswUtlSequencePK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mswUtlSequencePK != null ? mswUtlSequencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswUtlSequence)) {
            return false;
        }
        MswUtlSequence other = (MswUtlSequence) object;
        if ((this.mswUtlSequencePK == null && other.mswUtlSequencePK != null) || (this.mswUtlSequencePK != null && !this.mswUtlSequencePK.equals(other.mswUtlSequencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswUtlSequence[ mswUtlSequencePK=" + mswUtlSequencePK + " ]";
    }
    
}
