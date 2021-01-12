package com.bean;


import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Chauffeur")
public class Chauffeur {

    @Id
    @Column(name = "chauffeur_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Chauffeur_Voiture",
            joinColumns = { @JoinColumn(name = "C_id") },
            inverseJoinColumns = { @JoinColumn(name = "V_id") }
    )
    private Set<Voiture> voitures = new HashSet<>();

    public Chauffeur() {
    }

    public Chauffeur(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(Set<Voiture> voitures) {
        this.voitures = voitures;
    }
}
