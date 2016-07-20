/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Ref;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author yayan
 */
@Entity
@Table(name = "TYPE_DOSSIER_AVA", catalog = "", schema = "REF")
@NamedQueries({
    @NamedQuery(name = "TypeDossierAva.findAll", query = "SELECT t FROM TypeDossierAva t"),
    @NamedQuery(name = "TypeDossierAva.findByCodeTypeDosAva", query = "SELECT t FROM TypeDossierAva t WHERE t.codeTypeDosAva = :codeTypeDosAva"),
    @NamedQuery(name = "TypeDossierAva.findByLibTypeDosAva", query = "SELECT t FROM TypeDossierAva t WHERE t.libTypeDosAva = :libTypeDosAva"),
    @NamedQuery(name = "TypeDossierAva.findBySeuilMinimum", query = "SELECT t FROM TypeDossierAva t WHERE t.seuilMinimum = :seuilMinimum"),
    @NamedQuery(name = "TypeDossierAva.findBySeuilMaximum", query = "SELECT t FROM TypeDossierAva t WHERE t.seuilMaximum = :seuilMaximum"),
    @NamedQuery(name = "TypeDossierAva.findByDroitMinimum", query = "SELECT t FROM TypeDossierAva t WHERE t.droitMinimum = :droitMinimum"),
    @NamedQuery(name = "TypeDossierAva.findByTauxAva", query = "SELECT t FROM TypeDossierAva t WHERE t.tauxAva = :tauxAva"),
    @NamedQuery(name = "TypeDossierAva.findByDroitMaximum", query = "SELECT t FROM TypeDossierAva t WHERE t.droitMaximum = :droitMaximum"),
    @NamedQuery(name = "TypeDossierAva.findByAnneeCirculaire", query = "SELECT t FROM TypeDossierAva t WHERE t.anneeCirculaire = :anneeCirculaire"),
    @NamedQuery(name = "TypeDossierAva.findByNumeroCirculaire", query = "SELECT t FROM TypeDossierAva t WHERE t.numeroCirculaire = :numeroCirculaire"),
    @NamedQuery(name = "TypeDossierAva.findByDateApplication", query = "SELECT t FROM TypeDossierAva t WHERE t.dateApplication = :dateApplication"),
    @NamedQuery(name = "TypeDossierAva.findByDateFinApplication", query = "SELECT t FROM TypeDossierAva t WHERE t.dateFinApplication = :dateFinApplication"),
    @NamedQuery(name = "TypeDossierAva.findByStatus", query = "SELECT t FROM TypeDossierAva t WHERE t.status = :status"),
    @NamedQuery(name = "TypeDossierAva.findByAvanceON", query = "SELECT t FROM TypeDossierAva t WHERE t.avanceON = :avanceON"),
    @NamedQuery(name = "TypeDossierAva.findByTauxAvanceMax", query = "SELECT t FROM TypeDossierAva t WHERE t.tauxAvanceMax = :tauxAvanceMax"),
    @NamedQuery(name = "TypeDossierAva.findByNbrAvance", query = "SELECT t FROM TypeDossierAva t WHERE t.nbrAvance = :nbrAvance"),
    @NamedQuery(name = "TypeDossierAva.findByDateAvanceMax", query = "SELECT t FROM TypeDossierAva t WHERE t.dateAvanceMax = :dateAvanceMax")})
