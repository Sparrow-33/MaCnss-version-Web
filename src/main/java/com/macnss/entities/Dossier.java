package com.macnss.entities;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Dossier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "matricule")
    private Object matricule;
    @Basic
    @Column(name = "pieces")
    private int pieces;
    @Basic
    @Column(name = "total")
    private BigInteger total;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "dossierByDossier")
    private Collection<Analyses> analysesById;
    @ManyToOne
    @JoinColumn(name = "matricule", referencedColumnName = "matricule")
    private Patient patientByMatricule;
    @OneToMany(mappedBy = "dossierByDossier")
    private Collection<PatientMedicament> patientMedicamentsById;
    @OneToMany(mappedBy = "dossierByDossier")
    private Collection<Radio> radiosById;
    @OneToMany(mappedBy = "dossierByDossier")
    private Collection<Visite> visitesById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getMatricule() {
        return matricule;
    }

    public void setMatricule(Object matricule) {
        this.matricule = matricule;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dossier dossier = (Dossier) o;
        return id == dossier.id && pieces == dossier.pieces && Objects.equals(matricule, dossier.matricule) && Objects.equals(total, dossier.total) && Objects.equals(status, dossier.status) && Objects.equals(createdAt, dossier.createdAt) && Objects.equals(updatedAt, dossier.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, matricule, pieces, total, status, createdAt, updatedAt);
    }

    public Collection<Analyses> getAnalysesById() {
        return analysesById;
    }

    public void setAnalysesById(Collection<Analyses> analysesById) {
        this.analysesById = analysesById;
    }

    public Patient getPatientByMatricule() {
        return patientByMatricule;
    }

    public void setPatientByMatricule(Patient patientByMatricule) {
        this.patientByMatricule = patientByMatricule;
    }

    public Collection<PatientMedicament> getPatientMedicamentsById() {
        return patientMedicamentsById;
    }

    public void setPatientMedicamentsById(Collection<PatientMedicament> patientMedicamentsById) {
        this.patientMedicamentsById = patientMedicamentsById;
    }

    public Collection<Radio> getRadiosById() {
        return radiosById;
    }

    public void setRadiosById(Collection<Radio> radiosById) {
        this.radiosById = radiosById;
    }

    public Collection<Visite> getVisitesById() {
        return visitesById;
    }

    public void setVisitesById(Collection<Visite> visitesById) {
        this.visitesById = visitesById;
    }
}
