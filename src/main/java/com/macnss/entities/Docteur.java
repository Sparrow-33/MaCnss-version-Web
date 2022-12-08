package com.macnss.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Docteur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "code")
    private int code;
    @Basic
    @Column(name = "nomcomplet")
    private String nomcomplet;
    @Basic
    @Column(name = "specialite")
    private String specialite;
    @OneToMany(mappedBy = "docteurByCode")
    private Collection<Visite> visitesByCode;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docteur docteur = (Docteur) o;
        return code == docteur.code && Objects.equals(nomcomplet, docteur.nomcomplet) && Objects.equals(specialite, docteur.specialite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, nomcomplet, specialite);
    }

    public Collection<Visite> getVisitesByCode() {
        return visitesByCode;
    }

    public void setVisitesByCode(Collection<Visite> visitesByCode) {
        this.visitesByCode = visitesByCode;
    }
}
