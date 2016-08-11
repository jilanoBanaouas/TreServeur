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
@Table(name = "REGLEMENT", catalog = "", schema = "TRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reglement.findAll", query = "SELECT r FROM Reglement r"),
    @NamedQuery(name = "Reglement.findByCodeProduitService", query = "SELECT r FROM Reglement r WHERE r.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "Reglement.findByCodeOperation", query = "SELECT r FROM Reglement r WHERE r.codeOperation = :codeOperation"),
    @NamedQuery(name = "Reglement.findByRefOperation", query = "SELECT r FROM Reglement r WHERE r.refOperation = :refOperation"),
    @NamedQuery(name = "Reglement.findByDateOperation", query = "SELECT r FROM Reglement r WHERE r.dateOperation = :dateOperation"),
    @NamedQuery(name = "Reglement.findByNumDossier", query = "SELECT r FROM Reglement r WHERE r.numDossier = :numDossier"),
    @NamedQuery(name = "Reglement.findByTypeDossier", query = "SELECT r FROM Reglement r WHERE r.typeDossier = :typeDossier"),
    @NamedQuery(name = "Reglement.findByDateDossier", query = "SELECT r FROM Reglement r WHERE r.dateDossier = :dateDossier"),
    @NamedQuery(name = "Reglement.findByCodeService", query = "SELECT r FROM Reglement r WHERE r.codeService = :codeService"),
    @NamedQuery(name = "Reglement.findByDateJournee", query = "SELECT r FROM Reglement r WHERE r.dateJournee = :dateJournee"),
    @NamedQuery(name = "Reglement.findByRefOrdre", query = "SELECT r FROM Reglement r WHERE r.refOrdre = :refOrdre"),
    @NamedQuery(name = "Reglement.findByDateOrdre", query = "SELECT r FROM Reglement r WHERE r.dateOrdre = :dateOrdre"),
    @NamedQuery(name = "Reglement.findByCodeDeviseOrdre", query = "SELECT r FROM Reglement r WHERE r.codeDeviseOrdre = :codeDeviseOrdre"),
    @NamedQuery(name = "Reglement.findByCodeDevise", query = "SELECT r FROM Reglement r WHERE r.codeDevise = :codeDevise"),
    @NamedQuery(name = "Reglement.findByMntDevise", query = "SELECT r FROM Reglement r WHERE r.mntDevise = :mntDevise"),
    @NamedQuery(name = "Reglement.findByComInclus", query = "SELECT r FROM Reglement r WHERE r.comInclus = :comInclus"),
    @NamedQuery(name = "Reglement.findByCoursConversion", query = "SELECT r FROM Reglement r WHERE r.coursConversion = :coursConversion"),
    @NamedQuery(name = "Reglement.findByTypePieceClient", query = "SELECT r FROM Reglement r WHERE r.typePieceClient = :typePieceClient"),
    @NamedQuery(name = "Reglement.findByNoPieceClient", query = "SELECT r FROM Reglement r WHERE r.noPieceClient = :noPieceClient"),
    @NamedQuery(name = "Reglement.findByCodeAgenceBct", query = "SELECT r FROM Reglement r WHERE r.codeAgenceBct = :codeAgenceBct"),
    @NamedQuery(name = "Reglement.findByRacineCompte", query = "SELECT r FROM Reglement r WHERE r.racineCompte = :racineCompte"),
    @NamedQuery(name = "Reglement.findByCleRib", query = "SELECT r FROM Reglement r WHERE r.cleRib = :cleRib"),
    @NamedQuery(name = "Reglement.findByTauxCompte", query = "SELECT r FROM Reglement r WHERE r.tauxCompte = :tauxCompte"),
    @NamedQuery(name = "Reglement.findByMntCompte", query = "SELECT r FROM Reglement r WHERE r.mntCompte = :mntCompte"),
    @NamedQuery(name = "Reglement.findByCodeAgenceBctProfess", query = "SELECT r FROM Reglement r WHERE r.codeAgenceBctProfess = :codeAgenceBctProfess"),
    @NamedQuery(name = "Reglement.findByRacineCompteProfess", query = "SELECT r FROM Reglement r WHERE r.racineCompteProfess = :racineCompteProfess"),
    @NamedQuery(name = "Reglement.findByCleRibProfess", query = "SELECT r FROM Reglement r WHERE r.cleRibProfess = :cleRibProfess"),
    @NamedQuery(name = "Reglement.findByTauxCompteProfess", query = "SELECT r FROM Reglement r WHERE r.tauxCompteProfess = :tauxCompteProfess"),
    @NamedQuery(name = "Reglement.findByMntCompteProfess", query = "SELECT r FROM Reglement r WHERE r.mntCompteProfess = :mntCompteProfess"),
    @NamedQuery(name = "Reglement.findByNomDonneurOrdre", query = "SELECT r FROM Reglement r WHERE r.nomDonneurOrdre = :nomDonneurOrdre"),
    @NamedQuery(name = "Reglement.findByAdr1DonneurOrdre", query = "SELECT r FROM Reglement r WHERE r.adr1DonneurOrdre = :adr1DonneurOrdre"),
    @NamedQuery(name = "Reglement.findByAdr2DonneurOrdre", query = "SELECT r FROM Reglement r WHERE r.adr2DonneurOrdre = :adr2DonneurOrdre"),
    @NamedQuery(name = "Reglement.findByCodePaysDo", query = "SELECT r FROM Reglement r WHERE r.codePaysDo = :codePaysDo"),
    @NamedQuery(name = "Reglement.findByCodePostalDo", query = "SELECT r FROM Reglement r WHERE r.codePostalDo = :codePostalDo"),
    @NamedQuery(name = "Reglement.findByLibellePostalDo", query = "SELECT r FROM Reglement r WHERE r.libellePostalDo = :libellePostalDo"),
    @NamedQuery(name = "Reglement.findByBanqueNegociation", query = "SELECT r FROM Reglement r WHERE r.banqueNegociation = :banqueNegociation"),
    @NamedQuery(name = "Reglement.findByMntNegociationBaq", query = "SELECT r FROM Reglement r WHERE r.mntNegociationBaq = :mntNegociationBaq"),
    @NamedQuery(name = "Reglement.findByMntNegociation", query = "SELECT r FROM Reglement r WHERE r.mntNegociation = :mntNegociation"),
    @NamedQuery(name = "Reglement.findByCoursNegociation", query = "SELECT r FROM Reglement r WHERE r.coursNegociation = :coursNegociation"),
    @NamedQuery(name = "Reglement.findByFinancement", query = "SELECT r FROM Reglement r WHERE r.financement = :financement"),
    @NamedQuery(name = "Reglement.findByMntFinancement", query = "SELECT r FROM Reglement r WHERE r.mntFinancement = :mntFinancement"),
    @NamedQuery(name = "Reglement.findByRefFinancement", query = "SELECT r FROM Reglement r WHERE r.refFinancement = :refFinancement"),
    @NamedQuery(name = "Reglement.findByAchatATerme", query = "SELECT r FROM Reglement r WHERE r.achatATerme = :achatATerme"),
    @NamedQuery(name = "Reglement.findByMntAchatATerme", query = "SELECT r FROM Reglement r WHERE r.mntAchatATerme = :mntAchatATerme"),
    @NamedQuery(name = "Reglement.findByCoursAchatATerme", query = "SELECT r FROM Reglement r WHERE r.coursAchatATerme = :coursAchatATerme"),
    @NamedQuery(name = "Reglement.findByNomBeneficiaire", query = "SELECT r FROM Reglement r WHERE r.nomBeneficiaire = :nomBeneficiaire"),
    @NamedQuery(name = "Reglement.findByAdresseBeneficiaire", query = "SELECT r FROM Reglement r WHERE r.adresseBeneficiaire = :adresseBeneficiaire"),
    @NamedQuery(name = "Reglement.findByAdresseBeneficiaire2", query = "SELECT r FROM Reglement r WHERE r.adresseBeneficiaire2 = :adresseBeneficiaire2"),
    @NamedQuery(name = "Reglement.findByAdresseBeneficiaire3", query = "SELECT r FROM Reglement r WHERE r.adresseBeneficiaire3 = :adresseBeneficiaire3"),
    @NamedQuery(name = "Reglement.findByCompteBeneficiaire", query = "SELECT r FROM Reglement r WHERE r.compteBeneficiaire = :compteBeneficiaire"),
    @NamedQuery(name = "Reglement.findByCompteBenefDinarise", query = "SELECT r FROM Reglement r WHERE r.compteBenefDinarise = :compteBenefDinarise"),
    @NamedQuery(name = "Reglement.findByCodePaysBenef", query = "SELECT r FROM Reglement r WHERE r.codePaysBenef = :codePaysBenef"),
    @NamedQuery(name = "Reglement.findByCodeBnqDom", query = "SELECT r FROM Reglement r WHERE r.codeBnqDom = :codeBnqDom"),
    @NamedQuery(name = "Reglement.findByCodeAgcBnqDom", query = "SELECT r FROM Reglement r WHERE r.codeAgcBnqDom = :codeAgcBnqDom"),
    @NamedQuery(name = "Reglement.findByCptBnqDom", query = "SELECT r FROM Reglement r WHERE r.cptBnqDom = :cptBnqDom"),
    @NamedQuery(name = "Reglement.findByNomBnqDom", query = "SELECT r FROM Reglement r WHERE r.nomBnqDom = :nomBnqDom"),
    @NamedQuery(name = "Reglement.findByNomBnqDom2", query = "SELECT r FROM Reglement r WHERE r.nomBnqDom2 = :nomBnqDom2"),
    @NamedQuery(name = "Reglement.findByNomBnqDom3", query = "SELECT r FROM Reglement r WHERE r.nomBnqDom3 = :nomBnqDom3"),
    @NamedQuery(name = "Reglement.findByNomBnqDom4", query = "SELECT r FROM Reglement r WHERE r.nomBnqDom4 = :nomBnqDom4"),
    @NamedQuery(name = "Reglement.findByTypeOperation", query = "SELECT r FROM Reglement r WHERE r.typeOperation = :typeOperation"),
    @NamedQuery(name = "Reglement.findByCodeTitre", query = "SELECT r FROM Reglement r WHERE r.codeTitre = :codeTitre"),
    @NamedQuery(name = "Reglement.findByNoFiche", query = "SELECT r FROM Reglement r WHERE r.noFiche = :noFiche"),
    @NamedQuery(name = "Reglement.findByDateFiche", query = "SELECT r FROM Reglement r WHERE r.dateFiche = :dateFiche"),
    @NamedQuery(name = "Reglement.findByCodeDeviseFiche", query = "SELECT r FROM Reglement r WHERE r.codeDeviseFiche = :codeDeviseFiche"),
    @NamedQuery(name = "Reglement.findByMntFiche", query = "SELECT r FROM Reglement r WHERE r.mntFiche = :mntFiche"),
    @NamedQuery(name = "Reglement.findByNatureOprFiche", query = "SELECT r FROM Reglement r WHERE r.natureOprFiche = :natureOprFiche"),
    @NamedQuery(name = "Reglement.findByNumIdentite", query = "SELECT r FROM Reglement r WHERE r.numIdentite = :numIdentite"),
    @NamedQuery(name = "Reglement.findByOperateur", query = "SELECT r FROM Reglement r WHERE r.operateur = :operateur"),
    @NamedQuery(name = "Reglement.findByMotifOperation", query = "SELECT r FROM Reglement r WHERE r.motifOperation = :motifOperation"),
    @NamedQuery(name = "Reglement.findByMotifOperationSuite", query = "SELECT r FROM Reglement r WHERE r.motifOperationSuite = :motifOperationSuite"),
    @NamedQuery(name = "Reglement.findByFraisCharge", query = "SELECT r FROM Reglement r WHERE r.fraisCharge = :fraisCharge"),
    @NamedQuery(name = "Reglement.findByMt100", query = "SELECT r FROM Reglement r WHERE r.mt100 = :mt100"),
    @NamedQuery(name = "Reglement.findByMt202", query = "SELECT r FROM Reglement r WHERE r.mt202 = :mt202"),
    @NamedQuery(name = "Reglement.findByMt199", query = "SELECT r FROM Reglement r WHERE r.mt199 = :mt199"),
    @NamedQuery(name = "Reglement.findBySgmt", query = "SELECT r FROM Reglement r WHERE r.sgmt = :sgmt"),
    @NamedQuery(name = "Reglement.findByTelecomp", query = "SELECT r FROM Reglement r WHERE r.telecomp = :telecomp"),
    @NamedQuery(name = "Reglement.findByCheque", query = "SELECT r FROM Reglement r WHERE r.cheque = :cheque"),
    @NamedQuery(name = "Reglement.findByNumCheque", query = "SELECT r FROM Reglement r WHERE r.numCheque = :numCheque"),
    @NamedQuery(name = "Reglement.findByTypeBnqBenef", query = "SELECT r FROM Reglement r WHERE r.typeBnqBenef = :typeBnqBenef"),
    @NamedQuery(name = "Reglement.findByCodeBnqBenef", query = "SELECT r FROM Reglement r WHERE r.codeBnqBenef = :codeBnqBenef"),
    @NamedQuery(name = "Reglement.findByCodeAgcBnqBenef", query = "SELECT r FROM Reglement r WHERE r.codeAgcBnqBenef = :codeAgcBnqBenef"),
    @NamedQuery(name = "Reglement.findByNomBnqBenef", query = "SELECT r FROM Reglement r WHERE r.nomBnqBenef = :nomBnqBenef"),
    @NamedQuery(name = "Reglement.findByCodeBnqDest", query = "SELECT r FROM Reglement r WHERE r.codeBnqDest = :codeBnqDest"),
    @NamedQuery(name = "Reglement.findByCodeAgcBnqDest", query = "SELECT r FROM Reglement r WHERE r.codeAgcBnqDest = :codeAgcBnqDest"),
    @NamedQuery(name = "Reglement.findByNomBnqDest", query = "SELECT r FROM Reglement r WHERE r.nomBnqDest = :nomBnqDest"),
    @NamedQuery(name = "Reglement.findByCodeBnqExp", query = "SELECT r FROM Reglement r WHERE r.codeBnqExp = :codeBnqExp"),
    @NamedQuery(name = "Reglement.findByCodeAgcBnqExp", query = "SELECT r FROM Reglement r WHERE r.codeAgcBnqExp = :codeAgcBnqExp"),
    @NamedQuery(name = "Reglement.findByNomBnqExp", query = "SELECT r FROM Reglement r WHERE r.nomBnqExp = :nomBnqExp"),
    @NamedQuery(name = "Reglement.findByCodeBnqInter", query = "SELECT r FROM Reglement r WHERE r.codeBnqInter = :codeBnqInter"),
    @NamedQuery(name = "Reglement.findByCodeAgcBnqInter", query = "SELECT r FROM Reglement r WHERE r.codeAgcBnqInter = :codeAgcBnqInter"),
    @NamedQuery(name = "Reglement.findByNomBnqInter", query = "SELECT r FROM Reglement r WHERE r.nomBnqInter = :nomBnqInter"),
    @NamedQuery(name = "Reglement.findByCodeBnqCrp", query = "SELECT r FROM Reglement r WHERE r.codeBnqCrp = :codeBnqCrp"),
    @NamedQuery(name = "Reglement.findByCodeAgcBnqCrp", query = "SELECT r FROM Reglement r WHERE r.codeAgcBnqCrp = :codeAgcBnqCrp"),
    @NamedQuery(name = "Reglement.findByInformationBanque", query = "SELECT r FROM Reglement r WHERE r.informationBanque = :informationBanque"),
    @NamedQuery(name = "Reglement.findByInformationBanque199", query = "SELECT r FROM Reglement r WHERE r.informationBanque199 = :informationBanque199"),
    @NamedQuery(name = "Reglement.findByDateAchat", query = "SELECT r FROM Reglement r WHERE r.dateAchat = :dateAchat"),
    @NamedQuery(name = "Reglement.findByDateCreditCrp", query = "SELECT r FROM Reglement r WHERE r.dateCreditCrp = :dateCreditCrp"),
    @NamedQuery(name = "Reglement.findByDateDebitClient", query = "SELECT r FROM Reglement r WHERE r.dateDebitClient = :dateDebitClient"),
    @NamedQuery(name = "Reglement.findByMntCommission", query = "SELECT r FROM Reglement r WHERE r.mntCommission = :mntCommission"),
    @NamedQuery(name = "Reglement.findByMntBlocage", query = "SELECT r FROM Reglement r WHERE r.mntBlocage = :mntBlocage"),
    @NamedQuery(name = "Reglement.findByDossierWeb", query = "SELECT r FROM Reglement r WHERE r.dossierWeb = :dossierWeb"),
    @NamedQuery(name = "Reglement.findByMatEmp", query = "SELECT r FROM Reglement r WHERE r.matEmp = :matEmp"),
    @NamedQuery(name = "Reglement.findByStatus", query = "SELECT r FROM Reglement r WHERE r.status = :status"),
    @NamedQuery(name = "Reglement.findByDateValidation", query = "SELECT r FROM Reglement r WHERE r.dateValidation = :dateValidation"),
    @NamedQuery(name = "Reglement.findByEtatDossier", query = "SELECT r FROM Reglement r WHERE r.etatDossier = :etatDossier"),
    @NamedQuery(name = "Reglement.findByAvisSiege", query = "SELECT r FROM Reglement r WHERE r.avisSiege = :avisSiege"),
    @NamedQuery(name = "Reglement.findByTraite", query = "SELECT r FROM Reglement r WHERE r.traite = :traite"),
    @NamedQuery(name = "Reglement.findBySwiftGenerer", query = "SELECT r FROM Reglement r WHERE r.swiftGenerer = :swiftGenerer"),
    @NamedQuery(name = "Reglement.findByDomiciliationBp", query = "SELECT r FROM Reglement r WHERE r.domiciliationBp = :domiciliationBp"),
    @NamedQuery(name = "Reglement.findByRefBlocage", query = "SELECT r FROM Reglement r WHERE r.refBlocage = :refBlocage"),
    @NamedQuery(name = "Reglement.findByRefBlocageCle", query = "SELECT r FROM Reglement r WHERE r.refBlocageCle = :refBlocageCle"),
    @NamedQuery(name = "Reglement.findByCompteCom", query = "SELECT r FROM Reglement r WHERE r.compteCom = :compteCom"),
    @NamedQuery(name = "Reglement.findByMc202", query = "SELECT r FROM Reglement r WHERE r.mc202 = :mc202")})
