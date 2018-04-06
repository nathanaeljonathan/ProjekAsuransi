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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "POLIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Polis.findAll", query = "SELECT p FROM Polis p")
    , @NamedQuery(name = "Polis.findByNoPolis", query = "SELECT p FROM Polis p WHERE p.noPolis = :noPolis")})
public class Polis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NO_POLIS")
    private Integer noPolis;
    @OneToMany(mappedBy = "noPolis", fetch = FetchType.LAZY)
    private Collection<Pembayaran> pembayaranCollection;
    @JoinColumn(name = "KTP", referencedColumnName = "KTP")
    @ManyToOne(fetch = FetchType.LAZY)
    private Nasabah ktp;

    public Polis() {
    }

    public Polis(Integer noPolis) {
        this.noPolis = noPolis;
    }

    public Integer getNoPolis() {
        return noPolis;
    }

    public void setNoPolis(Integer noPolis) {
        this.noPolis = noPolis;
    }

    @XmlTransient
    public Collection<Pembayaran> getPembayaranCollection() {
        return pembayaranCollection;
    }

    public void setPembayaranCollection(Collection<Pembayaran> pembayaranCollection) {
        this.pembayaranCollection = pembayaranCollection;
    }

    public Nasabah getKtp() {
        return ktp;
    }

    public void setKtp(Nasabah ktp) {
        this.ktp = ktp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noPolis != null ? noPolis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polis)) {
            return false;
        }
        Polis other = (Polis) object;
        if ((this.noPolis == null && other.noPolis != null) || (this.noPolis != null && !this.noPolis.equals(other.noPolis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Polis[ noPolis=" + noPolis + " ]";
    }
    
}
