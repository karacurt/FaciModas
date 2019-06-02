/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Xavier
 */
@Embeddable
public class PedidoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "pedi_cod")
    private int pediCod;
    @Basic(optional = false)
    @Column(name = "pedi_data")
    @Temporal(TemporalType.DATE)
    private Date pediData;

    public PedidoPK() {
    }

    public PedidoPK(int pediCod, Date pediData) {
        this.pediCod = pediCod;
        this.pediData = pediData;
    }

    public int getPediCod() {
        return pediCod;
    }

    public void setPediCod(int pediCod) {
        this.pediCod = pediCod;
    }

    public Date getPediData() {
        return pediData;
    }

    public void setPediData(Date pediData) {
        this.pediData = pediData;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pediCod;
        hash += (pediData != null ? pediData.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoPK)) {
            return false;
        }
        PedidoPK other = (PedidoPK) object;
        if (this.pediCod != other.pediCod) {
            return false;
        }
        if ((this.pediData == null && other.pediData != null) || (this.pediData != null && !this.pediData.equals(other.pediData))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.PedidoPK[ pediCod=" + pediCod + ", pediData=" + pediData + " ]";
    }
    
}
