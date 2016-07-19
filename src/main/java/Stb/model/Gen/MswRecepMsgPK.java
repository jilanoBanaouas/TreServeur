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
public class MswRecepMsgPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_SWIFT")
    private int numSwift;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "MTXXX")
    private String mtxxx;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDRE")
    private short ordre;

    public MswRecepMsgPK() {
    }

    public MswRecepMsgPK(int numSwift, String mtxxx, short ordre) {
        this.numSwift = numSwift;
        this.mtxxx = mtxxx;
        this.ordre = ordre;
    }

    public int getNumSwift() {
        return numSwift;
    }

    public void setNumSwift(int numSwift) {
        this.numSwift = numSwift;
    }

    public String getMtxxx() {
        return mtxxx;
    }

    public void setMtxxx(String mtxxx) {
        this.mtxxx = mtxxx;
    }

    public short getOrdre() {
        return ordre;
    }

    public void setOrdre(short ordre) {
        this.ordre = ordre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numSwift;
        hash += (mtxxx != null ? mtxxx.hashCode() : 0);
        hash += (int) ordre;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswRecepMsgPK)) {
            return false;
        }
        MswRecepMsgPK other = (MswRecepMsgPK) object;
        if (this.numSwift != other.numSwift) {
            return false;
        }
        if ((this.mtxxx == null && other.mtxxx != null) || (this.mtxxx != null && !this.mtxxx.equals(other.mtxxx))) {
            return false;
        }
        if (this.ordre != other.ordre) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswRecepMsgPK[ numSwift=" + numSwift + ", mtxxx=" + mtxxx + ", ordre=" + ordre + " ]";
    }
    
}
