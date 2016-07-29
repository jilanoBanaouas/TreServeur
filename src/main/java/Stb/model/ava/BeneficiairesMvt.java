/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.ava;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.IdClass;
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
@Table(name = "BENEFICIAIRES_MVT", catalog = "", schema = "AVA")
@NamedQueries({
    @NamedQuery(name = "BeneficiairesMvt.findAll", query = "SELECT b FROM BeneficiairesMvt b"),
    @NamedQuery(name = "BeneficiairesMvt.findByCodeProduitService", query = "SELECT b FROM BeneficiairesMvt b WHERE b.beneficiairesMvtPK.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "BeneficiairesMvt.findByCodeOperation", query = "SELECT b FROM BeneficiairesMvt b WHERE b.beneficiairesMvtPK.codeOperation = :codeOperation"),
    @NamedQuery(name = "BeneficiairesMvt.findByRefOperation", query = "SELECT b FROM BeneficiairesMvt b WHERE b.beneficiairesMvtPK.refOperation = :refOperation"),
    @NamedQuery(name = "BeneficiairesMvt.findByDateOperation", query = "SELECT b FROM BeneficiairesMvt b WHERE b.beneficiairesMvtPK.dateOperation = :dateOperation"),
    @NamedQuery(name = "BeneficiairesMvt.findByUniteOperation", query = "SELECT b FROM BeneficiairesMvt b WHERE b.beneficiairesMvtPK.uniteOperation = :uniteOperation"),
    @NamedQuery(name = "BeneficiairesMvt.findByNumDossier", query = "SELECT b FROM BeneficiairesMvt b WHERE b.numDossier = :numDossier"),
    @NamedQuery(name = "BeneficiairesMvt.findByDateDossier", query = "SELECT b FROM BeneficiairesMvt b WHERE b.dateDossier = :dateDossier"),
    @NamedQuery(name = "BeneficiairesMvt.findByCodeTypeDos", query = "SELECT b FROM BeneficiairesMvt b WHERE b.codeTypeDos = :codeTypeDos"),
    @NamedQuery(name = "BeneficiairesMvt.findByCodeBanque", query = "SELECT b FROM BeneficiairesMvt b WHERE b.codeBanque = :codeBanque"),
    @NamedQuery(name = "BeneficiairesMvt.findByCodeAgenceAva", query = "SELECT b FROM BeneficiairesMvt b WHERE b.codeAgenceAva = :codeAgenceAva"),
    @NamedQuery(name = "BeneficiairesMvt.findByTypePieceBenef", query = "SELECT b FROM BeneficiairesMvt b WHERE b.typePieceBenef = :typePieceBenef"),
    @NamedQuery(name = "BeneficiairesMvt.findByNoPieceBenef", query = "SELECT b FROM BeneficiairesMvt b WHERE b.beneficiairesMvtPK.noPieceBenef = :noPieceBenef"),
    @NamedQuery(name = "BeneficiairesMvt.findByDatePiece", query = "SELECT b FROM BeneficiairesMvt b WHERE b.datePiece = :datePiece"),
    @NamedQuery(name = "BeneficiairesMvt.findByNomBenef", query = "SELECT b FROM BeneficiairesMvt b WHERE b.nomBenef = :nomBenef"),
    @NamedQuery(name = "BeneficiairesMvt.findByAdresseBenef", query = "SELECT b FROM BeneficiairesMvt b WHERE b.adresseBenef = :adresseBenef"),
    @NamedQuery(name = "BeneficiairesMvt.findByQualite", query = "SELECT b FROM BeneficiairesMvt b WHERE b.qualite = :qualite"),
    @NamedQuery(name = "BeneficiairesMvt.findByEtat", query = "SELECT b FROM BeneficiairesMvt b WHERE b.etat = :etat"),
    @NamedQuery(name = "BeneficiairesMvt.findByDateCreation", query = "SELECT b FROM BeneficiairesMvt b WHERE b.dateCreation = :dateCreation"),
    @NamedQuery(name = "BeneficiairesMvt.findByDateSuppression", query = "SELECT b FROM BeneficiairesMvt b WHERE b.dateSuppression = :dateSuppression")})
public class BeneficiairesMvt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BeneficiairesMvtPK beneficiairesMvtPK;
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.DATE)
    private Date dateDossier;
    @Column(name = "CODE_TYPE_DOS")
    private Short codeTypeDos;
    @Column(name = "CODE_BANQUE")
    private Short codeBanque;
    @Column(name = "CODE_AGENCE_AVA")
    private Short codeAgenceAva;
    @Column(name = "TYPE_PIECE_BENEF")
    private Short typePieceBenef;
    @Column(name = "DATE_PIECE")
    @Temporal(TemporalType.DATE)
    private Date datePiece;
    @Size(max = 50)
    @Column(name = "NOM_BENEF", length = 50)
    private String nomBenef;
    @Size(max = 50)
    @Column(name = "ADRESSE_BENEF", length = 50)
    private String adresseBenef;
    @Size(max = 30)
    @Column(name = "QUALITE", length = 30)
    private String qualite;
    @Size(max = 2)
    @Column(name = "ETAT", length = 2)
    private String etat;
    @Column(name = "DATE_CREATION")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Column(name = "DATE_SUPPRESSION")
    @Temporal(TemporalType.DATE)
    private Date dateSuppression;

    public BeneficiairesMvt() {
    }

    public BeneficiairesMvt(BeneficiairesMvtPK beneficiairesMvtPK) {
        this.beneficiairesMvtPK = beneficiairesMvtPK;
    }

    public BeneficiairesMvt(short codeProduitService, short codeOperation, long refOperation, Date dateOperation, short uniteOperation, String noPieceBenef) {
        this.beneficiairesMvtPK = new BeneficiairesMvtPK(codeProduitService, codeOperation, refOperation, dateOperation, uniteOperation, noPieceBenef);
    }

    public BeneficiairesMvtPK getBeneficiairesMvtPK() {
        return beneficiairesMvtPK;
    }

    public void setBeneficiairesMvtPK(BeneficiairesMvtPK beneficiairesMvtPK) {
        this.beneficiairesMvtPK = beneficiairesMvtPK;
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

    public Short getCodeTypeDos() {
        return codeTypeDos;
    }

    public void setCodeTypeDos(Short codeTypeDos) {
        this.codeTypeDos = codeTypeDos;
    }

    public Short getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(Short codeBanque) {
        this.codeBanque = codeBanque;
    }

    public Short getCodeAgenceAva() {
        return codeAgenceAva;
    }

    public void setCodeAgenceAva(Short codeAgenceAva) {
        this.codeAgenceAva = codeAgenceAva;
    }

    public Short getTypePieceBenef() {
        return typePieceBenef;
    }

    public void setTypePieceBenef(Short typePieceBenef) {
        this.typePieceBenef = typePieceBenef;
    }

    public Date getDatePiece() {
        return datePiece;
    }

    public void setDatePiece(Date datePiece) {
        this.datePiece = datePiece;
    }

    public String getNomBenef() {
        return nomBenef;
    }

    public void setNomBenef(String nomBenef) {
        this.nomBenef = nomBenef;
    }

    public String getAdresseBenef() {
        return adresseBenef;
    }

    public void setAdresseBenef(String adresseBenef) {
        this.adresseBenef = adresseBenef;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateSuppression() {
        return dateSuppression;
    }

    public void setDateSuppression(Date dateSuppression) {
        this.dateSuppression = dateSuppression;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (beneficiairesMvtPK != null ? beneficiairesMvtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BeneficiairesMvt)) {
            return false;
        }
        BeneficiairesMvt other = (BeneficiairesMvt) object;
        if ((this.beneficiairesMvtPK == null && other.beneficiairesMvtPK != null) || (this.beneficiairesMvtPK != null && !this.beneficiairesMvtPK.equals(other.beneficiairesMvtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.ava.BeneficiairesMvt[ beneficiairesMvtPK=" + beneficiairesMvtPK + " ]";
    }
    
}
