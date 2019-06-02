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
public class ClientePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "cli_cod")
    private int cliCod;
    @Basic(optional = false)
    @Column(name = "cli_cpf")
    private long cliCpf;

    public ClientePK() {
    }

    public ClientePK(int cliCod, long cliCpf) {
        this.cliCod = cliCod;
        this.cliCpf = cliCpf;
    }

    public int getCliCod() {
        return cliCod;
    }

    public void setCliCod(int cliCod) {
        this.cliCod = cliCod;
    }

    public long getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(long cliCpf) {
        this.cliCpf = cliCpf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cliCod;
        hash += (int) cliCpf;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientePK)) {
            return false;
        }
        ClientePK other = (ClientePK) object;
        if (this.cliCod != other.cliCod) {
            return false;
        }
        if (this.cliCpf != other.cliCpf) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.ClientePK[ cliCod=" + cliCod + ", cliCpf=" + cliCpf + " ]";
    }
    
}
