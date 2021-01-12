package com.bean;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Voiture")
public class Voiture {

    @Id
    @Column(name = "voiture_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String matricule;

    @ManyToOne
    @JoinColumn(name = "marque_id")
    private Marque marque;

    @ManyToMany(mappedBy = "voitures", fetch= FetchType.LAZY)
    private Set<Chauffeur> chauffeurs = new HashSet<>();

    public Voiture() {
    }

    public Voiture(String nom, String matricule, Marque marque) {
        this.nom = nom;
        this.matricule = matricule;
        this.marque = marque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Set<Chauffeur> getChauffeurs() {
        return chauffeurs;
    }

    public void setChauffeurs(Set<Chauffeur> chauffeurs) {
        this.chauffeurs = chauffeurs;
    }
}
