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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "cliente", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCliCod", query = "SELECT c FROM Cliente c WHERE c.clientePK.cliCod = :cliCod"),
    @NamedQuery(name = "Cliente.findByCliCpf", query = "SELECT c FROM Cliente c WHERE c.clientePK.cliCpf = :cliCpf"),
    @NamedQuery(name = "Cliente.findByCliRg", query = "SELECT c FROM Cliente c WHERE c.cliRg = :cliRg"),
    @NamedQuery(name = "Cliente.findByCliNome", query = "SELECT c FROM Cliente c WHERE c.cliNome = :cliNome"),
    @NamedQuery(name = "Cliente.findByCliEnd", query = "SELECT c FROM Cliente c WHERE c.cliEnd = :cliEnd"),
    @NamedQuery(name = "Cliente.findByCliBairro", query = "SELECT c FROM Cliente c WHERE c.cliBairro = :cliBairro"),
    @NamedQuery(name = "Cliente.findByCliCompl", query = "SELECT c FROM Cliente c WHERE c.cliCompl = :cliCompl"),
    @NamedQuery(name = "Cliente.findByCliCep", query = "SELECT c FROM Cliente c WHERE c.cliCep = :cliCep"),
    @NamedQuery(name = "Cliente.findByCliTel", query = "SELECT c FROM Cliente c WHERE c.cliTel = :cliTel"),
    @NamedQuery(name = "Cliente.findByCliEmail", query = "SELECT c FROM Cliente c WHERE c.cliEmail = :cliEmail"),
    @NamedQuery(name = "Cliente.findByCliDtnasc", query = "SELECT c FROM Cliente c WHERE c.cliDtnasc = :cliDtnasc"),
    @NamedQuery(name = "Cliente.findByCliPontpromo", query = "SELECT c FROM Cliente c WHERE c.cliPontpromo = :cliPontpromo")})
public class Cliente implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClientePK clientePK;
    @Basic(optional = false)
    @Column(name = "cli_rg")
    private long cliRg;
    @Basic(optional = false)
    @Column(name = "cli_nome")
    private String cliNome;
    @Basic(optional = false)
    @Column(name = "cli_end")
    private String cliEnd;
    @Basic(optional = false)
    @Column(name = "cli_bairro")
    private String cliBairro;
    @Basic(optional = false)
    @Column(name = "cli_compl")
    private String cliCompl;
    @Basic(optional = false)
    @Column(name = "cli_cep")
    private int cliCep;
    @Column(name = "cli_tel")
    private BigInteger cliTel;
    @Column(name = "cli_email")
    private String cliEmail;
    @Basic(optional = false)
    @Column(name = "cli_dtnasc")
    @Temporal(TemporalType.DATE)
    private Date cliDtnasc;
    @Column(name = "cli_pontpromo")
    private Integer cliPontpromo;

    public Cliente() {
    }

    public Cliente(ClientePK clientePK) {
        this.clientePK = clientePK;
    }

    public Cliente(ClientePK clientePK, long cliRg, String cliNome, String cliEnd, String cliBairro, String cliCompl, int cliCep, Date cliDtnasc) {
        this.clientePK = clientePK;
        this.cliRg = cliRg;
        this.cliNome = cliNome;
        this.cliEnd = cliEnd;
        this.cliBairro = cliBairro;
        this.cliCompl = cliCompl;
        this.cliCep = cliCep;
        this.cliDtnasc = cliDtnasc;
    }

    public Cliente(int cliCod, long cliCpf) {
        this.clientePK = new ClientePK(cliCod, cliCpf);
    }

    public ClientePK getClientePK() {
        return clientePK;
    }

    public void setClientePK(ClientePK clientePK) {
        this.clientePK = clientePK;
    }

    public long getCliRg() {
        return cliRg;
    }

    public void setCliRg(long cliRg) {
        long oldCliRg = this.cliRg;
        this.cliRg = cliRg;
        changeSupport.firePropertyChange("cliRg", oldCliRg, cliRg);
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        String oldCliNome = this.cliNome;
        this.cliNome = cliNome;
        changeSupport.firePropertyChange("cliNome", oldCliNome, cliNome);
    }

    public String getCliEnd() {
        return cliEnd;
    }

    public void setCliEnd(String cliEnd) {
        String oldCliEnd = this.cliEnd;
        this.cliEnd = cliEnd;
        changeSupport.firePropertyChange("cliEnd", oldCliEnd, cliEnd);
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        String oldCliBairro = this.cliBairro;
        this.cliBairro = cliBairro;
        changeSupport.firePropertyChange("cliBairro", oldCliBairro, cliBairro);
    }

    public String getCliCompl() {
        return cliCompl;
    }

    public void setCliCompl(String cliCompl) {
        String oldCliCompl = this.cliCompl;
        this.cliCompl = cliCompl;
        changeSupport.firePropertyChange("cliCompl", oldCliCompl, cliCompl);
    }

    public int getCliCep() {
        return cliCep;
    }

    public void setCliCep(int cliCep) {
        int oldCliCep = this.cliCep;
        this.cliCep = cliCep;
        changeSupport.firePropertyChange("cliCep", oldCliCep, cliCep);
    }

    public BigInteger getCliTel() {
        return cliTel;
    }

    public void setCliTel(BigInteger cliTel) {
        BigInteger oldCliTel = this.cliTel;
        this.cliTel = cliTel;
        changeSupport.firePropertyChange("cliTel", oldCliTel, cliTel);
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        String oldCliEmail = this.cliEmail;
        this.cliEmail = cliEmail;
        changeSupport.firePropertyChange("cliEmail", oldCliEmail, cliEmail);
    }

    public Date getCliDtnasc() {
        return cliDtnasc;
    }

    public void setCliDtnasc(Date cliDtnasc) {
        Date oldCliDtnasc = this.cliDtnasc;
        this.cliDtnasc = cliDtnasc;
        changeSupport.firePropertyChange("cliDtnasc", oldCliDtnasc, cliDtnasc);
    }

    public Integer getCliPontpromo() {
        return cliPontpromo;
    }

    public void setCliPontpromo(Integer cliPontpromo) {
        Integer oldCliPontpromo = this.cliPontpromo;
        this.cliPontpromo = cliPontpromo;
        changeSupport.firePropertyChange("cliPontpromo", oldCliPontpromo, cliPontpromo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientePK != null ? clientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clientePK == null && other.clientePK != null) || (this.clientePK != null && !this.clientePK.equals(other.clientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Cliente[ clientePK=" + clientePK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
