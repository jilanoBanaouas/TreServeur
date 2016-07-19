/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.ava;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author yayan
 */
@Entity
@Table(name = "OPERATIONS_DELEGUEES", catalog = "", schema = "AVA")
@NamedQueries({
    @NamedQuery(name = "OperationsDeleguees.findAll", query = "SELECT o FROM OperationsDeleguees o"),
    @NamedQuery(name = "OperationsDeleguees.findByCodeTypeDosAva", query = "SELECT o FROM OperationsDeleguees o WHERE o.codeTypeDosAva = :codeTypeDosAva"),
    @NamedQuery(name = "OperationsDeleguees.findByNumDossier", query = "SELECT o FROM OperationsDeleguees o WHERE o.operationsDelegueesPK.numDossier = :numDossier"),
    @NamedQuery(name = "OperationsDeleguees.findByDateDossier", query = "SELECT o FROM OperationsDeleguees o WHERE o.operationsDelegueesPK.dateDossier = :dateDossier"),
    @NamedQuery(name = "OperationsDeleguees.findByCodeBanque", query = "SELECT o FROM OperationsDeleguees o WHERE o.codeBanque = :codeBanque"),
    @NamedQuery(name = "OperationsDeleguees.findByCodeAgenceAva", query = "SELECT o FROM OperationsDeleguees o WHERE o.operationsDelegueesPK.codeAgenceAva = :codeAgenceAva"),
    @NamedQuery(name = "OperationsDeleguees.findByTypePieceClient", query = "SELECT o FROM OperationsDeleguees o WHERE o.typePieceClient = :typePieceClient"),
    @NamedQuery(name = "OperationsDeleguees.findByNoPieceClient", query = "SELECT o FROM OperationsDeleguees o WHERE o.noPieceClient = :noPieceClient"),
    @NamedQuery(name = "OperationsDeleguees.findByTel", query = "SELECT o FROM OperationsDeleguees o WHERE o.tel = :tel"),
    @NamedQuery(name = "OperationsDeleguees.findByFax", query = "SELECT o FROM OperationsDeleguees o WHERE o.fax = :fax"),
    @NamedQuery(name = "OperationsDeleguees.findByCodeCloture", query = "SELECT o FROM OperationsDeleguees o WHERE o.codeCloture = :codeCloture"),
    @NamedQuery(name = "OperationsDeleguees.findByDateCloture", query = "SELECT o FROM OperationsDeleguees o WHERE o.dateCloture = :dateCloture"),
    @NamedQuery(name = "OperationsDeleguees.findByMotifCloture", query = "SELECT o FROM OperationsDeleguees o WHERE o.motifCloture = :motifCloture"),
    @NamedQuery(name = "OperationsDeleguees.findByEtatCloture", query = "SELECT o FROM OperationsDeleguees o WHERE o.etatCloture = :etatCloture"),
    @NamedQuery(name = "OperationsDeleguees.findByDateReactivation", query = "SELECT o FROM OperationsDeleguees o WHERE o.dateReactivation = :dateReactivation"),
    @NamedQuery(name = "OperationsDeleguees.findByDateBlocage", query = "SELECT o FROM OperationsDeleguees o WHERE o.dateBlocage = :dateBlocage"),
    @NamedQuery(name = "OperationsDeleguees.findByMotifBlocage", query = "SELECT o FROM OperationsDeleguees o WHERE o.motifBlocage = :motifBlocage"),
    @NamedQuery(name = "OperationsDeleguees.findByEtatBlocage", query = "SELECT o FROM OperationsDeleguees o WHERE o.etatBlocage = :etatBlocage"),
    @NamedQuery(name = "OperationsDeleguees.findByDateDeblocage", query = "SELECT o FROM OperationsDeleguees o WHERE o.dateDeblocage = :dateDeblocage"),
    @NamedQuery(name = "OperationsDeleguees.findByEtatDossier", query = "SELECT o FROM OperationsDeleguees o WHERE o.etatDossier = :etatDossier"),
    @NamedQuery(name = "OperationsDeleguees.findByCodeAgenceBct", query = "SELECT o FROM OperationsDeleguees o WHERE o.codeAgenceBct = :codeAgenceBct"),
    @NamedQuery(name = "OperationsDeleguees.findByRacineCompte", query = "SELECT o FROM OperationsDeleguees o WHERE o.racineCompte = :racineCompte"),
    @NamedQuery(name = "OperationsDeleguees.findByCleRib", query = "SELECT o FROM OperationsDeleguees o WHERE o.cleRib = :cleRib"),
    @NamedQuery(name = "OperationsDeleguees.findByMntAvance", query = "SELECT o FROM OperationsDeleguees o WHERE o.mntAvance = :mntAvance"),
    @NamedQuery(name = "OperationsDeleguees.findByMntUtilise", query = "SELECT o FROM OperationsDeleguees o WHERE o.mntUtilise = :mntUtilise"),
    @NamedQuery(name = "OperationsDeleguees.findByMntAutorise", query = "SELECT o FROM OperationsDeleguees o WHERE o.mntAutorise = :mntAutorise"),
    @NamedQuery(name = "OperationsDeleguees.findByMntCa", query = "SELECT o FROM OperationsDeleguees o WHERE o.mntCa = :mntCa"),
    @NamedQuery(name = "OperationsDeleguees.findByMntRrvRav", query = "SELECT o FROM OperationsDeleguees o WHERE o.mntRrvRav = :mntRrvRav"),
    @NamedQuery(name = "OperationsDeleguees.findByMntCaFiscal", query = "SELECT o FROM OperationsDeleguees o WHERE o.mntCaFiscal = :mntCaFiscal"),
    @NamedQuery(name = "OperationsDeleguees.findByMntTotTitre", query = "SELECT o FROM OperationsDeleguees o WHERE o.mntTotTitre = :mntTotTitre"),
    @NamedQuery(name = "OperationsDeleguees.findByCaImportateur", query = "SELECT o FROM OperationsDeleguees o WHERE o.caImportateur = :caImportateur"),
    @NamedQuery(name = "OperationsDeleguees.findBySolde", query = "SELECT o FROM OperationsDeleguees o WHERE o.solde = :solde"),
    @NamedQuery(name = "OperationsDeleguees.findByEcheance", query = "SELECT o FROM OperationsDeleguees o WHERE o.echeance = :echeance"),
    @NamedQuery(name = "OperationsDeleguees.findByDernierNumMvtAva", query = "SELECT o FROM OperationsDeleguees o WHERE o.dernierNumMvtAva = :dernierNumMvtAva"),
    @NamedQuery(name = "OperationsDeleguees.findByAnnee", query = "SELECT o FROM OperationsDeleguees o WHERE o.annee = :annee"),
    @NamedQuery(name = "OperationsDeleguees.findByCodeActivite", query = "SELECT o FROM OperationsDeleguees o WHERE o.codeActivite = :codeActivite"),
    @NamedQuery(name = "OperationsDeleguees.findByObservation", query = "SELECT o FROM OperationsDeleguees o WHERE o.observation = :observation"),
    @NamedQuery(name = "OperationsDeleguees.findByDeclarationFiscale", query = "SELECT o FROM OperationsDeleguees o WHERE o.declarationFiscale = :declarationFiscale")})
