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
public class MswUtlMtxxxPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO")
    private int numero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "NMESG")
    private String nmesg;

    public MswUtlMtxxxPK() {
    }

    public MswUtlMtxxxPK(int numero, String nmesg) {
        this.numero = numero;
        this.nmesg = nmesg;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numero;
        hash += (nmesg != null ? nmesg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswUtlMtxxxPK)) {
            return false;
        }
        MswUtlMtxxxPK other = (MswUtlMtxxxPK) object;
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.nmesg == null && other.nmesg != null) || (this.nmesg != null && !this.nmesg.equals(other.nmesg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswUtlMtxxxPK[ numero=" + numero + ", nmesg=" + nmesg + " ]";
    }
    
}
