/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Tre;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author workstation djo
 */
@Entity
@Table(name = "DECHARGE_CLIENT", catalog = "", schema = "TRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DechargeClient.findAll", query = "SELECT d FROM DechargeClient d"),
    @NamedQuery(name = "DechargeClient.findByNumDossier", query = "SELECT d FROM DechargeClient d WHERE d.numDossier = :numDossier"),
    @NamedQuery(name = "DechargeClient.findByDateDossier", query = "SELECT d FROM DechargeClient d WHERE d.dateDossier = :dateDossier"),
    @NamedQuery(name = "DechargeClient.findByTypeDossier", query = "SELECT d FROM DechargeClient d WHERE d.typeDossier = :typeDossier"),
    @NamedQuery(name = "DechargeClient.findByTypePieceClient", query = "SELECT d FROM DechargeClient d WHERE d.typePieceClient = :typePieceClient"),
    @NamedQuery(name = "DechargeClient.findByNoPieceClient", query = "SELECT d FROM DechargeClient d WHERE d.noPieceClient = :noPieceClient"),
    @NamedQuery(name = "DechargeClient.findByCodeAgenceBct", query = "SELECT d FROM DechargeClient d WHERE d.codeAgenceBct = :codeAgenceBct"),
    @NamedQuery(name = "DechargeClient.findByRacineCompte", query = "SELECT d FROM DechargeClient d WHERE d.racineCompte = :racineCompte"),
    @NamedQuery(name = "DechargeClient.findByCleRib", query = "SELECT d FROM DechargeClient d WHERE d.cleRib = :cleRib"),
    @NamedQuery(name = "DechargeClient.findByRefModification", query = "SELECT d FROM DechargeClient d WHERE d.refModification = :refModification"),
    @NamedQuery(name = "DechargeClient.findByDateModification", query = "SELECT d FROM DechargeClient d WHERE d.dateModification = :dateModification"),
    @NamedQuery(name = "DechargeClient.findByCodeDeviseOrdre", query = "SELECT d FROM DechargeClient d WHERE d.codeDeviseOrdre = :codeDeviseOrdre"),
    @NamedQuery(name = "DechargeClient.findByCodeDevise", query = "SELECT d FROM DechargeClient d WHERE d.codeDevise = :codeDevise"),
    @NamedQuery(name = "DechargeClient.findByMntDevise", query = "SELECT d FROM DechargeClient d WHERE d.mntDevise = :mntDevise"),
    @NamedQuery(name = "DechargeClient.findByRefOrdre", query = "SELECT d FROM DechargeClient d WHERE d.refOrdre = :refOrdre"),
    @NamedQuery(name = "DechargeClient.findByDateOrdre", query = "SELECT d FROM DechargeClient d WHERE d.dateOrdre = :dateOrdre"),
    @NamedQuery(name = "DechargeClient.findByNomBeneficiaire", query = "SELECT d FROM DechargeClient d WHERE d.nomBeneficiaire = :nomBeneficiaire"),
    @NamedQuery(name = "DechargeClient.findByNatureOperation", query = "SELECT d FROM DechargeClient d WHERE d.natureOperation = :natureOperation"),
    @NamedQuery(name = "DechargeClient.findByCodeOperationDecharge", query = "SELECT d FROM DechargeClient d WHERE d.codeOperationDecharge = :codeOperationDecharge"),
    @NamedQuery(name = "DechargeClient.findByCodeTypeOperation", query = "SELECT d FROM DechargeClient d WHERE d.codeTypeOperation = :codeTypeOperation"),
    @NamedQuery(name = "DechargeClient.findByCodeDetailOperation", query = "SELECT d FROM DechargeClient d WHERE d.codeDetailOperation = :codeDetailOperation"),
    @NamedQuery(name = "DechargeClient.findByTraiteON", query = "SELECT d FROM DechargeClient d WHERE d.traiteON = :traiteON"),
    @NamedQuery(name = "DechargeClient.findByComInclus", query = "SELECT d FROM DechargeClient d WHERE d.comInclus = :comInclus"),
    @NamedQuery(name = "DechargeClient.findByNumDom", query = "SELECT d FROM DechargeClient d WHERE d.numDom = :numDom"),
    @NamedQuery(name = "DechargeClient.findByDateDom", query = "SELECT d FROM DechargeClient d WHERE d.dateDom = :dateDom"),
    @NamedQuery(name = "DechargeClient.findByDomiciliationBp", query = "SELECT d FROM DechargeClient d WHERE d.domiciliationBp = :domiciliationBp")})
