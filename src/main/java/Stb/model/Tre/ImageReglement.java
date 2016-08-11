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
@Table(name = "IMAGE_REGLEMENT", catalog = "", schema = "TRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImageReglement.findAll", query = "SELECT i FROM ImageReglement i"),
    @NamedQuery(name = "ImageReglement.findByNumDossier", query = "SELECT i FROM ImageReglement i WHERE i.numDossier = :numDossier"),
    @NamedQuery(name = "ImageReglement.findByDateDossier", query = "SELECT i FROM ImageReglement i WHERE i.dateDossier = :dateDossier"),
    @NamedQuery(name = "ImageReglement.findByTypeDossier", query = "SELECT i FROM ImageReglement i WHERE i.typeDossier = :typeDossier"),
    @NamedQuery(name = "ImageReglement.findByCodeService", query = "SELECT i FROM ImageReglement i WHERE i.codeService = :codeService"),
    @NamedQuery(name = "ImageReglement.findByDateJournee", query = "SELECT i FROM ImageReglement i WHERE i.dateJournee = :dateJournee"),
    @NamedQuery(name = "ImageReglement.findByRefOrdre", query = "SELECT i FROM ImageReglement i WHERE i.refOrdre = :refOrdre"),
    @NamedQuery(name = "ImageReglement.findByDateOrdre", query = "SELECT i FROM ImageReglement i WHERE i.dateOrdre = :dateOrdre"),
    @NamedQuery(name = "ImageReglement.findByCodeDeviseOrdre", query = "SELECT i FROM ImageReglement i WHERE i.codeDeviseOrdre = :codeDeviseOrdre"),
    @NamedQuery(name = "ImageReglement.findByCodeDevise", query = "SELECT i FROM ImageReglement i WHERE i.codeDevise = :codeDevise"),
    @NamedQuery(name = "ImageReglement.findByMntDevise", query = "SELECT i FROM ImageReglement i WHERE i.mntDevise = :mntDevise"),
    @NamedQuery(name = "ImageReglement.findByComInclus", query = "SELECT i FROM ImageReglement i WHERE i.comInclus = :comInclus"),
    @NamedQuery(name = "ImageReglement.findByCoursConversion", query = "SELECT i FROM ImageReglement i WHERE i.coursConversion = :coursConversion"),
    @NamedQuery(name = "ImageReglement.findByTypePieceClient", query = "SELECT i FROM ImageReglement i WHERE i.typePieceClient = :typePieceClient"),
    @NamedQuery(name = "ImageReglement.findByNoPieceClient", query = "SELECT i FROM ImageReglement i WHERE i.noPieceClient = :noPieceClient"),
    @NamedQuery(name = "ImageReglement.findByCodeAgenceBct", query = "SELECT i FROM ImageReglement i WHERE i.codeAgenceBct = :codeAgenceBct"),
    @NamedQuery(name = "ImageReglement.findByRacineCompte", query = "SELECT i FROM ImageReglement i WHERE i.racineCompte = :racineCompte"),
    @NamedQuery(name = "ImageReglement.findByCleRib", query = "SELECT i FROM ImageReglement i WHERE i.cleRib = :cleRib"),
    @NamedQuery(name = "ImageReglement.findByTauxCompte", query = "SELECT i FROM ImageReglement i WHERE i.tauxCompte = :tauxCompte"),
    @NamedQuery(name = "ImageReglement.findByMntCompte", query = "SELECT i FROM ImageReglement i WHERE i.mntCompte = :mntCompte"),
    @NamedQuery(name = "ImageReglement.findByCodeAgenceBctProfess", query = "SELECT i FROM ImageReglement i WHERE i.codeAgenceBctProfess = :codeAgenceBctProfess"),
    @NamedQuery(name = "ImageReglement.findByRacineCompteProfess", query = "SELECT i FROM ImageReglement i WHERE i.racineCompteProfess = :racineCompteProfess"),
    @NamedQuery(name = "ImageReglement.findByCleRibProfess", query = "SELECT i FROM ImageReglement i WHERE i.cleRibProfess = :cleRibProfess"),
    @NamedQuery(name = "ImageReglement.findByTauxCompteProfess", query = "SELECT i FROM ImageReglement i WHERE i.tauxCompteProfess = :tauxCompteProfess"),
    @NamedQuery(name = "ImageReglement.findByMntCompteProfess", query = "SELECT i FROM ImageReglement i WHERE i.mntCompteProfess = :mntCompteProfess"),
    @NamedQuery(name = "ImageReglement.findByNomDonneurOrdre", query = "SELECT i FROM ImageReglement i WHERE i.nomDonneurOrdre = :nomDonneurOrdre"),
    @NamedQuery(name = "ImageReglement.findByAdr1DonneurOrdre", query = "SELECT i FROM ImageReglement i WHERE i.adr1DonneurOrdre = :adr1DonneurOrdre"),
    @NamedQuery(name = "ImageReglement.findByAdr2DonneurOrdre", query = "SELECT i FROM ImageReglement i WHERE i.adr2DonneurOrdre = :adr2DonneurOrdre"),
    @NamedQuery(name = "ImageReglement.findByCodePaysDo", query = "SELECT i FROM ImageReglement i WHERE i.codePaysDo = :codePaysDo"),
    @NamedQuery(name = "ImageReglement.findByCodePostalDo", query = "SELECT i FROM ImageReglement i WHERE i.codePostalDo = :codePostalDo"),
    @NamedQuery(name = "ImageReglement.findByLibellePostalDo", query = "SELECT i FROM ImageReglement i WHERE i.libellePostalDo = :libellePostalDo"),
    @NamedQuery(name = "ImageReglement.findByBanqueNegociation", query = "SELECT i FROM ImageReglement i WHERE i.banqueNegociation = :banqueNegociation"),
    @NamedQuery(name = "ImageReglement.findByMntNegociationBaq", query = "SELECT i FROM ImageReglement i WHERE i.mntNegociationBaq = :mntNegociationBaq"),
    @NamedQuery(name = "ImageReglement.findByMntNegociation", query = "SELECT i FROM ImageReglement i WHERE i.mntNegociation = :mntNegociation"),
    @NamedQuery(name = "ImageReglement.findByCoursNegociation", query = "SELECT i FROM ImageReglement i WHERE i.coursNegociation = :coursNegociation"),
    @NamedQuery(name = "ImageReglement.findByFinancement", query = "SELECT i FROM ImageReglement i WHERE i.financement = :financement"),
    @NamedQuery(name = "ImageReglement.findByMntFinancement", query = "SELECT i FROM ImageReglement i WHERE i.mntFinancement = :mntFinancement"),
    @NamedQuery(name = "ImageReglement.findByRefFinancement", query = "SELECT i FROM ImageReglement i WHERE i.refFinancement = :refFinancement"),
    @NamedQuery(name = "ImageReglement.findByAchatATerme", query = "SELECT i FROM ImageReglement i WHERE i.achatATerme = :achatATerme"),
    @NamedQuery(name = "ImageReglement.findByMntAchatATerme", query = "SELECT i FROM ImageReglement i WHERE i.mntAchatATerme = :mntAchatATerme"),
    @NamedQuery(name = "ImageReglement.findByCoursAchatATerme", query = "SELECT i FROM ImageReglement i WHERE i.coursAchatATerme = :coursAchatATerme"),
    @NamedQuery(name = "ImageReglement.findByNomBeneficiaire", query = "SELECT i FROM ImageReglement i WHERE i.nomBeneficiaire = :nomBeneficiaire"),
    @NamedQuery(name = "ImageReglement.findByAdresseBeneficiaire", query = "SELECT i FROM ImageReglement i WHERE i.adresseBeneficiaire = :adresseBeneficiaire"),
    @NamedQuery(name = "ImageReglement.findByAdresseBeneficiaire2", query = "SELECT i FROM ImageReglement i WHERE i.adresseBeneficiaire2 = :adresseBeneficiaire2"),
    @NamedQuery(name = "ImageReglement.findByAdresseBeneficiaire3", query = "SELECT i FROM ImageReglement i WHERE i.adresseBeneficiaire3 = :adresseBeneficiaire3"),
    @NamedQuery(name = "ImageReglement.findByCompteBeneficiaire", query = "SELECT i FROM ImageReglement i WHERE i.compteBeneficiaire = :compteBeneficiaire"),
    @NamedQuery(name = "ImageReglement.findByCompteBenefDinarise", query = "SELECT i FROM ImageReglement i WHERE i.compteBenefDinarise = :compteBenefDinarise"),
    @NamedQuery(name = "ImageReglement.findByCodePaysBenef", query = "SELECT i FROM ImageReglement i WHERE i.codePaysBenef = :codePaysBenef"),
    @NamedQuery(name = "ImageReglement.findByCodeBnqDom", query = "SELECT i FROM ImageReglement i WHERE i.codeBnqDom = :codeBnqDom"),
    @NamedQuery(name = "ImageReglement.findByCodeAgcBnqDom", query = "SELECT i FROM ImageReglement i WHERE i.codeAgcBnqDom = :codeAgcBnqDom"),
    @NamedQuery(name = "ImageReglement.findByCptBnqDom", query = "SELECT i FROM ImageReglement i WHERE i.cptBnqDom = :cptBnqDom"),
    @NamedQuery(name = "ImageReglement.findByNomBnqDom", query = "SELECT i FROM ImageReglement i WHERE i.nomBnqDom = :nomBnqDom"),
    @NamedQuery(name = "ImageReglement.findByNomBnqDom2", query = "SELECT i FROM ImageReglement i WHERE i.nomBnqDom2 = :nomBnqDom2"),
    @NamedQuery(name = "ImageReglement.findByNomBnqDom3", query = "SELECT i FROM ImageReglement i WHERE i.nomBnqDom3 = :nomBnqDom3"),
    @NamedQuery(name = "ImageReglement.findByNomBnqDom4", query = "SELECT i FROM ImageReglement i WHERE i.nomBnqDom4 = :nomBnqDom4"),
    @NamedQuery(name = "ImageReglement.findByTypeOperation", query = "SELECT i FROM ImageReglement i WHERE i.typeOperation = :typeOperation"),
    @NamedQuery(name = "ImageReglement.findByCodeTitre", query = "SELECT i FROM ImageReglement i WHERE i.codeTitre = :codeTitre"),
    @NamedQuery(name = "ImageReglement.findByNoFiche", query = "SELECT i FROM ImageReglement i WHERE i.noFiche = :noFiche"),
    @NamedQuery(name = "ImageReglement.findByDateFiche", query = "SELECT i FROM ImageReglement i WHERE i.dateFiche = :dateFiche"),
    @NamedQuery(name = "ImageReglement.findByCodeDeviseFiche", query = "SELECT i FROM ImageReglement i WHERE i.codeDeviseFiche = :codeDeviseFiche"),
    @NamedQuery(name = "ImageReglement.findByMntFiche", query = "SELECT i FROM ImageReglement i WHERE i.mntFiche = :mntFiche"),
    @NamedQuery(name = "ImageReglement.findByNatureOprFiche", query = "SELECT i FROM ImageReglement i WHERE i.natureOprFiche = :natureOprFiche"),
    @NamedQuery(name = "ImageReglement.findByNumIdentite", query = "SELECT i FROM ImageReglement i WHERE i.numIdentite = :numIdentite"),
    @NamedQuery(name = "ImageReglement.findByOperateur", query = "SELECT i FROM ImageReglement i WHERE i.operateur = :operateur"),
    @NamedQuery(name = "ImageReglement.findByMotifOperation", query = "SELECT i FROM ImageReglement i WHERE i.motifOperation = :motifOperation"),
    @NamedQuery(name = "ImageReglement.findByMotifOperationSuite", query = "SELECT i FROM ImageReglement i WHERE i.motifOperationSuite = :motifOperationSuite"),
    @NamedQuery(name = "ImageReglement.findByFraisCharge", query = "SELECT i FROM ImageReglement i WHERE i.fraisCharge = :fraisCharge"),
    @NamedQuery(name = "ImageReglement.findByMt100", query = "SELECT i FROM ImageReglement i WHERE i.mt100 = :mt100"),
    @NamedQuery(name = "ImageReglement.findByMt202", query = "SELECT i FROM ImageReglement i WHERE i.mt202 = :mt202"),
    @NamedQuery(name = "ImageReglement.findByMt199", query = "SELECT i FROM ImageReglement i WHERE i.mt199 = :mt199"),
    @NamedQuery(name = "ImageReglement.findBySgmt", query = "SELECT i FROM ImageReglement i WHERE i.sgmt = :sgmt"),
    @NamedQuery(name = "ImageReglement.findByTelecomp", query = "SELECT i FROM ImageReglement i WHERE i.telecomp = :telecomp"),
    @NamedQuery(name = "ImageReglement.findByCheque", query = "SELECT i FROM ImageReglement i WHERE i.cheque = :cheque"),
    @NamedQuery(name = "ImageReglement.findByNumCheque", query = "SELECT i FROM ImageReglement i WHERE i.numCheque = :numCheque"),
    @NamedQuery(name = "ImageReglement.findByTypeBnqBenef", query = "SELECT i FROM ImageReglement i WHERE i.typeBnqBenef = :typeBnqBenef"),
    @NamedQuery(name = "ImageReglement.findByCodeBnqBenef", query = "SELECT i FROM ImageReglement i WHERE i.codeBnqBenef = :codeBnqBenef"),
    @NamedQuery(name = "ImageReglement.findByCodeAgcBnqBenef", query = "SELECT i FROM ImageReglement i WHERE i.codeAgcBnqBenef = :codeAgcBnqBenef"),
    @NamedQuery(name = "ImageReglement.findByNomBnqBenef", query = "SELECT i FROM ImageReglement i WHERE i.nomBnqBenef = :nomBnqBenef"),
    @NamedQuery(name = "ImageReglement.findByCodeBnqDest", query = "SELECT i FROM ImageReglement i WHERE i.codeBnqDest = :codeBnqDest"),
    @NamedQuery(name = "ImageReglement.findByCodeAgcBnqDest", query = "SELECT i FROM ImageReglement i WHERE i.codeAgcBnqDest = :codeAgcBnqDest"),
    @NamedQuery(name = "ImageReglement.findByNomBnqDest", query = "SELECT i FROM ImageReglement i WHERE i.nomBnqDest = :nomBnqDest"),
    @NamedQuery(name = "ImageReglement.findByCodeBnqExp", query = "SELECT i FROM ImageReglement i WHERE i.codeBnqExp = :codeBnqExp"),
    @NamedQuery(name = "ImageReglement.findByCodeAgcBnqExp", query = "SELECT i FROM ImageReglement i WHERE i.codeAgcBnqExp = :codeAgcBnqExp"),
    @NamedQuery(name = "ImageReglement.findByNomBnqExp", query = "SELECT i FROM ImageReglement i WHERE i.nomBnqExp = :nomBnqExp"),
    @NamedQuery(name = "ImageReglement.findByCodeBnqInter", query = "SELECT i FROM ImageReglement i WHERE i.codeBnqInter = :codeBnqInter"),
    @NamedQuery(name = "ImageReglement.findByCodeAgcBnqInter", query = "SELECT i FROM ImageReglement i WHERE i.codeAgcBnqInter = :codeAgcBnqInter"),
    @NamedQuery(name = "ImageReglement.findByNomBnqInter", query = "SELECT i FROM ImageReglement i WHERE i.nomBnqInter = :nomBnqInter"),
    @NamedQuery(name = "ImageReglement.findByCodeBnqCrp", query = "SELECT i FROM ImageReglement i WHERE i.codeBnqCrp = :codeBnqCrp"),
    @NamedQuery(name = "ImageReglement.findByCodeAgcBnqCrp", query = "SELECT i FROM ImageReglement i WHERE i.codeAgcBnqCrp = :codeAgcBnqCrp"),
    @NamedQuery(name = "ImageReglement.findByInformationBanque", query = "SELECT i FROM ImageReglement i WHERE i.informationBanque = :informationBanque"),
    @NamedQuery(name = "ImageReglement.findByInformationBanque199", query = "SELECT i FROM ImageReglement i WHERE i.informationBanque199 = :informationBanque199"),
    @NamedQuery(name = "ImageReglement.findByDateAchat", query = "SELECT i FROM ImageReglement i WHERE i.dateAchat = :dateAchat"),
    @NamedQuery(name = "ImageReglement.findByDateCreditCrp", query = "SELECT i FROM ImageReglement i WHERE i.dateCreditCrp = :dateCreditCrp"),
    @NamedQuery(name = "ImageReglement.findByDateDebitClient", query = "SELECT i FROM ImageReglement i WHERE i.dateDebitClient = :dateDebitClient"),
    @NamedQuery(name = "ImageReglement.findByMntCommission", query = "SELECT i FROM ImageReglement i WHERE i.mntCommission = :mntCommission"),
    @NamedQuery(name = "ImageReglement.findByMntBlocage", query = "SELECT i FROM ImageReglement i WHERE i.mntBlocage = :mntBlocage"),
    @NamedQuery(name = "ImageReglement.findByDossierWeb", query = "SELECT i FROM ImageReglement i WHERE i.dossierWeb = :dossierWeb"),
    @NamedQuery(name = "ImageReglement.findByTraite", query = "SELECT i FROM ImageReglement i WHERE i.traite = :traite"),
    @NamedQuery(name = "ImageReglement.findByEtatDossier", query = "SELECT i FROM ImageReglement i WHERE i.etatDossier = :etatDossier"),
    @NamedQuery(name = "ImageReglement.findByAvisSiege", query = "SELECT i FROM ImageReglement i WHERE i.avisSiege = :avisSiege"),
    @NamedQuery(name = "ImageReglement.findBySwiftGenerer", query = "SELECT i FROM ImageReglement i WHERE i.swiftGenerer = :swiftGenerer"),
    @NamedQuery(name = "ImageReglement.findByMntOrdreDvs", query = "SELECT i FROM ImageReglement i WHERE i.mntOrdreDvs = :mntOrdreDvs"),
    @NamedQuery(name = "ImageReglement.findByMntOrdreTnd", query = "SELECT i FROM ImageReglement i WHERE i.mntOrdreTnd = :mntOrdreTnd"),
    @NamedQuery(name = "ImageReglement.findByCours", query = "SELECT i FROM ImageReglement i WHERE i.cours = :cours"),
    @NamedQuery(name = "ImageReglement.findByDateJourneeTelecomp", query = "SELECT i FROM ImageReglement i WHERE i.dateJourneeTelecomp = :dateJourneeTelecomp"),
    @NamedQuery(name = "ImageReglement.findByDomiciliationBp", query = "SELECT i FROM ImageReglement i WHERE i.domiciliationBp = :domiciliationBp"),
    @NamedQuery(name = "ImageReglement.findByRefBlocage", query = "SELECT i FROM ImageReglement i WHERE i.refBlocage = :refBlocage"),
    @NamedQuery(name = "ImageReglement.findByCompteCom", query = "SELECT i FROM ImageReglement i WHERE i.compteCom = :compteCom"),
    @NamedQuery(name = "ImageReglement.findByMc202", query = "SELECT i FROM ImageReglement i WHERE i.mc202 = :mc202")})
