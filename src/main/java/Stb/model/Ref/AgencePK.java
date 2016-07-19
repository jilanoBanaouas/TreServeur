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
 * @author slim
 */
@Embeddable
public class AgencePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_BANQUE")
    private short codeBanque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_AGENCE_BCT")
    private short codeAgenceBct;

    public AgencePK() {
    }

    public AgencePK(short codeBanque, short codeAgenceBct) {
        this.codeBanque = codeBanque;
        this.codeAgenceBct = codeAgenceBct;
    }

    public short getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(short codeBanque) {
        this.codeBanque = codeBanque;
    }

    public short getCodeAgenceBct() {
        return codeAgenceBct;
    }

    public void setCodeAgenceBct(short codeAgenceBct) {
        this.codeAgenceBct = codeAgenceBct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeBanque;
        hash += (int) codeAgenceBct;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgencePK)) {
            return false;
        }
        AgencePK other = (AgencePK) object;
        if (this.codeBanque != other.codeBanque) {
            return false;
        }
        if (this.codeAgenceBct != other.codeAgenceBct) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "services.beans.Ref.AgencePK[ codeBanque=" + codeBanque + ", codeAgenceBct=" + codeAgenceBct + " ]";
    }
    
}
