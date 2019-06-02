/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
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
 * @author lab0519
 */
@Entity
@Table(name = "fornecedor", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByFornCod", query = "SELECT f FROM Fornecedor f WHERE f.fornecedorPK.fornCod = :fornCod"),
    @NamedQuery(name = "Fornecedor.findByFornCnpj", query = "SELECT f FROM Fornecedor f WHERE f.fornecedorPK.fornCnpj = :fornCnpj"),
    @NamedQuery(name = "Fornecedor.findByFornIe", query = "SELECT f FROM Fornecedor f WHERE f.fornIe = :fornIe"),
    @NamedQuery(name = "Fornecedor.findByFornRasoci", query = "SELECT f FROM Fornecedor f WHERE f.fornRasoci = :fornRasoci"),
    @NamedQuery(name = "Fornecedor.findByFornEnd", query = "SELECT f FROM Fornecedor f WHERE f.fornEnd = :fornEnd"),
    @NamedQuery(name = "Fornecedor.findByFornBairro", query = "SELECT f FROM Fornecedor f WHERE f.fornBairro = :fornBairro"),
    @NamedQuery(name = "Fornecedor.findByFornCompl", query = "SELECT f FROM Fornecedor f WHERE f.fornCompl = :fornCompl"),
    @NamedQuery(name = "Fornecedor.findByFornCep", query = "SELECT f FROM Fornecedor f WHERE f.fornCep = :fornCep"),
    @NamedQuery(name = "Fornecedor.findByFornTel", query = "SELECT f FROM Fornecedor f WHERE f.fornTel = :fornTel"),
    @NamedQuery(name = "Fornecedor.findByFornEmail", query = "SELECT f FROM Fornecedor f WHERE f.fornEmail = :fornEmail")})
public class Fornecedor implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FornecedorPK fornecedorPK;
    @Column(name = "forn_ie")
    private BigInteger fornIe;
    @Basic(optional = false)
    @Column(name = "forn_rasoci")
    private String fornRasoci;
    @Column(name = "forn_end")
    private String fornEnd;
    @Basic(optional = false)
    @Column(name = "forn_bairro")
    private String fornBairro;
    @Basic(optional = false)
    @Column(name = "forn_compl")
    private String fornCompl;
    @Column(name = "forn_cep")
    private Integer fornCep;
    @Column(name = "forn_tel")
    private BigInteger fornTel;
    @Basic(optional = false)
    @Column(name = "forn_email")
    private String fornEmail;

    public Fornecedor() {
    }

    public Fornecedor(FornecedorPK fornecedorPK) {
        this.fornecedorPK = fornecedorPK;
    }

    public Fornecedor(FornecedorPK fornecedorPK, String fornRasoci, String fornBairro, String fornCompl, String fornEmail) {
        this.fornecedorPK = fornecedorPK;
        this.fornRasoci = fornRasoci;
        this.fornBairro = fornBairro;
        this.fornCompl = fornCompl;
        this.fornEmail = fornEmail;
    }

    public Fornecedor(int fornCod, long fornCnpj) {
        this.fornecedorPK = new FornecedorPK(fornCod, fornCnpj);
    }

    public FornecedorPK getFornecedorPK() {
        return fornecedorPK;
    }

    public void setFornecedorPK(FornecedorPK fornecedorPK) {
        this.fornecedorPK = fornecedorPK;
    }

    public BigInteger getFornIe() {
        return fornIe;
    }

    public void setFornIe(BigInteger fornIe) {
        BigInteger oldFornIe = this.fornIe;
        this.fornIe = fornIe;
        changeSupport.firePropertyChange("fornIe", oldFornIe, fornIe);
    }

    public String getFornRasoci() {
        return fornRasoci;
    }

    public void setFornRasoci(String fornRasoci) {
        String oldFornRasoci = this.fornRasoci;
        this.fornRasoci = fornRasoci;
        changeSupport.firePropertyChange("fornRasoci", oldFornRasoci, fornRasoci);
    }

    public String getFornEnd() {
        return fornEnd;
    }

    public void setFornEnd(String fornEnd) {
        String oldFornEnd = this.fornEnd;
        this.fornEnd = fornEnd;
        changeSupport.firePropertyChange("fornEnd", oldFornEnd, fornEnd);
    }

    public String getFornBairro() {
        return fornBairro;
    }

    public void setFornBairro(String fornBairro) {
        String oldFornBairro = this.fornBairro;
        this.fornBairro = fornBairro;
        changeSupport.firePropertyChange("fornBairro", oldFornBairro, fornBairro);
    }

    public String getFornCompl() {
        return fornCompl;
    }

    public void setFornCompl(String fornCompl) {
        String oldFornCompl = this.fornCompl;
        this.fornCompl = fornCompl;
        changeSupport.firePropertyChange("fornCompl", oldFornCompl, fornCompl);
    }

    public Integer getFornCep() {
        return fornCep;
    }

    public void setFornCep(Integer fornCep) {
        Integer oldFornCep = this.fornCep;
        this.fornCep = fornCep;
        changeSupport.firePropertyChange("fornCep", oldFornCep, fornCep);
    }

    public BigInteger getFornTel() {
        return fornTel;
    }

    public void setFornTel(BigInteger fornTel) {
        BigInteger oldFornTel = this.fornTel;
        this.fornTel = fornTel;
        changeSupport.firePropertyChange("fornTel", oldFornTel, fornTel);
    }

    public String getFornEmail() {
        return fornEmail;
    }

    public void setFornEmail(String fornEmail) {
        String oldFornEmail = this.fornEmail;
        this.fornEmail = fornEmail;
        changeSupport.firePropertyChange("fornEmail", oldFornEmail, fornEmail);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fornecedorPK != null ? fornecedorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.fornecedorPK == null && other.fornecedorPK != null) || (this.fornecedorPK != null && !this.fornecedorPK.equals(other.fornecedorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Fornecedor[ fornecedorPK=" + fornecedorPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
