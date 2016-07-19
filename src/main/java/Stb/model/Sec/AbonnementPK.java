package Stb.model.Sec;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class AbonnementPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE",length = 255)
    private int codeProduitService;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NO_PIECE_PERSONNE",length = 255)
    private String noPiecePersonne;

    public AbonnementPK() {
    }

    public AbonnementPK(int codeProduitService, String noPiecePersonne) {
        this.codeProduitService = codeProduitService;
        this.noPiecePersonne = noPiecePersonne;
    }

    public int getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(int codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public String getNoPiecePersonne() {
        return noPiecePersonne;
    }

    public void setNoPiecePersonne(String noPiecePersonne) {
        this.noPiecePersonne = noPiecePersonne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeProduitService;
        hash += (noPiecePersonne != null ? noPiecePersonne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AbonnementPK)) {
            return false;
        }
        AbonnementPK other = (AbonnementPK) object;
        if (this.codeProduitService != other.codeProduitService) {
            return false;
        }
        if ((this.noPiecePersonne == null && other.noPiecePersonne != null) || (this.noPiecePersonne != null && !this.noPiecePersonne.equals(other.noPiecePersonne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SW.AbonnementPK[ codeProduitService=" + codeProduitService + ", noPiecePersonne=" + noPiecePersonne + " ]";
    }
    
}
