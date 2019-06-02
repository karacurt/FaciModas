/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Xavier
 */
@Entity
@Table(name = "pedido", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByPediCod", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.pediCod = :pediCod"),
    @NamedQuery(name = "Pedido.findByPediData", query = "SELECT p FROM Pedido p WHERE p.pedidoPK.pediData = :pediData"),
    @NamedQuery(name = "Pedido.findByPediCliCod", query = "SELECT p FROM Pedido p WHERE p.pediCliCod = :pediCliCod"),
    @NamedQuery(name = "Pedido.findByPediDesc", query = "SELECT p FROM Pedido p WHERE p.pediDesc = :pediDesc"),
    @NamedQuery(name = "Pedido.findByPediObs", query = "SELECT p FROM Pedido p WHERE p.pediObs = :pediObs"),
    @NamedQuery(name = "Pedido.findByPediTotal", query = "SELECT p FROM Pedido p WHERE p.pediTotal = :pediTotal"),
    @NamedQuery(name = "Pedido.findByPediForpaga", query = "SELECT p FROM Pedido p WHERE p.pediForpaga = :pediForpaga"),
    @NamedQuery(name = "Pedido.findByPediCodfunc", query = "SELECT p FROM Pedido p WHERE p.pediCodfunc = :pediCodfunc")})
public class Pedido implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PedidoPK pedidoPK;
    @Basic(optional = false)
    @Column(name = "pedi_cli_cod")
    private int pediCliCod;
    @Column(name = "pedi_desc")
    private String pediDesc;
    @Basic(optional = false)
    @Column(name = "pedi_obs")
    private String pediObs;
    @Basic(optional = false)
    @Column(name = "pedi_total")
    private float pediTotal;
    @Basic(optional = false)
    @Column(name = "pedi_forpaga")
    private String pediForpaga;
    @Basic(optional = false)
    @Column(name = "pedi_codfunc")
    private int pediCodfunc;

    public Pedido() {
    }

    public Pedido(PedidoPK pedidoPK) {
        this.pedidoPK = pedidoPK;
    }

    public Pedido(PedidoPK pedidoPK, int pediCliCod, String pediObs, float pediTotal, String pediForpaga, int pediCodfunc) {
        this.pedidoPK = pedidoPK;
        this.pediCliCod = pediCliCod;
        this.pediObs = pediObs;
        this.pediTotal = pediTotal;
        this.pediForpaga = pediForpaga;
        this.pediCodfunc = pediCodfunc;
    }

    public Pedido(int pediCod, Date pediData) {
        this.pedidoPK = new PedidoPK(pediCod, pediData);
    }

    public PedidoPK getPedidoPK() {
        return pedidoPK;
    }

    public void setPedidoPK(PedidoPK pedidoPK) {
        this.pedidoPK = pedidoPK;
    }

    public int getPediCliCod() {
        return pediCliCod;
    }

    public void setPediCliCod(int pediCliCod) {
        int oldPediCliCod = this.pediCliCod;
        this.pediCliCod = pediCliCod;
        changeSupport.firePropertyChange("pediCliCod", oldPediCliCod, pediCliCod);
    }

    public String getPediDesc() {
        return pediDesc;
    }

    public void setPediDesc(String pediDesc) {
        String oldPediDesc = this.pediDesc;
        this.pediDesc = pediDesc;
        changeSupport.firePropertyChange("pediDesc", oldPediDesc, pediDesc);
    }

    public String getPediObs() {
        return pediObs;
    }

    public void setPediObs(String pediObs) {
        String oldPediObs = this.pediObs;
        this.pediObs = pediObs;
        changeSupport.firePropertyChange("pediObs", oldPediObs, pediObs);
    }

    public float getPediTotal() {
        return pediTotal;
    }

    public void setPediTotal(float pediTotal) {
        float oldPediTotal = this.pediTotal;
        this.pediTotal = pediTotal;
        changeSupport.firePropertyChange("pediTotal", oldPediTotal, pediTotal);
    }

    public String getPediForpaga() {
        return pediForpaga;
    }

    public void setPediForpaga(String pediForpaga) {
        String oldPediForpaga = this.pediForpaga;
        this.pediForpaga = pediForpaga;
        changeSupport.firePropertyChange("pediForpaga", oldPediForpaga, pediForpaga);
    }

    public int getPediCodfunc() {
        return pediCodfunc;
    }

    public void setPediCodfunc(int pediCodfunc) {
        int oldPediCodfunc = this.pediCodfunc;
        this.pediCodfunc = pediCodfunc;
        changeSupport.firePropertyChange("pediCodfunc", oldPediCodfunc, pediCodfunc);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedidoPK != null ? pedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedidoPK == null && other.pedidoPK != null) || (this.pedidoPK != null && !this.pedidoPK.equals(other.pedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Pedido[ pedidoPK=" + pedidoPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
