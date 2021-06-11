package fr.hibernate.Model;

/**
 * @author Marques
 * @created 11/06/2021
 */
public class Chambre {
    private int id;
    private int num_chambre;
    private Double superficie;
    private String type;
    private int etage;

    public Chambre(int num_chambre, Double superficie, String type, int etage) {
        this.num_chambre = num_chambre;
        this.superficie = superficie;
        this.type = type;
        this.etage = etage;
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
