package com.macnss.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Patient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "matricule")
    private Object matricule;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "patientByMatricule")
    private Collection<Dossier> dossiersByMatricule;

    public Object getMatricule() {
        return matricule;
    }

    public void setMatricule(Object matricule) {
        this.matricule = matricule;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(matricule, patient.matricule) && Objects.equals(email, patient.email) && Objects.equals(password, patient.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, email, password);
    }

    public Collection<Dossier> getDossiersByMatricule() {
        return dossiersByMatricule;
    }

    public void setDossiersByMatricule(Collection<Dossier> dossiersByMatricule) {
        this.dossiersByMatricule = dossiersByMatricule;
    }
}
