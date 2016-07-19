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

/**
 *
 * @author yayan
 */
@Embeddable
public class OperationsDelegueesMvtPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE", nullable = false)
    private short codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_OPERATION", nullable = false)
    private int codeOperation;
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

    public OperationsDelegueesMvtPK() {
    }

    public OperationsDelegueesMvtPK(short codeProduitService, int codeOperation, long refOperation, Date dateOperation, short uniteOperation) {
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
        this.refOperation = refOperation;
        this.dateOperation = dateOperation;
        this.uniteOperation = uniteOperation;
    }

    public short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public int getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(int codeOperation) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeProduitService;
        hash += (int) codeOperation;
        hash += (int) refOperation;
        hash += (dateOperation != null ? dateOperation.hashCode() : 0);
        hash += (int) uniteOperation;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperationsDelegueesMvtPK)) {
            return false;
        }
        OperationsDelegueesMvtPK other = (OperationsDelegueesMvtPK) object;
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
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.ava.OperationsDelegueesMvtPK[ codeProduitService=" + codeProduitService + ", codeOperation=" + codeOperation + ", refOperation=" + refOperation + ", dateOperation=" + dateOperation + ", uniteOperation=" + uniteOperation + " ]";
    }
    
}
