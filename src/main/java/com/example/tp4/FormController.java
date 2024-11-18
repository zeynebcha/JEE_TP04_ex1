package com.example.tp4;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class FormController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String sexe = request.getParameter("sexe");
        String transport = request.getParameter("transport");
        String codePostal = request.getParameter("codePostal");

        // Diviser les différents modes de transport par une virgule ou un autre séparateur
        String[] transports = transport != null ? transport.split(",\\s*") : new String[0];

        if (nom == null || prenom == null || sexe == null || codePostal == null ||
                nom.isEmpty() || prenom.isEmpty() || sexe.isEmpty() || codePostal.isEmpty()) {
            // Si un des champs est vide, renvoyer vers le formulaire avec un message d'erreur
            request.setAttribute("errorMessage", "Certains champs obligatoires n'ont pas été remplis.");
            request.getRequestDispatcher("formulaire.jsp").forward(request, response);
        } else {
            // Créer un JavaBean pour stocker les données
            Client client = new Client(nom, prenom, sexe, transports, codePostal);

            // Stocker l'objet client dans la session
            HttpSession session = request.getSession();
            session.setAttribute("client", client);

            // Transférer à la page JSP pour afficher les résultats
            request.getRequestDispatcher("resultat.jsp").forward(request, response);
        }
    }
}
