/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Xavier
 */
@Embeddable
public class FuncionarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "func_cod")
    private int funcCod;
    @Basic(optional = false)
    @Column(name = "func_nome")
    private String funcNome;

    public FuncionarioPK() {
    }

    public FuncionarioPK(int funcCod, String funcNome) {
        this.funcCod = funcCod;
        this.funcNome = funcNome;
    }

    public int getFuncCod() {
        return funcCod;
    }

    public void setFuncCod(int funcCod) {
        this.funcCod = funcCod;
    }

    public String getFuncNome() {
        return funcNome;
    }

    public void setFuncNome(String funcNome) {
        this.funcNome = funcNome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) funcCod;
        hash += (funcNome != null ? funcNome.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuncionarioPK)) {
            return false;
        }
        FuncionarioPK other = (FuncionarioPK) object;
        if (this.funcCod != other.funcCod) {
            return false;
        }
        if ((this.funcNome == null && other.funcNome != null) || (this.funcNome != null && !this.funcNome.equals(other.funcNome))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.FuncionarioPK[ funcCod=" + funcCod + ", funcNome=" + funcNome + " ]";
    }
    
}
