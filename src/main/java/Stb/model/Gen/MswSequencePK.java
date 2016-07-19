/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Gen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author slim
 */
@Embeddable
public class MswSequencePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "MTXXX")
    private String mtxxx;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "SEQ")
    private String seq;

    public MswSequencePK() {
    }

    public MswSequencePK(String mtxxx, String seq) {
        this.mtxxx = mtxxx;
        this.seq = seq;
    }

    public String getMtxxx() {
        return mtxxx;
    }

    public void setMtxxx(String mtxxx) {
        this.mtxxx = mtxxx;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtxxx != null ? mtxxx.hashCode() : 0);
        hash += (seq != null ? seq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswSequencePK)) {
            return false;
        }
        MswSequencePK other = (MswSequencePK) object;
        if ((this.mtxxx == null && other.mtxxx != null) || (this.mtxxx != null && !this.mtxxx.equals(other.mtxxx))) {
            return false;
        }
        if ((this.seq == null && other.seq != null) || (this.seq != null && !this.seq.equals(other.seq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswSequencePK[ mtxxx=" + mtxxx + ", seq=" + seq + " ]";
    }
    
}
