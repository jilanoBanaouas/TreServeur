/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Gen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author slim
 */
@Entity
@Table(name = "MSW_NOM_FIELD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MswNomField.findlibfield", query = "SELECT m FROM MswNomField m WHERE m.mswNomFieldPK.mtxxx = :mtxxx AND m.mswNomFieldPK.seq = :seq AND m.mswNomFieldPK.field = :field"),
    @NamedQuery(name = "MswNomField.findAll", query = "SELECT m FROM MswNomField m"),
    @NamedQuery(name = "MswNomField.findByMtxxx", query = "SELECT m FROM MswNomField m WHERE m.mswNomFieldPK.mtxxx = :mtxxx"),
    @NamedQuery(name = "MswNomField.findBySeq", query = "SELECT m FROM MswNomField m WHERE m.mswNomFieldPK.seq = :seq"),
    @NamedQuery(name = "MswNomField.findByField", query = "SELECT m FROM MswNomField m WHERE m.mswNomFieldPK.field = :field"),
    @NamedQuery(name = "MswNomField.findByOptions", query = "SELECT m FROM MswNomField m WHERE m.options = :options"),
    @NamedQuery(name = "MswNomField.findByLibField", query = "SELECT m FROM MswNomField m WHERE m.libField = :libField"),
    @NamedQuery(name = "MswNomField.findByRField", query = "SELECT m FROM MswNomField m WHERE m.mswNomFieldPK.rField = :rField")})
public class MswNomField implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MswNomFieldPK mswNomFieldPK;
    @Size(max = 10)
    @Column(name = "OPTIONS")
    private String options;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LIB_FIELD")
    private String libField;

    public MswNomField() {
    }

    public MswNomField(MswNomFieldPK mswNomFieldPK) {
        this.mswNomFieldPK = mswNomFieldPK;
    }

    public MswNomField(MswNomFieldPK mswNomFieldPK, String libField) {
        this.mswNomFieldPK = mswNomFieldPK;
        this.libField = libField;
    }

    public MswNomField(String mtxxx, String seq, String field, short rField) {
        this.mswNomFieldPK = new MswNomFieldPK(mtxxx, seq, field, rField);
    }

    public MswNomFieldPK getMswNomFieldPK() {
        return mswNomFieldPK;
    }

    public void setMswNomFieldPK(MswNomFieldPK mswNomFieldPK) {
        this.mswNomFieldPK = mswNomFieldPK;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getLibField() {
        return libField;
    }

    public void setLibField(String libField) {
        this.libField = libField;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mswNomFieldPK != null ? mswNomFieldPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswNomField)) {
            return false;
        }
        MswNomField other = (MswNomField) object;
        if ((this.mswNomFieldPK == null && other.mswNomFieldPK != null) || (this.mswNomFieldPK != null && !this.mswNomFieldPK.equals(other.mswNomFieldPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswNomField[ mswNomFieldPK=" + mswNomFieldPK + " ]";
    }
    
}
