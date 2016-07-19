package Stb.model.Sec;

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

@Entity
@Table(name = "produit_service")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProduitService.findAll", query = "SELECT p FROM ProduitService p"),
    @NamedQuery(name = "ProduitService.findByCodeProduitService", query = "SELECT p FROM ProduitService p WHERE p.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "ProduitService.findByLibelleProduitService", query = "SELECT p FROM ProduitService p WHERE p.libelleProduitService = :libelleProduitService"),
    @NamedQuery(name = "ProduitService.findByPeriode", query = "SELECT p FROM ProduitService p WHERE p.periode = :periode"),
    @NamedQuery(name = "ProduitService.findByNbrPeriode", query = "SELECT p FROM ProduitService p WHERE p.nbrPeriode = :nbrPeriode")})
public class ProduitService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE", length = 255)
    private Integer codeProduitService;
    @Size(max = 200)
    @Column(name = "LIBELLE_PRODUIT_SERVICE", length = 255)
    private String libelleProduitService;
    @Column(name = "PERIODE", length = 255)
    private Integer periode;
    @Column(name = "NBR_PERIODE", length = 255)
    private Integer nbrPeriode;

    public ProduitService() {
    }

    public ProduitService(Integer codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Integer getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Integer codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public String getLibelleProduitService() {
        return libelleProduitService;
    }

    public void setLibelleProduitService(String libelleProduitService) {
        this.libelleProduitService = libelleProduitService;
    }

    public Integer getPeriode() {
        return periode;
    }

    public void setPeriode(Integer periode) {
        this.periode = periode;
    }

    public Integer getNbrPeriode() {
        return nbrPeriode;
    }

    public void setNbrPeriode(Integer nbrPeriode) {
        this.nbrPeriode = nbrPeriode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeProduitService != null ? codeProduitService.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduitService)) {
            return false;
        }
        ProduitService other = (ProduitService) object;
        if ((this.codeProduitService == null && other.codeProduitService != null) || (this.codeProduitService != null && !this.codeProduitService.equals(other.codeProduitService))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SW.ProduitService[ codeProduitService=" + codeProduitService + " ]";
    }

}
