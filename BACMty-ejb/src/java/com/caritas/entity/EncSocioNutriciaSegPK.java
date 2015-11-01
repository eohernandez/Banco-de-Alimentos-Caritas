/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.caritas.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tecnologia
 */
@Embeddable
public class EncSocioNutriciaSegPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "Expediente")
    private int expediente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AreaGeo")
    private char areaGeo;

    public EncSocioNutriciaSegPK() {
    }

    public EncSocioNutriciaSegPK(int expediente, char areaGeo) {
        this.expediente = expediente;
        this.areaGeo = areaGeo;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public char getAreaGeo() {
        return areaGeo;
    }

    public void setAreaGeo(char areaGeo) {
        this.areaGeo = areaGeo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) expediente;
        hash += (int) areaGeo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncSocioNutriciaSegPK)) {
            return false;
        }
        EncSocioNutriciaSegPK other = (EncSocioNutriciaSegPK) object;
        if (this.expediente != other.expediente) {
            return false;
        }
        if (this.areaGeo != other.areaGeo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.caritas.entity.EncSocioNutriciaSegPK[ expediente=" + expediente + ", areaGeo=" + areaGeo + " ]";
    }
    
}
