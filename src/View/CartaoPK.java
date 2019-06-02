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
public class CartaoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "cart_cod")
    private int cartCod;
    @Basic(optional = false)
    @Column(name = "cart_num")
    private long cartNum;

    public CartaoPK() {
    }

    public CartaoPK(int cartCod, long cartNum) {
        this.cartCod = cartCod;
        this.cartNum = cartNum;
    }

    public int getCartCod() {
        return cartCod;
    }

    public void setCartCod(int cartCod) {
        this.cartCod = cartCod;
    }

    public long getCartNum() {
        return cartNum;
    }

    public void setCartNum(long cartNum) {
        this.cartNum = cartNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cartCod;
        hash += (int) cartNum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartaoPK)) {
            return false;
        }
        CartaoPK other = (CartaoPK) object;
        if (this.cartCod != other.cartCod) {
            return false;
        }
        if (this.cartNum != other.cartNum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.CartaoPK[ cartCod=" + cartCod + ", cartNum=" + cartNum + " ]";
    }
    
}
