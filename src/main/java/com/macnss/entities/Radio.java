package com.macnss.entities;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Radio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "dossier")
    private int dossier;
    @Basic
    @Column(name = "tarif")
    private BigInteger tarif;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @ManyToOne
    @JoinColumn(name = "dossier", referencedColumnName = "id", nullable = false, insertable = false ,updatable = false)
    private Dossier dossierByDossier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDossier() {
        return dossier;
    }

    public void setDossier(int dossier) {
        this.dossier = dossier;
    }

    public BigInteger getTarif() {
        return tarif;
    }

    public void setTarif(BigInteger tarif) {
        this.tarif = tarif;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Radio radio = (Radio) o;
        return id == radio.id && dossier == radio.dossier && Objects.equals(tarif, radio.tarif) && Objects.equals(createdAt, radio.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dossier, tarif, createdAt);
    }

    public Dossier getDossierByDossier() {
        return dossierByDossier;
    }

    public void setDossierByDossier(Dossier dossierByDossier) {
        this.dossierByDossier = dossierByDossier;
    }
}
