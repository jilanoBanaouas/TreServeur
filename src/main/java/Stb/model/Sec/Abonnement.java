package Stb.model.Sec;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "abonnement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abonnement.findAll", query = "SELECT a FROM Abonnement a"),
    @NamedQuery(name = "Abonnement.findByCodeProduitService", query = "SELECT a FROM Abonnement a WHERE a.abonnementPK.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "Abonnement.findByNoPiecePersonne", query = "SELECT a FROM Abonnement a WHERE a.abonnementPK.noPiecePersonne = :noPiecePersonne"),
    @NamedQuery(name = "Abonnement.findByDateDebut", query = "SELECT a FROM Abonnement a WHERE a.dateDebut = :dateDebut"),
    @NamedQuery(name = "Abonnement.findByDateFin", query = "SELECT a FROM Abonnement a WHERE a.dateFin = :dateFin")})
public class Abonnement implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AbonnementPK abonnementPK;
    @Column(name = "DATE_DEBUT", length = 255)
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "DATE_FIN", length = 255)
    @Temporal(TemporalType.DATE)
    private Date dateFin;

    public Abonnement() {
    }

    public Abonnement(AbonnementPK abonnementPK) {
        this.abonnementPK = abonnementPK;
    }

    public Abonnement(int codeProduitService, String noPiecePersonne) {
        this.abonnementPK = new AbonnementPK(codeProduitService, noPiecePersonne);
    }

    public AbonnementPK getAbonnementPK() {
        return abonnementPK;
    }

    public void setAbonnementPK(AbonnementPK abonnementPK) {
        this.abonnementPK = abonnementPK;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (abonnementPK != null ? abonnementPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abonnement)) {
            return false;
        }
        Abonnement other = (Abonnement) object;
        if ((this.abonnementPK == null && other.abonnementPK != null) || (this.abonnementPK != null && !this.abonnementPK.equals(other.abonnementPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SW.Abonnement[ abonnementPK=" + abonnementPK + " ]";
    }

}