public class OperationsDeleguees implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OperationsDelegueesPK operationsDelegueesPK;
    @Column(name = "CODE_TYPE_DOS_AVA")
    private Short codeTypeDosAva;
    @Column(name = "CODE_BANQUE")
    private Short codeBanque;
    @Column(name = "TYPE_PIECE_CLIENT")
    private Short typePieceClient;
    @Size(max = 13)
    @Column(name = "NO_PIECE_CLIENT", length = 13)
    private String noPieceClient;
    @Size(max = 15)
    @Column(name = "TEL", length = 15)
    private String tel;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 15)
    @Column(name = "FAX", length = 15)
    private String fax;
    @Size(max = 1)
    @Column(name = "CODE_CLOTURE", length = 1)
    private String codeCloture;
    @Column(name = "DATE_CLOTURE")
    @Temporal(TemporalType.DATE)
    private Date dateCloture;
    @Size(max = 100)
    @Column(name = "MOTIF_CLOTURE", length = 100)
    private String motifCloture;
    @Size(max = 1)
    @Column(name = "ETAT_CLOTURE", length = 1)
    private String etatCloture;
    @Column(name = "DATE_REACTIVATION")
    @Temporal(TemporalType.DATE)
    private Date dateReactivation;
    @Column(name = "DATE_BLOCAGE")
    @Temporal(TemporalType.DATE)
    private Date dateBlocage;
    @Size(max = 100)
    @Column(name = "MOTIF_BLOCAGE", length = 100)
    private String motifBlocage;
    @Size(max = 1)
    @Column(name = "ETAT_BLOCAGE", length = 1)
    private String etatBlocage;
    @Column(name = "DATE_DEBLOCAGE")
    @Temporal(TemporalType.DATE)
    private Date dateDeblocage;
    @Size(max = 1)
    @Column(name = "ETAT_DOSSIER", length = 1)
    private String etatDossier;
    @Column(name = "CODE_AGENCE_BCT")
    private Short codeAgenceBct;
    @Size(max = 13)
    @Column(name = "RACINE_COMPTE", length = 13)
    private String racineCompte;
    @Column(name = "CLE_RIB")
    private Short cleRib;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_AVANCE", precision = 19, scale = 3)
    private BigDecimal mntAvance;
    @Column(name = "MNT_UTILISE", precision = 19, scale = 3)
    private BigDecimal mntUtilise;
    @Column(name = "MNT_AUTORISE", precision = 19, scale = 3)
    private BigDecimal mntAutorise;
    @Column(name = "MNT_CA", precision = 19, scale = 3)
    private BigDecimal mntCa;
    @Column(name = "MNT_RRV_RAV", precision = 19, scale = 3)
    private BigDecimal mntRrvRav;
    @Column(name = "MNT_CA_FISCAL", precision = 19, scale = 3)
    private BigDecimal mntCaFiscal;
    @Column(name = "MNT_TOT_TITRE")
    private BigInteger mntTotTitre;
    @Size(max = 1)
    @Column(name = "CA_IMPORTATEUR", length = 1)
    private String caImportateur;
    @Column(name = "SOLDE", precision = 19, scale = 3)
    private BigDecimal solde;
    @Column(name = "ECHEANCE")
    @Temporal(TemporalType.DATE)
    private Date echeance;
    @Column(name = "DERNIER_NUM_MVT_AVA")
    private Integer dernierNumMvtAva;
    @Column(name = "ANNEE")
    private Short annee;
    @Column(name = "CODE_ACTIVITE")
    private Integer codeActivite;
    @Size(max = 200)
    @Column(name = "OBSERVATION", length = 200)
    private String observation;
    @Size(max = 1)
    @Column(name = "DECLARATION_FISCALE", length = 1)
    private String declarationFiscale;

    public OperationsDeleguees() {
    }

    public OperationsDeleguees(OperationsDelegueesPK operationsDelegueesPK) {
        this.operationsDelegueesPK = operationsDelegueesPK;
    }

    public OperationsDeleguees(long numDossier, Date dateDossier, short codeAgenceAva) {
        this.operationsDelegueesPK = new OperationsDelegueesPK(numDossier, dateDossier, codeAgenceAva);
    }

    public OperationsDelegueesPK getOperationsDelegueesPK() {
        return operationsDelegueesPK;
    }

    public void setOperationsDelegueesPK(OperationsDelegueesPK operationsDelegueesPK) {
        this.operationsDelegueesPK = operationsDelegueesPK;
    }

    public Short getCodeTypeDosAva() {
        return codeTypeDosAva;
    }

    public void setCodeTypeDosAva(Short codeTypeDosAva) {
        this.codeTypeDosAva = codeTypeDosAva;
    }

    public Short getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Short codeBanque) {
        this.codeBanque = codeBanque;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCodeCloture() {
        return codeCloture;
    }

    public void setCodeCloture(String codeCloture) {
        this.codeCloture = codeCloture;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date dateCloture) {
        this.dateCloture = dateCloture;
    }

    public String getMotifCloture() {
        return motifCloture;
    }

    public void setMotifCloture(String motifCloture) {
        this.motifCloture = motifCloture;
    }

    public String getEtatCloture() {
        return etatCloture;
    }

    public void setEtatCloture(String etatCloture) {
        this.etatCloture = etatCloture;
    }

    public Date getDateReactivation() {
        return dateReactivation;
    }

    public void setDateReactivation(Date dateReactivation) {
        this.dateReactivation = dateReactivation;
    }

    public Date getDateBlocage() {
        return dateBlocage;
    }

    public void setDateBlocage(Date dateBlocage) {
        this.dateBlocage = dateBlocage;
    }

    public String getMotifBlocage() {
        return motifBlocage;
    }

    public void setMotifBlocage(String motifBlocage) {
        this.motifBlocage = motifBlocage;
    }

    public String getEtatBlocage() {
        return etatBlocage;
    }

    public void setEtatBlocage(String etatBlocage) {
        this.etatBlocage = etatBlocage;
    }

    public Date getDateDeblocage() {
        return dateDeblocage;
    }

    public void setDateDeblocage(Date dateDeblocage) {
        this.dateDeblocage = dateDeblocage;
    }

    public String getEtatDossier() {
        return etatDossier;
    }

    public void setEtatDossier(String etatDossier) {
        this.etatDossier = etatDossier;
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

    public BigDecimal getMntAvance() {
        return mntAvance;
    }

    public void setMntAvance(BigDecimal mntAvance) {
        this.mntAvance = mntAvance;
    }

    public BigDecimal getMntUtilise() {
        return mntUtilise;
    }

    public void setMntUtilise(BigDecimal mntUtilise) {
        this.mntUtilise = mntUtilise;
    }

    public BigDecimal getMntAutorise() {
        return mntAutorise;
    }

    public void setMntAutorise(BigDecimal mntAutorise) {
        this.mntAutorise = mntAutorise;
    }

    public BigDecimal getMntCa() {
        return mntCa;
    }

    public void setMntCa(BigDecimal mntCa) {
        this.mntCa = mntCa;
    }

    public BigDecimal getMntRrvRav() {
        return mntRrvRav;
    }

    public void setMntRrvRav(BigDecimal mntRrvRav) {
        this.mntRrvRav = mntRrvRav;
    }

    public BigDecimal getMntCaFiscal() {
        return mntCaFiscal;
    }

    public void setMntCaFiscal(BigDecimal mntCaFiscal) {
        this.mntCaFiscal = mntCaFiscal;
    }

    public BigInteger getMntTotTitre() {
        return mntTotTitre;
    }

    public void setMntTotTitre(BigInteger mntTotTitre) {
        this.mntTotTitre = mntTotTitre;
    }

    public String getCaImportateur() {
        return caImportateur;
    }

    public void setCaImportateur(String caImportateur) {
        this.caImportateur = caImportateur;
    }

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public Date getEcheance() {
        return echeance;
    }

    public void setEcheance(Date echeance) {
        this.echeance = echeance;
    }

    public Integer getDernierNumMvtAva() {
        return dernierNumMvtAva;
    }

    public void setDernierNumMvtAva(Integer dernierNumMvtAva) {
        this.dernierNumMvtAva = dernierNumMvtAva;
    }

    public Short getAnnee() {
        return annee;
    }

    public void setAnnee(Short annee) {
        this.annee = annee;
    }

    public Integer getCodeActivite() {
        return codeActivite;
    }

    public void setCodeActivite(Integer codeActivite) {
        this.codeActivite = codeActivite;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getDeclarationFiscale() {
        return declarationFiscale;
    }

    public void setDeclarationFiscale(String declarationFiscale) {
        this.declarationFiscale = declarationFiscale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operationsDelegueesPK != null ? operationsDelegueesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperationsDeleguees)) {
            return false;
        }
        OperationsDeleguees other = (OperationsDeleguees) object;
        if ((this.operationsDelegueesPK == null && other.operationsDelegueesPK != null) || (this.operationsDelegueesPK != null && !this.operationsDelegueesPK.equals(other.operationsDelegueesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.ava.OperationsDeleguees[ operationsDelegueesPK=" + operationsDelegueesPK + " ]";
    }
    
}
