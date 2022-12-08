package com.macnss.entities;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Medicament {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "etiquette")
    private String etiquette;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "prix")
    private BigInteger prix;
    @Basic
    @Column(name = "remboursement")
    private BigInteger remboursement;
    @OneToMany(mappedBy = "medicamentByMedicament")
    private Collection<PatientMedicament> patientMedicamentsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtiquette() {
        return etiquette;
    }

    public void setEtiquette(String etiquette) {
        this.etiquette = etiquette;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigInteger getPrix() {
        return prix;
    }

    public void setPrix(BigInteger prix) {
        this.prix = prix;
    }

    public BigInteger getRemboursement() {
        return remboursement;
    }

    public void setRemboursement(BigInteger remboursement) {
        this.remboursement = remboursement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicament that = (Medicament) o;
        return id == that.id && Objects.equals(etiquette, that.etiquette) && Objects.equals(code, that.code) && Objects.equals(prix, that.prix) && Objects.equals(remboursement, that.remboursement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, etiquette, code, prix, remboursement);
    }

    public Collection<PatientMedicament> getPatientMedicamentsById() {
        return patientMedicamentsById;
    }

    public void setPatientMedicamentsById(Collection<PatientMedicament> patientMedicamentsById) {
        this.patientMedicamentsById = patientMedicamentsById;
    }
}