public class DechargeClient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.DATE)
    private Date dateDossier;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Column(name = "TYPE_PIECE_CLIENT")
    private Short typePieceClient;
    @Size(max = 13)
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Column(name = "CODE_AGENCE_BCT")
    private Short codeAgenceBct;
    @Size(max = 13)
    @Column(name = "RACINE_COMPTE")
    private String racineCompte;
    @Column(name = "CLE_RIB")
    private Short cleRib;
    @Column(name = "REF_MODIFICATION")
    private Short refModification;
    @Column(name = "DATE_MODIFICATION")
    @Temporal(TemporalType.DATE)
    private Date dateModification;
    @Column(name = "CODE_DEVISE_ORDRE")
    private Short codeDeviseOrdre;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_DEVISE")
    private BigDecimal mntDevise;
    @Size(max = 20)
    @Column(name = "REF_ORDRE")
    private String refOrdre;
    @Column(name = "DATE_ORDRE")
    @Temporal(TemporalType.DATE)
    private Date dateOrdre;
    @Size(max = 35)
    @Column(name = "NOM_BENEFICIAIRE")
    private String nomBeneficiaire;
    @Size(max = 3)
    @Column(name = "NATURE_OPERATION")
    private String natureOperation;
    @Column(name = "CODE_OPERATION_DECHARGE")
    private Short codeOperationDecharge;
    @Column(name = "CODE_TYPE_OPERATION")
    private Short codeTypeOperation;
    @Column(name = "CODE_DETAIL_OPERATION")
    private Short codeDetailOperation;
    @Size(max = 1)
    @Column(name = "TRAITE_O_N")
    private String traiteON;
    @Size(max = 1)
    @Column(name = "COM_INCLUS")
    private String comInclus;
    @Column(name = "NUM_DOM")
    private Integer numDom;
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.DATE)
    private Date dateDom;
    @Size(max = 1)
    @Column(name = "DOMICILIATION_BP")
    private String domiciliationBp;

    public DechargeClient() {
    }

    public DechargeClient(Integer numDossier) {
        this.numDossier = numDossier;
    }

    public DechargeClient(Integer numDossier, Date dateDossier) {
        this.numDossier = numDossier;
        this.dateDossier = dateDossier;
    }

    public Integer getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Integer numDossier) {
        this.numDossier = numDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Short getTypePieceClient() {
        return typePieceClient;
    }

    public void setTypePieceClient(Short typePieceClient) {
        this.typePieceClient = typePieceClient;
    }

    public String getNoPieceClient() {
        return noPieceClient;
    }

    public void setNoPieceClient(String noPieceClient) {
        this.noPieceClient = noPieceClient;
    }

    public Short getCodeAgenceBct() {
        return codeAgenceBct;
    }

    public void setCodeAgenceBct(Short codeAgenceBct) {
        this.codeAgenceBct = codeAgenceBct;
    }

    public String getRacineCompte() {
        return racineCompte;
    }

    public void setRacineCompte(String racineCompte) {
        this.racineCompte = racineCompte;
    }

    public Short getCleRib() {
        return cleRib;
    }

    public void setCleRib(Short cleRib) {
        this.cleRib = cleRib;
    }

    public Short getRefModification() {
        return refModification;
    }

    public void setRefModification(Short refModification) {
        this.refModification = refModification;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public Short getCodeDeviseOrdre() {
        return codeDeviseOrdre;
    }

    public void setCodeDeviseOrdre(Short codeDeviseOrdre) {
        this.codeDeviseOrdre = codeDeviseOrdre;
    }

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public BigDecimal getMntDevise() {
        return mntDevise;
    }

    public void setMntDevise(BigDecimal mntDevise) {
        this.mntDevise = mntDevise;
    }

    public String getRefOrdre() {
        return refOrdre;
    }

    public void setRefOrdre(String refOrdre) {
        this.refOrdre = refOrdre;
    }

    public Date getDateOrdre() {
        return dateOrdre;
    }

    public void setDateOrdre(Date dateOrdre) {
        this.dateOrdre = dateOrdre;
    }

    public String getNomBeneficiaire() {
        return nomBeneficiaire;
    }

    public void setNomBeneficiaire(String nomBeneficiaire) {
        this.nomBeneficiaire = nomBeneficiaire;
    }

    public String getNatureOperation() {
        return natureOperation;
    }

    public void setNatureOperation(String natureOperation) {
        this.natureOperation = natureOperation;
    }

    public Short getCodeOperationDecharge() {
        return codeOperationDecharge;
    }

    public void setCodeOperationDecharge(Short codeOperationDecharge) {
        this.codeOperationDecharge = codeOperationDecharge;
    }

    public Short getCodeTypeOperation() {
        return codeTypeOperation;
    }

    public void setCodeTypeOperation(Short codeTypeOperation) {
        this.codeTypeOperation = codeTypeOperation;
    }

    public Short getCodeDetailOperation() {
        return codeDetailOperation;
    }

    public void setCodeDetailOperation(Short codeDetailOperation) {
        this.codeDetailOperation = codeDetailOperation;
    }

    public String getTraiteON() {
        return traiteON;
    }

    public void setTraiteON(String traiteON) {
        this.traiteON = traiteON;
    }

    public String getComInclus() {
        return comInclus;
    }

    public void setComInclus(String comInclus) {
        this.comInclus = comInclus;
    }

    public Integer getNumDom() {
        return numDom;
    }

    public void setNumDom(Integer numDom) {
        this.numDom = numDom;
    }

    public Date getDateDom() {
        return dateDom;
    }

    public void setDateDom(Date dateDom) {
        this.dateDom = dateDom;
    }

    public String getDomiciliationBp() {
        return domiciliationBp;
    }

    public void setDomiciliationBp(String domiciliationBp) {
        this.domiciliationBp = domiciliationBp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numDossier != null ? numDossier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DechargeClient)) {
            return false;
        }
        DechargeClient other = (DechargeClient) object;
        if ((this.numDossier == null && other.numDossier != null) || (this.numDossier != null && !this.numDossier.equals(other.numDossier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Tre.DechargeClient[ numDossier=" + numDossier + " ]";
    }
    
}
