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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author slim
 */
@Entity
@Table(name = "SWIFT_RECUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SwiftRecus.findAll", query = "SELECT s FROM SwiftRecus s"),
    @NamedQuery(name = "SwiftRecus.findByNumSwift", query = "SELECT s FROM SwiftRecus s WHERE s.swiftRecusPK.numSwift = :numSwift"),
    @NamedQuery(name = "SwiftRecus.findByMtxxx", query = "SELECT s FROM SwiftRecus s WHERE s.swiftRecusPK.mtxxx = :mtxxx"),
    @NamedQuery(name = "SwiftRecus.findByTypeBnqEmetteur", query = "SELECT s FROM SwiftRecus s WHERE s.typeBnqEmetteur = :typeBnqEmetteur"),
    @NamedQuery(name = "SwiftRecus.findByCodeBnqEmetteur", query = "SELECT s FROM SwiftRecus s WHERE s.codeBnqEmetteur = :codeBnqEmetteur"),
    @NamedQuery(name = "SwiftRecus.findByCodeAgcEmetteur", query = "SELECT s FROM SwiftRecus s WHERE s.codeAgcEmetteur = :codeAgcEmetteur"),
    @NamedQuery(name = "SwiftRecus.findByDateGeneration", query = "SELECT s FROM SwiftRecus s WHERE s.dateGeneration = :dateGeneration"),
    @NamedQuery(name = "SwiftRecus.findByF20", query = "SELECT s FROM SwiftRecus s WHERE s.f20 = :f20"),
    @NamedQuery(name = "SwiftRecus.findByF21", query = "SELECT s FROM SwiftRecus s WHERE s.f21 = :f21"),
    @NamedQuery(name = "SwiftRecus.findByF25", query = "SELECT s FROM SwiftRecus s WHERE s.f25 = :f25"),
    @NamedQuery(name = "SwiftRecus.findByF30", query = "SELECT s FROM SwiftRecus s WHERE s.f30 = :f30"),
    @NamedQuery(name = "SwiftRecus.findByF32Date", query = "SELECT s FROM SwiftRecus s WHERE s.f32Date = :f32Date"),
    @NamedQuery(name = "SwiftRecus.findByF32Dvs", query = "SELECT s FROM SwiftRecus s WHERE s.f32Dvs = :f32Dvs"),
    @NamedQuery(name = "SwiftRecus.findByF32Mnt", query = "SELECT s FROM SwiftRecus s WHERE s.f32Mnt = :f32Mnt"),
    @NamedQuery(name = "SwiftRecus.findByF33Dvs", query = "SELECT s FROM SwiftRecus s WHERE s.f33Dvs = :f33Dvs"),
    @NamedQuery(name = "SwiftRecus.findByF33Mnt", query = "SELECT s FROM SwiftRecus s WHERE s.f33Mnt = :f33Mnt"),
    @NamedQuery(name = "SwiftRecus.findByF34Date", query = "SELECT s FROM SwiftRecus s WHERE s.f34Date = :f34Date"),
    @NamedQuery(name = "SwiftRecus.findByF34Dvs", query = "SELECT s FROM SwiftRecus s WHERE s.f34Dvs = :f34Dvs"),
    @NamedQuery(name = "SwiftRecus.findByF34Mnt", query = "SELECT s FROM SwiftRecus s WHERE s.f34Mnt = :f34Mnt"),
    @NamedQuery(name = "SwiftRecus.findByF71", query = "SELECT s FROM SwiftRecus s WHERE s.f71 = :f71"),
    @NamedQuery(name = "SwiftRecus.findByF73", query = "SELECT s FROM SwiftRecus s WHERE s.f73 = :f73"),
    @NamedQuery(name = "SwiftRecus.findByF53Bnq", query = "SELECT s FROM SwiftRecus s WHERE s.f53Bnq = :f53Bnq"),
    @NamedQuery(name = "SwiftRecus.findByF53Agc", query = "SELECT s FROM SwiftRecus s WHERE s.f53Agc = :f53Agc"),
    @NamedQuery(name = "SwiftRecus.findByF53NumCpt", query = "SELECT s FROM SwiftRecus s WHERE s.f53NumCpt = :f53NumCpt"),
    @NamedQuery(name = "SwiftRecus.findByF53Nom", query = "SELECT s FROM SwiftRecus s WHERE s.f53Nom = :f53Nom"),
    @NamedQuery(name = "SwiftRecus.findByF53Adr1", query = "SELECT s FROM SwiftRecus s WHERE s.f53Adr1 = :f53Adr1"),
    @NamedQuery(name = "SwiftRecus.findByF53Adr2", query = "SELECT s FROM SwiftRecus s WHERE s.f53Adr2 = :f53Adr2"),
    @NamedQuery(name = "SwiftRecus.findByF57Bnq", query = "SELECT s FROM SwiftRecus s WHERE s.f57Bnq = :f57Bnq"),
    @NamedQuery(name = "SwiftRecus.findByF57Agc", query = "SELECT s FROM SwiftRecus s WHERE s.f57Agc = :f57Agc"),
    @NamedQuery(name = "SwiftRecus.findByF57NumCpt", query = "SELECT s FROM SwiftRecus s WHERE s.f57NumCpt = :f57NumCpt"),
    @NamedQuery(name = "SwiftRecus.findByF57Nom", query = "SELECT s FROM SwiftRecus s WHERE s.f57Nom = :f57Nom"),
    @NamedQuery(name = "SwiftRecus.findByF57Adr1", query = "SELECT s FROM SwiftRecus s WHERE s.f57Adr1 = :f57Adr1"),
    @NamedQuery(name = "SwiftRecus.findByF57Adr2", query = "SELECT s FROM SwiftRecus s WHERE s.f57Adr2 = :f57Adr2"),
    @NamedQuery(name = "SwiftRecus.findByF58Bnq", query = "SELECT s FROM SwiftRecus s WHERE s.f58Bnq = :f58Bnq"),
    @NamedQuery(name = "SwiftRecus.findByF58Agc", query = "SELECT s FROM SwiftRecus s WHERE s.f58Agc = :f58Agc"),
    @NamedQuery(name = "SwiftRecus.findByF58NumCpt", query = "SELECT s FROM SwiftRecus s WHERE s.f58NumCpt = :f58NumCpt"),
    @NamedQuery(name = "SwiftRecus.findByF58Nom", query = "SELECT s FROM SwiftRecus s WHERE s.f58Nom = :f58Nom"),
    @NamedQuery(name = "SwiftRecus.findByF58Adr1", query = "SELECT s FROM SwiftRecus s WHERE s.f58Adr1 = :f58Adr1"),
    @NamedQuery(name = "SwiftRecus.findByF58Adr2", query = "SELECT s FROM SwiftRecus s WHERE s.f58Adr2 = :f58Adr2"),
    @NamedQuery(name = "SwiftRecus.findByF72", query = "SELECT s FROM SwiftRecus s WHERE s.f72 = :f72"),
    @NamedQuery(name = "SwiftRecus.findByF77", query = "SELECT s FROM SwiftRecus s WHERE s.f77 = :f77"),
    @NamedQuery(name = "SwiftRecus.findByF79", query = "SELECT s FROM SwiftRecus s WHERE s.f79 = :f79"),
    @NamedQuery(name = "SwiftRecus.findByNumDossier", query = "SELECT s FROM SwiftRecus s WHERE s.numDossier = :numDossier"),
    @NamedQuery(name = "SwiftRecus.findByDateDossier", query = "SELECT s FROM SwiftRecus s WHERE s.dateDossier = :dateDossier"),
    @NamedQuery(name = "SwiftRecus.findByNumExpedition", query = "SELECT s FROM SwiftRecus s WHERE s.numExpedition = :numExpedition"),
    @NamedQuery(name = "SwiftRecus.findByDateExpedition", query = "SELECT s FROM SwiftRecus s WHERE s.dateExpedition = :dateExpedition"),
    @NamedQuery(name = "SwiftRecus.findByStatus", query = "SELECT s FROM SwiftRecus s WHERE s.status = :status")})
