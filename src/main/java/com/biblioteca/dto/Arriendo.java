package com.biblioteca.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Arriendo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArriendo;
    private int costoTotal;
    private Date fechaArriendo;
    private Date fechaDevolucion;
    private Date fechaEntrega;
    private int diasRetraso;
    private int multa;
    private int costoArriendo;
    private Integer clienteInvolucrado;
    private Integer trabajorInvolucrado;

    public Integer getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(Integer idArriendo) {
        this.idArriendo = idArriendo;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Date getFechaArriendo() {
        return fechaArriendo;
    }

    public void setFechaArriendo(Date fechaArriendo) {
        this.fechaArriendo = fechaArriendo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public int getCostoArriendo() {
        return costoArriendo;
    }

    public void setCostoArriendo(int costoArriendo) {
        this.costoArriendo = costoArriendo;
    }

    public Integer getClienteInvolucrado() {
        return clienteInvolucrado;
    }

    public void setClienteInvolucrado(Integer clienteInvolucrado) {
        this.clienteInvolucrado = clienteInvolucrado;
    }

    public Integer getTrabajorInvolucrado() {
        return trabajorInvolucrado;
    }

    public void setTrabajorInvolucrado(Integer trabajorInvolucrado) {
        this.trabajorInvolucrado = trabajorInvolucrado;
    }
}
