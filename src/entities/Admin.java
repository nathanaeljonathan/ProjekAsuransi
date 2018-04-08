/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Medina
 */
@Entity
@Table(name = "ADMIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a")
    , @NamedQuery(name = "Admin.findByIdAdmin", query = "SELECT a FROM Admin a WHERE a.idAdmin = :idAdmin")
    , @NamedQuery(name = "Admin.findByNamaAdmin", query = "SELECT a FROM Admin a WHERE a.namaAdmin = :namaAdmin")
    , @NamedQuery(name = "Admin.findByAlamat", query = "SELECT a FROM Admin a WHERE a.alamat = :alamat")
    , @NamedQuery(name = "Admin.findByNoTelp", query = "SELECT a FROM Admin a WHERE a.noTelp = :noTelp")
    , @NamedQuery(name = "Admin.findByEmail", query = "SELECT a FROM Admin a WHERE a.email = :email")})
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ADMIN")
    private String idAdmin;
    @Column(name = "NAMA_ADMIN")
    private String namaAdmin;
    @Column(name = "ALAMAT")
    private String alamat;
    @Column(name = "NO_TELP")
    private String noTelp;
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(mappedBy = "idAdmin", fetch = FetchType.LAZY)
    private List<Nasabah> nasabahList;

    public Admin() {
    }

    public Admin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<Nasabah> getNasabahList() {
        return nasabahList;
    }

    public void setNasabahList(List<Nasabah> nasabahList) {
        this.nasabahList = nasabahList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdmin != null ? idAdmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.idAdmin == null && other.idAdmin != null) || (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idAdmin + "";
    }
    
}
