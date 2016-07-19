/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.ava;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yayan
 */
@Embeddable
public class BeneficiairesMvtPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE", nullable = false)
    private short codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_OPERATION", nullable = false)
    private short codeOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REF_OPERATION", nullable = false)
    private long refOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_OPERATION", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOperation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNITE_OPERATION", nullable = false)
    private short uniteOperation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "NO_PIECE_BENEF", nullable = false, length = 13)
    private String noPieceBenef;

    public BeneficiairesMvtPK() {
    }

    public BeneficiairesMvtPK(short codeProduitService, short codeOperation, long refOperation, Date dateOperation, short uniteOperation, String noPieceBenef) {
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
        this.refOperation = refOperation;
        this.dateOperation = dateOperation;
        this.uniteOperation = uniteOperation;
        this.noPieceBenef = noPieceBenef;
    }

    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public long getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(long refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public short getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(short uniteOperation) {
        this.uniteOperation = uniteOperation;
    }

    public String getNoPieceBenef() {
        return noPieceBenef;
    }

    public void setNoPieceBenef(String noPieceBenef) {
        this.noPieceBenef = noPieceBenef;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeProduitService;
        hash += (int) codeOperation;
        hash += (int) refOperation;
        hash += (dateOperation != null ? dateOperation.hashCode() : 0);
        hash += (int) uniteOperation;
        hash += (noPieceBenef != null ? noPieceBenef.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficiairesMvtPK)) {
            return false;
        }
        BeneficiairesMvtPK other = (BeneficiairesMvtPK) object;
        if (this.codeProduitService != other.codeProduitService) {
            return false;
        }
        if (this.codeOperation != other.codeOperation) {
            return false;
        }
        if (this.refOperation != other.refOperation) {
            return false;
        }
        if ((this.dateOperation == null && other.dateOperation != null) || (this.dateOperation != null && !this.dateOperation.equals(other.dateOperation))) {
            return false;
        }
        if (this.uniteOperation != other.uniteOperation) {
            return false;
        }
        if ((this.noPieceBenef == null && other.noPieceBenef != null) || (this.noPieceBenef != null && !this.noPieceBenef.equals(other.noPieceBenef))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.ava.BeneficiairesMvtPK[ codeProduitService=" + codeProduitService + ", codeOperation=" + codeOperation + ", refOperation=" + refOperation + ", dateOperation=" + dateOperation + ", uniteOperation=" + uniteOperation + ", noPieceBenef=" + noPieceBenef + " ]";
    }
    
}