public class TypeDossierAva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TYPE_DOS_AVA", nullable = false)
    private Short codeTypeDosAva;
    @Size(max = 30)
    @Column(name = "LIB_TYPE_DOS_AVA", length = 30)
    private String libTypeDosAva;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SEUIL_MINIMUM", precision = 15, scale = 3)
    private BigDecimal seuilMinimum;
    @Column(name = "SEUIL_MAXIMUM", precision = 15, scale = 3)
    private BigDecimal seuilMaximum;
    @Column(name = "DROIT_MINIMUM", precision = 15, scale = 3)
    private BigDecimal droitMinimum;
    @Column(name = "TAUX_AVA", precision = 6, scale = 3)
    private BigDecimal tauxAva;
    @Column(name = "DROIT_MAXIMUM", precision = 15, scale = 3)
    private BigDecimal droitMaximum;
    @Column(name = "ANNEE_CIRCULAIRE")
    private Short anneeCirculaire;
    @Column(name = "NUMERO_CIRCULAIRE")
    private Short numeroCirculaire;
    @Column(name = "DATE_APPLICATION")
    @Temporal(TemporalType.DATE)
    private Date dateApplication;
    @Column(name = "DATE_FIN_APPLICATION")
    @Temporal(TemporalType.DATE)
    private Date dateFinApplication;
    @Size(max = 1)
    @Column(name = "STATUS", length = 1)
    private String status;
    @Size(max = 1)
    @Column(name = "AVANCE_O_N", length = 1)
    private String avanceON;
    @Column(name = "TAUX_AVANCE_MAX", precision = 6, scale = 3)
    private BigDecimal tauxAvanceMax;
    @Column(name = "NBR_AVANCE")
    private BigInteger nbrAvance;
    @Column(name = "DATE_AVANCE_MAX")
    @Temporal(TemporalType.DATE)
    private Date dateAvanceMax;

    public TypeDossierAva() {
    }

    public TypeDossierAva(Short codeTypeDosAva) {
        this.codeTypeDosAva = codeTypeDosAva;
    }

    public Short getCodeTypeDosAva() {
        return codeTypeDosAva;
    }

    public void setCodeTypeDosAva(Short codeTypeDosAva) {
        this.codeTypeDosAva = codeTypeDosAva;
    }

    public String getLibTypeDosAva() {
        return libTypeDosAva;
    }

    public void setLibTypeDosAva(String libTypeDosAva) {
        this.libTypeDosAva = libTypeDosAva;
    }

    public BigDecimal getSeuilMinimum() {
        return seuilMinimum;
    }

    public void setSeuilMinimum(BigDecimal seuilMinimum) {
        this.seuilMinimum = seuilMinimum;
    }

    public BigDecimal getSeuilMaximum() {
        return seuilMaximum;
    }

    public void setSeuilMaximum(BigDecimal seuilMaximum) {
        this.seuilMaximum = seuilMaximum;
    }

    public BigDecimal getDroitMinimum() {
        return droitMinimum;
    }

    public void setDroitMinimum(BigDecimal droitMinimum) {
        this.droitMinimum = droitMinimum;
    }

    public BigDecimal getTauxAva() {
        return tauxAva;
    }

    public void setTauxAva(BigDecimal tauxAva) {
        this.tauxAva = tauxAva;
    }

    public BigDecimal getDroitMaximum() {
        return droitMaximum;
    }

    public void setDroitMaximum(BigDecimal droitMaximum) {
        this.droitMaximum = droitMaximum;
    }

    public Short getAnneeCirculaire() {
        return anneeCirculaire;
    }

    public void setAnneeCirculaire(Short anneeCirculaire) {
        this.anneeCirculaire = anneeCirculaire;
    }

    public Short getNumeroCirculaire() {
        return numeroCirculaire;
    }

    public void setNumeroCirculaire(Short numeroCirculaire) {
        this.numeroCirculaire = numeroCirculaire;
    }

    public Date getDateApplication() {
        return dateApplication;
    }

    public void setDateApplication(Date dateApplication) {
        this.dateApplication = dateApplication;
    }

    public Date getDateFinApplication() {
        return dateFinApplication;
    }

    public void setDateFinApplication(Date dateFinApplication) {
        this.dateFinApplication = dateFinApplication;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvanceON() {
        return avanceON;
    }

    public void setAvanceON(String avanceON) {
        this.avanceON = avanceON;
    }

    public BigDecimal getTauxAvanceMax() {
        return tauxAvanceMax;
    }

    public void setTauxAvanceMax(BigDecimal tauxAvanceMax) {
        this.tauxAvanceMax = tauxAvanceMax;
    }

    public BigInteger getNbrAvance() {
        return nbrAvance;
    }

    public void setNbrAvance(BigInteger nbrAvance) {
        this.nbrAvance = nbrAvance;
    }

    public Date getDateAvanceMax() {
        return dateAvanceMax;
    }

    public void setDateAvanceMax(Date dateAvanceMax) {
        this.dateAvanceMax = dateAvanceMax;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTypeDosAva != null ? codeTypeDosAva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeDossierAva)) {
            return false;
        }
        TypeDossierAva other = (TypeDossierAva) object;
        if ((this.codeTypeDosAva == null && other.codeTypeDosAva != null) || (this.codeTypeDosAva != null && !this.codeTypeDosAva.equals(other.codeTypeDosAva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Ref.TypeDossierAva[ codeTypeDosAva=" + codeTypeDosAva + " ]";
    }
    
}
