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
@Table(name = "MSW_RECEP_MSG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MswRecepMsg.findAll", query = "SELECT m FROM MswRecepMsg m"),
    @NamedQuery(name = "MswRecepMsg.findByNumSwift", query = "SELECT m FROM MswRecepMsg m WHERE m.mswRecepMsgPK.numSwift = :numSwift"),
    @NamedQuery(name = "MswRecepMsg.findByMtxxx", query = "SELECT m FROM MswRecepMsg m WHERE m.mswRecepMsgPK.mtxxx = :mtxxx"),
    @NamedQuery(name = "MswRecepMsg.findByRefEmetteur", query = "SELECT m FROM MswRecepMsg m WHERE m.refEmetteur = :refEmetteur"),
    @NamedQuery(name = "MswRecepMsg.findByRefRecepteur", query = "SELECT m FROM MswRecepMsg m WHERE m.refRecepteur = :refRecepteur"),
    @NamedQuery(name = "MswRecepMsg.findByChamps", query = "SELECT m FROM MswRecepMsg m WHERE m.champs = :champs"),
    @NamedQuery(name = "MswRecepMsg.findBySousChamps", query = "SELECT m FROM MswRecepMsg m WHERE m.sousChamps = :sousChamps"),
    @NamedQuery(name = "MswRecepMsg.findByOrdre", query = "SELECT m FROM MswRecepMsg m WHERE m.mswRecepMsgPK.ordre = :ordre"),
    @NamedQuery(name = "MswRecepMsg.findByStatus", query = "SELECT m FROM MswRecepMsg m WHERE m.status = :status"),
    @NamedQuery(name = "MswRecepMsg.findByDateGeneration", query = "SELECT m FROM MswRecepMsg m WHERE m.dateGeneration = :dateGeneration"),
    @NamedQuery(name = "MswRecepMsg.findByRefSwift", query = "SELECT m FROM MswRecepMsg m WHERE m.refSwift = :refSwift")})
public class MswRecepMsg implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MswRecepMsgPK mswRecepMsgPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "REF_EMETTEUR")
    private String refEmetteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "REF_RECEPTEUR")
    private String refRecepteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CHAMPS")
    private String champs;
    @Size(max = 15)
    @Column(name = "SOUS_CHAMPS")
    private String sousChamps;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 0)
    @Column(name = "VALEUR")
    private String valeur;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE_GENERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateGeneration;
    @Column(name = "REF_SWIFT")
    private Long refSwift;

    public MswRecepMsg() {
    }

    public MswRecepMsg(MswRecepMsgPK mswRecepMsgPK) {
        this.mswRecepMsgPK = mswRecepMsgPK;
    }

    public MswRecepMsg(MswRecepMsgPK mswRecepMsgPK, String refEmetteur, String refRecepteur, String champs, String valeur) {
        this.mswRecepMsgPK = mswRecepMsgPK;
        this.refEmetteur = refEmetteur;
        this.refRecepteur = refRecepteur;
        this.champs = champs;
        this.valeur = valeur;
    }

    public MswRecepMsg(int numSwift, String mtxxx, short ordre) {
        this.mswRecepMsgPK = new MswRecepMsgPK(numSwift, mtxxx, ordre);
    }

    public MswRecepMsgPK getMswRecepMsgPK() {
        return mswRecepMsgPK;
    }

    public void setMswRecepMsgPK(MswRecepMsgPK mswRecepMsgPK) {
        this.mswRecepMsgPK = mswRecepMsgPK;
    }

    public String getRefEmetteur() {
        return refEmetteur;
    }

    public void setRefEmetteur(String refEmetteur) {
        this.refEmetteur = refEmetteur;
    }

    public String getRefRecepteur() {
        return refRecepteur;
    }

    public void setRefRecepteur(String refRecepteur) {
        this.refRecepteur = refRecepteur;
    }

    public String getChamps() {
        return champs;
    }

    public void setChamps(String champs) {
        this.champs = champs;
    }

    public String getSousChamps() {
        return sousChamps;
    }

    public void setSousChamps(String sousChamps) {
        this.sousChamps = sousChamps;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public Long getRefSwift() {
        return refSwift;
    }

    public void setRefSwift(Long refSwift) {
        this.refSwift = refSwift;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mswRecepMsgPK != null ? mswRecepMsgPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MswRecepMsg)) {
            return false;
        }
        MswRecepMsg other = (MswRecepMsg) object;
        if ((this.mswRecepMsgPK == null && other.mswRecepMsgPK != null) || (this.mswRecepMsgPK != null && !this.mswRecepMsgPK.equals(other.mswRecepMsgPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Gen.MswRecepMsg[ mswRecepMsgPK=" + mswRecepMsgPK + " ]";
    }
    
}
