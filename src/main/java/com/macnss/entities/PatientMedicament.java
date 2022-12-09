package com.macnss.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "patient_medicament", schema = "public", catalog = "macnss")
public class PatientMedicament {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "dossier")
    private Integer dossier;
    @Basic
    @Column(name = "medicament")
    private Integer medicament;
    @ManyToOne
    @JoinColumn(name = "dossier", referencedColumnName = "id", insertable = false, updatable = false)
    private Dossier dossierByDossier;
    @ManyToOne
    @JoinColumn(name = "medicament", referencedColumnName = "id", insertable = false, updatable = false)
    private Medicament medicamentByMedicament;

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

    public Integer getMedicament() {
        return medicament;
    }

    public void setMedicament(Integer medicament) {
        this.medicament = medicament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientMedicament that = (PatientMedicament) o;
        return id == that.id && Objects.equals(dossier, that.dossier) && Objects.equals(medicament, that.medicament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dossier, medicament);
    }

    public Dossier getDossierByDossier() {
        return dossierByDossier;
    }

    public void setDossierByDossier(Dossier dossierByDossier) {
        this.dossierByDossier = dossierByDossier;
    }

    public Medicament getMedicamentByMedicament() {
        return medicamentByMedicament;
    }

    public void setMedicamentByMedicament(Medicament medicamentByMedicament) {
        this.medicamentByMedicament = medicamentByMedicament;
    }
}
