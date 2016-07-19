/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Domi;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ZEMNI
 */
@Entity
@Table(name = "VUE_TIMELINE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VueTimeline.findAll", query = "SELECT v FROM VueTimeline v"),
    @NamedQuery(name = "VueTimeline.findByRowId", query = "SELECT v FROM VueTimeline v WHERE v.rowId = :rowId"),
    @NamedQuery(name = "VueTimeline.findByCodeTitre", query = "SELECT v FROM VueTimeline v WHERE v.codeTitre = :codeTitre"),
    @NamedQuery(name = "VueTimeline.findByNumDom", query = "SELECT v FROM VueTimeline v WHERE v.numDom = :numDom"),
    @NamedQuery(name = "VueTimeline.findByDateDom", query = "SELECT v FROM VueTimeline v WHERE v.dateDom = :dateDom"),
    @NamedQuery(name = "VueTimeline.findByDateOperation", query = "SELECT v FROM VueTimeline v WHERE v.dateOperation = :dateOperation"),
    @NamedQuery(name = "VueTimeline.findByObjet", query = "SELECT v FROM VueTimeline v WHERE v.objet = :objet")})
public class VueTimeline implements Serializable {
    private static final long serialVersionUID = 1L;
    //@Size(max = 402)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ROW_ID")
    private String rowId;
    @Column(name = "CODE_TITRE")
    private Integer codeTitre;
    @Column(name = "NUM_DOM")
    private Integer numDom;
    @Column(name = "DATE_DOM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDom;
    @Column(name = "DATE_OPERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOperation;
    @Size(max = 145)
    @Column(name = "OBJET")
    private String objet;

    public VueTimeline() {
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public Integer getCodeTitre() {
        return codeTitre;
    }

    public void setCodeTitre(Integer codeTitre) {
        this.codeTitre = codeTitre;
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

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }
    
}
