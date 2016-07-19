/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Ref;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author slim
 */
@Entity
@Table(name = "pays")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pays.findAll", query = "SELECT p FROM Pays p"),
    @NamedQuery(name = "Pays.findByCodePays", query = "SELECT p FROM Pays p WHERE p.codePays = :codePays"),
    @NamedQuery(name = "Pays.findBySiglePays", query = "SELECT p FROM Pays p WHERE p.siglePays = :siglePays"),
    @NamedQuery(name = "Pays.findByLibPays", query = "SELECT p FROM Pays p WHERE p.libPays = :libPays"),
    @NamedQuery(name = "Pays.findByNationalite", query = "SELECT p FROM Pays p WHERE p.nationalite = :nationalite"),
    @NamedQuery(name = "Pays.findByCodeContinent", query = "SELECT p FROM Pays p WHERE p.codeContinent = :codeContinent"),
    @NamedQuery(name = "Pays.findByCodeZone", query = "SELECT p FROM Pays p WHERE p.codeZone = :codeZone"),
    @NamedQuery(name = "Pays.findByConvention", query = "SELECT p FROM Pays p WHERE p.convention = :convention"),
    @NamedQuery(name = "Pays.findByListe", query = "SELECT p FROM Pays p WHERE p.liste = :liste"),
    @NamedQuery(name = "Pays.findByLun", query = "SELECT p FROM Pays p WHERE p.lun = :lun"),
    @NamedQuery(name = "Pays.findByMar", query = "SELECT p FROM Pays p WHERE p.mar = :mar"),
    @NamedQuery(name = "Pays.findByMer", query = "SELECT p FROM Pays p WHERE p.mer = :mer"),
    @NamedQuery(name = "Pays.findByJeu", query = "SELECT p FROM Pays p WHERE p.jeu = :jeu"),
    @NamedQuery(name = "Pays.findByVen", query = "SELECT p FROM Pays p WHERE p.ven = :ven"),
    @NamedQuery(name = "Pays.findBySam", query = "SELECT p FROM Pays p WHERE p.sam = :sam"),
    @NamedQuery(name = "Pays.findByDim", query = "SELECT p FROM Pays p WHERE p.dim = :dim"),
    @NamedQuery(name = "Pays.findByLangue", query = "SELECT p FROM Pays p WHERE p.langue = :langue"),
    @NamedQuery(name = "Pays.findByCodePaysIso", query = "SELECT p FROM Pays p WHERE p.codePaysIso = :codePaysIso"),
    @NamedQuery(name = "Pays.findByCodeIso", query = "SELECT p FROM Pays p WHERE p.codeIso = :codeIso")})
public class Pays implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PAYS")
    private Integer codePays;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "SIGLE_PAYS")
    private String siglePays;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LIB_PAYS")
    private String libPays;
    @Size(max = 20)
    @Column(name = "NATIONALITE")
    private String nationalite;
    @Size(max = 1)
    @Column(name = "CODE_CONTINENT")
    private String codeContinent;
    @Column(name = "CODE_ZONE")
    private Integer codeZone;
    @Size(max = 2)
    @Column(name = "CONVENTION")
    private String convention;
    @Size(max = 1)
    @Column(name = "LISTE")
    private String liste;
    @Size(max = 1)
    @Column(name = "LUN")
    private String lun;
    @Size(max = 1)
    @Column(name = "MAR")
    private String mar;
    @Size(max = 1)
    @Column(name = "MER")
    private String mer;
    @Size(max = 1)
    @Column(name = "JEU")
    private String jeu;
    @Size(max = 1)
    @Column(name = "VEN")
    private String ven;
    @Size(max = 1)
    @Column(name = "SAM")
    private String sam;
    @Size(max = 1)
    @Column(name = "DIM")
    private String dim;
    @Size(max = 1)
    @Column(name = "LANGUE")
    private String langue;
    @Size(max = 2)
    @Column(name = "CODE_PAYS_ISO")
    private String codePaysIso;
    @Size(max = 2)
    @Column(name = "CODE_ISO")
    private String codeIso;
    
    
    /*@OneToMany(mappedBy="pays")
    private List<AgenceEtrangere>  agencesEtrangere; 

    public List<AgenceEtrangere> getAgencesEtrangere() {
        return agencesEtrangere;
    }

    public void setAgencesEtrangere(List<AgenceEtrangere> agencesEtrangere) {
        this.agencesEtrangere = agencesEtrangere;
    
    }*/
    
    

   
    
    
    
    public Pays() {
    }

    public Pays(Integer codePays) {
        this.codePays = codePays;
    }

    public Pays(Integer codePays, String siglePays, String libPays) {
        this.codePays = codePays;
        this.siglePays = siglePays;
        this.libPays = libPays;
    }

    public Integer getCodePays() {
        return codePays;
    }

    public void setCodePays(Integer codePays) {
        this.codePays = codePays;
    }

    public String getSiglePays() {
        return siglePays;
    }

    public void setSiglePays(String siglePays) {
        this.siglePays = siglePays;
    }

    public String getLibPays() {
        return libPays;
    }

    public void setLibPays(String libPays) {
        this.libPays = libPays;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getCodeContinent() {
        return codeContinent;
    }

    public void setCodeContinent(String codeContinent) {
        this.codeContinent = codeContinent;
    }

    public Integer getCodeZone() {
        return codeZone;
    }

    public void setCodeZone(Integer codeZone) {
        this.codeZone = codeZone;
    }

    public String getConvention() {
        return convention;
    }

    public void setConvention(String convention) {
        this.convention = convention;
    }

    public String getListe() {
        return liste;
    }

    public void setListe(String liste) {
        this.liste = liste;
    }

    public String getLun() {
        return lun;
    }

    public void setLun(String lun) {
        this.lun = lun;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getMer() {
        return mer;
    }

    public void setMer(String mer) {
        this.mer = mer;
    }

    public String getJeu() {
        return jeu;
    }

    public void setJeu(String jeu) {
        this.jeu = jeu;
    }

    public String getVen() {
        return ven;
    }

    public void setVen(String ven) {
        this.ven = ven;
    }

    public String getSam() {
        return sam;
    }

    public void setSam(String sam) {
        this.sam = sam;
    }

    public String getDim() {
        return dim;
    }

    public void setDim(String dim) {
        this.dim = dim;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getCodePaysIso() {
        return codePaysIso;
    }

    public void setCodePaysIso(String codePaysIso) {
        this.codePaysIso = codePaysIso;
    }

    public String getCodeIso() {
        return codeIso;
    }

    public void setCodeIso(String codeIso) {
        this.codeIso = codeIso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePays != null ? codePays.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pays)) {
            return false;
        }
        Pays other = (Pays) object;
        if ((this.codePays == null && other.codePays != null) || (this.codePays != null && !this.codePays.equals(other.codePays))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Pays[ codePays=" + codePays + " ]";
    }
    
}
