/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Gen;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "MSW_MTXXX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MswMtxxx.findAll", query = "SELECT m FROM MswMtxxx m"),
    @NamedQuery(name = "MswMtxxx.findByMtxxx", query = "SELECT m FROM MswMtxxx m WHERE m.mtxxx = :mtxxx"),
    @NamedQuery(name = "MswMtxxx.findByLibMesg", query = "SELECT m FROM MswMtxxx m WHERE m.libMesg = :libMesg")})
public class MswMtxxx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "MTXXX")
    private String mtxxx;
    @Size(max = 100)
    @Column(name = "LIB_MESG")
    private String libMesg;

    public MswMtxxx() {
    }

    public MswMtxxx(String mtxxx) {
        this.mtxxx = mtxxx;
    }

    public String getMtxxx() {
        return mtxxx;
    }

    public void setMtxxx(String mtxxx) {
        this.mtxxx = mtxxx;
    }

    public String getLibMesg() {
        return libMesg;
    }

    public void setLibMesg(String libMesg) {
        this.libMesg = libMesg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtxxx != null ? mtxxx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswMtxxx)) {
            return false;
        }
        MswMtxxx other = (MswMtxxx) object;
        if ((this.mtxxx == null && other.mtxxx != null) || (this.mtxxx != null && !this.mtxxx.equals(other.mtxxx))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswMtxxx[ mtxxx=" + mtxxx + " ]";
    }
    
}
