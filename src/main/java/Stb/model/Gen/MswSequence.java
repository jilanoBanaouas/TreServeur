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
@Table(name = "MSW_SEQUENCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MswSequence.findAll", query = "SELECT m FROM MswSequence m"),
    @NamedQuery(name = "MswSequence.findByMtxxx", query = "SELECT m FROM MswSequence m WHERE m.mswSequencePK.mtxxx = :mtxxx"),
    @NamedQuery(name = "MswSequence.findBySeq", query = "SELECT m FROM MswSequence m WHERE m.mswSequencePK.seq = :seq"),
    @NamedQuery(name = "MswSequence.findByLibSeq", query = "SELECT m FROM MswSequence m WHERE m.libSeq = :libSeq"),
    @NamedQuery(name = "MswSequence.findByRSeq", query = "SELECT m FROM MswSequence m WHERE m.rSeq = :rSeq")})
public class MswSequence implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MswSequencePK mswSequencePK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LIB_SEQ")
    private String libSeq;
    @Basic(optional = false)
    @NotNull
    @Column(name = "R_SEQ")
    private short rSeq;

    public MswSequence() {
    }

    public MswSequence(MswSequencePK mswSequencePK) {
        this.mswSequencePK = mswSequencePK;
    }

    public MswSequence(MswSequencePK mswSequencePK, String libSeq, short rSeq) {
        this.mswSequencePK = mswSequencePK;
        this.libSeq = libSeq;
        this.rSeq = rSeq;
    }

    public MswSequence(String mtxxx, String seq) {
        this.mswSequencePK = new MswSequencePK(mtxxx, seq);
    }

    public MswSequencePK getMswSequencePK() {
        return mswSequencePK;
    }

    public void setMswSequencePK(MswSequencePK mswSequencePK) {
        this.mswSequencePK = mswSequencePK;
    }

    public String getLibSeq() {
        return libSeq;
    }

    public void setLibSeq(String libSeq) {
        this.libSeq = libSeq;
    }

    public short getRSeq() {
        return rSeq;
    }

    public void setRSeq(short rSeq) {
        this.rSeq = rSeq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mswSequencePK != null ? mswSequencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswSequence)) {
            return false;
        }
        MswSequence other = (MswSequence) object;
        if ((this.mswSequencePK == null && other.mswSequencePK != null) || (this.mswSequencePK != null && !this.mswSequencePK.equals(other.mswSequencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswSequence[ mswSequencePK=" + mswSequencePK + " ]";
    }
    
}
