package com.polizaseguros.apirest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Poliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPoliza;
    private String nombrePlanPoliza;
    private String coberturasPoliza;
    private String valorMaximoCoberturaPoliza;
    private String fechaPolizaTomada;
    private String fechaVencimientoPoliza;

    public Poliza (){

    }

    public Integer getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Integer idPoliza) {
        this.idPoliza = idPoliza;
    }

    public String getNombrePlanPoliza() {
        return nombrePlanPoliza;
    }

    public void setNombrePlanPoliza(String nombrePlanPoliza) {
        this.nombrePlanPoliza = nombrePlanPoliza;
    }

    public String getCoberturasPoliza() {
        return coberturasPoliza;
    }

    public void setCoberturasPoliza(String coberturasPoliza) {
        this.coberturasPoliza = coberturasPoliza;
    }

    public String getValorMaximoCoberturaPoliza() {
        return valorMaximoCoberturaPoliza;
    }

    public void setValorMaximoCoberturaPoliza(String valorMaximoCoberturaPoliza) {
        this.valorMaximoCoberturaPoliza = valorMaximoCoberturaPoliza;
    }

    public String getFechaPolizaTomada() {
        return fechaPolizaTomada;
    }

    public void setFechaPolizaTomada(String fechaPolizaTomada) {
        this.fechaPolizaTomada = fechaPolizaTomada;
    }

    public String getFechaVencimientoPoliza() {
        return fechaVencimientoPoliza;
    }

    public void setFechaVencimientoPoliza(String fechaVencimientoPoliza) {
        this.fechaVencimientoPoliza = fechaVencimientoPoliza;
    }
}
