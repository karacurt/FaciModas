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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Xavier
 */
@Entity
@Table(name = "produto", catalog = "loja", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByProdCod", query = "SELECT p FROM Produto p WHERE p.prodCod = :prodCod"),
    @NamedQuery(name = "Produto.findByProdCodbarra", query = "SELECT p FROM Produto p WHERE p.prodCodbarra = :prodCodbarra"),
    @NamedQuery(name = "Produto.findByProdNome", query = "SELECT p FROM Produto p WHERE p.prodNome = :prodNome"),
    @NamedQuery(name = "Produto.findByProdTipo", query = "SELECT p FROM Produto p WHERE p.prodTipo = :prodTipo"),
    @NamedQuery(name = "Produto.findByProdMarca", query = "SELECT p FROM Produto p WHERE p.prodMarca = :prodMarca"),
    @NamedQuery(name = "Produto.findByProdVlvenda", query = "SELECT p FROM Produto p WHERE p.prodVlvenda = :prodVlvenda"),
    @NamedQuery(name = "Produto.findByProdVlforn", query = "SELECT p FROM Produto p WHERE p.prodVlforn = :prodVlforn"),
    @NamedQuery(name = "Produto.findByProdTam", query = "SELECT p FROM Produto p WHERE p.prodTam = :prodTam"),
    @NamedQuery(name = "Produto.findByProdCor", query = "SELECT p FROM Produto p WHERE p.prodCor = :prodCor"),
    @NamedQuery(name = "Produto.findByProdCate", query = "SELECT p FROM Produto p WHERE p.prodCate = :prodCate"),
    @NamedQuery(name = "Produto.findByProdQuant", query = "SELECT p FROM Produto p WHERE p.prodQuant = :prodQuant"),
    @NamedQuery(name = "Produto.findByProdTaxatri", query = "SELECT p FROM Produto p WHERE p.prodTaxatri = :prodTaxatri"),
    @NamedQuery(name = "Produto.findByProdMargem", query = "SELECT p FROM Produto p WHERE p.prodMargem = :prodMargem")})
