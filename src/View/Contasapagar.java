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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Xavier
 */
@Entity
@Table(name = "contasapagar", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Contasapagar.findAll", query = "SELECT c FROM Contasapagar c"),
    @NamedQuery(name = "Contasapagar.findByCapCod", query = "SELECT c FROM Contasapagar c WHERE c.capCod = :capCod"),
    @NamedQuery(name = "Contasapagar.findByCapDte", query = "SELECT c FROM Contasapagar c WHERE c.capDte = :capDte"),
    @NamedQuery(name = "Contasapagar.findByCapDtvenc", query = "SELECT c FROM Contasapagar c WHERE c.capDtvenc = :capDtvenc"),
    @NamedQuery(name = "Contasapagar.findByCapCobrador", query = "SELECT c FROM Contasapagar c WHERE c.capCobrador = :capCobrador"),
    @NamedQuery(name = "Contasapagar.findByCapNcobra", query = "SELECT c FROM Contasapagar c WHERE c.capNcobra = :capNcobra"),
    @NamedQuery(name = "Contasapagar.findByCapTipo", query = "SELECT c FROM Contasapagar c WHERE c.capTipo = :capTipo"),
    @NamedQuery(name = "Contasapagar.findByCapValor", query = "SELECT c FROM Contasapagar c WHERE c.capValor = :capValor"),
    @NamedQuery(name = "Contasapagar.findByCapStatus", query = "SELECT c FROM Contasapagar c WHERE c.capStatus = :capStatus"),
    @NamedQuery(name = "Contasapagar.findByCapDesc", query = "SELECT c FROM Contasapagar c WHERE c.capDesc = :capDesc"),
    @NamedQuery(name = "Contasapagar.findByCapObs", query = "SELECT c FROM Contasapagar c WHERE c.capObs = :capObs")})
public class Contasapagar implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cap_cod")
    private Integer capCod;
    @Basic(optional = false)
    @Column(name = "cap_dte")
    @Temporal(TemporalType.DATE)
    private Date capDte;
    @Basic(optional = false)
    @Column(name = "cap_dtvenc")
    @Temporal(TemporalType.DATE)
    private Date capDtvenc;
    @Basic(optional = false)
    @Column(name = "cap_cobrador")
    private String capCobrador;
    @Basic(optional = false)
    @Column(name = "cap_ncobra")
    private String capNcobra;
    @Basic(optional = false)
    @Column(name = "cap_tipo")
    private String capTipo;
    @Basic(optional = false)
    @Column(name = "cap_valor")
    private float capValor;
    @Basic(optional = false)
    @Column(name = "cap_status")
    private String capStatus;
    @Basic(optional = false)
    @Column(name = "cap_desc")
    private String capDesc;
    @Basic(optional = false)
    @Column(name = "cap_obs")
    private String capObs;

    public Contasapagar() {
    }

    public Contasapagar(Integer capCod) {
        this.capCod = capCod;
    }

    public Contasapagar(Integer capCod, Date capDte, Date capDtvenc, String capCobrador, String capNcobra, String capTipo, float capValor, String capStatus, String capDesc, String capObs) {
        this.capCod = capCod;
        this.capDte = capDte;
        this.capDtvenc = capDtvenc;
        this.capCobrador = capCobrador;
        this.capNcobra = capNcobra;
        this.capTipo = capTipo;
        this.capValor = capValor;
        this.capStatus = capStatus;
        this.capDesc = capDesc;
        this.capObs = capObs;
    }

    public Integer getCapCod() {
        return capCod;
    }

    public void setCapCod(Integer capCod) {
        Integer oldCapCod = this.capCod;
        this.capCod = capCod;
        changeSupport.firePropertyChange("capCod", oldCapCod, capCod);
    }

    public Date getCapDte() {
        return capDte;
    }

    public void setCapDte(Date capDte) {
        Date oldCapDte = this.capDte;
        this.capDte = capDte;
        changeSupport.firePropertyChange("capDte", oldCapDte, capDte);
    }

    public Date getCapDtvenc() {
        return capDtvenc;
    }

    public void setCapDtvenc(Date capDtvenc) {
        Date oldCapDtvenc = this.capDtvenc;
        this.capDtvenc = capDtvenc;
        changeSupport.firePropertyChange("capDtvenc", oldCapDtvenc, capDtvenc);
    }

    public String getCapCobrador() {
        return capCobrador;
    }

    public void setCapCobrador(String capCobrador) {
        String oldCapCobrador = this.capCobrador;
        this.capCobrador = capCobrador;
        changeSupport.firePropertyChange("capCobrador", oldCapCobrador, capCobrador);
    }

    public String getCapNcobra() {
        return capNcobra;
    }

    public void setCapNcobra(String capNcobra) {
        String oldCapNcobra = this.capNcobra;
        this.capNcobra = capNcobra;
        changeSupport.firePropertyChange("capNcobra", oldCapNcobra, capNcobra);
    }

    public String getCapTipo() {
        return capTipo;
    }

    public void setCapTipo(String capTipo) {
        String oldCapTipo = this.capTipo;
        this.capTipo = capTipo;
        changeSupport.firePropertyChange("capTipo", oldCapTipo, capTipo);
    }

    public float getCapValor() {
        return capValor;
    }

    public void setCapValor(float capValor) {
        float oldCapValor = this.capValor;
        this.capValor = capValor;
        changeSupport.firePropertyChange("capValor", oldCapValor, capValor);
    }

    public String getCapStatus() {
        return capStatus;
    }

    public void setCapStatus(String capStatus) {
        String oldCapStatus = this.capStatus;
        this.capStatus = capStatus;
        changeSupport.firePropertyChange("capStatus", oldCapStatus, capStatus);
    }

    public String getCapDesc() {
        return capDesc;
    }

    public void setCapDesc(String capDesc) {
        String oldCapDesc = this.capDesc;
        this.capDesc = capDesc;
        changeSupport.firePropertyChange("capDesc", oldCapDesc, capDesc);
    }

    public String getCapObs() {
        return capObs;
    }

    public void setCapObs(String capObs) {
        String oldCapObs = this.capObs;
        this.capObs = capObs;
        changeSupport.firePropertyChange("capObs", oldCapObs, capObs);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (capCod != null ? capCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contasapagar)) {
            return false;
        }
        Contasapagar other = (Contasapagar) object;
        if ((this.capCod == null && other.capCod != null) || (this.capCod != null && !this.capCod.equals(other.capCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Contasapagar[ capCod=" + capCod + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
