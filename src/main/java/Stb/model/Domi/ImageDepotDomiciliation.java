/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Domi;
import Stb.model.Domi.Apurement;
import Stb.model.Domi.ApurementPK;
import Stb.model.Ref.Titre;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author slim
 */
@Entity
@Table(catalog = "domi",name = "image_depot_domiciliation")
@XmlRootElement
@NamedQueries({
    
    @NamedQuery(name = "ImageDepotDomiciliation.findAll", query = "SELECT i FROM ImageDepotDomiciliation i"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByRefContrat", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.imageDepotDomiciliationPK.refContrat = :refContrat"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByUniteContrat", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.imageDepotDomiciliationPK.uniteContrat = :uniteContrat"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateContrat", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.imageDepotDomiciliationPK.dateContrat = :dateContrat"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNumDom", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.numDom = :numDom"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateDom", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateDom = :dateDom"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNumDepot", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.numDepot = :numDepot"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateDepot", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateDepot = :dateDepot"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeTitre", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeTitre = :codeTitre"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNbrRbq", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.nbrRbq = :nbrRbq"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeDevise", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeDevise = :codeDevise"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeModLiv", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeModLiv = :codeModLiv"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByMntDvsPtfnFact", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.mntDvsPtfnFact = :mntDvsPtfnFact"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByMntDvsFobFact", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.mntDvsFobFact = :mntDvsFobFact"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodPayAch", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codPayAch = :codPayAch"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodPayProv", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codPayProv = :codPayProv"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodPayOrig", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codPayOrig = :codPayOrig"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNumContratCom", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.numContratCom = :numContratCom"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateContratCom", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateContratCom = :dateContratCom"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNomFournisseur", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.nomFournisseur = :nomFournisseur"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByRegimeStat", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.regimeStat = :regimeStat"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByMntTndFob", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.mntTndFob = :mntTndFob"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByMntTndPtfn", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.mntTndPtfn = :mntTndPtfn"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeActivite", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeActivite = :codeActivite"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNbrColis", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.nbrColis = :nbrColis"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCauseRejet", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.causeRejet = :causeRejet"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeCloture", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeCloture = :codeCloture"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeApurement", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeApurement = :codeApurement"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateValidite", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateValidite = :dateValidite"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateCloture", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateCloture = :dateCloture"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNumeroFacture", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.numeroFacture = :numeroFacture"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNomClient", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.nomClient = :nomClient"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByAdrClient", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.adrClient = :adrClient"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateValidation", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateValidation = :dateValidation"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateExpedition", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateExpedition = :dateExpedition"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateEcheance", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateEcheance = :dateEcheance"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByAdresseClient", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.adresseClient = :adresseClient"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateApurement", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateApurement = :dateApurement"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByTypePieceClient", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.typePieceClient = :typePieceClient"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNoPieceClient", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.noPieceClient = :noPieceClient"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByAdresseClient1", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.adresseClient1 = :adresseClient1"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByAdresseClient2", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.adresseClient2 = :adresseClient2"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByAdresseClient3", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.adresseClient3 = :adresseClient3"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByObservations", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.observations = :observations"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByTotMntEmarge", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.totMntEmarge = :totMntEmarge"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByTotMntRestant", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.totMntRestant = :totMntRestant"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByTotMntRegle", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.totMntRegle = :totMntRegle"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByTotMntReserve", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.totMntReserve = :totMntReserve"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByTotMntImpute", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.totMntImpute = :totMntImpute"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByInforApurement", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.inforApurement = :inforApurement"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNumeroDossier", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.numeroDossier = :numeroDossier"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateTraitement", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateTraitement = :dateTraitement"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByNumeroDemande", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.numeroDemande = :numeroDemande"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByAdresseFournisseur", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.adresseFournisseur = :adresseFournisseur"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByValidationTtn", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.validationTtn = :validationTtn"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateValidationTtn", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateValidationTtn = :dateValidationTtn"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeModReg", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeModReg = :codeModReg"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeDelReg", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeDelReg = :codeDelReg"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCodeAgenceBct", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.codeAgenceBct = :codeAgenceBct"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByRacineCompte", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.racineCompte = :racineCompte"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByCleRib", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.cleRib = :cleRib"),
    @NamedQuery(name = "ImageDepotDomiciliation.findByDateTirage", query = "SELECT i FROM ImageDepotDomiciliation i WHERE i.dateTirage = :dateTirage")})