public class Produto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prod_cod")
    private Integer prodCod;
    @Basic(optional = false)
    @Column(name = "prod_codbarra")
    private String prodCodbarra;
    @Basic(optional = false)
    @Column(name = "prod_nome")
    private String prodNome;
    @Basic(optional = false)
    @Column(name = "prod_tipo")
    private String prodTipo;
    @Basic(optional = false)
    @Column(name = "prod_marca")
    private String prodMarca;
    @Basic(optional = false)
    @Column(name = "prod_vlvenda")
    private float prodVlvenda;
    @Basic(optional = false)
    @Column(name = "prod_vlforn")
    private float prodVlforn;
    @Basic(optional = false)
    @Column(name = "prod_tam")
    private String prodTam;
    @Basic(optional = false)
    @Column(name = "prod_cor")
    private String prodCor;
    @Basic(optional = false)
    @Column(name = "prod_cate")
    private String prodCate;
    @Basic(optional = false)
    @Column(name = "prod_quant")
    private int prodQuant;
    @Basic(optional = false)
    @Column(name = "prod_taxatri")
    private float prodTaxatri;
    @Basic(optional = false)
    @Column(name = "prod_margem")
    private float prodMargem;

    public Produto() {
    }

    public Produto(Integer prodCod) {
        this.prodCod = prodCod;
    }

    public Produto(Integer prodCod, String prodCodbarra, String prodNome, String prodTipo, String prodMarca, float prodVlvenda, float prodVlforn, String prodTam, String prodCor, String prodCate, int prodQuant, float prodTaxatri, float prodMargem) {
        this.prodCod = prodCod;
        this.prodCodbarra = prodCodbarra;
        this.prodNome = prodNome;
        this.prodTipo = prodTipo;
        this.prodMarca = prodMarca;
        this.prodVlvenda = prodVlvenda;
        this.prodVlforn = prodVlforn;
        this.prodTam = prodTam;
        this.prodCor = prodCor;
        this.prodCate = prodCate;
        this.prodQuant = prodQuant;
        this.prodTaxatri = prodTaxatri;
        this.prodMargem = prodMargem;
    }

    public Integer getProdCod() {
        return prodCod;
    }

    public void setProdCod(Integer prodCod) {
        Integer oldProdCod = this.prodCod;
        this.prodCod = prodCod;
        changeSupport.firePropertyChange("prodCod", oldProdCod, prodCod);
    }

    public String getProdCodbarra() {
        return prodCodbarra;
    }

    public void setProdCodbarra(String prodCodbarra) {
        String oldProdCodbarra = this.prodCodbarra;
        this.prodCodbarra = prodCodbarra;
        changeSupport.firePropertyChange("prodCodbarra", oldProdCodbarra, prodCodbarra);
    }

    public String getProdNome() {
        return prodNome;
    }

    public void setProdNome(String prodNome) {
        String oldProdNome = this.prodNome;
        this.prodNome = prodNome;
        changeSupport.firePropertyChange("prodNome", oldProdNome, prodNome);
    }

    public String getProdTipo() {
        return prodTipo;
    }

    public void setProdTipo(String prodTipo) {
        String oldProdTipo = this.prodTipo;
        this.prodTipo = prodTipo;
        changeSupport.firePropertyChange("prodTipo", oldProdTipo, prodTipo);
    }

    public String getProdMarca() {
        return prodMarca;
    }

    public void setProdMarca(String prodMarca) {
        String oldProdMarca = this.prodMarca;
        this.prodMarca = prodMarca;
        changeSupport.firePropertyChange("prodMarca", oldProdMarca, prodMarca);
    }

    public float getProdVlvenda() {
        return prodVlvenda;
    }

    public void setProdVlvenda(float prodVlvenda) {
        float oldProdVlvenda = this.prodVlvenda;
        this.prodVlvenda = prodVlvenda;
        changeSupport.firePropertyChange("prodVlvenda", oldProdVlvenda, prodVlvenda);
    }

    public float getProdVlforn() {
        return prodVlforn;
    }

    public void setProdVlforn(float prodVlforn) {
        float oldProdVlforn = this.prodVlforn;
        this.prodVlforn = prodVlforn;
        changeSupport.firePropertyChange("prodVlforn", oldProdVlforn, prodVlforn);
    }

    public String getProdTam() {
        return prodTam;
    }

    public void setProdTam(String prodTam) {
        String oldProdTam = this.prodTam;
        this.prodTam = prodTam;
        changeSupport.firePropertyChange("prodTam", oldProdTam, prodTam);
    }

    public String getProdCor() {
        return prodCor;
    }

    public void setProdCor(String prodCor) {
        String oldProdCor = this.prodCor;
        this.prodCor = prodCor;
        changeSupport.firePropertyChange("prodCor", oldProdCor, prodCor);
    }

    public String getProdCate() {
        return prodCate;
    }

    public void setProdCate(String prodCate) {
        String oldProdCate = this.prodCate;
        this.prodCate = prodCate;
        changeSupport.firePropertyChange("prodCate", oldProdCate, prodCate);
    }

    public int getProdQuant() {
        return prodQuant;
    }

    public void setProdQuant(int prodQuant) {
        int oldProdQuant = this.prodQuant;
        this.prodQuant = prodQuant;
        changeSupport.firePropertyChange("prodQuant", oldProdQuant, prodQuant);
    }

    public float getProdTaxatri() {
        return prodTaxatri;
    }

    public void setProdTaxatri(float prodTaxatri) {
        float oldProdTaxatri = this.prodTaxatri;
        this.prodTaxatri = prodTaxatri;
        changeSupport.firePropertyChange("prodTaxatri", oldProdTaxatri, prodTaxatri);
    }

    public float getProdMargem() {
        return prodMargem;
    }

    public void setProdMargem(float prodMargem) {
        float oldProdMargem = this.prodMargem;
        this.prodMargem = prodMargem;
        changeSupport.firePropertyChange("prodMargem", oldProdMargem, prodMargem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodCod != null ? prodCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.prodCod == null && other.prodCod != null) || (this.prodCod != null && !this.prodCod.equals(other.prodCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Produto[ prodCod=" + prodCod + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
