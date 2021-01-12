package com.crud;

import com.bean.Voiture;

import java.util.List;

public interface DAO {

    public void ajouter_Voiture(Voiture v);
    public void modifier_Voiture(int id, String nom, String matricule);
    public void supprimer_Voiture(Voiture v);
    public List<Voiture> AfficherVoitures();

}