public class ImageDepotDomiciliation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ImageDepotDomiciliationPK imageDepotDomiciliationPK;
    @Column(name = "NUM_DOM")
    private Integer numDom;
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.DATE)
    private Date dateDom;
    @Column(name = "NUM_DEPOT")
    private Integer numDepot;
    @Column(name = "DATE_DEPOT")
    @Temporal(TemporalType.DATE)
    private Date dateDepot;
    @Column(name = "CODE_TITRE")
    private Integer codeTitre;
    @Column(name = "NBR_RBQ")
    private Integer nbrRbq;
    @Column(name = "CODE_DEVISE")
    private Integer codeDevise;
    @Column(name = "CODE_MOD_LIV")
    private Integer codeModLiv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_DVS_PTFN_FACT")
    private Double mntDvsPtfnFact;
    @Column(name = "MNT_DVS_FOB_FACT")
    private Double mntDvsFobFact;
    @Column(name = "COD_PAY_ACH")
    private Integer codPayAch;
    @Column(name = "COD_PAY_PROV")
    private Integer codPayProv;
    @Column(name = "COD_PAY_ORIG")
    private Integer codPayOrig;
    @Size(max = 35)
    @Column(name = "NUM_CONTRAT_COM")
    private String numContratCom;
    @Column(name = "DATE_CONTRAT_COM")
    @Temporal(TemporalType.DATE)
    private Date dateContratCom;
    @Size(max = 175)
    @Column(name = "NOM_FOURNISSEUR")
    private String nomFournisseur;
    @Column(name = "REGIME_STAT")
    private Integer regimeStat;
    @Column(name = "MNT_TND_FOB")
    private Double mntTndFob;
    @Column(name = "MNT_TND_PTFN")
    private Double mntTndPtfn;
    @Size(max = 7)
    @Column(name = "CODE_ACTIVITE")
    private String codeActivite;
    @Column(name = "NBR_COLIS")
    private Integer nbrColis;
    @Size(max = 200)
    @Column(name = "CAUSE_REJET")
    private String causeRejet;
    @Size(max = 1)
    @Column(name = "CODE_CLOTURE")
    private String codeCloture;
    @Column(name = "CODE_APUREMENT")
    private Integer codeApurement;
    @Column(name = "DATE_VALIDITE")
    @Temporal(TemporalType.DATE)
    private Date dateValidite;
    @Column(name = "DATE_CLOTURE")
    @Temporal(TemporalType.DATE)
    private Date dateCloture;
    @Size(max = 10)
    @Column(name = "NUMERO_FACTURE")
    private String numeroFacture;
    @Size(max = 175)
    @Column(name = "NOM_CLIENT")
    private String nomClient;
    @Size(max = 100)
    @Column(name = "ADR_CLIENT")
    private String adrClient;
    @Column(name = "DATE_VALIDATION")
    @Temporal(TemporalType.DATE)
    private Date dateValidation;
    @Column(name = "DATE_EXPEDITION")
    @Temporal(TemporalType.DATE)
    private Date dateExpedition;
    @Column(name = "DATE_ECHEANCE")
    @Temporal(TemporalType.DATE)
    private Date dateEcheance;
    @Size(max = 50)
    @Column(name = "ADRESSE_CLIENT")
    private String adresseClient;
    @Column(name = "DATE_APUREMENT")
    @Temporal(TemporalType.DATE)
    private Date dateApurement;
    @Column(name = "TYPE_PIECE_CLIENT")
    private Integer typePieceClient;
    @Size(max = 13)
    @Column(name = "NO_PIECE_CLIENT")
    private String noPieceClient;
    @Size(max = 70)
    @Column(name = "ADRESSE_CLIENT1")
    private String adresseClient1;
    @Size(max = 70)
    @Column(name = "ADRESSE_CLIENT2")
    private String adresseClient2;
    @Column(name = "ADRESSE_CLIENT3")
    private Integer adresseClient3;
    @Size(max = 200)
    @Column(name = "OBSERVATIONS")
    private String observations;
    @Column(name = "TOT_MNT_EMARGE")
    private Double totMntEmarge;
    @Column(name = "TOT_MNT_RESTANT")
    private Double totMntRestant;
    @Column(name = "TOT_MNT_REGLE")
    private Double totMntRegle;
    @Column(name = "TOT_MNT_RESERVE")
    private Double totMntReserve;
    @Column(name = "TOT_MNT_IMPUTE")
    private Double totMntImpute;
    @Column(name = "INFOR_APUREMENT")
    private Integer inforApurement;
    @Size(max = 35)
    @Column(name = "NUMERO_DOSSIER")
    private String numeroDossier;
    @Column(name = "DATE_TRAITEMENT")
    @Temporal(TemporalType.DATE)
    private Date dateTraitement;
    @Size(max = 35)
    @Column(name = "NUMERO_DEMANDE")
    private String numeroDemande;
    @Size(max = 70)
    @Column(name = "ADRESSE_FOURNISSEUR")
    private String adresseFournisseur;
    @Size(max = 1)
    @Column(name = "VALIDATION_TTN")
    private String validationTtn;
    @Column(name = "DATE_VALIDATION_TTN")
    @Temporal(TemporalType.DATE)
    private Date dateValidationTtn;
    @Column(name = "CODE_MOD_REG")
    private Integer codeModReg;
    @Column(name = "CODE_DEL_REG")
    private Integer codeDelReg;
    @Column(name = "CODE_AGENCE_BCT")
    private Integer codeAgenceBct;
    @Size(max = 13)
    @Column(name = "RACINE_COMPTE")
    private String racineCompte;
    @Column(name = "CLE_RIB")
    private Integer cleRib;
    @Column(name = "Date_Tirage")
    @Temporal(TemporalType.DATE)
    private Date dateTirage;

    public ImageDepotDomiciliation() {
    }

    public ImageDepotDomiciliation(ImageDepotDomiciliationPK imageDepotDomiciliationPK) {
        this.imageDepotDomiciliationPK = imageDepotDomiciliationPK;
    }

    public ImageDepotDomiciliation(int refContrat, int uniteContrat, Date dateContrat) {
        this.imageDepotDomiciliationPK = new ImageDepotDomiciliationPK(refContrat, uniteContrat, dateContrat);
    }

    public ImageDepotDomiciliationPK getImageDepotDomiciliationPK() {
        return imageDepotDomiciliationPK;
    }

    public void setImageDepotDomiciliationPK(ImageDepotDomiciliationPK imageDepotDomiciliationPK) {
        this.imageDepotDomiciliationPK = imageDepotDomiciliationPK;
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

    public Integer getNumDepot() {
        return numDepot;
    }

    public void setNumDepot(Integer numDepot) {
        this.numDepot = numDepot;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public Integer getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Integer codeTitre) {
        this.codeTitre = codeTitre;
    }

    public Integer getNbrRbq() {
        return nbrRbq;
    }

    public void setNbrRbq(Integer nbrRbq) {
        this.nbrRbq = nbrRbq;
    }

    public Integer getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Integer codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Integer getCodeModLiv() {
        return codeModLiv;
    }

    public void setCodeModLiv(Integer codeModLiv) {
        this.codeModLiv = codeModLiv;
    }

    public Double getMntDvsPtfnFact() {
        return mntDvsPtfnFact;
    }

    public void setMntDvsPtfnFact(Double mntDvsPtfnFact) {
        this.mntDvsPtfnFact = mntDvsPtfnFact;
    }

    public Double getMntDvsFobFact() {
        return mntDvsFobFact;
    }

    public void setMntDvsFobFact(Double mntDvsFobFact) {
        this.mntDvsFobFact = mntDvsFobFact;
    }

    public Integer getCodPayAch() {
        return codPayAch;
    }

    public void setCodPayAch(Integer codPayAch) {
        this.codPayAch = codPayAch;
    }

    public Integer getCodPayProv() {
        return codPayProv;
    }

    public void setCodPayProv(Integer codPayProv) {
        this.codPayProv = codPayProv;
    }

    public Integer getCodPayOrig() {
        return codPayOrig;
    }

    public void setCodPayOrig(Integer codPayOrig) {
        this.codPayOrig = codPayOrig;
    }

    public String getNumContratCom() {
        return numContratCom;
    }

    public void setNumContratCom(String numContratCom) {
        this.numContratCom = numContratCom;
    }

    public Date getDateContratCom() {
        return dateContratCom;
    }

    public void setDateContratCom(Date dateContratCom) {
        this.dateContratCom = dateContratCom;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public Integer getRegimeStat() {
        return regimeStat;
    }

    public void setRegimeStat(Integer regimeStat) {
        this.regimeStat = regimeStat;
    }

    public Double getMntTndFob() {
        return mntTndFob;
    }

    public void setMntTndFob(Double mntTndFob) {
        this.mntTndFob = mntTndFob;
    }

    public Double getMntTndPtfn() {
        return mntTndPtfn;
    }

    public void setMntTndPtfn(Double mntTndPtfn) {
        this.mntTndPtfn = mntTndPtfn;
    }

    public String getCodeActivite() {
        return codeActivite;
    }

    public void setCodeActivite(String codeActivite) {
        this.codeActivite = codeActivite;
    }

    public Integer getNbrColis() {
        return nbrColis;
    }

    public void setNbrColis(Integer nbrColis) {
        this.nbrColis = nbrColis;
    }

    public String getCauseRejet() {
        return causeRejet;
    }

    public void setCauseRejet(String causeRejet) {
        this.causeRejet = causeRejet;
    }

    public String getCodeCloture() {
        return codeCloture;
    }

    public void setCodeCloture(String codeCloture) {
        this.codeCloture = codeCloture;
    }

    public Integer getCodeApurement() {
        return codeApurement;
    }

    public void setCodeApurement(Integer codeApurement) {
        this.codeApurement = codeApurement;
    }

    public Date getDateValidite() {
        return dateValidite;
    }

    public void setDateValidite(Date dateValidite) {
        this.dateValidite = dateValidite;
    }

    public Date getDateCloture() {
        return dateCloture;
    }

    public void setDateCloture(Date dateCloture) {
        this.dateCloture = dateCloture;
    }

    public String getNumeroFacture() {
        return numeroFacture;
    }

    public void setNumeroFacture(String numeroFacture) {
        this.numeroFacture = numeroFacture;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAdrClient() {
        return adrClient;
    }

    public void setAdrClient(String adrClient) {
        this.adrClient = adrClient;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Date getDateExpedition() {
        return dateExpedition;
    }

    public void setDateExpedition(Date dateExpedition) {
        this.dateExpedition = dateExpedition;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public Date getDateApurement() {
        return dateApurement;
    }

    public void setDateApurement(Date dateApurement) {
        this.dateApurement = dateApurement;
    }

    public Integer getTypePieceClient() {
        return typePieceClient;
    }

    public void setTypePieceClient(Integer typePieceClient) {
        this.typePieceClient = typePieceClient;
    }

    public String getNoPieceClient() {
        return noPieceClient;
    }

    public void setNoPieceClient(String noPieceClient) {
        this.noPieceClient = noPieceClient;
    }

    public String getAdresseClient1() {
        return adresseClient1;
    }

    public void setAdresseClient1(String adresseClient1) {
        this.adresseClient1 = adresseClient1;
    }

    public String getAdresseClient2() {
        return adresseClient2;
    }

    public void setAdresseClient2(String adresseClient2) {
        this.adresseClient2 = adresseClient2;
    }

    public Integer getAdresseClient3() {
        return adresseClient3;
    }

    public void setAdresseClient3(Integer adresseClient3) {
        this.adresseClient3 = adresseClient3;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Double getTotMntEmarge() {
        return totMntEmarge;
    }

    public void setTotMntEmarge(Double totMntEmarge) {
        this.totMntEmarge = totMntEmarge;
    }

    public Double getTotMntRestant() {
        return totMntRestant;
    }

    public void setTotMntRestant(Double totMntRestant) {
        this.totMntRestant = totMntRestant;
    }

    public Double getTotMntRegle() {
        return totMntRegle;
    }

    public void setTotMntRegle(Double totMntRegle) {
        this.totMntRegle = totMntRegle;
    }

    public Double getTotMntReserve() {
        return totMntReserve;
    }

    public void setTotMntReserve(Double totMntReserve) {
        this.totMntReserve = totMntReserve;
    }

    public Double getTotMntImpute() {
        return totMntImpute;
    }

    public void setTotMntImpute(Double totMntImpute) {
        this.totMntImpute = totMntImpute;
    }

    public Integer getInforApurement() {
        return inforApurement;
    }

    public void setInforApurement(Integer inforApurement) {
        this.inforApurement = inforApurement;
    }

    public String getNumeroDossier() {
        return numeroDossier;
    }

    public void setNumeroDossier(String numeroDossier) {
        this.numeroDossier = numeroDossier;
    }

    public Date getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Date dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    public String getNumeroDemande() {
        return numeroDemande;
    }

    public void setNumeroDemande(String numeroDemande) {
        this.numeroDemande = numeroDemande;
    }

    public String getAdresseFournisseur() {
        return adresseFournisseur;
    }

    public void setAdresseFournisseur(String adresseFournisseur) {
        this.adresseFournisseur = adresseFournisseur;
    }

    public String getValidationTtn() {
        return validationTtn;
    }

    public void setValidationTtn(String validationTtn) {
        this.validationTtn = validationTtn;
    }

    public Date getDateValidationTtn() {
        return dateValidationTtn;
    }

    public void setDateValidationTtn(Date dateValidationTtn) {
        this.dateValidationTtn = dateValidationTtn;
    }

    public Integer getCodeModReg() {
        return codeModReg;
    }

    public void setCodeModReg(Integer codeModReg) {
        this.codeModReg = codeModReg;
    }

    public Integer getCodeDelReg() {
        return codeDelReg;
    }

    public void setCodeDelReg(Integer codeDelReg) {
        this.codeDelReg = codeDelReg;
    }

    public Integer getCodeAgenceBct() {
        return codeAgenceBct;
    }

    public void setCodeAgenceBct(Integer codeAgenceBct) {
        this.codeAgenceBct = codeAgenceBct;
    }

    public String getRacineCompte() {
        return racineCompte;
    }

    public void setRacineCompte(String racineCompte) {
        this.racineCompte = racineCompte;
    }

    public Integer getCleRib() {
        return cleRib;
    }

    public void setCleRib(Integer cleRib) {
        this.cleRib = cleRib;
    }

    public Date getDateTirage() {
        return dateTirage;
    }

    public void setDateTirage(Date dateTirage) {
        this.dateTirage = dateTirage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imageDepotDomiciliationPK != null ? imageDepotDomiciliationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageDepotDomiciliation)) {
            return false;
        }
        ImageDepotDomiciliation other = (ImageDepotDomiciliation) object;
        if ((this.imageDepotDomiciliationPK == null && other.imageDepotDomiciliationPK != null) || (this.imageDepotDomiciliationPK != null && !this.imageDepotDomiciliationPK.equals(other.imageDepotDomiciliationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ImageDepotDomiciliation[ imageDepotDomiciliationPK=" + imageDepotDomiciliationPK + " ]";
    }
    
}
