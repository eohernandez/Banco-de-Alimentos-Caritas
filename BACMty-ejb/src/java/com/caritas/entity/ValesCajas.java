/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caritas.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tecnologia
 */
@Entity
@Table(name = "ValesCajas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ValesCajas.findAll", query = "SELECT v FROM ValesCajas v"),
    @NamedQuery(name = "ValesCajas.findByIDFolio", query = "SELECT v FROM ValesCajas v WHERE v.iDFolio = :iDFolio"),
    @NamedQuery(name = "ValesCajas.findByFecha", query = "SELECT v FROM ValesCajas v WHERE v.fecha = :fecha"),
    @NamedQuery(name = "ValesCajas.findByPaquetes", query = "SELECT v FROM ValesCajas v WHERE v.paquetes = :paquetes"),
    @NamedQuery(name = "ValesCajas.findByPrecioPaq", query = "SELECT v FROM ValesCajas v WHERE v.precioPaq = :precioPaq"),
    @NamedQuery(name = "ValesCajas.findByOtrosCargos", query = "SELECT v FROM ValesCajas v WHERE v.otrosCargos = :otrosCargos"),
    @NamedQuery(name = "ValesCajas.findByStatus", query = "SELECT v FROM ValesCajas v WHERE v.status = :status"),
    @NamedQuery(name = "ValesCajas.findByFolioMov", query = "SELECT v FROM ValesCajas v WHERE v.folioMov = :folioMov"),
    @NamedQuery(name = "ValesCajas.findByFlete", query = "SELECT v FROM ValesCajas v WHERE v.flete = :flete"),
    @NamedQuery(name = "ValesCajas.findByTotal", query = "SELECT v FROM ValesCajas v WHERE v.total = :total"),
    @NamedQuery(name = "ValesCajas.findBySaldo", query = "SELECT v FROM ValesCajas v WHERE v.saldo = :saldo"),
    @NamedQuery(name = "ValesCajas.findByPersonas", query = "SELECT v FROM ValesCajas v WHERE v.personas = :personas"),
    @NamedQuery(name = "ValesCajas.findByTipo", query = "SELECT v FROM ValesCajas v WHERE v.tipo = :tipo"),
    @NamedQuery(name = "ValesCajas.findByObservacion", query = "SELECT v FROM ValesCajas v WHERE v.observacion = :observacion"),
    @NamedQuery(name = "ValesCajas.findByFamilia", query = "SELECT v FROM ValesCajas v WHERE v.familia = :familia"),
    @NamedQuery(name = "ValesCajas.findByFleteCom", query = "SELECT v FROM ValesCajas v WHERE v.fleteCom = :fleteCom"),
    @NamedQuery(name = "ValesCajas.findByDescuento", query = "SELECT v FROM ValesCajas v WHERE v.descuento = :descuento"),
    @NamedQuery(name = "ValesCajas.findByFechaSistema", query = "SELECT v FROM ValesCajas v WHERE v.fechaSistema = :fechaSistema")})
public class ValesCajas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDFolio")
    private String iDFolio;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "Paquetes")
    private Integer paquetes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PrecioPaq")
    private Double precioPaq;
    @Column(name = "OtrosCargos")
    private Double otrosCargos;
    @Size(max = 10)
    @Column(name = "Status")
    private String status;
    @Size(max = 10)
    @Column(name = "FolioMov")
    private String folioMov;
    @Column(name = "Flete")
    private Double flete;
    @Column(name = "Total")
    private Double total;
    @Column(name = "Saldo")
    private Double saldo;
    @Column(name = "Personas")
    private Integer personas;
    @Column(name = "Tipo")
    private Short tipo;
    @Size(max = 100)
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "Familia")
    private Double familia;
    @Column(name = "FleteCom")
    private Double fleteCom;
    @Column(name = "Descuento")
    private Double descuento;
    @Column(name = "FechaSistema")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSistema;
    @JoinColumn(name = "IDPrograma", referencedColumnName = "IDPrograma")
    @ManyToOne
    private Programas iDPrograma;
    @JoinColumn(name = "IdInstitucion", referencedColumnName = "IDInstitucion")
    @ManyToOne
    private Instituciones idInstitucion;
    @JoinColumn(name = "IdArea", referencedColumnName = "IDArea")
    @ManyToOne
    private Areas idArea;

    public ValesCajas() {
    }

    public ValesCajas(String iDFolio) {
        this.iDFolio = iDFolio;
    }

    public String getIDFolio() {
        return iDFolio;
    }

    public void setIDFolio(String iDFolio) {
        this.iDFolio = iDFolio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(Integer paquetes) {
        this.paquetes = paquetes;
    }

    public Double getPrecioPaq() {
        return precioPaq;
    }

    public void setPrecioPaq(Double precioPaq) {
        this.precioPaq = precioPaq;
    }

    public Double getOtrosCargos() {
        return otrosCargos;
    }

    public void setOtrosCargos(Double otrosCargos) {
        this.otrosCargos = otrosCargos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFolioMov() {
        return folioMov;
    }

    public void setFolioMov(String folioMov) {
        this.folioMov = folioMov;
    }

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Short getTipo() {
        return tipo;
    }

    public void setTipo(Short tipo) {
        this.tipo = tipo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Double getFamilia() {
        return familia;
    }

    public void setFamilia(Double familia) {
        this.familia = familia;
    }

    public Double getFleteCom() {
        return fleteCom;
    }

    public void setFleteCom(Double fleteCom) {
        this.fleteCom = fleteCom;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Date getFechaSistema() {
        return fechaSistema;
    }

    public void setFechaSistema(Date fechaSistema) {
        this.fechaSistema = fechaSistema;
    }

    public Programas getIDPrograma() {
        return iDPrograma;
    }

    public void setIDPrograma(Programas iDPrograma) {
        this.iDPrograma = iDPrograma;
    }

    public Instituciones getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Instituciones idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public Areas getIdArea() {
        return idArea;
    }

    public void setIdArea(Areas idArea) {
        this.idArea = idArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDFolio != null ? iDFolio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValesCajas)) {
            return false;
        }
        ValesCajas other = (ValesCajas) object;
        if ((this.iDFolio == null && other.iDFolio != null) || (this.iDFolio != null && !this.iDFolio.equals(other.iDFolio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caritas.entity.ValesCajas[ iDFolio=" + iDFolio + " ]";
    }
    
}
