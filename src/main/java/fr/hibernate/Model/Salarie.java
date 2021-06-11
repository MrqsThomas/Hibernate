package fr.hibernate.Model;

import javax.persistence.*;

/**
 * @author Marques
 * @created 11/06/2021
 */
@Entity
@Table(name = "Salarie")
public class Salarie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;

    @Column(name = "salaire", nullable = false)
    private Double salaire;

    @Column(name = "experience", nullable = false)
    private Double experience;

    public Salarie(String nom, String prenom, Double salaire, Double experience) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.experience = experience;
    }

    public Salarie() {

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

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }
}
