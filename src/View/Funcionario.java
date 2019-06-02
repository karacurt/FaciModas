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
@Table(name = "funcionario", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByFuncCod", query = "SELECT f FROM Funcionario f WHERE f.funcionarioPK.funcCod = :funcCod"),
    @NamedQuery(name = "Funcionario.findByFuncCpf", query = "SELECT f FROM Funcionario f WHERE f.funcCpf = :funcCpf"),
    @NamedQuery(name = "Funcionario.findByFuncRg", query = "SELECT f FROM Funcionario f WHERE f.funcRg = :funcRg"),
    @NamedQuery(name = "Funcionario.findByFuncCtps", query = "SELECT f FROM Funcionario f WHERE f.funcCtps = :funcCtps"),
    @NamedQuery(name = "Funcionario.findByFuncNome", query = "SELECT f FROM Funcionario f WHERE f.funcionarioPK.funcNome = :funcNome"),
    @NamedQuery(name = "Funcionario.findByFuncDtnasc", query = "SELECT f FROM Funcionario f WHERE f.funcDtnasc = :funcDtnasc"),
    @NamedQuery(name = "Funcionario.findByFuncEnd", query = "SELECT f FROM Funcionario f WHERE f.funcEnd = :funcEnd"),
    @NamedQuery(name = "Funcionario.findByFuncBairro", query = "SELECT f FROM Funcionario f WHERE f.funcBairro = :funcBairro"),
    @NamedQuery(name = "Funcionario.findByFuncCompl", query = "SELECT f FROM Funcionario f WHERE f.funcCompl = :funcCompl"),
    @NamedQuery(name = "Funcionario.findByFuncTel", query = "SELECT f FROM Funcionario f WHERE f.funcTel = :funcTel"),
    @NamedQuery(name = "Funcionario.findByFuncSal", query = "SELECT f FROM Funcionario f WHERE f.funcSal = :funcSal"),
    @NamedQuery(name = "Funcionario.findByFuncComi", query = "SELECT f FROM Funcionario f WHERE f.funcComi = :funcComi"),
    @NamedQuery(name = "Funcionario.findByFuncPeri", query = "SELECT f FROM Funcionario f WHERE f.funcPeri = :funcPeri"),
    @NamedQuery(name = "Funcionario.findByFuncEmail", query = "SELECT f FROM Funcionario f WHERE f.funcEmail = :funcEmail")})
