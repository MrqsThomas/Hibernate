package fr.hibernate.Model;

/**
 * @author Marques
 * @created 11/06/2021
 */
public class Salarie {
    private int id;
    private String nom;
    private String prenom;
    private Double salaire;
    private Double experience;

    public Salarie(String nom, String prenom, Double salaire, Double experience) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.experience = experience;
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
