/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Tre;

import java.io.Serializable;
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
@Table(name = "DOC_OPERATION_APPORTES_MVT", catalog = "", schema = "TRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocOperationApportesMvt.findAll", query = "SELECT d FROM DocOperationApportesMvt d"),
    @NamedQuery(name = "DocOperationApportesMvt.findByCodeProduitService", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "DocOperationApportesMvt.findByCodeOperation", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.codeOperation = :codeOperation"),
    @NamedQuery(name = "DocOperationApportesMvt.findByRefOperation", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.refOperation = :refOperation"),
    @NamedQuery(name = "DocOperationApportesMvt.findByDateOperation", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.dateOperation = :dateOperation"),
    @NamedQuery(name = "DocOperationApportesMvt.findByNumDossier", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.numDossier = :numDossier"),
    @NamedQuery(name = "DocOperationApportesMvt.findByDateDossier", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.dateDossier = :dateDossier"),
    @NamedQuery(name = "DocOperationApportesMvt.findByTypeDossier", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.typeDossier = :typeDossier"),
    @NamedQuery(name = "DocOperationApportesMvt.findByCodeDocument", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.codeDocument = :codeDocument"),
    @NamedQuery(name = "DocOperationApportesMvt.findByNbrOrigine", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.nbrOrigine = :nbrOrigine"),
    @NamedQuery(name = "DocOperationApportesMvt.findByNbrCopie", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.nbrCopie = :nbrCopie"),
    @NamedQuery(name = "DocOperationApportesMvt.findByNbrOrigineApportes", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.nbrOrigineApportes = :nbrOrigineApportes"),
    @NamedQuery(name = "DocOperationApportesMvt.findByNbrCopieApportes", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.nbrCopieApportes = :nbrCopieApportes"),
    @NamedQuery(name = "DocOperationApportesMvt.findByEtat", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.etat = :etat"),
    @NamedQuery(name = "DocOperationApportesMvt.findByCodeOperationDecharge", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.codeOperationDecharge = :codeOperationDecharge"),
    @NamedQuery(name = "DocOperationApportesMvt.findByCodeTypeOperation", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.codeTypeOperation = :codeTypeOperation"),
    @NamedQuery(name = "DocOperationApportesMvt.findByCodeDetailOperation", query = "SELECT d FROM DocOperationApportesMvt d WHERE d.codeDetailOperation = :codeDetailOperation")})
public class DocOperationApportesMvt implements Serializable {

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
    @Column(name = "CODE_DOCUMENT")
    private Short codeDocument;
    @Column(name = "NBR_ORIGINE")
    private Short nbrOrigine;
    @Column(name = "NBR_COPIE")
    private Short nbrCopie;
    @Column(name = "NBR_ORIGINE_APPORTES")
    private Short nbrOrigineApportes;
    @Column(name = "NBR_COPIE_APPORTES")
    private Short nbrCopieApportes;
    @Column(name = "ETAT")
    private Short etat;
    @Column(name = "CODE_OPERATION_DECHARGE")
    private Short codeOperationDecharge;
    @Column(name = "CODE_TYPE_OPERATION")
    private Short codeTypeOperation;
    @Column(name = "CODE_DETAIL_OPERATION")
    private Short codeDetailOperation;

    public DocOperationApportesMvt() {
    }

    public DocOperationApportesMvt(Short codeProduitService) {
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

    public Short getCodeDocument() {
        return codeDocument;
    }

    public void setCodeDocument(Short codeDocument) {
        this.codeDocument = codeDocument;
    }

    public Short getNbrOrigine() {
        return nbrOrigine;
    }

    public void setNbrOrigine(Short nbrOrigine) {
        this.nbrOrigine = nbrOrigine;
    }

    public Short getNbrCopie() {
        return nbrCopie;
    }

    public void setNbrCopie(Short nbrCopie) {
        this.nbrCopie = nbrCopie;
    }

    public Short getNbrOrigineApportes() {
        return nbrOrigineApportes;
    }

    public void setNbrOrigineApportes(Short nbrOrigineApportes) {
        this.nbrOrigineApportes = nbrOrigineApportes;
    }

    public Short getNbrCopieApportes() {
        return nbrCopieApportes;
    }

    public void setNbrCopieApportes(Short nbrCopieApportes) {
        this.nbrCopieApportes = nbrCopieApportes;
    }

    public Short getEtat() {
        return etat;
    }

    public void setEtat(Short etat) {
        this.etat = etat;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeProduitService != null ? codeProduitService.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocOperationApportesMvt)) {
            return false;
        }
        DocOperationApportesMvt other = (DocOperationApportesMvt) object;
        if ((this.codeProduitService == null && other.codeProduitService != null) || (this.codeProduitService != null && !this.codeProduitService.equals(other.codeProduitService))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Tre.DocOperationApportesMvt[ codeProduitService=" + codeProduitService + " ]";
    }
    
}