public class Funcionario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FuncionarioPK funcionarioPK;
    @Basic(optional = false)
    @Column(name = "func_cpf")
    private long funcCpf;
    @Basic(optional = false)
    @Column(name = "func_rg")
    private long funcRg;
    @Basic(optional = false)
    @Column(name = "func_ctps")
    private long funcCtps;
    @Basic(optional = false)
    @Column(name = "func_dtnasc")
    @Temporal(TemporalType.DATE)
    private Date funcDtnasc;
    @Basic(optional = false)
    @Column(name = "func_end")
    private String funcEnd;
    @Basic(optional = false)
    @Column(name = "func_bairro")
    private String funcBairro;
    @Basic(optional = false)
    @Column(name = "func_compl")
    private String funcCompl;
    @Column(name = "func_tel")
    private BigInteger funcTel;
    @Basic(optional = false)
    @Column(name = "func_sal")
    private float funcSal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "func_comi")
    private Float funcComi;
    @Basic(optional = false)
    @Column(name = "func_peri")
    private String funcPeri;
    @Column(name = "func_email")
    private String funcEmail;

    public Funcionario() {
    }

    public Funcionario(FuncionarioPK funcionarioPK) {
        this.funcionarioPK = funcionarioPK;
    }

    public Funcionario(FuncionarioPK funcionarioPK, long funcCpf, long funcRg, long funcCtps, Date funcDtnasc, String funcEnd, String funcBairro, String funcCompl, float funcSal, String funcPeri) {
        this.funcionarioPK = funcionarioPK;
        this.funcCpf = funcCpf;
        this.funcRg = funcRg;
        this.funcCtps = funcCtps;
        this.funcDtnasc = funcDtnasc;
        this.funcEnd = funcEnd;
        this.funcBairro = funcBairro;
        this.funcCompl = funcCompl;
        this.funcSal = funcSal;
        this.funcPeri = funcPeri;
    }

    public Funcionario(int funcCod, String funcNome) {
        this.funcionarioPK = new FuncionarioPK(funcCod, funcNome);
    }

    public FuncionarioPK getFuncionarioPK() {
        return funcionarioPK;
    }

    public void setFuncionarioPK(FuncionarioPK funcionarioPK) {
        this.funcionarioPK = funcionarioPK;
    }

    public long getFuncCpf() {
        return funcCpf;
    }

    public void setFuncCpf(long funcCpf) {
        long oldFuncCpf = this.funcCpf;
        this.funcCpf = funcCpf;
        changeSupport.firePropertyChange("funcCpf", oldFuncCpf, funcCpf);
    }

    public long getFuncRg() {
        return funcRg;
    }

    public void setFuncRg(long funcRg) {
        long oldFuncRg = this.funcRg;
        this.funcRg = funcRg;
        changeSupport.firePropertyChange("funcRg", oldFuncRg, funcRg);
    }

    public long getFuncCtps() {
        return funcCtps;
    }

    public void setFuncCtps(long funcCtps) {
        long oldFuncCtps = this.funcCtps;
        this.funcCtps = funcCtps;
        changeSupport.firePropertyChange("funcCtps", oldFuncCtps, funcCtps);
    }

    public Date getFuncDtnasc() {
        return funcDtnasc;
    }

    public void setFuncDtnasc(Date funcDtnasc) {
        Date oldFuncDtnasc = this.funcDtnasc;
        this.funcDtnasc = funcDtnasc;
        changeSupport.firePropertyChange("funcDtnasc", oldFuncDtnasc, funcDtnasc);
    }

    public String getFuncEnd() {
        return funcEnd;
    }

    public void setFuncEnd(String funcEnd) {
        String oldFuncEnd = this.funcEnd;
        this.funcEnd = funcEnd;
        changeSupport.firePropertyChange("funcEnd", oldFuncEnd, funcEnd);
    }

    public String getFuncBairro() {
        return funcBairro;
    }

    public void setFuncBairro(String funcBairro) {
        String oldFuncBairro = this.funcBairro;
        this.funcBairro = funcBairro;
        changeSupport.firePropertyChange("funcBairro", oldFuncBairro, funcBairro);
    }

    public String getFuncCompl() {
        return funcCompl;
    }

    public void setFuncCompl(String funcCompl) {
        String oldFuncCompl = this.funcCompl;
        this.funcCompl = funcCompl;
        changeSupport.firePropertyChange("funcCompl", oldFuncCompl, funcCompl);
    }

    public BigInteger getFuncTel() {
        return funcTel;
    }

    public void setFuncTel(BigInteger funcTel) {
        BigInteger oldFuncTel = this.funcTel;
        this.funcTel = funcTel;
        changeSupport.firePropertyChange("funcTel", oldFuncTel, funcTel);
    }

    public float getFuncSal() {
        return funcSal;
    }

    public void setFuncSal(float funcSal) {
        float oldFuncSal = this.funcSal;
        this.funcSal = funcSal;
        changeSupport.firePropertyChange("funcSal", oldFuncSal, funcSal);
    }

    public Float getFuncComi() {
        return funcComi;
    }

    public void setFuncComi(Float funcComi) {
        Float oldFuncComi = this.funcComi;
        this.funcComi = funcComi;
        changeSupport.firePropertyChange("funcComi", oldFuncComi, funcComi);
    }

    public String getFuncPeri() {
        return funcPeri;
    }

    public void setFuncPeri(String funcPeri) {
        String oldFuncPeri = this.funcPeri;
        this.funcPeri = funcPeri;
        changeSupport.firePropertyChange("funcPeri", oldFuncPeri, funcPeri);
    }

    public String getFuncEmail() {
        return funcEmail;
    }

    public void setFuncEmail(String funcEmail) {
        String oldFuncEmail = this.funcEmail;
        this.funcEmail = funcEmail;
        changeSupport.firePropertyChange("funcEmail", oldFuncEmail, funcEmail);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (funcionarioPK != null ? funcionarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.funcionarioPK == null && other.funcionarioPK != null) || (this.funcionarioPK != null && !this.funcionarioPK.equals(other.funcionarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Funcionario[ funcionarioPK=" + funcionarioPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