public class SwiftRecus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SwiftRecusPK swiftRecusPK;
    @Size(max = 1)
    @Column(name = "TYPE_BNQ_EMETTEUR")
    private String typeBnqEmetteur;
    @Column(name = "CODE_BNQ_EMETTEUR")
    private Integer codeBnqEmetteur;
    @Column(name = "CODE_AGC_EMETTEUR")
    private Integer codeAgcEmetteur;
    @Column(name = "DATE_GENERATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateGeneration;
    @Size(max = 16)
    @Column(name = "F20")
    private String f20;
    @Size(max = 16)
    @Column(name = "F21")
    private String f21;
    @Size(max = 35)
    @Column(name = "F25")
    private String f25;
    @Column(name = "F30")
    private Integer f30;
    @Column(name = "F32_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date f32Date;
    @Column(name = "F32_DVS")
    private Short f32Dvs;
    @Column(name = "F32_MNT")
    private Long f32Mnt;
    @Column(name = "F33_DVS")
    private Short f33Dvs;
    @Column(name = "F33_MNT")
    private Long f33Mnt;
    @Column(name = "F34_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date f34Date;
    @Column(name = "F34_DVS")
    private Short f34Dvs;
    @Column(name = "F34_MNT")
    private Long f34Mnt;
    @Size(max = 210)
    @Column(name = "F71")
    private String f71;
    @Size(max = 210)
    @Column(name = "F73")
    private String f73;
    @Column(name = "F53_BNQ")
    private Integer f53Bnq;
    @Column(name = "F53_AGC")
    private Integer f53Agc;
    @Size(max = 34)
    @Column(name = "F53_NUM_CPT")
    private String f53NumCpt;
    @Size(max = 35)
    @Column(name = "F53_NOM")
    private String f53Nom;
    @Size(max = 35)
    @Column(name = "F53_ADR1")
    private String f53Adr1;
    @Size(max = 35)
    @Column(name = "F53_ADR2")
    private String f53Adr2;
    @Column(name = "F57_BNQ")
    private Integer f57Bnq;
    @Column(name = "F57_AGC")
    private Integer f57Agc;
    @Size(max = 34)
    @Column(name = "F57_NUM_CPT")
    private String f57NumCpt;
    @Size(max = 35)
    @Column(name = "F57_NOM")
    private String f57Nom;
    @Size(max = 35)
    @Column(name = "F57_ADR1")
    private String f57Adr1;
    @Size(max = 35)
    @Column(name = "F57_ADR2")
    private String f57Adr2;
    @Column(name = "F58_BNQ")
    private Integer f58Bnq;
    @Column(name = "F58_AGC")
    private Integer f58Agc;
    @Size(max = 34)
    @Column(name = "F58_NUM_CPT")
    private String f58NumCpt;
    @Size(max = 35)
    @Column(name = "F58_NOM")
    private String f58Nom;
    @Size(max = 35)
    @Column(name = "F58_ADR1")
    private String f58Adr1;
    @Size(max = 35)
    @Column(name = "F58_ADR2")
    private String f58Adr2;
    @Size(max = 210)
    @Column(name = "F72")
    private String f72;
    @Size(max = 1400)
    @Column(name = "F77")
    private String f77;
    @Size(max = 1750)
    @Column(name = "F79")
    private String f79;
    @Column(name = "NUM_DOSSIER")
    private Integer numDossier;
    @Column(name = "DATE_DOSSIER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDossier;
    @Column(name = "NUM_EXPEDITION")
    private Short numExpedition;
    @Column(name = "DATE_EXPEDITION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateExpedition;
    @Size(max = 1)
    @Column(name = "STATUS")
    private String status;

    public SwiftRecus() {
    }

    public SwiftRecus(SwiftRecusPK swiftRecusPK) {
        this.swiftRecusPK = swiftRecusPK;
    }

    public SwiftRecus(long numSwift, String mtxxx) {
        this.swiftRecusPK = new SwiftRecusPK(numSwift, mtxxx);
    }

    public SwiftRecusPK getSwiftRecusPK() {
        return swiftRecusPK;
    }

    public void setSwiftRecusPK(SwiftRecusPK swiftRecusPK) {
        this.swiftRecusPK = swiftRecusPK;
    }

    public String getTypeBnqEmetteur() {
        return typeBnqEmetteur;
    }

    public void setTypeBnqEmetteur(String typeBnqEmetteur) {
        this.typeBnqEmetteur = typeBnqEmetteur;
    }

    public Integer getCodeBnqEmetteur() {
        return codeBnqEmetteur;
    }

    public void setCodeBnqEmetteur(Integer codeBnqEmetteur) {
        this.codeBnqEmetteur = codeBnqEmetteur;
    }

    public Integer getCodeAgcEmetteur() {
        return codeAgcEmetteur;
    }

    public void setCodeAgcEmetteur(Integer codeAgcEmetteur) {
        this.codeAgcEmetteur = codeAgcEmetteur;
    }

    public Date getDateGeneration() {
        return dateGeneration;
    }

    public void setDateGeneration(Date dateGeneration) {
        this.dateGeneration = dateGeneration;
    }

    public String getF20() {
        return f20;
    }

    public void setF20(String f20) {
        this.f20 = f20;
    }

    public String getF21() {
        return f21;
    }

    public void setF21(String f21) {
        this.f21 = f21;
    }

    public String getF25() {
        return f25;
    }

    public void setF25(String f25) {
        this.f25 = f25;
    }

    public Integer getF30() {
        return f30;
    }

    public void setF30(Integer f30) {
        this.f30 = f30;
    }

    public Date getF32Date() {
        return f32Date;
    }

    public void setF32Date(Date f32Date) {
        this.f32Date = f32Date;
    }

    public Short getF32Dvs() {
        return f32Dvs;
    }

    public void setF32Dvs(Short f32Dvs) {
        this.f32Dvs = f32Dvs;
    }

    public Long getF32Mnt() {
        return f32Mnt;
    }

    public void setF32Mnt(Long f32Mnt) {
        this.f32Mnt = f32Mnt;
    }

    public Short getF33Dvs() {
        return f33Dvs;
    }

    public void setF33Dvs(Short f33Dvs) {
        this.f33Dvs = f33Dvs;
    }

    public Long getF33Mnt() {
        return f33Mnt;
    }

    public void setF33Mnt(Long f33Mnt) {
        this.f33Mnt = f33Mnt;
    }

    public Date getF34Date() {
        return f34Date;
    }

    public void setF34Date(Date f34Date) {
        this.f34Date = f34Date;
    }

    public Short getF34Dvs() {
        return f34Dvs;
    }

    public void setF34Dvs(Short f34Dvs) {
        this.f34Dvs = f34Dvs;
    }

    public Long getF34Mnt() {
        return f34Mnt;
    }

    public void setF34Mnt(Long f34Mnt) {
        this.f34Mnt = f34Mnt;
    }

    public String getF71() {
        return f71;
    }

    public void setF71(String f71) {
        this.f71 = f71;
    }

    public String getF73() {
        return f73;
    }

    public void setF73(String f73) {
        this.f73 = f73;
    }

    public Integer getF53Bnq() {
        return f53Bnq;
    }

    public void setF53Bnq(Integer f53Bnq) {
        this.f53Bnq = f53Bnq;
    }

    public Integer getF53Agc() {
        return f53Agc;
    }

    public void setF53Agc(Integer f53Agc) {
        this.f53Agc = f53Agc;
    }

    public String getF53NumCpt() {
        return f53NumCpt;
    }

    public void setF53NumCpt(String f53NumCpt) {
        this.f53NumCpt = f53NumCpt;
    }

    public String getF53Nom() {
        return f53Nom;
    }

    public void setF53Nom(String f53Nom) {
        this.f53Nom = f53Nom;
    }

    public String getF53Adr1() {
        return f53Adr1;
    }

    public void setF53Adr1(String f53Adr1) {
        this.f53Adr1 = f53Adr1;
    }

    public String getF53Adr2() {
        return f53Adr2;
    }

    public void setF53Adr2(String f53Adr2) {
        this.f53Adr2 = f53Adr2;
    }

    public Integer getF57Bnq() {
        return f57Bnq;
    }

    public void setF57Bnq(Integer f57Bnq) {
        this.f57Bnq = f57Bnq;
    }

    public Integer getF57Agc() {
        return f57Agc;
    }

    public void setF57Agc(Integer f57Agc) {
        this.f57Agc = f57Agc;
    }

    public String getF57NumCpt() {
        return f57NumCpt;
    }

    public void setF57NumCpt(String f57NumCpt) {
        this.f57NumCpt = f57NumCpt;
    }

    public String getF57Nom() {
        return f57Nom;
    }

    public void setF57Nom(String f57Nom) {
        this.f57Nom = f57Nom;
    }

    public String getF57Adr1() {
        return f57Adr1;
    }

    public void setF57Adr1(String f57Adr1) {
        this.f57Adr1 = f57Adr1;
    }

    public String getF57Adr2() {
        return f57Adr2;
    }

    public void setF57Adr2(String f57Adr2) {
        this.f57Adr2 = f57Adr2;
    }

    public Integer getF58Bnq() {
        return f58Bnq;
    }

    public void setF58Bnq(Integer f58Bnq) {
        this.f58Bnq = f58Bnq;
    }

    public Integer getF58Agc() {
        return f58Agc;
    }

    public void setF58Agc(Integer f58Agc) {
        this.f58Agc = f58Agc;
    }

    public String getF58NumCpt() {
        return f58NumCpt;
    }

    public void setF58NumCpt(String f58NumCpt) {
        this.f58NumCpt = f58NumCpt;
    }

    public String getF58Nom() {
        return f58Nom;
    }

    public void setF58Nom(String f58Nom) {
        this.f58Nom = f58Nom;
    }

    public String getF58Adr1() {
        return f58Adr1;
    }

    public void setF58Adr1(String f58Adr1) {
        this.f58Adr1 = f58Adr1;
    }

    public String getF58Adr2() {
        return f58Adr2;
    }

    public void setF58Adr2(String f58Adr2) {
        this.f58Adr2 = f58Adr2;
    }

    public String getF72() {
        return f72;
    }

    public void setF72(String f72) {
        this.f72 = f72;
    }

    public String getF77() {
        return f77;
    }

    public void setF77(String f77) {
        this.f77 = f77;
    }

    public String getF79() {
        return f79;
    }

    public void setF79(String f79) {
        this.f79 = f79;
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

    public Short getNumExpedition() {
        return numExpedition;
    }

    public void setNumExpedition(Short numExpedition) {
        this.numExpedition = numExpedition;
    }

    public Date getDateExpedition() {
        return dateExpedition;
    }

    public void setDateExpedition(Date dateExpedition) {
        this.dateExpedition = dateExpedition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (swiftRecusPK != null ? swiftRecusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SwiftRecus)) {
            return false;
        }
        SwiftRecus other = (SwiftRecus) object;
        if ((this.swiftRecusPK == null && other.swiftRecusPK != null) || (this.swiftRecusPK != null && !this.swiftRecusPK.equals(other.swiftRecusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Gen.SwiftRecus[ swiftRecusPK=" + swiftRecusPK + " ]";
    }
    
}
