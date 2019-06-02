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
 * @author lab0519
 */
@Embeddable
public class FornecedorPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "forn_cod")
    private int fornCod;
    @Basic(optional = false)
    @Column(name = "forn_cnpj")
    private long fornCnpj;

    public FornecedorPK() {
    }

    public FornecedorPK(int fornCod, long fornCnpj) {
        this.fornCod = fornCod;
        this.fornCnpj = fornCnpj;
    }

    public int getFornCod() {
        return fornCod;
    }

    public void setFornCod(int fornCod) {
        this.fornCod = fornCod;
    }

    public long getFornCnpj() {
        return fornCnpj;
    }

    public void setFornCnpj(long fornCnpj) {
        this.fornCnpj = fornCnpj;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fornCod;
        hash += (int) fornCnpj;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FornecedorPK)) {
            return false;
        }
        FornecedorPK other = (FornecedorPK) object;
        if (this.fornCod != other.fornCod) {
            return false;
        }
        if (this.fornCnpj != other.fornCnpj) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.FornecedorPK[ fornCod=" + fornCod + ", fornCnpj=" + fornCnpj + " ]";
    }
    
}
