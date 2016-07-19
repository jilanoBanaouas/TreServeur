/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.model.Ref;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ZEMNI
 */
@Embeddable
public class AgenceEtrangerePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_BNQ_ETR")
    private int codeBnqEtr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_AGENCE_ETR")
    private int codeAgenceEtr;

    public AgenceEtrangerePK() {
    }

    public AgenceEtrangerePK(int codeBnqEtr, int codeAgenceEtr) {
        this.codeBnqEtr = codeBnqEtr;
        this.codeAgenceEtr = codeAgenceEtr;
    }

    public int getCodeBnqEtr() {
        return codeBnqEtr;
    }

    public void setCodeBnqEtr(int codeBnqEtr) {
        this.codeBnqEtr = codeBnqEtr;
    }

    public int getCodeAgenceEtr() {
        return codeAgenceEtr;
    }

    public void setCodeAgenceEtr(int codeAgenceEtr) {
        this.codeAgenceEtr = codeAgenceEtr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeBnqEtr;
        hash += (int) codeAgenceEtr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgenceEtrangerePK)) {
            return false;
        }
        AgenceEtrangerePK other = (AgenceEtrangerePK) object;
        if (this.codeBnqEtr != other.codeBnqEtr) {
            return false;
        }
        if (this.codeAgenceEtr != other.codeAgenceEtr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stb.model.Ref.AgenceEtrangerePK[ codeBnqEtr=" + codeBnqEtr + ", codeAgenceEtr=" + codeAgenceEtr + " ]";
    }
    
}
