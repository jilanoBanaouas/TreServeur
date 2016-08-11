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
@Table(name = "DOC_OPERATION_APPORTES", catalog = "", schema = "TRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocOperationApportes.findAll", query = "SELECT d FROM DocOperationApportes d"),
    @NamedQuery(name = "DocOperationApportes.findByNumDossier", query = "SELECT d FROM DocOperationApportes d WHERE d.numDossier = :numDossier"),
    @NamedQuery(name = "DocOperationApportes.findByDateDossier", query = "SELECT d FROM DocOperationApportes d WHERE d.dateDossier = :dateDossier"),
    @NamedQuery(name = "DocOperationApportes.findByTypeDossier", query = "SELECT d FROM DocOperationApportes d WHERE d.typeDossier = :typeDossier"),
    @NamedQuery(name = "DocOperationApportes.findByCodeDocument", query = "SELECT d FROM DocOperationApportes d WHERE d.codeDocument = :codeDocument"),
    @NamedQuery(name = "DocOperationApportes.findByNbrOrigine", query = "SELECT d FROM DocOperationApportes d WHERE d.nbrOrigine = :nbrOrigine"),
    @NamedQuery(name = "DocOperationApportes.findByNbrCopie", query = "SELECT d FROM DocOperationApportes d WHERE d.nbrCopie = :nbrCopie"),
    @NamedQuery(name = "DocOperationApportes.findByNbrOrigineApportes", query = "SELECT d FROM DocOperationApportes d WHERE d.nbrOrigineApportes = :nbrOrigineApportes"),
    @NamedQuery(name = "DocOperationApportes.findByNbrCopieApportes", query = "SELECT d FROM DocOperationApportes d WHERE d.nbrCopieApportes = :nbrCopieApportes"),
    @NamedQuery(name = "DocOperationApportes.findByCodeOperationDecharge", query = "SELECT d FROM DocOperationApportes d WHERE d.codeOperationDecharge = :codeOperationDecharge"),
    @NamedQuery(name = "DocOperationApportes.findByCodeTypeOperation", query = "SELECT d FROM DocOperationApportes d WHERE d.codeTypeOperation = :codeTypeOperation"),
    @NamedQuery(name = "DocOperationApportes.findByCodeDetailOperation", query = "SELECT d FROM DocOperationApportes d WHERE d.codeDetailOperation = :codeDetailOperation")})
public class DocOperationApportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
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
    @Column(name = "CODE_OPERATION_DECHARGE")
    private Short codeOperationDecharge;
    @Column(name = "CODE_TYPE_OPERATION")
    private Short codeTypeOperation;
    @Column(name = "CODE_DETAIL_OPERATION")
    private Short codeDetailOperation;

    public DocOperationApportes() {
    }

    public DocOperationApportes(Integer numDossier) {
        this.numDossier = numDossier;
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
        hash += (numDossier != null ? numDossier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocOperationApportes)) {
            return false;
        }
        DocOperationApportes other = (DocOperationApportes) object;
        if ((this.numDossier == null && other.numDossier != null) || (this.numDossier != null && !this.numDossier.equals(other.numDossier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Tre.DocOperationApportes[ numDossier=" + numDossier + " ]";
    }
    
}
