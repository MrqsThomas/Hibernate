package fr.hibernate.Model;

import javax.persistence.*;

/**
 * @author Marques
 * @created 11/06/2021
 */
@Entity
@Table(name = "Chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "num_chambre", nullable = false)
    private int num_chambre;

    @Column(name = "superficie", nullable = false)
    private Double superficie;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "etage", nullable = false)
    private int etage;

    public Chambre(int num_chambre, Double superficie, String type, int etage) {
        this.num_chambre = num_chambre;
        this.superficie = superficie;
        this.type = type;
        this.etage = etage;
    }

    public Chambre() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_chambre() {
        return num_chambre;
    }

    public void setNum_chambre(int num_chambre) {
        this.num_chambre = num_chambre;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }
}
