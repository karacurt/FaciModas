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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author lab0519
 */
@Entity
@Table(name = "cartao", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cartao.findAll", query = "SELECT c FROM Cartao c"),
    @NamedQuery(name = "Cartao.findByCartCod", query = "SELECT c FROM Cartao c WHERE c.cartaoPK.cartCod = :cartCod"),
    @NamedQuery(name = "Cartao.findByCartNum", query = "SELECT c FROM Cartao c WHERE c.cartaoPK.cartNum = :cartNum"),
    @NamedQuery(name = "Cartao.findByCartCliDtnasc", query = "SELECT c FROM Cartao c WHERE c.cartCliDtnasc = :cartCliDtnasc"),
    @NamedQuery(name = "Cartao.findByCartCliNome", query = "SELECT c FROM Cartao c WHERE c.cartCliNome = :cartCliNome"),
    @NamedQuery(name = "Cartao.findByCartCliCpf", query = "SELECT c FROM Cartao c WHERE c.cartCliCpf = :cartCliCpf"),
    @NamedQuery(name = "Cartao.findByCartVal", query = "SELECT c FROM Cartao c WHERE c.cartVal = :cartVal"),
    @NamedQuery(name = "Cartao.findByCartGrufi", query = "SELECT c FROM Cartao c WHERE c.cartGrufi = :cartGrufi"),
    @NamedQuery(name = "Cartao.findByCartSexo", query = "SELECT c FROM Cartao c WHERE c.cartSexo = :cartSexo"),
    @NamedQuery(name = "Cartao.findByCartEstacivil", query = "SELECT c FROM Cartao c WHERE c.cartEstacivil = :cartEstacivil")})
public class Cartao implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CartaoPK cartaoPK;
    @Basic(optional = false)
    @Column(name = "cart_cli_dtnasc")
    @Temporal(TemporalType.DATE)
    private Date cartCliDtnasc;
    @Basic(optional = false)
    @Column(name = "cart_cli_nome")
    private String cartCliNome;
    @Basic(optional = false)
    @Column(name = "cart_cli_cpf")
    private long cartCliCpf;
    @Basic(optional = false)
    @Column(name = "cart_val")
    @Temporal(TemporalType.DATE)
    private Date cartVal;
    @Basic(optional = false)
    @Column(name = "cart_grufi")
    private String cartGrufi;
    @Basic(optional = false)
    @Column(name = "cart_sexo")
    private String cartSexo;
    @Basic(optional = false)
    @Column(name = "cart_estacivil")
    private String cartEstacivil;

    public Cartao() {
    }

    public Cartao(CartaoPK cartaoPK) {
        this.cartaoPK = cartaoPK;
    }

    public Cartao(CartaoPK cartaoPK, Date cartCliDtnasc, String cartCliNome, long cartCliCpf, Date cartVal, String cartGrufi, String cartSexo, String cartEstacivil) {
        this.cartaoPK = cartaoPK;
        this.cartCliDtnasc = cartCliDtnasc;
        this.cartCliNome = cartCliNome;
        this.cartCliCpf = cartCliCpf;
        this.cartVal = cartVal;
        this.cartGrufi = cartGrufi;
        this.cartSexo = cartSexo;
        this.cartEstacivil = cartEstacivil;
    }

    public Cartao(int cartCod, long cartNum) {
        this.cartaoPK = new CartaoPK(cartCod, cartNum);
    }

    public CartaoPK getCartaoPK() {
        return cartaoPK;
    }

    public void setCartaoPK(CartaoPK cartaoPK) {
        this.cartaoPK = cartaoPK;
    }

    public Date getCartCliDtnasc() {
        return cartCliDtnasc;
    }

    public void setCartCliDtnasc(Date cartCliDtnasc) {
        Date oldCartCliDtnasc = this.cartCliDtnasc;
        this.cartCliDtnasc = cartCliDtnasc;
        changeSupport.firePropertyChange("cartCliDtnasc", oldCartCliDtnasc, cartCliDtnasc);
    }

    public String getCartCliNome() {
        return cartCliNome;
    }

    public void setCartCliNome(String cartCliNome) {
        String oldCartCliNome = this.cartCliNome;
        this.cartCliNome = cartCliNome;
        changeSupport.firePropertyChange("cartCliNome", oldCartCliNome, cartCliNome);
    }

    public long getCartCliCpf() {
        return cartCliCpf;
    }

    public void setCartCliCpf(long cartCliCpf) {
        long oldCartCliCpf = this.cartCliCpf;
        this.cartCliCpf = cartCliCpf;
        changeSupport.firePropertyChange("cartCliCpf", oldCartCliCpf, cartCliCpf);
    }

    public Date getCartVal() {
        return cartVal;
    }

    public void setCartVal(Date cartVal) {
        Date oldCartVal = this.cartVal;
        this.cartVal = cartVal;
        changeSupport.firePropertyChange("cartVal", oldCartVal, cartVal);
    }

    public String getCartGrufi() {
        return cartGrufi;
    }

    public void setCartGrufi(String cartGrufi) {
        String oldCartGrufi = this.cartGrufi;
        this.cartGrufi = cartGrufi;
        changeSupport.firePropertyChange("cartGrufi", oldCartGrufi, cartGrufi);
    }

    public String getCartSexo() {
        return cartSexo;
    }

    public void setCartSexo(String cartSexo) {
        String oldCartSexo = this.cartSexo;
        this.cartSexo = cartSexo;
        changeSupport.firePropertyChange("cartSexo", oldCartSexo, cartSexo);
    }

    public String getCartEstacivil() {
        return cartEstacivil;
    }

    public void setCartEstacivil(String cartEstacivil) {
        String oldCartEstacivil = this.cartEstacivil;
        this.cartEstacivil = cartEstacivil;
        changeSupport.firePropertyChange("cartEstacivil", oldCartEstacivil, cartEstacivil);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cartaoPK != null ? cartaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartao)) {
            return false;
        }
        Cartao other = (Cartao) object;
        if ((this.cartaoPK == null && other.cartaoPK != null) || (this.cartaoPK != null && !this.cartaoPK.equals(other.cartaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Cartao[ cartaoPK=" + cartaoPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
