package fr.hibernate.Model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Marques
 * @created 11/06/2021
 */
@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "nom", length = 50)
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "telephone", length = 50)
    private String telephone;

    @OneToOne(mappedBy = "hotel")
    private Directeur directeur;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="hotel_id")
    private Set<Chambre> chambres;

    public Hotel(String nom, String adresse, String telephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public Hotel() {

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Directeur getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Directeur directeur) {
        this.directeur = directeur;
    }

    public Set<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(Set<Chambre> chambres) {
        this.chambres = chambres;
    }
}
