package fr.hibernate.Service;

import fr.hibernate.Model.Directeur;
import fr.hibernate.Model.Salarie;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * @author Marques
 * @created 11/06/2021
 */
public class DirecteurService implements Serializable {

    public boolean create(Directeur directeur, Session s) {
        s.save(directeur);
        return true;
    }

    public void delete(Session s, int id) {
        Directeur directeur = s.get(Directeur.class, id);
        s.delete(directeur);
    }

    public void update(Session s, int id)
    {
        Directeur directeur = s.get(Directeur.class, id);
        directeur.setPrenom("Directeur TOTO");
        s.update(directeur);
    }

    public Directeur findById(Session s, int id)
    {
        Directeur directeur = s.get(Directeur.class, id);
        return directeur;
    }

    public List<Directeur> findAll(Session s)
    {
        Query q = s.createQuery("from Directeur");
        List<Directeur> listeDirecteurs = q.list();

        return listeDirecteurs;
    }
}
