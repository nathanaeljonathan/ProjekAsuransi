/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
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
 * @author ASUS A455L
 */
@Entity
@Table(name = "ASURANSI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asuransi.findAll", query = "SELECT a FROM Asuransi a")
    , @NamedQuery(name = "Asuransi.findByIdAsuransi", query = "SELECT a FROM Asuransi a WHERE a.idAsuransi = :idAsuransi")
    , @NamedQuery(name = "Asuransi.findByNmAsuransi", query = "SELECT a FROM Asuransi a WHERE a.nmAsuransi = :nmAsuransi")})
public class Asuransi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ASURANSI")
    private String idAsuransi;
    @Column(name = "NM_ASURANSI")
    private String nmAsuransi;
    @OneToMany(mappedBy = "idAsuransi", fetch = FetchType.LAZY)
    private Collection<Pembayaran> pembayaranCollection;

    public Asuransi() {
    }

    public Asuransi(String idAsuransi) {
        this.idAsuransi = idAsuransi;
    }

    public String getIdAsuransi() {
        return idAsuransi;
    }

    public void setIdAsuransi(String idAsuransi) {
        this.idAsuransi = idAsuransi;
    }

    public String getNmAsuransi() {
        return nmAsuransi;
    }

    public void setNmAsuransi(String nmAsuransi) {
        this.nmAsuransi = nmAsuransi;
    }

    @XmlTransient
    public Collection<Pembayaran> getPembayaranCollection() {
        return pembayaranCollection;
    }

    public void setPembayaranCollection(Collection<Pembayaran> pembayaranCollection) {
        this.pembayaranCollection = pembayaranCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsuransi != null ? idAsuransi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asuransi)) {
            return false;
        }
        Asuransi other = (Asuransi) object;
        if ((this.idAsuransi == null && other.idAsuransi != null) || (this.idAsuransi != null && !this.idAsuransi.equals(other.idAsuransi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Asuransi[ idAsuransi=" + idAsuransi + " ]";
    }
    
}