public class Reglement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;
    @Column(name = "CODE_OPERATION")
    private Short codeOperation;
    @Column(name = "REF_OPERATION")
    private Long refOperation;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.DATE)
    private Date dateOperation;
    @Column(name = "NUM_DOSSIER")
    private Long numDossier;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.DATE)
    private Date dateDossier;
    @Column(name = "CODE_SERVICE")
    private Short codeService;
    @Column(name = "DATE_JOURNEE")
    @Temporal(TemporalType.DATE)
    private Date dateJournee;
    @Size(max = 16)
    @Column(name = "REF_ORDRE")
    private String refOrdre;
    @Column(name = "DATE_ORDRE")
    @Temporal(TemporalType.DATE)
    private Date dateOrdre;
    @Column(name = "CODE_DEVISE_ORDRE")
    private Short codeDeviseOrdre;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MNT_DEVISE")
    private BigDecimal mntDevise;
    @Size(max = 1)
    @Column(name = "COM_INCLUS")
    private String comInclus;
    @Column(name = "COURS_CONVERSION")
    private BigDecimal coursConversion;
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
    @Column(name = "TAUX_COMPTE")
    private BigDecimal tauxCompte;
    @Column(name = "MNT_COMPTE")
    private BigDecimal mntCompte;
    @Column(name = "CODE_AGENCE_BCT_PROFESS")
    private Short codeAgenceBctProfess;
    @Size(max = 13)
    @Column(name = "RACINE_COMPTE_PROFESS")
    private String racineCompteProfess;
    @Column(name = "CLE_RIB_PROFESS")
    private Short cleRibProfess;
    @Column(name = "TAUX_COMPTE_PROFESS")
    private BigDecimal tauxCompteProfess;
    @Column(name = "MNT_COMPTE_PROFESS")
    private BigDecimal mntCompteProfess;
    @Size(max = 35)
    @Column(name = "NOM_DONNEUR_ORDRE")
    private String nomDonneurOrdre;
    @Size(max = 35)
    @Column(name = "ADR1_DONNEUR_ORDRE")
    private String adr1DonneurOrdre;
    @Size(max = 35)
    @Column(name = "ADR2_DONNEUR_ORDRE")
    private String adr2DonneurOrdre;
    @Column(name = "CODE_PAYS_DO")
    private Short codePaysDo;
    @Column(name = "CODE_POSTAL_DO")
    private Short codePostalDo;
    @Size(max = 30)
    @Column(name = "LIBELLE_POSTAL_DO")
    private String libellePostalDo;
    @Size(max = 1)
    @Column(name = "BANQUE_NEGOCIATION")
    private String banqueNegociation;
    @Column(name = "MNT_NEGOCIATION_BAQ")
    private BigDecimal mntNegociationBaq;
    @Column(name = "MNT_NEGOCIATION")
    private BigDecimal mntNegociation;
    @Column(name = "COURS_NEGOCIATION")
    private BigDecimal coursNegociation;
    @Size(max = 1)
    @Column(name = "FINANCEMENT")
    private String financement;
    @Column(name = "MNT_FINANCEMENT")
    private BigDecimal mntFinancement;
    @Size(max = 20)
    @Column(name = "REF_FINANCEMENT")
    private String refFinancement;
    @Size(max = 1)
    @Column(name = "ACHAT_A_TERME")
    private String achatATerme;
    @Column(name = "MNT_ACHAT_A_TERME")
    private BigDecimal mntAchatATerme;
    @Column(name = "COURS_ACHAT_A_TERME")
    private BigDecimal coursAchatATerme;
    @Size(max = 35)
    @Column(name = "NOM_BENEFICIAIRE")
    private String nomBeneficiaire;
    @Size(max = 35)
    @Column(name = "ADRESSE_BENEFICIAIRE")
    private String adresseBeneficiaire;
    @Size(max = 35)
    @Column(name = "ADRESSE_BENEFICIAIRE2")
    private String adresseBeneficiaire2;
    @Size(max = 35)
    @Column(name = "ADRESSE_BENEFICIAIRE3")
    private String adresseBeneficiaire3;
    @Size(max = 34)
    @Column(name = "COMPTE_BENEFICIAIRE")
    private String compteBeneficiaire;
    @Size(max = 1)
    @Column(name = "COMPTE_BENEF_DINARISE")
    private String compteBenefDinarise;
    @Column(name = "CODE_PAYS_BENEF")
    private Short codePaysBenef;
    @Column(name = "CODE_BNQ_DOM")
    private Integer codeBnqDom;
    @Column(name = "CODE_AGC_BNQ_DOM")
    private Short codeAgcBnqDom;
    @Size(max = 34)
    @Column(name = "CPT_BNQ_DOM")
    private String cptBnqDom;
    @Size(max = 35)
    @Column(name = "NOM_BNQ_DOM")
    private String nomBnqDom;
    @Size(max = 35)
    @Column(name = "NOM_BNQ_DOM2")
    private String nomBnqDom2;
    @Size(max = 35)
    @Column(name = "NOM_BNQ_DOM3")
    private String nomBnqDom3;
    @Size(max = 35)
    @Column(name = "NOM_BNQ_DOM4")
    private String nomBnqDom4;
    @Size(max = 1)
    @Column(name = "TYPE_OPERATION")
    private String typeOperation;
    @Column(name = "CODE_TITRE")
    private Short codeTitre;
    @Column(name = "NO_FICHE")
    private Integer noFiche;
    @Column(name = "DATE_FICHE")
    @Temporal(TemporalType.DATE)
    private Date dateFiche;
    @Column(name = "CODE_DEVISE_FICHE")
    private Short codeDeviseFiche;
    @Column(name = "MNT_FICHE")
    private BigDecimal mntFiche;
    @Size(max = 4)
    @Column(name = "NATURE_OPR_FICHE")
    private String natureOprFiche;
    @Size(max = 20)
    @Column(name = "NUM_IDENTITE")
    private String numIdentite;
    @Size(max = 15)
    @Column(name = "OPERATEUR")
    private String operateur;
    @Size(max = 200)
    @Column(name = "MOTIF_OPERATION")
    private String motifOperation;
    @Size(max = 100)
    @Column(name = "MOTIF_OPERATION_SUITE")
    private String motifOperationSuite;
    @Size(max = 3)
    @Column(name = "FRAIS_CHARGE")
    private String fraisCharge;
    @Size(max = 1)
    @Column(name = "MT100")
    private String mt100;
    @Size(max = 1)
    @Column(name = "MT202")
    private String mt202;
    @Size(max = 1)
    @Column(name = "MT199")
    private String mt199;
    @Size(max = 1)
    @Column(name = "SGMT")
    private String sgmt;
    @Size(max = 1)
    @Column(name = "TELECOMP")
    private String telecomp;
    @Size(max = 1)
    @Column(name = "CHEQUE")
    private String cheque;
    @Size(max = 15)
    @Column(name = "NUM_CHEQUE")
    private String numCheque;
    @Size(max = 1)
    @Column(name = "TYPE_BNQ_BENEF")
    private String typeBnqBenef;
    @Column(name = "CODE_BNQ_BENEF")
    private Integer codeBnqBenef;
    @Column(name = "CODE_AGC_BNQ_BENEF")
    private Integer codeAgcBnqBenef;
    @Size(max = 100)
    @Column(name = "NOM_BNQ_BENEF")
    private String nomBnqBenef;
    @Column(name = "CODE_BNQ_DEST")
    private Integer codeBnqDest;
    @Column(name = "CODE_AGC_BNQ_DEST")
    private Short codeAgcBnqDest;
    @Size(max = 100)
    @Column(name = "NOM_BNQ_DEST")
    private String nomBnqDest;
    @Column(name = "CODE_BNQ_EXP")
    private Integer codeBnqExp;
    @Column(name = "CODE_AGC_BNQ_EXP")
    private Short codeAgcBnqExp;
    @Size(max = 100)
    @Column(name = "NOM_BNQ_EXP")
    private String nomBnqExp;
    @Column(name = "CODE_BNQ_INTER")
    private Integer codeBnqInter;
    @Column(name = "CODE_AGC_BNQ_INTER")
    private Short codeAgcBnqInter;
    @Size(max = 100)
    @Column(name = "NOM_BNQ_INTER")
    private String nomBnqInter;
    @Column(name = "CODE_BNQ_CRP")
    private Integer codeBnqCrp;
    @Column(name = "CODE_AGC_BNQ_CRP")
    private Short codeAgcBnqCrp;
    @Size(max = 1000)
    @Column(name = "INFORMATION_BANQUE")
    private String informationBanque;
    @Size(max = 1000)
    @Column(name = "INFORMATION_BANQUE_199")
    private String informationBanque199;
    @Column(name = "DATE_ACHAT")
    @Temporal(TemporalType.DATE)
    private Date dateAchat;
    @Column(name = "DATE_CREDIT_CRP")
    @Temporal(TemporalType.DATE)
    private Date dateCreditCrp;
    @Column(name = "DATE_DEBIT_CLIENT")
    @Temporal(TemporalType.DATE)
    private Date dateDebitClient;
    @Column(name = "MNT_COMMISSION")
    private BigDecimal mntCommission;
    @Column(name = "MNT_BLOCAGE")
    private BigDecimal mntBlocage;
    @Size(max = 1)
    @Column(name = "DOSSIER_WEB")
    private String dossierWeb;
    @Size(max = 5)
    @Column(name = "MAT_EMP")
    private String matEmp;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE_VALIDATION")
    @Temporal(TemporalType.DATE)
    private Date dateValidation;
    @Size(max = 1)
    @Column(name = "ETAT_DOSSIER")
    private String etatDossier;
    @Size(max = 200)
    @Column(name = "AVIS_SIEGE")
    private String avisSiege;
    @Size(max = 1)
    @Column(name = "TRAITE")
    private String traite;
    @Size(max = 1)
    @Column(name = "SWIFT_GENERER")
    private String swiftGenerer;
    @Size(max = 1)
    @Column(name = "DOMICILIATION_BP")
    private String domiciliationBp;
    @Column(name = "REF_BLOCAGE")
    private Integer refBlocage;
    @Column(name = "REF_BLOCAGE_CLE")
    private Short refBlocageCle;
    @Column(name = "COMPTE_COM")
    private Short compteCom;
    @Size(max = 1)
    @Column(name = "MC202")
    private String mc202;

    public Reglement() {
    }

    public Reglement(Short codeProduitService) {
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

    public Long getRefOperation() {
        return refOperation;
    }

    public void setRefOperation(Long refOperation) {
        this.refOperation = refOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public Long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Long numDossier) {
        this.numDossier = numDossier;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public Date getDateDossier() {
        return dateDossier;
    }

    public void setDateDossier(Date dateDossier) {
        this.dateDossier = dateDossier;
    }

    public Short getCodeService() {
        return codeService;
    }

    public void setCodeService(Short codeService) {
        this.codeService = codeService;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
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

    public String getComInclus() {
        return comInclus;
    }

    public void setComInclus(String comInclus) {
        this.comInclus = comInclus;
    }

    public BigDecimal getCoursConversion() {
        return coursConversion;
    }

    public void setCoursConversion(BigDecimal coursConversion) {
        this.coursConversion = coursConversion;
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

    public BigDecimal getTauxCompte() {
        return tauxCompte;
    }

    public void setTauxCompte(BigDecimal tauxCompte) {
        this.tauxCompte = tauxCompte;
    }

    public BigDecimal getMntCompte() {
        return mntCompte;
    }

    public void setMntCompte(BigDecimal mntCompte) {
        this.mntCompte = mntCompte;
    }

    public Short getCodeAgenceBctProfess() {
        return codeAgenceBctProfess;
    }

    public void setCodeAgenceBctProfess(Short codeAgenceBctProfess) {
        this.codeAgenceBctProfess = codeAgenceBctProfess;
    }

    public String getRacineCompteProfess() {
        return racineCompteProfess;
    }

    public void setRacineCompteProfess(String racineCompteProfess) {
        this.racineCompteProfess = racineCompteProfess;
    }

    public Short getCleRibProfess() {
        return cleRibProfess;
    }

    public void setCleRibProfess(Short cleRibProfess) {
        this.cleRibProfess = cleRibProfess;
    }

    public BigDecimal getTauxCompteProfess() {
        return tauxCompteProfess;
    }

    public void setTauxCompteProfess(BigDecimal tauxCompteProfess) {
        this.tauxCompteProfess = tauxCompteProfess;
    }

    public BigDecimal getMntCompteProfess() {
        return mntCompteProfess;
    }

    public void setMntCompteProfess(BigDecimal mntCompteProfess) {
        this.mntCompteProfess = mntCompteProfess;
    }

    public String getNomDonneurOrdre() {
        return nomDonneurOrdre;
    }

    public void setNomDonneurOrdre(String nomDonneurOrdre) {
        this.nomDonneurOrdre = nomDonneurOrdre;
    }

    public String getAdr1DonneurOrdre() {
        return adr1DonneurOrdre;
    }

    public void setAdr1DonneurOrdre(String adr1DonneurOrdre) {
        this.adr1DonneurOrdre = adr1DonneurOrdre;
    }

    public String getAdr2DonneurOrdre() {
        return adr2DonneurOrdre;
    }

    public void setAdr2DonneurOrdre(String adr2DonneurOrdre) {
        this.adr2DonneurOrdre = adr2DonneurOrdre;
    }

    public Short getCodePaysDo() {
        return codePaysDo;
    }

    public void setCodePaysDo(Short codePaysDo) {
        this.codePaysDo = codePaysDo;
    }

    public Short getCodePostalDo() {
        return codePostalDo;
    }

    public void setCodePostalDo(Short codePostalDo) {
        this.codePostalDo = codePostalDo;
    }

    public String getLibellePostalDo() {
        return libellePostalDo;
    }

    public void setLibellePostalDo(String libellePostalDo) {
        this.libellePostalDo = libellePostalDo;
    }

    public String getBanqueNegociation() {
        return banqueNegociation;
    }

    public void setBanqueNegociation(String banqueNegociation) {
        this.banqueNegociation = banqueNegociation;
    }

    public BigDecimal getMntNegociationBaq() {
        return mntNegociationBaq;
    }

    public void setMntNegociationBaq(BigDecimal mntNegociationBaq) {
        this.mntNegociationBaq = mntNegociationBaq;
    }

    public BigDecimal getMntNegociation() {
        return mntNegociation;
    }

    public void setMntNegociation(BigDecimal mntNegociation) {
        this.mntNegociation = mntNegociation;
    }

    public BigDecimal getCoursNegociation() {
        return coursNegociation;
    }

    public void setCoursNegociation(BigDecimal coursNegociation) {
        this.coursNegociation = coursNegociation;
    }

    public String getFinancement() {
        return financement;
    }

    public void setFinancement(String financement) {
        this.financement = financement;
    }

    public BigDecimal getMntFinancement() {
        return mntFinancement;
    }

    public void setMntFinancement(BigDecimal mntFinancement) {
        this.mntFinancement = mntFinancement;
    }

    public String getRefFinancement() {
        return refFinancement;
    }

    public void setRefFinancement(String refFinancement) {
        this.refFinancement = refFinancement;
    }

    public String getAchatATerme() {
        return achatATerme;
    }

    public void setAchatATerme(String achatATerme) {
        this.achatATerme = achatATerme;
    }

    public BigDecimal getMntAchatATerme() {
        return mntAchatATerme;
    }

    public void setMntAchatATerme(BigDecimal mntAchatATerme) {
        this.mntAchatATerme = mntAchatATerme;
    }

    public BigDecimal getCoursAchatATerme() {
        return coursAchatATerme;
    }

    public void setCoursAchatATerme(BigDecimal coursAchatATerme) {
        this.coursAchatATerme = coursAchatATerme;
    }

    public String getNomBeneficiaire() {
        return nomBeneficiaire;
    }

    public void setNomBeneficiaire(String nomBeneficiaire) {
        this.nomBeneficiaire = nomBeneficiaire;
    }

    public String getAdresseBeneficiaire() {
        return adresseBeneficiaire;
    }

    public void setAdresseBeneficiaire(String adresseBeneficiaire) {
        this.adresseBeneficiaire = adresseBeneficiaire;
    }

    public String getAdresseBeneficiaire2() {
        return adresseBeneficiaire2;
    }

    public void setAdresseBeneficiaire2(String adresseBeneficiaire2) {
        this.adresseBeneficiaire2 = adresseBeneficiaire2;
    }

    public String getAdresseBeneficiaire3() {
        return adresseBeneficiaire3;
    }

    public void setAdresseBeneficiaire3(String adresseBeneficiaire3) {
        this.adresseBeneficiaire3 = adresseBeneficiaire3;
    }

    public String getCompteBeneficiaire() {
        return compteBeneficiaire;
    }

    public void setCompteBeneficiaire(String compteBeneficiaire) {
        this.compteBeneficiaire = compteBeneficiaire;
    }

    public String getCompteBenefDinarise() {
        return compteBenefDinarise;
    }

    public void setCompteBenefDinarise(String compteBenefDinarise) {
        this.compteBenefDinarise = compteBenefDinarise;
    }

    public Short getCodePaysBenef() {
        return codePaysBenef;
    }

    public void setCodePaysBenef(Short codePaysBenef) {
        this.codePaysBenef = codePaysBenef;
    }

    public Integer getCodeBnqDom() {
        return codeBnqDom;
    }

    public void setCodeBnqDom(Integer codeBnqDom) {
        this.codeBnqDom = codeBnqDom;
    }

    public Short getCodeAgcBnqDom() {
        return codeAgcBnqDom;
    }

    public void setCodeAgcBnqDom(Short codeAgcBnqDom) {
        this.codeAgcBnqDom = codeAgcBnqDom;
    }

    public String getCptBnqDom() {
        return cptBnqDom;
    }

    public void setCptBnqDom(String cptBnqDom) {
        this.cptBnqDom = cptBnqDom;
    }

    public String getNomBnqDom() {
        return nomBnqDom;
    }

    public void setNomBnqDom(String nomBnqDom) {
        this.nomBnqDom = nomBnqDom;
    }

    public String getNomBnqDom2() {
        return nomBnqDom2;
    }

    public void setNomBnqDom2(String nomBnqDom2) {
        this.nomBnqDom2 = nomBnqDom2;
    }

    public String getNomBnqDom3() {
        return nomBnqDom3;
    }

    public void setNomBnqDom3(String nomBnqDom3) {
        this.nomBnqDom3 = nomBnqDom3;
    }

    public String getNomBnqDom4() {
        return nomBnqDom4;
    }

    public void setNomBnqDom4(String nomBnqDom4) {
        this.nomBnqDom4 = nomBnqDom4;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public Short getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Short codeTitre) {
        this.codeTitre = codeTitre;
    }

    public Integer getNoFiche() {
        return noFiche;
    }

    public void setNoFiche(Integer noFiche) {
        this.noFiche = noFiche;
    }

    public Date getDateFiche() {
        return dateFiche;
    }

    public void setDateFiche(Date dateFiche) {
        this.dateFiche = dateFiche;
    }

    public Short getCodeDeviseFiche() {
        return codeDeviseFiche;
    }

    public void setCodeDeviseFiche(Short codeDeviseFiche) {
        this.codeDeviseFiche = codeDeviseFiche;
    }

    public BigDecimal getMntFiche() {
        return mntFiche;
    }

    public void setMntFiche(BigDecimal mntFiche) {
        this.mntFiche = mntFiche;
    }

    public String getNatureOprFiche() {
        return natureOprFiche;
    }

    public void setNatureOprFiche(String natureOprFiche) {
        this.natureOprFiche = natureOprFiche;
    }

    public String getNumIdentite() {
        return numIdentite;
    }

    public void setNumIdentite(String numIdentite) {
        this.numIdentite = numIdentite;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getMotifOperation() {
        return motifOperation;
    }

    public void setMotifOperation(String motifOperation) {
        this.motifOperation = motifOperation;
    }

    public String getMotifOperationSuite() {
        return motifOperationSuite;
    }

    public void setMotifOperationSuite(String motifOperationSuite) {
        this.motifOperationSuite = motifOperationSuite;
    }

    public String getFraisCharge() {
        return fraisCharge;
    }

    public void setFraisCharge(String fraisCharge) {
        this.fraisCharge = fraisCharge;
    }

    public String getMt100() {
        return mt100;
    }

    public void setMt100(String mt100) {
        this.mt100 = mt100;
    }

    public String getMt202() {
        return mt202;
    }

    public void setMt202(String mt202) {
        this.mt202 = mt202;
    }

    public String getMt199() {
        return mt199;
    }

    public void setMt199(String mt199) {
        this.mt199 = mt199;
    }

    public String getSgmt() {
        return sgmt;
    }

    public void setSgmt(String sgmt) {
        this.sgmt = sgmt;
    }

    public String getTelecomp() {
        return telecomp;
    }

    public void setTelecomp(String telecomp) {
        this.telecomp = telecomp;
    }

    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public String getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    public String getTypeBnqBenef() {
        return typeBnqBenef;
    }

    public void setTypeBnqBenef(String typeBnqBenef) {
        this.typeBnqBenef = typeBnqBenef;
    }

    public Integer getCodeBnqBenef() {
        return codeBnqBenef;
    }

    public void setCodeBnqBenef(Integer codeBnqBenef) {
        this.codeBnqBenef = codeBnqBenef;
    }

    public Integer getCodeAgcBnqBenef() {
        return codeAgcBnqBenef;
    }

    public void setCodeAgcBnqBenef(Integer codeAgcBnqBenef) {
        this.codeAgcBnqBenef = codeAgcBnqBenef;
    }

    public String getNomBnqBenef() {
        return nomBnqBenef;
    }

    public void setNomBnqBenef(String nomBnqBenef) {
        this.nomBnqBenef = nomBnqBenef;
    }

    public Integer getCodeBnqDest() {
        return codeBnqDest;
    }

    public void setCodeBnqDest(Integer codeBnqDest) {
        this.codeBnqDest = codeBnqDest;
    }

    public Short getCodeAgcBnqDest() {
        return codeAgcBnqDest;
    }

    public void setCodeAgcBnqDest(Short codeAgcBnqDest) {
        this.codeAgcBnqDest = codeAgcBnqDest;
    }

    public String getNomBnqDest() {
        return nomBnqDest;
    }

    public void setNomBnqDest(String nomBnqDest) {
        this.nomBnqDest = nomBnqDest;
    }

    public Integer getCodeBnqExp() {
        return codeBnqExp;
    }

    public void setCodeBnqExp(Integer codeBnqExp) {
        this.codeBnqExp = codeBnqExp;
    }

    public Short getCodeAgcBnqExp() {
        return codeAgcBnqExp;
    }

    public void setCodeAgcBnqExp(Short codeAgcBnqExp) {
        this.codeAgcBnqExp = codeAgcBnqExp;
    }

    public String getNomBnqExp() {
        return nomBnqExp;
    }

    public void setNomBnqExp(String nomBnqExp) {
        this.nomBnqExp = nomBnqExp;
    }

    public Integer getCodeBnqInter() {
        return codeBnqInter;
    }

    public void setCodeBnqInter(Integer codeBnqInter) {
        this.codeBnqInter = codeBnqInter;
    }

    public Short getCodeAgcBnqInter() {
        return codeAgcBnqInter;
    }

    public void setCodeAgcBnqInter(Short codeAgcBnqInter) {
        this.codeAgcBnqInter = codeAgcBnqInter;
    }

    public String getNomBnqInter() {
        return nomBnqInter;
    }

    public void setNomBnqInter(String nomBnqInter) {
        this.nomBnqInter = nomBnqInter;
    }

    public Integer getCodeBnqCrp() {
        return codeBnqCrp;
    }

    public void setCodeBnqCrp(Integer codeBnqCrp) {
        this.codeBnqCrp = codeBnqCrp;
    }

    public Short getCodeAgcBnqCrp() {
        return codeAgcBnqCrp;
    }

    public void setCodeAgcBnqCrp(Short codeAgcBnqCrp) {
        this.codeAgcBnqCrp = codeAgcBnqCrp;
    }

    public String getInformationBanque() {
        return informationBanque;
    }

    public void setInformationBanque(String informationBanque) {
        this.informationBanque = informationBanque;
    }

    public String getInformationBanque199() {
        return informationBanque199;
    }

    public void setInformationBanque199(String informationBanque199) {
        this.informationBanque199 = informationBanque199;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Date getDateCreditCrp() {
        return dateCreditCrp;
    }

    public void setDateCreditCrp(Date dateCreditCrp) {
        this.dateCreditCrp = dateCreditCrp;
    }

    public Date getDateDebitClient() {
        return dateDebitClient;
    }

    public void setDateDebitClient(Date dateDebitClient) {
        this.dateDebitClient = dateDebitClient;
    }

    public BigDecimal getMntCommission() {
        return mntCommission;
    }

    public void setMntCommission(BigDecimal mntCommission) {
        this.mntCommission = mntCommission;
    }

    public BigDecimal getMntBlocage() {
        return mntBlocage;
    }

    public void setMntBlocage(BigDecimal mntBlocage) {
        this.mntBlocage = mntBlocage;
    }

    public String getDossierWeb() {
        return dossierWeb;
    }

    public void setDossierWeb(String dossierWeb) {
        this.dossierWeb = dossierWeb;
    }

    public String getMatEmp() {
        return matEmp;
    }

    public void setMatEmp(String matEmp) {
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

    public String getEtatDossier() {
        return etatDossier;
    }

    public void setEtatDossier(String etatDossier) {
        this.etatDossier = etatDossier;
    }

    public String getAvisSiege() {
        return avisSiege;
    }

    public void setAvisSiege(String avisSiege) {
        this.avisSiege = avisSiege;
    }

    public String getTraite() {
        return traite;
    }

    public void setTraite(String traite) {
        this.traite = traite;
    }

    public String getSwiftGenerer() {
        return swiftGenerer;
    }

    public void setSwiftGenerer(String swiftGenerer) {
        this.swiftGenerer = swiftGenerer;
    }

    public String getDomiciliationBp() {
        return domiciliationBp;
    }

    public void setDomiciliationBp(String domiciliationBp) {
        this.domiciliationBp = domiciliationBp;
    }

    public Integer getRefBlocage() {
        return refBlocage;
    }

    public void setRefBlocage(Integer refBlocage) {
        this.refBlocage = refBlocage;
    }

    public Short getRefBlocageCle() {
        return refBlocageCle;
    }

    public void setRefBlocageCle(Short refBlocageCle) {
        this.refBlocageCle = refBlocageCle;
    }

    public Short getCompteCom() {
        return compteCom;
    }

    public void setCompteCom(Short compteCom) {
        this.compteCom = compteCom;
    }

    public String getMc202() {
        return mc202;
    }

    public void setMc202(String mc202) {
        this.mc202 = mc202;
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
        if (!(object instanceof Reglement)) {
            return false;
        }
        Reglement other = (Reglement) object;
        if ((this.codeProduitService == null && other.codeProduitService != null) || (this.codeProduitService != null && !this.codeProduitService.equals(other.codeProduitService))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Tre.Reglement[ codeProduitService=" + codeProduitService + " ]";
    }
    
}
