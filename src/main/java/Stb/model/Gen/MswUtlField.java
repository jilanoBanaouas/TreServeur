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
import javax.persistence.Lob;
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
@Table(name = "MSW_UTL_FIELD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MswUtlField.findAll", query = "SELECT m FROM MswUtlField m"),
    @NamedQuery(name = "MswUtlField.findByNumero", query = "SELECT m FROM MswUtlField m WHERE m.mswUtlFieldPK.numero = :numero"),
    @NamedQuery(name = "MswUtlField.findByCodeService", query = "SELECT m FROM MswUtlField m WHERE m.codeService = :codeService"),
    @NamedQuery(name = "MswUtlField.findByNumDossier", query = "SELECT m FROM MswUtlField m WHERE m.numDossier = :numDossier"),
    @NamedQuery(name = "MswUtlField.findByDateDossier", query = "SELECT m FROM MswUtlField m WHERE m.dateDossier = :dateDossier"),
    @NamedQuery(name = "MswUtlField.findByRefOperation", query = "SELECT m FROM MswUtlField m WHERE m.refOperation = :refOperation"),
    @NamedQuery(name = "MswUtlField.findByDateOperation", query = "SELECT m FROM MswUtlField m WHERE m.dateOperation = :dateOperation"),
    @NamedQuery(name = "MswUtlField.findByUniteOperation", query = "SELECT m FROM MswUtlField m WHERE m.uniteOperation = :uniteOperation"),
    @NamedQuery(name = "MswUtlField.findByNmesg", query = "SELECT m FROM MswUtlField m WHERE m.mswUtlFieldPK.nmesg = :nmesg"),
    @NamedQuery(name = "MswUtlField.findByNumSequence", query = "SELECT m FROM MswUtlField m WHERE m.mswUtlFieldPK.numSequence = :numSequence"),
    @NamedQuery(name = "MswUtlField.findByNumField", query = "SELECT m FROM MswUtlField m WHERE m.mswUtlFieldPK.numField = :numField"),
    @NamedQuery(name = "MswUtlField.findByField", query = "SELECT m FROM MswUtlField m WHERE m.field = :field"),
    @NamedQuery(name = "MswUtlField.findByFieldOption", query = "SELECT m FROM MswUtlField m WHERE m.fieldOption = :fieldOption")})
public class MswUtlField implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MswUtlFieldPK mswUtlFieldPK;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "FIELD")
    private String field;
    @Column(name = "FIELD_OPTION")
    private Character fieldOption;
    @Size(max = 0)
    @Column(name = "FIELD_TEXT")
    private String fieldText;

    public MswUtlField() {
    }

    public MswUtlField(MswUtlFieldPK mswUtlFieldPK) {
        this.mswUtlFieldPK = mswUtlFieldPK;
    }

    public MswUtlField(MswUtlFieldPK mswUtlFieldPK, short codeService, String field) {
        this.mswUtlFieldPK = mswUtlFieldPK;
        this.codeService = codeService;
        this.field = field;
    }

    public MswUtlField(int numero, String nmesg, short numSequence, short numField) {
        this.mswUtlFieldPK = new MswUtlFieldPK(numero, nmesg, numSequence, numField);
    }

    public MswUtlFieldPK getMswUtlFieldPK() {
        return mswUtlFieldPK;
    }

    public void setMswUtlFieldPK(MswUtlFieldPK mswUtlFieldPK) {
        this.mswUtlFieldPK = mswUtlFieldPK;
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

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Character getFieldOption() {
        return fieldOption;
    }

    public void setFieldOption(Character fieldOption) {
        this.fieldOption = fieldOption;
    }

    public String getFieldText() {
        return fieldText;
    }

    public void setFieldText(String fieldText) {
        this.fieldText = fieldText;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mswUtlFieldPK != null ? mswUtlFieldPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswUtlField)) {
            return false;
        }
        MswUtlField other = (MswUtlField) object;
        if ((this.mswUtlFieldPK == null && other.mswUtlFieldPK != null) || (this.mswUtlFieldPK != null && !this.mswUtlFieldPK.equals(other.mswUtlFieldPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Gen.MswUtlField[ mswUtlFieldPK=" + mswUtlFieldPK + " ]";
    }
    
}
