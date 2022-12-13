package com.macnss.entities;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Objects;

@Entity
public class Visite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "dossier")
    private Integer dossier;
    @Basic
    @Column(name = "code")
    private Integer code;
    @Basic
    @Column(name = "tarif")
    private Double tarif;
    @ManyToOne
    @JoinColumn(name = "dossier", referencedColumnName = "id", insertable = false, updatable = false)
    private Dossier dossierByDossier;
    @ManyToOne
    @JoinColumn(name = "code", referencedColumnName = "code", insertable = false, updatable = false)
    private Docteur docteurByCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getDossier() {
        return dossier;
    }

    public void setDossier(Integer dossier) {
        this.dossier = dossier;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getTarif() {
        return tarif;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visite visite = (Visite) o;
        return id == visite.id && Objects.equals(dossier, visite.dossier) && Objects.equals(code, visite.code) && Objects.equals(tarif, visite.tarif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dossier, code, tarif);
    }

    public Dossier getDossierByDossier() {
        return dossierByDossier;
    }

    public void setDossierByDossier(Dossier dossierByDossier) {
        this.dossierByDossier = dossierByDossier;
    }

    public Docteur getDocteurByCode() {
        return docteurByCode;
    }

    public void setDocteurByCode(Docteur docteurByCode) {
        this.docteurByCode = docteurByCode;
    }
}
