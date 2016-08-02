/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Gen;

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

/**
 *
 * @author yayan
 */
@Entity
@Table(name = "DOCUMENTS")
@NamedQueries({
    @NamedQuery(name = "Documents.findAll", query = "SELECT d FROM Documents d"),
    @NamedQuery(name = "Documents.findByCodeProduitService", query = "SELECT d FROM Documents d WHERE d.codeProduitService = :codeProduitService"),
    @NamedQuery(name = "Documents.findByCodeOperation", query = "SELECT d FROM Documents d WHERE d.codeOperation = :codeOperation"),
    @NamedQuery(name = "Documents.findByRefOperation", query = "SELECT d FROM Documents d WHERE d.refOperation = :refOperation"),
    @NamedQuery(name = "Documents.findByDateOperation", query = "SELECT d FROM Documents d WHERE d.dateOperation = :dateOperation"),
    @NamedQuery(name = "Documents.findByUniteOperation", query = "SELECT d FROM Documents d WHERE d.uniteOperation = :uniteOperation"),
    @NamedQuery(name = "Documents.findByTypeDossier", query = "SELECT d FROM Documents d WHERE d.documentsPK.typeDossier = :typeDossier"),
    @NamedQuery(name = "Documents.findByNumDossier", query = "SELECT d FROM Documents d WHERE d.documentsPK.numDossier = :numDossier"),
    @NamedQuery(name = "Documents.findByDateDossier", query = "SELECT d FROM Documents d WHERE d.documentsPK.dateDossier = :dateDossier"),
    @NamedQuery(name = "Documents.findByNumLigne", query = "SELECT d FROM Documents d WHERE d.documentsPK.numLigne = :numLigne"),
    @NamedQuery(name = "Documents.findByReferenceFichierJoint", query = "SELECT d FROM Documents d WHERE d.referenceFichierJoint = :referenceFichierJoint"),
    @NamedQuery(name = "Documents.findByPathAnnee", query = "SELECT d FROM Documents d WHERE d.pathAnnee = :pathAnnee"),
    @NamedQuery(name = "Documents.findByPathMois", query = "SELECT d FROM Documents d WHERE d.pathMois = :pathMois")})
public class Documents implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentsPK documentsPK;
    @Column(name = "CODE_PRODUIT_SERVICE")
    private Short codeProduitService;
    @Column(name = "CODE_OPERATION")
    private Short codeOperation;
    @Column(name = "REF_OPERATION")
    private Long refOperation;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.DATE)
    private Date dateOperation;
    @Column(name = "UNITE_OPERATION")
    private Short uniteOperation;
    @Size(max = 45)
    @Column(name = "REFERENCE_FICHIER_JOINT")
    private String referenceFichierJoint;
    @Size(max = 4)
    @Column(name = "PATH_ANNEE")
    private String pathAnnee;
    @Size(max = 2)
    @Column(name = "PATH_MOIS")
    private String pathMois;

    public Documents() {
    }

    public Documents(DocumentsPK documentsPK) {
        this.documentsPK = documentsPK;
    }

    public Documents(String typeDossier, long numDossier, Date dateDossier, short numLigne) {
        this.documentsPK = new DocumentsPK(typeDossier, numDossier, dateDossier, numLigne);
    }

    public DocumentsPK getDocumentsPK() {
        return documentsPK;
    }

    public void setDocumentsPK(DocumentsPK documentsPK) {
        this.documentsPK = documentsPK;
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

    public Short getUniteOperation() {
        return uniteOperation;
    }

    public void setUniteOperation(Short uniteOperation) {
        this.uniteOperation = uniteOperation;
    }

    public String getReferenceFichierJoint() {
        return referenceFichierJoint;
    }

    public void setReferenceFichierJoint(String referenceFichierJoint) {
        this.referenceFichierJoint = referenceFichierJoint;
    }

    public String getPathAnnee() {
        return pathAnnee;
    }

    public void setPathAnnee(String pathAnnee) {
        this.pathAnnee = pathAnnee;
    }

    public String getPathMois() {
        return pathMois;
    }

    public void setPathMois(String pathMois) {
        this.pathMois = pathMois;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentsPK != null ? documentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documents)) {
            return false;
        }
        Documents other = (Documents) object;
        if ((this.documentsPK == null && other.documentsPK != null) || (this.documentsPK != null && !this.documentsPK.equals(other.documentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Gen.Documents[ documentsPK=" + documentsPK + " ]";
    }
    
}