public class ImageReglement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOSSIER")
    private Long numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.DATE)
    private Date dateDossier;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER")
    private String typeDossier;
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
    @Size(max = 1)
    @Column(name = "TRAITE")
    private String traite;
    @Size(max = 1)
    @Column(name = "ETAT_DOSSIER")
    private String etatDossier;
    @Size(max = 200)
    @Column(name = "AVIS_SIEGE")
    private String avisSiege;
    @Size(max = 1)
    @Column(name = "SWIFT_GENERER")
    private String swiftGenerer;
    @Column(name = "MNT_ORDRE_DVS")
    private BigDecimal mntOrdreDvs;
    @Column(name = "MNT_ORDRE_TND")
    private BigDecimal mntOrdreTnd;
    @Column(name = "COURS")
    private BigDecimal cours;
    @Column(name = "DATE_JOURNEE_TELECOMP")
    @Temporal(TemporalType.DATE)
    private Date dateJourneeTelecomp;
    @Size(max = 1)
    @Column(name = "DOMICILIATION_BP")
    private String domiciliationBp;
    @Size(max = 8)
    @Column(name = "REF_BLOCAGE")
    private String refBlocage;
    @Column(name = "COMPTE_COM")
    private Short compteCom;
    @Size(max = 1)
    @Column(name = "MC202")
    private String mc202;

    public ImageReglement() {
    }

    public ImageReglement(Long numDossier) {
        this.numDossier = numDossier;
    }

    public Long getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(Long numDossier) {
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

    public String getTraite() {
        return traite;
    }

    public void setTraite(String traite) {
        this.traite = traite;
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

    public String getSwiftGenerer() {
        return swiftGenerer;
    }

    public void setSwiftGenerer(String swiftGenerer) {
        this.swiftGenerer = swiftGenerer;
    }

    public BigDecimal getMntOrdreDvs() {
        return mntOrdreDvs;
    }

    public void setMntOrdreDvs(BigDecimal mntOrdreDvs) {
        this.mntOrdreDvs = mntOrdreDvs;
    }

    public BigDecimal getMntOrdreTnd() {
        return mntOrdreTnd;
    }

    public void setMntOrdreTnd(BigDecimal mntOrdreTnd) {
        this.mntOrdreTnd = mntOrdreTnd;
    }

    public BigDecimal getCours() {
        return cours;
    }

    public void setCours(BigDecimal cours) {
        this.cours = cours;
    }

    public Date getDateJourneeTelecomp() {
        return dateJourneeTelecomp;
    }

    public void setDateJourneeTelecomp(Date dateJourneeTelecomp) {
        this.dateJourneeTelecomp = dateJourneeTelecomp;
    }

    public String getDomiciliationBp() {
        return domiciliationBp;
    }

    public void setDomiciliationBp(String domiciliationBp) {
        this.domiciliationBp = domiciliationBp;
    }

    public String getRefBlocage() {
        return refBlocage;
    }

    public void setRefBlocage(String refBlocage) {
        this.refBlocage = refBlocage;
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
        hash += (numDossier != null ? numDossier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImageReglement)) {
            return false;
        }
        ImageReglement other = (ImageReglement) object;
        if ((this.numDossier == null && other.numDossier != null) || (this.numDossier != null && !this.numDossier.equals(other.numDossier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Tre.ImageReglement[ numDossier=" + numDossier + " ]";
    }
    
}
