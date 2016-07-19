package Stb.model.Sec;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class OperationPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE", length = 255)
    private int codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_OPERATION", length = 255)
    private int codeOperation;

    public OperationPK() {
    }

    public OperationPK(int codeProduitService, int codeOperation) {
        this.codeProduitService = codeProduitService;
        this.codeOperation = codeOperation;
    }

    public int getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(int codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public int getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(int codeOperation) {
        this.codeOperation = codeOperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeProduitService;
        hash += (int) codeOperation;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperationPK)) {
            return false;
        }
        OperationPK other = (OperationPK) object;
        if (this.codeProduitService != other.codeProduitService) {
            return false;
        }
        if (this.codeOperation != other.codeOperation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SW.OperationPK[ codeProduitService=" + codeProduitService + ", codeOperation=" + codeOperation + " ]";
    }

}
