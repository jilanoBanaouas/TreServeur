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
public class MswUtlSequencePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO")
    private int numero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "NMESG")
    private String nmesg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_SEQUENCE")
    private short numSequence;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SEQ")
    private String seq;

    public MswUtlSequencePK() {
    }

    public MswUtlSequencePK(int numero, String nmesg, short numSequence, String seq) {
        this.numero = numero;
        this.nmesg = nmesg;
        this.numSequence = numSequence;
        this.seq = seq;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNmesg() {
        return nmesg;
    }

    public void setNmesg(String nmesg) {
        this.nmesg = nmesg;
    }

    public short getNumSequence() {
        return numSequence;
    }

    public void setNumSequence(short numSequence) {
        this.numSequence = numSequence;
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
        hash += (int) numero;
        hash += (nmesg != null ? nmesg.hashCode() : 0);
        hash += (int) numSequence;
        hash += (seq != null ? seq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswUtlSequencePK)) {
            return false;
        }
        MswUtlSequencePK other = (MswUtlSequencePK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.nmesg == null && other.nmesg != null) || (this.nmesg != null && !this.nmesg.equals(other.nmesg))) {
            return false;
        }
        if (this.numSequence != other.numSequence) {
            return false;
        }
        if ((this.seq == null && other.seq != null) || (this.seq != null && !this.seq.equals(other.seq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswUtlSequencePK[ numero=" + numero + ", nmesg=" + nmesg + ", numSequence=" + numSequence + ", seq=" + seq + " ]";
    }
    
}
