package com.gestion;

import com.bean.Voiture;
import com.crud.DAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.*;

import java.util.ArrayList;
import java.util.List;

public class gestionDAO implements DAO {
    @Override
    public void ajouter_Voiture(Voiture v) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(v);
        transaction.commit();
        session.close();
    }

    public void modifier_Voiture(int id, String nom, String matricule) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Voiture vr = (Voiture) session.load(Voiture.class, id);
        vr.setNom(nom);
        vr.setMatricule(matricule);
        session.update(vr);
        transaction.commit();
        session.close();
    }

    public void supprimer_Voiture(Voiture v) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(v);
        transaction.commit();
        session.close();

    }

    public List<Voiture> AfficherVoitures(){
        List<Voiture> voitureList = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().openSession();
        String qr = "FROM Voiture"; //Entity name
        Query query = session.createQuery(qr);
        voitureList = query.list();
        return voitureList;
    }
}
