package fr.hibernate.Model;

import javax.persistence.*;

/**
 * @author Marques
 * @created 11/06/2021
 */
@Entity
@Table(name = "Directeur")
public class Directeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;

    public Directeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Directeur() {

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
