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
@Table(name = "OPERATIONS_DELEGUEES_MVT", catalog = "", schema = "AVA")
@NamedQueries({
    @NamedQuery(name = "OperationsDelegueesMvt.findAll", query = "SELECT o FROM OperationsDelegueesMvt o"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeProduitService", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.operationsDelegueesMvtPK.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeOperation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.operationsDelegueesMvtPK.codeOperation = :codeOperation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByRefOperation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.operationsDelegueesMvtPK.refOperation = :refOperation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateOperation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.operationsDelegueesMvtPK.dateOperation = :dateOperation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByUniteOperation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.operationsDelegueesMvtPK.uniteOperation = :uniteOperation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeTypeDosAva", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeTypeDosAva = :codeTypeDosAva"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNumDossier", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.numDossier = :numDossier"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateDossier", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateDossier = :dateDossier"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeDevise", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeDevise = :codeDevise"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodePaysBct", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codePaysBct = :codePaysBct"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByTypePieceClient", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.typePieceClient = :typePieceClient"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNoPieceClient", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.noPieceClient = :noPieceClient"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeAgenceBct", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeAgenceBct = :codeAgenceBct"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeTypeMvtAva", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeTypeMvtAva = :codeTypeMvtAva"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeAgenceChanger", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeAgenceChanger = :codeAgenceChanger"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateSort", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateSort = :dateSort"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateEnt", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateEnt = :dateEnt"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMontant", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.montant = :montant"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodePaysDest", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codePaysDest = :codePaysDest"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateBct", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateBct = :dateBct"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNumeroBct", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.numeroBct = :numeroBct"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMontantAutre", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.montantAutre = :montantAutre"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNumeroDeclaration", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.numeroDeclaration = :numeroDeclaration"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateDeclaration", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateDeclaration = :dateDeclaration"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByModeDePayementBbChq", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.modeDePayementBbChq = :modeDePayementBbChq"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNumDom", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.numDom = :numDom"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateDom", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateDom = :dateDom"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNumMvtAva", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.numMvtAva = :numMvtAva"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateMvtAva", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateMvtAva = :dateMvtAva"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntRap", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntRap = :mntRap"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntRrvRav", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntRrvRav = :mntRrvRav"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntAutorise", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntAutorise = :mntAutorise"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntCa", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntCa = :mntCa"),
    @NamedQuery(name = "OperationsDelegueesMvt.findBySolde", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.solde = :solde"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNumMvtAs", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.numMvtAs = :numMvtAs"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByEcheance", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.echeance = :echeance"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeModePaiement", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeModePaiement = :codeModePaiement"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntMvtAva", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntMvtAva = :mntMvtAva"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByTypePieceBenef", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.typePieceBenef = :typePieceBenef"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNoPieceBenef", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.noPieceBenef = :noPieceBenef"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMotifBlocage", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.motifBlocage = :motifBlocage"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByEtatBlocage", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.etatBlocage = :etatBlocage"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateBlocage", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateBlocage = :dateBlocage"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateDeblocage", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateDeblocage = :dateDeblocage"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByRefBct", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.refBct = :refBct"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateAccordBct", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateAccordBct = :dateAccordBct"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeTitre", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeTitre = :codeTitre"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntRetrocession", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntRetrocession = :mntRetrocession"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateCloture", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateCloture = :dateCloture"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMotifCloture", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.motifCloture = :motifCloture"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByEtatCloture", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.etatCloture = :etatCloture"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateReactivation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateReactivation = :dateReactivation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateBlocageMnt", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateBlocageMnt = :dateBlocageMnt"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMotifBlocageMnt", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.motifBlocageMnt = :motifBlocageMnt"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNumBlocage", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.numBlocage = :numBlocage"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateAgenceChanger", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateAgenceChanger = :dateAgenceChanger"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeBanqueProvenance", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeBanqueProvenance = :codeBanqueProvenance"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntDom", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntDom = :mntDom"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateAlimentation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateAlimentation = :dateAlimentation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntAlimentation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntAlimentation = :mntAlimentation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeService", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeService = :codeService"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntDevise", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntDevise = :mntDevise"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateJournee", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateJournee = :dateJournee"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeActivite", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeActivite = :codeActivite"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntUtilise", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntUtilise = :mntUtilise"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntAvance", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntAvance = :mntAvance"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByTel", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.tel = :tel"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByFax", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.fax = :fax"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntTotTitre", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntTotTitre = :mntTotTitre"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByStatus", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.status = :status"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByTypeDossier", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.typeDossier = :typeDossier"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByObservation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.observation = :observation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByAnnee", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.annee = :annee"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDeclarationFiscale", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.declarationFiscale = :declarationFiscale"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCaImportateur", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.caImportateur = :caImportateur"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByMntCaFiscal", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.mntCaFiscal = :mntCaFiscal"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByAvisAgence", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.avisAgence = :avisAgence"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByAvisSiege", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.avisSiege = :avisSiege"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNomClient1", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.nomClient1 = :nomClient1"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateValidation", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateValidation = :dateValidation"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDestinataire", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.destinataire = :destinataire"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByEtatDossier", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.etatDossier = :etatDossier"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCleRib", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.cleRib = :cleRib"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByRacineCompte", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.racineCompte = :racineCompte"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByNumDosRap", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.numDosRap = :numDosRap"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByDateDosRap", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.dateDosRap = :dateDosRap"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByTypeDossierRap", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.typeDossierRap = :typeDossierRap"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByCodeAgenceAva", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.codeAgenceAva = :codeAgenceAva"),
    @NamedQuery(name = "OperationsDelegueesMvt.findByEcheanceAs", query = "SELECT o FROM OperationsDelegueesMvt o WHERE o.echeanceAs = :echeanceAs")})
public class OperationsDelegueesMvt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OperationsDelegueesMvtPK operationsDelegueesMvtPK;
    @Column(name = "CODE_TYPE_DOS_AVA")
    private Short codeTypeDosAva;
    @Column(name = "NUM_DOSSIER")
    private Long numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.DATE)
    private Date dateDossier;
    @Column(name = "CODE_DEVISE")
    private Short codeDevise;
    @Column(name = "CODE_PAYS_BCT")
    private Short codePaysBct;
    @Column(name = "TYPE_PIECE_CLIENT")
    private Short typePieceClient;
    @Size(max = 13)
    @Column(name = "NO_PIECE_CLIENT", length = 13)
    private String noPieceClient;
    @Column(name = "CODE_AGENCE_BCT")
    private Short codeAgenceBct;
    @Size(max = 3)
    @Column(name = "CODE_TYPE_MVT_AVA", length = 3)
    private String codeTypeMvtAva;
    @Column(name = "CODE_AGENCE_CHANGER")
    private Short codeAgenceChanger;
    @Column(name = "DATE_SORT")
    @Temporal(TemporalType.DATE)
    private Date dateSort;
    @Column(name = "DATE_ENT")
    @Temporal(TemporalType.DATE)
    private Date dateEnt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT", precision = 19, scale = 3)
    private BigDecimal montant;
    @Column(name = "CODE_PAYS_DEST")
    private Short codePaysDest;
    @Column(name = "DATE_BCT")
    @Temporal(TemporalType.DATE)
    private Date dateBct;
    @Column(name = "NUMERO_BCT")
    private Integer numeroBct;
    @Column(name = "MONTANT_AUTRE", precision = 19, scale = 3)
    private BigDecimal montantAutre;
    @Column(name = "NUMERO_DECLARATION")
    private Long numeroDeclaration;
    @Column(name = "DATE_DECLARATION")
    @Temporal(TemporalType.DATE)
    private Date dateDeclaration;
    @Size(max = 3)
    @Column(name = "MODE_DE_PAYEMENT_BB_CHQ", length = 3)
    private String modeDePayementBbChq;
    @Column(name = "NUM_DOM")
    private Integer numDom;
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.DATE)
    private Date dateDom;
    @Column(name = "NUM_MVT_AVA")
    private Integer numMvtAva;
    @Column(name = "DATE_MVT_AVA")
    @Temporal(TemporalType.DATE)
    private Date dateMvtAva;
    @Column(name = "MNT_RAP", precision = 19, scale = 3)
    private BigDecimal mntRap;
    @Column(name = "MNT_RRV_RAV", precision = 19, scale = 3)
    private BigDecimal mntRrvRav;
    @Column(name = "MNT_AUTORISE", precision = 19, scale = 3)
    private BigDecimal mntAutorise;
    @Column(name = "MNT_CA", precision = 19, scale = 3)
    private BigDecimal mntCa;
    @Column(name = "SOLDE", precision = 19, scale = 3)
    private BigDecimal solde;
    @Column(name = "NUM_MVT_AS")
    private Integer numMvtAs;
    @Column(name = "ECHEANCE")
    @Temporal(TemporalType.DATE)
    private Date echeance;
    @Size(max = 2)
    @Column(name = "CODE_MODE_PAIEMENT", length = 2)
    private String codeModePaiement;
    @Column(name = "MNT_MVT_AVA", precision = 19, scale = 3)
    private BigDecimal mntMvtAva;
    @Column(name = "TYPE_PIECE_BENEF")
    private Short typePieceBenef;
    @Size(max = 13)
    @Column(name = "NO_PIECE_BENEF", length = 13)
    private String noPieceBenef;
    @Size(max = 100)
    @Column(name = "MOTIF_BLOCAGE", length = 100)
    private String motifBlocage;
    @Size(max = 1)
    @Column(name = "ETAT_BLOCAGE", length = 1)
    private String etatBlocage;
    @Column(name = "DATE_BLOCAGE")
    @Temporal(TemporalType.DATE)
    private Date dateBlocage;
    @Column(name = "DATE_DEBLOCAGE")
    @Temporal(TemporalType.DATE)
    private Date dateDeblocage;
    @Size(max = 7)
    @Column(name = "REF_BCT", length = 7)
    private String refBct;
    @Column(name = "DATE_ACCORD_BCT")
    @Temporal(TemporalType.DATE)
    private Date dateAccordBct;
    @Column(name = "CODE_TITRE")
    private Short codeTitre;
    @Column(name = "MNT_RETROCESSION", precision = 19, scale = 3)
    private BigDecimal mntRetrocession;
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
    @Column(name = "DATE_BLOCAGE_MNT")
    @Temporal(TemporalType.DATE)
    private Date dateBlocageMnt;
    @Size(max = 200)
    @Column(name = "MOTIF_BLOCAGE_MNT", length = 200)
    private String motifBlocageMnt;
    @Column(name = "NUM_BLOCAGE")
    private Integer numBlocage;
    @Column(name = "DATE_AGENCE_CHANGER")
    @Temporal(TemporalType.DATE)
    private Date dateAgenceChanger;
    @Column(name = "CODE_BANQUE_PROVENANCE")
    private Short codeBanqueProvenance;
    @Column(name = "MNT_DOM", precision = 19, scale = 3)
    private BigDecimal mntDom;
    @Column(name = "DATE_ALIMENTATION")
    @Temporal(TemporalType.DATE)
    private Date dateAlimentation;
    @Column(name = "MNT_ALIMENTATION", precision = 19, scale = 3)
    private BigDecimal mntAlimentation;
    @Column(name = "CODE_SERVICE")
    private Short codeService;
    @Column(name = "MNT_DEVISE", precision = 19, scale = 3)
    private BigDecimal mntDevise;
    @Column(name = "DATE_JOURNEE")
    @Temporal(TemporalType.DATE)
    private Date dateJournee;
    @Column(name = "CODE_ACTIVITE")
    private Integer codeActivite;
    @Column(name = "MNT_UTILISE", precision = 19, scale = 3)
    private BigDecimal mntUtilise;
    @Column(name = "MNT_AVANCE", precision = 19, scale = 3)
    private BigDecimal mntAvance;
    @Size(max = 15)
    @Column(name = "TEL", length = 15)
    private String tel;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 15)
    @Column(name = "FAX", length = 15)
    private String fax;
    @Column(name = "MNT_TOT_TITRE")
    private BigInteger mntTotTitre;
    @Size(max = 1)
    @Column(name = "STATUS", length = 1)
    private String status;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER", length = 3)
    private String typeDossier;
    @Size(max = 200)
    @Column(name = "OBSERVATION", length = 200)
    private String observation;
    @Column(name = "ANNEE")
    private Short annee;
    @Size(max = 1)
    @Column(name = "DECLARATION_FISCALE", length = 1)
    private String declarationFiscale;
    @Size(max = 1)
    @Column(name = "CA_IMPORTATEUR", length = 1)
    private String caImportateur;
    @Column(name = "MNT_CA_FISCAL", precision = 19, scale = 3)
    private BigDecimal mntCaFiscal;
    @Size(max = 1000)
    @Column(name = "AVIS_AGENCE", length = 1000)
    private String avisAgence;
    @Size(max = 1000)
    @Column(name = "AVIS_SIEGE", length = 1000)
    private String avisSiege;
    @Size(max = 100)
    @Column(name = "NOM_CLIENT1", length = 100)
    private String nomClient1;
    @Column(name = "DATE_VALIDATION")
    @Temporal(TemporalType.DATE)
    private Date dateValidation;
    @Size(max = 1)
    @Column(name = "DESTINATAIRE", length = 1)
    private String destinataire;
    @Size(max = 1)
    @Column(name = "ETAT_DOSSIER", length = 1)
    private String etatDossier;
    @Column(name = "CLE_RIB")
    private Short cleRib;
    @Size(max = 13)
    @Column(name = "RACINE_COMPTE", length = 13)
    private String racineCompte;
    @Column(name = "NUM_DOS_RAP")
    private Integer numDosRap;
    @Column(name = "DATE_DOS_RAP")
    @Temporal(TemporalType.DATE)
    private Date dateDosRap;
    @Size(max = 3)
    @Column(name = "TYPE_DOSSIER_RAP", length = 3)
    private String typeDossierRap;
    @Column(name = "CODE_AGENCE_AVA")
    private Short codeAgenceAva;
    @Column(name = "ECHEANCE_AS")
    @Temporal(TemporalType.DATE)
    private Date echeanceAs;

    public OperationsDelegueesMvt() {
    }

    public OperationsDelegueesMvt(OperationsDelegueesMvtPK operationsDelegueesMvtPK) {
        this.operationsDelegueesMvtPK = operationsDelegueesMvtPK;
    }

    public OperationsDelegueesMvt(short codeProduitService, int codeOperation, long refOperation, Date dateOperation, short uniteOperation) {
        this.operationsDelegueesMvtPK = new OperationsDelegueesMvtPK(codeProduitService, codeOperation, refOperation, dateOperation, uniteOperation);
    }

    public OperationsDelegueesMvtPK getOperationsDelegueesMvtPK() {
        return operationsDelegueesMvtPK;
    }

    public void setOperationsDelegueesMvtPK(OperationsDelegueesMvtPK operationsDelegueesMvtPK) {
        this.operationsDelegueesMvtPK = operationsDelegueesMvtPK;
    }

    public Short getCodeTypeDosAva() {
        return codeTypeDosAva;
    }

    public void setCodeTypeDosAva(Short codeTypeDosAva) {
        this.codeTypeDosAva = codeTypeDosAva;
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

    public Short getCodeDevise() {
        return codeDevise;
    }

    public void setCodeDevise(Short codeDevise) {
        this.codeDevise = codeDevise;
    }

    public Short getCodePaysBct() {
        return codePaysBct;
    }

    public void setCodePaysBct(Short codePaysBct) {
        this.codePaysBct = codePaysBct;
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

    public String getCodeTypeMvtAva() {
        return codeTypeMvtAva;
    }

    public void setCodeTypeMvtAva(String codeTypeMvtAva) {
        this.codeTypeMvtAva = codeTypeMvtAva;
    }

    public Short getCodeAgenceChanger() {
        return codeAgenceChanger;
    }

    public void setCodeAgenceChanger(Short codeAgenceChanger) {
        this.codeAgenceChanger = codeAgenceChanger;
    }

    public Date getDateSort() {
        return dateSort;
    }

    public void setDateSort(Date dateSort) {
        this.dateSort = dateSort;
    }

    public Date getDateEnt() {
        return dateEnt;
    }

    public void setDateEnt(Date dateEnt) {
        this.dateEnt = dateEnt;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Short getCodePaysDest() {
        return codePaysDest;
    }

    public void setCodePaysDest(Short codePaysDest) {
        this.codePaysDest = codePaysDest;
    }

    public Date getDateBct() {
        return dateBct;
    }

    public void setDateBct(Date dateBct) {
        this.dateBct = dateBct;
    }

    public Integer getNumeroBct() {
        return numeroBct;
    }

    public void setNumeroBct(Integer numeroBct) {
        this.numeroBct = numeroBct;
    }

    public BigDecimal getMontantAutre() {
        return montantAutre;
    }

    public void setMontantAutre(BigDecimal montantAutre) {
        this.montantAutre = montantAutre;
    }

    public Long getNumeroDeclaration() {
        return numeroDeclaration;
    }

    public void setNumeroDeclaration(Long numeroDeclaration) {
        this.numeroDeclaration = numeroDeclaration;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public String getModeDePayementBbChq() {
        return modeDePayementBbChq;
    }

    public void setModeDePayementBbChq(String modeDePayementBbChq) {
        this.modeDePayementBbChq = modeDePayementBbChq;
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

    public Integer getNumMvtAva() {
        return numMvtAva;
    }

    public void setNumMvtAva(Integer numMvtAva) {
        this.numMvtAva = numMvtAva;
    }

    public Date getDateMvtAva() {
        return dateMvtAva;
    }

    public void setDateMvtAva(Date dateMvtAva) {
        this.dateMvtAva = dateMvtAva;
    }

    public BigDecimal getMntRap() {
        return mntRap;
    }

    public void setMntRap(BigDecimal mntRap) {
        this.mntRap = mntRap;
    }

    public BigDecimal getMntRrvRav() {
        return mntRrvRav;
    }

    public void setMntRrvRav(BigDecimal mntRrvRav) {
        this.mntRrvRav = mntRrvRav;
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

    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

    public Integer getNumMvtAs() {
        return numMvtAs;
    }

    public void setNumMvtAs(Integer numMvtAs) {
        this.numMvtAs = numMvtAs;
    }

    public Date getEcheance() {
        return echeance;
    }

    public void setEcheance(Date echeance) {
        this.echeance = echeance;
    }

    public String getCodeModePaiement() {
        return codeModePaiement;
    }

    public void setCodeModePaiement(String codeModePaiement) {
        this.codeModePaiement = codeModePaiement;
    }

    public BigDecimal getMntMvtAva() {
        return mntMvtAva;
    }

    public void setMntMvtAva(BigDecimal mntMvtAva) {
        this.mntMvtAva = mntMvtAva;
    }

    public Short getTypePieceBenef() {
        return typePieceBenef;
    }

    public void setTypePieceBenef(Short typePieceBenef) {
        this.typePieceBenef = typePieceBenef;
    }

    public String getNoPieceBenef() {
        return noPieceBenef;
    }

    public void setNoPieceBenef(String noPieceBenef) {
        this.noPieceBenef = noPieceBenef;
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

    public Date getDateBlocage() {
        return dateBlocage;
    }

    public void setDateBlocage(Date dateBlocage) {
        this.dateBlocage = dateBlocage;
    }

    public Date getDateDeblocage() {
        return dateDeblocage;
    }

    public void setDateDeblocage(Date dateDeblocage) {
        this.dateDeblocage = dateDeblocage;
    }

    public String getRefBct() {
        return refBct;
    }

    public void setRefBct(String refBct) {
        this.refBct = refBct;
    }

    public Date getDateAccordBct() {
        return dateAccordBct;
    }

    public void setDateAccordBct(Date dateAccordBct) {
        this.dateAccordBct = dateAccordBct;
    }

    public Short getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Short codeTitre) {
        this.codeTitre = codeTitre;
    }

    public BigDecimal getMntRetrocession() {
        return mntRetrocession;
    }

    public void setMntRetrocession(BigDecimal mntRetrocession) {
        this.mntRetrocession = mntRetrocession;
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

    public Date getDateBlocageMnt() {
        return dateBlocageMnt;
    }

    public void setDateBlocageMnt(Date dateBlocageMnt) {
        this.dateBlocageMnt = dateBlocageMnt;
    }

    public String getMotifBlocageMnt() {
        return motifBlocageMnt;
    }

    public void setMotifBlocageMnt(String motifBlocageMnt) {
        this.motifBlocageMnt = motifBlocageMnt;
    }

    public Integer getNumBlocage() {
        return numBlocage;
    }

    public void setNumBlocage(Integer numBlocage) {
        this.numBlocage = numBlocage;
    }

    public Date getDateAgenceChanger() {
        return dateAgenceChanger;
    }

    public void setDateAgenceChanger(Date dateAgenceChanger) {
        this.dateAgenceChanger = dateAgenceChanger;
    }

    public Short getCodeBanqueProvenance() {
        return codeBanqueProvenance;
    }

    public void setCodeBanqueProvenance(Short codeBanqueProvenance) {
        this.codeBanqueProvenance = codeBanqueProvenance;
    }

    public BigDecimal getMntDom() {
        return mntDom;
    }

    public void setMntDom(BigDecimal mntDom) {
        this.mntDom = mntDom;
    }

    public Date getDateAlimentation() {
        return dateAlimentation;
    }

    public void setDateAlimentation(Date dateAlimentation) {
        this.dateAlimentation = dateAlimentation;
    }

    public BigDecimal getMntAlimentation() {
        return mntAlimentation;
    }

    public void setMntAlimentation(BigDecimal mntAlimentation) {
        this.mntAlimentation = mntAlimentation;
    }

    public Short getCodeService() {
        return codeService;
    }

    public void setCodeService(Short codeService) {
        this.codeService = codeService;
    }

    public BigDecimal getMntDevise() {
        return mntDevise;
    }

    public void setMntDevise(BigDecimal mntDevise) {
        this.mntDevise = mntDevise;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
    }

    public Integer getCodeActivite() {
        return codeActivite;
    }

    public void setCodeActivite(Integer codeActivite) {
        this.codeActivite = codeActivite;
    }

    public BigDecimal getMntUtilise() {
        return mntUtilise;
    }

    public void setMntUtilise(BigDecimal mntUtilise) {
        this.mntUtilise = mntUtilise;
    }

    public BigDecimal getMntAvance() {
        return mntAvance;
    }

    public void setMntAvance(BigDecimal mntAvance) {
        this.mntAvance = mntAvance;
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

    public BigInteger getMntTotTitre() {
        return mntTotTitre;
    }

    public void setMntTotTitre(BigInteger mntTotTitre) {
        this.mntTotTitre = mntTotTitre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(String typeDossier) {
        this.typeDossier = typeDossier;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Short getAnnee() {
        return annee;
    }

    public void setAnnee(Short annee) {
        this.annee = annee;
    }

    public String getDeclarationFiscale() {
        return declarationFiscale;
    }

    public void setDeclarationFiscale(String declarationFiscale) {
        this.declarationFiscale = declarationFiscale;
    }

    public String getCaImportateur() {
        return caImportateur;
    }

    public void setCaImportateur(String caImportateur) {
        this.caImportateur = caImportateur;
    }

    public BigDecimal getMntCaFiscal() {
        return mntCaFiscal;
    }

    public void setMntCaFiscal(BigDecimal mntCaFiscal) {
        this.mntCaFiscal = mntCaFiscal;
    }

    public String getAvisAgence() {
        return avisAgence;
    }

    public void setAvisAgence(String avisAgence) {
        this.avisAgence = avisAgence;
    }

    public String getAvisSiege() {
        return avisSiege;
    }

    public void setAvisSiege(String avisSiege) {
        this.avisSiege = avisSiege;
    }

    public String getNomClient1() {
        return nomClient1;
    }

    public void setNomClient1(String nomClient1) {
        this.nomClient1 = nomClient1;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getEtatDossier() {
        return etatDossier;
    }

    public void setEtatDossier(String etatDossier) {
        this.etatDossier = etatDossier;
    }

    public Short getCleRib() {
        return cleRib;
    }

    public void setCleRib(Short cleRib) {
        this.cleRib = cleRib;
    }

    public String getRacineCompte() {
        return racineCompte;
    }

    public void setRacineCompte(String racineCompte) {
        this.racineCompte = racineCompte;
    }

    public Integer getNumDosRap() {
        return numDosRap;
    }

    public void setNumDosRap(Integer numDosRap) {
        this.numDosRap = numDosRap;
    }

    public Date getDateDosRap() {
        return dateDosRap;
    }

    public void setDateDosRap(Date dateDosRap) {
        this.dateDosRap = dateDosRap;
    }

    public String getTypeDossierRap() {
        return typeDossierRap;
    }

    public void setTypeDossierRap(String typeDossierRap) {
        this.typeDossierRap = typeDossierRap;
    }

    public Short getCodeAgenceAva() {
        return codeAgenceAva;
    }

    public void setCodeAgenceAva(Short codeAgenceAva) {
        this.codeAgenceAva = codeAgenceAva;
    }

    public Date getEcheanceAs() {
        return echeanceAs;
    }

    public void setEcheanceAs(Date echeanceAs) {
        this.echeanceAs = echeanceAs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operationsDelegueesMvtPK != null ? operationsDelegueesMvtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperationsDelegueesMvt)) {
            return false;
        }
        OperationsDelegueesMvt other = (OperationsDelegueesMvt) object;
        if ((this.operationsDelegueesMvtPK == null && other.operationsDelegueesMvtPK != null) || (this.operationsDelegueesMvtPK != null && !this.operationsDelegueesMvtPK.equals(other.operationsDelegueesMvtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.ava.OperationsDelegueesMvt[ operationsDelegueesMvtPK=" + operationsDelegueesMvtPK + " ]";
    }
    
}
