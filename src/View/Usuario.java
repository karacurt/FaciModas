/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "usuario", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUserCod", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.userCod = :userCod"),
    @NamedQuery(name = "Usuario.findByUserLogin", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.userLogin = :userLogin"),
    @NamedQuery(name = "Usuario.findByUserPass", query = "SELECT u FROM Usuario u WHERE u.userPass = :userPass"),
    @NamedQuery(name = "Usuario.findByUserFuncCod", query = "SELECT u FROM Usuario u WHERE u.userFuncCod = :userFuncCod"),
    @NamedQuery(name = "Usuario.findByUserTipo", query = "SELECT u FROM Usuario u WHERE u.userTipo = :userTipo")})
public class Usuario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioPK usuarioPK;
    @Basic(optional = false)
    @Column(name = "user_pass")
    private String userPass;
    @Basic(optional = false)
    @Column(name = "user_func_cod")
    private String userFuncCod;
    @Basic(optional = false)
    @Column(name = "user_tipo")
    private String userTipo;

    public Usuario() {
    }

    public Usuario(UsuarioPK usuarioPK) {
        this.usuarioPK = usuarioPK;
    }

    public Usuario(UsuarioPK usuarioPK, String userPass, String userFuncCod, String userTipo) {
        this.usuarioPK = usuarioPK;
        this.userPass = userPass;
        this.userFuncCod = userFuncCod;
        this.userTipo = userTipo;
    }

    public Usuario(int userCod, String userLogin) {
        this.usuarioPK = new UsuarioPK(userCod, userLogin);
    }

    public UsuarioPK getUsuarioPK() {
        return usuarioPK;
    }

    public void setUsuarioPK(UsuarioPK usuarioPK) {
        this.usuarioPK = usuarioPK;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        String oldUserPass = this.userPass;
        this.userPass = userPass;
        changeSupport.firePropertyChange("userPass", oldUserPass, userPass);
    }

    public String getUserFuncCod() {
        return userFuncCod;
    }

    public void setUserFuncCod(String userFuncCod) {
        String oldUserFuncCod = this.userFuncCod;
        this.userFuncCod = userFuncCod;
        changeSupport.firePropertyChange("userFuncCod", oldUserFuncCod, userFuncCod);
    }

    public String getUserTipo() {
        return userTipo;
    }

    public void setUserTipo(String userTipo) {
        String oldUserTipo = this.userTipo;
        this.userTipo = userTipo;
        changeSupport.firePropertyChange("userTipo", oldUserTipo, userTipo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioPK != null ? usuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioPK == null && other.usuarioPK != null) || (this.usuarioPK != null && !this.usuarioPK.equals(other.usuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Usuario[ usuarioPK=" + usuarioPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
