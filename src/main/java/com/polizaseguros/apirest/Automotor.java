package com.polizaseguros.apirest;

import jakarta.persistence.*;

@Entity
public class Automotor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matriculaAuotomotor;
    private String moteloAutomotor;
    private Boolean inspeccionAutomotor;


    public Automotor() {
    }

    public Integer getMatriculaAuotomotor() {
        return matriculaAuotomotor;
    }

    public void setMatriculaAuotomotor(Integer matriculaAuotomotor) {
        this.matriculaAuotomotor = matriculaAuotomotor;
    }

    public String getMoteloAutomotor() {
        return moteloAutomotor;
    }

    public void setMoteloAutomotor(String moteloAutomotor) {
        this.moteloAutomotor = moteloAutomotor;
    }

    public Boolean getInspeccionAutomotor() {
        return inspeccionAutomotor;
    }

    public void setInspeccionAutomotor(Boolean inspeccionAutomotor) {
        this.inspeccionAutomotor = inspeccionAutomotor;
    }

}
