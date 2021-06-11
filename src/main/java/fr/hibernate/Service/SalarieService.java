package fr.hibernate.Service;

import fr.hibernate.Model.Salarie;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * @author Marques
 * @created 11/06/2021
 */
public class SalarieService implements Serializable {

    public boolean create(Salarie salarie, Session s) {
        s.save(salarie);
        return true;
    }

    public void delete(Session s, int id) {
        Salarie salarie = s.get(Salarie.class, id);
        s.delete(salarie);
    }

    public void update(Session s, int id)
    {
        Salarie salarie = s.get(Salarie.class, id);
        salarie.setPrenom("Paul");
        s.update(salarie);
    }

    public Salarie findById(Session s, int id)
    {
        Salarie salarie = s.get(Salarie.class, id);
        return salarie;
    }

    public List<Salarie> findAll(Session s)
    {
        Query q = s.createQuery("from Salarie");
        List<Salarie> listeSalaries = q.list();

        return listeSalaries;
    }
}
