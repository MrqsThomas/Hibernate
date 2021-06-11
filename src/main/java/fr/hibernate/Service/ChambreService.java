package fr.hibernate.Service;

import fr.hibernate.Model.Chambre;
import fr.hibernate.Model.Salarie;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * @author Marques
 * @created 11/06/2021
 */
public class ChambreService implements Serializable {

    public boolean create(Chambre chambre, Session s) {
        s.save(chambre);
        return true;
    }

    public void delete(Session s, int id) {
        Chambre chambre = s.get(Chambre.class, id);
        s.delete(chambre);
    }

    public void update(Session s, int id)
    {
        Chambre chambre = s.get(Chambre.class, id);
        chambre.setType("Type 2");
        s.update(chambre);
    }

    public Chambre findById(Session s, int id)
    {
        Chambre chambre = s.get(Chambre.class, id);
        return chambre;
    }

    public List<Chambre> findAll(Session s)
    {
        Query q = s.createQuery("from Chambre");
        List<Chambre> listeChambres = q.list();

        return listeChambres;
    }
}
