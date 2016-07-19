package Stb.model.Sec;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class ClientPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "TYPE_PIECE_PERSONNE")
    private BigInteger typePiecePersonne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "NO_PIECE_PERSONNE")
    private String noPiecePersonne;

    public ClientPK() {
    }

    public ClientPK(BigInteger typePiecePersonne, String noPiecePersonne) {
        this.typePiecePersonne = typePiecePersonne;
        this.noPiecePersonne = noPiecePersonne;
    }

    public BigInteger getTypePiecePersonne() {
        return typePiecePersonne;
    }

    public void setTypePiecePersonne(BigInteger typePiecePersonne) {
        this.typePiecePersonne = typePiecePersonne;
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
        hash += (typePiecePersonne != null ? typePiecePersonne.hashCode() : 0);
        hash += (noPiecePersonne != null ? noPiecePersonne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientPK)) {
            return false;
        }
        ClientPK other = (ClientPK) object;
        if ((this.typePiecePersonne == null && other.typePiecePersonne != null) || (this.typePiecePersonne != null && !this.typePiecePersonne.equals(other.typePiecePersonne))) {
            return false;
        }
        if ((this.noPiecePersonne == null && other.noPiecePersonne != null) || (this.noPiecePersonne != null && !this.noPiecePersonne.equals(other.noPiecePersonne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Sec.ClientPK[ typePiecePersonne=" + typePiecePersonne + ", noPiecePersonne=" + noPiecePersonne + " ]";
    }
    
}
