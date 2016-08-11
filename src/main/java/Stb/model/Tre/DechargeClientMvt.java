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
@Table(name = "DECHARGE_CLIENT_MVT", catalog = "", schema = "TRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DechargeClientMvt.findAll", query = "SELECT d FROM DechargeClientMvt d"),
    @NamedQuery(name = "DechargeClientMvt.findByCodeProduitService", query = "SELECT d FROM DechargeClientMvt d WHERE d.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "DechargeClientMvt.findByCodeOperation", query = "SELECT d FROM DechargeClientMvt d WHERE d.codeOperation = :codeOperation"),
    @NamedQuery(name = "DechargeClientMvt.findByRefOperation", query = "SELECT d FROM DechargeClientMvt d WHERE d.refOperation = :refOperation"),
    @NamedQuery(name = "DechargeClientMvt.findByDateOperation", query = "SELECT d FROM DechargeClientMvt d WHERE d.dateOperation = :dateOperation"),
    @NamedQuery(name = "DechargeClientMvt.findByNumDossier", query = "SELECT d FROM DechargeClientMvt d WHERE d.numDossier = :numDossier"),
    @NamedQuery(name = "DechargeClientMvt.findByDateDossier", query = "SELECT d FROM DechargeClientMvt d WHERE d.dateDossier = :dateDossier"),
    @NamedQuery(name = "DechargeClientMvt.findByTypeDossier", query = "SELECT d FROM DechargeClientMvt d WHERE d.typeDossier = :typeDossier"),
    @NamedQuery(name = "DechargeClientMvt.findByTypePieceClient", query = "SELECT d FROM DechargeClientMvt d WHERE d.typePieceClient = :typePieceClient"),
    @NamedQuery(name = "DechargeClientMvt.findByNoPieceClient", query = "SELECT d FROM DechargeClientMvt d WHERE d.noPieceClient = :noPieceClient"),
    @NamedQuery(name = "DechargeClientMvt.findByCodeAgenceBct", query = "SELECT d FROM DechargeClientMvt d WHERE d.codeAgenceBct = :codeAgenceBct"),
    @NamedQuery(name = "DechargeClientMvt.findByRacineCompte", query = "SELECT d FROM DechargeClientMvt d WHERE d.racineCompte = :racineCompte"),
    @NamedQuery(name = "DechargeClientMvt.findByCleRib", query = "SELECT d FROM DechargeClientMvt d WHERE d.cleRib = :cleRib"),
    @NamedQuery(name = "DechargeClientMvt.findByRefModification", query = "SELECT d FROM DechargeClientMvt d WHERE d.refModification = :refModification"),
    @NamedQuery(name = "DechargeClientMvt.findByDateModification", query = "SELECT d FROM DechargeClientMvt d WHERE d.dateModification = :dateModification"),
    @NamedQuery(name = "DechargeClientMvt.findByCodeDeviseOrdre", query = "SELECT d FROM DechargeClientMvt d WHERE d.codeDeviseOrdre = :codeDeviseOrdre"),
    @NamedQuery(name = "DechargeClientMvt.findByCodeDevise", query = "SELECT d FROM DechargeClientMvt d WHERE d.codeDevise = :codeDevise"),
    @NamedQuery(name = "DechargeClientMvt.findByMntDevise", query = "SELECT d FROM DechargeClientMvt d WHERE d.mntDevise = :mntDevise"),
    @NamedQuery(name = "DechargeClientMvt.findByRefOrdre", query = "SELECT d FROM DechargeClientMvt d WHERE d.refOrdre = :refOrdre"),
    @NamedQuery(name = "DechargeClientMvt.findByDateOrdre", query = "SELECT d FROM DechargeClientMvt d WHERE d.dateOrdre = :dateOrdre"),
    @NamedQuery(name = "DechargeClientMvt.findByNomBeneficiaire", query = "SELECT d FROM DechargeClientMvt d WHERE d.nomBeneficiaire = :nomBeneficiaire"),
    @NamedQuery(name = "DechargeClientMvt.findByNatureOperation", query = "SELECT d FROM DechargeClientMvt d WHERE d.natureOperation = :natureOperation"),
    @NamedQuery(name = "DechargeClientMvt.findByCodeOperationDecharge", query = "SELECT d FROM DechargeClientMvt d WHERE d.codeOperationDecharge = :codeOperationDecharge"),
    @NamedQuery(name = "DechargeClientMvt.findByCodeTypeOperation", query = "SELECT d FROM DechargeClientMvt d WHERE d.codeTypeOperation = :codeTypeOperation"),
    @NamedQuery(name = "DechargeClientMvt.findByCodeDetailOperation", query = "SELECT d FROM DechargeClientMvt d WHERE d.codeDetailOperation = :codeDetailOperation"),
    @NamedQuery(name = "DechargeClientMvt.findByMatEmp", query = "SELECT d FROM DechargeClientMvt d WHERE d.matEmp = :matEmp"),
    @NamedQuery(name = "DechargeClientMvt.findByStatus", query = "SELECT d FROM DechargeClientMvt d WHERE d.status = :status"),
    @NamedQuery(name = "DechargeClientMvt.findByDateValidation", query = "SELECT d FROM DechargeClientMvt d WHERE d.dateValidation = :dateValidation"),
    @NamedQuery(name = "DechargeClientMvt.findByComInclus", query = "SELECT d FROM DechargeClientMvt d WHERE d.comInclus = :comInclus"),
    @NamedQuery(name = "DechargeClientMvt.findByNumDom", query = "SELECT d FROM DechargeClientMvt d WHERE d.numDom = :numDom"),
    @NamedQuery(name = "DechargeClientMvt.findByDateDom", query = "SELECT d FROM DechargeClientMvt d WHERE d.dateDom = :dateDom"),
    @NamedQuery(name = "DechargeClientMvt.findByDomiciliationBp", query = "SELECT d FROM DechargeClientMvt d WHERE d.domiciliationBp = :domiciliationBp")})
public class DechargeClientMvt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;
    @Column(name = "CODE_OPERATION")
    private Short codeOperation;
    @Column(name = "REF_OPERATION")
    private Integer refOperation;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.DATE)
    private Date dateOperation;
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
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
    @Column(name = "MAT_EMP")
    private Integer matEmp;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE_VALIDATION")
    @Temporal(TemporalType.DATE)
    private Date dateValidation;
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

    public DechargeClientMvt() {
    }

    public DechargeClientMvt(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Short getCodeProduitService() {
        return codeProduitService;
    }

    public void setCodeProduitService(Short codeProduitService) {
        this.codeProduitService = codeProduitService;
    }

    public Short getCodeOperation() {
        return codeOperation;
    }

    public void setCodeOperation(Short codeOperation) {
        this.codeOperation = codeOperation;
    }

    public Integer getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(Integer refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
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

    public Integer getMatEmp() {
        return matEmp;
    }

    public void setMatEmp(Integer matEmp) {
        this.matEmp = matEmp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
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
        hash += (codeProduitService != null ? codeProduitService.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DechargeClientMvt)) {
            return false;
        }
        DechargeClientMvt other = (DechargeClientMvt) object;
        if ((this.codeProduitService == null && other.codeProduitService != null) || (this.codeProduitService != null && !this.codeProduitService.equals(other.codeProduitService))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Tre.DechargeClientMvt[ codeProduitService=" + codeProduitService + " ]";
    }
    
}
