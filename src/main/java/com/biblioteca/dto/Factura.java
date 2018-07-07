package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFactura;
    private String folio;
    private int precioNeto;
    private int precioConIva;
    private int costoIva;
    private Date fechaHoraCompra;
    private Integer distribuidorInvolucrado;
    private Integer metodoPago;

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(int precioNeto) {
        this.precioNeto = precioNeto;
    }

    public int getPrecioConIva() {
        return precioConIva;
    }

    public void setPrecioConIva(int precioConIva) {
        this.precioConIva = precioConIva;
    }

    public int getCostoIva() {
        return costoIva;
    }

    public void setCostoIva(int costoIva) {
        this.costoIva = costoIva;
    }

    public Date getFechaHoraCompra() {
        return fechaHoraCompra;
    }

    public void setFechaHoraCompra(Date fechaHoraCompra) {
        this.fechaHoraCompra = fechaHoraCompra;
    }

    public Integer getDistribuidorInvolucrado() {
        return distribuidorInvolucrado;
    }

    public void setDistribuidorInvolucrado(Integer distribuidorInvolucrado) {
        this.distribuidorInvolucrado = distribuidorInvolucrado;
    }

    public Integer getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Integer metodoPago) {
        this.metodoPago = metodoPago;
    }
}
