package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBoleta;
    private int folio;
    private int precioNeto;
    private int precioConIva;
    private int costoIva;
    private Date fechaHoraVenta;
    private Integer clienteInvolucrado;
    private Integer trabajadorInvolucrado;
    private Integer metodoPago;

    public Integer getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
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

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public Integer getClienteInvolucrado() {
        return clienteInvolucrado;
    }

    public void setClienteInvolucrado(Integer clienteInvolucrado) {
        this.clienteInvolucrado = clienteInvolucrado;
    }

    public Integer getTrabajadorInvolucrado() {
        return trabajadorInvolucrado;
    }

    public void setTrabajadorInvolucrado(Integer trabajadorInvolucrado) {
        this.trabajadorInvolucrado = trabajadorInvolucrado;
    }

    public Integer getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Integer metodoPago) {
        this.metodoPago = metodoPago;
    }
}
