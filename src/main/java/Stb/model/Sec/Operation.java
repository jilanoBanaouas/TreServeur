package Stb.model.Sec;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "operation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operation.findAll", query = "SELECT o FROM Operation o"),
    @NamedQuery(name = "Operation.findByCodeProduitService", query = "SELECT o FROM Operation o WHERE o.operationPK.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "Operation.findByCodeOperation", query = "SELECT o FROM Operation o WHERE o.operationPK.codeOperation = :codeOperation"),
    @NamedQuery(name = "Operation.findByLibelleOperation", query = "SELECT o FROM Operation o WHERE o.libelleOperation = :libelleOperation")})
public class Operation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OperationPK operationPK;
    @Size(max = 200)
    @Column(name = "LIBELLE_OPERATION", length = 255)
    private String libelleOperation;

    public Operation() {
    }

    public Operation(OperationPK operationPK) {
        this.operationPK = operationPK;
    }

    public Operation(int codeProduitService, int codeOperation) {
        this.operationPK = new OperationPK(codeProduitService, codeOperation);
    }

    public OperationPK getOperationPK() {
        return operationPK;
    }

    public void setOperationPK(OperationPK operationPK) {
        this.operationPK = operationPK;
    }

    public String getLibelleOperation() {
        return libelleOperation;
    }

    public void setLibelleOperation(String libelleOperation) {
        this.libelleOperation = libelleOperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operationPK != null ? operationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operation)) {
            return false;
        }
        Operation other = (Operation) object;
        if ((this.operationPK == null && other.operationPK != null) || (this.operationPK != null && !this.operationPK.equals(other.operationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SW.Operation[ operationPK=" + operationPK + " ]";
    }

}
