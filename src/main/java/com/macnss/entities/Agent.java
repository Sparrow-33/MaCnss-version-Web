package com.macnss.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Agent {
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
        Agent agent = (Agent) o;
        return Objects.equals(matricule, agent.matricule) && Objects.equals(email, agent.email) && Objects.equals(password, agent.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, email, password);
    }
}
