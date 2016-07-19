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
public class MswUtlFieldPK implements Serializable {

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
    private int numSequence;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_FIELD")
    private short numField;

    public MswUtlFieldPK() {
    }

    public MswUtlFieldPK(int numero, String nmesg, short numSequence, short numField) {
        this.numero = numero;
        this.nmesg = nmesg;
        this.numSequence = numSequence;
        this.numField = numField;
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

    public int getNumSequence() {
        return numSequence;
    }

    public void setNumSequence(int numSequence) {
        this.numSequence = numSequence;
    }

    public short getNumField() {
        return numField;
    }

    public void setNumField(short numField) {
        this.numField = numField;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numero;
        hash += (nmesg != null ? nmesg.hashCode() : 0);
        hash += (int) numSequence;
        hash += (int) numField;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswUtlFieldPK)) {
            return false;
        }
        MswUtlFieldPK other = (MswUtlFieldPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.nmesg == null && other.nmesg != null) || (this.nmesg != null && !this.nmesg.equals(other.nmesg))) {
            return false;
        }
        if (this.numSequence != other.numSequence) {
            return false;
        }
        if (this.numField != other.numField) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Gen.MswUtlFieldPK[ numero=" + numero + ", nmesg=" + nmesg + ", numSequence=" + numSequence + ", numField=" + numField + " ]";
    }
    
}
