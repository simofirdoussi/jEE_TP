package com.controller;

import com.bean.Voiture;
import com.crud.DAO;
import com.gestion.gestionDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "VoitureServlet")
public class VoitureServlet extends HttpServlet {

    Voiture v = new Voiture();
    gestionDAO gs = new gestionDAO();
    DAO v_dao;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("ajoutVoiture")!=null){
            String nom = request.getParameter("nom");
            String matricule = request.getParameter("matricule");
            v.setNom(nom);
            v.setMatricule(matricule);
            gs.ajouter_Voiture(v);
            RequestDispatcher rd = request.getRequestDispatcher("Ajoutvoiture.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("afficherVoiture")!=null){
            List<Voiture> voitureList = new ArrayList();
            voitureList = gs.AfficherVoitures();
            request.setAttribute("voitureList", voitureList);
            RequestDispatcher rd = request.getRequestDispatcher("AfficherVoitures.jsp");
            rd.forward(request, response);
        }

        if(request.getParameter("modifiervoiture")!=null){
            int id_ = Integer.parseInt(request.getParameter("id"));
            String nom = request.getParameter("nom");
            String mat = request.getParameter("mat");
            gs.modifier_Voiture(id_, nom, mat);
            RequestDispatcher rd = request.getRequestDispatcher("Ajoutvoiture.jsp");
            rd.forward(request, response);
        }

        if(request.getParameter("supprimervoiture")!=null){
            int idx = Integer.parseInt(request.getParameter("id"));
            v.setId(idx);
            gs.supprimer_Voiture(v);
            RequestDispatcher rd = request.getRequestDispatcher("SupprimerVoiture.jsp");
            rd.forward(request, response);
        }

    }

}
