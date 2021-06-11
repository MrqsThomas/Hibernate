package fr.hibernate;

import fr.hibernate.Model.Chambre;
import fr.hibernate.Model.Directeur;
import fr.hibernate.Model.Hotel;
import fr.hibernate.Model.Salarie;
import fr.hibernate.Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Marques
 * @created 11/06/2021
 */
public class Main {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Thomas", "Marques", 10000d, 1000d);
        Salarie salarie1 = new Salarie("TOTO", "TATA", 100d, 10d);
        Directeur directeur = new Directeur("Toto", "Tata");
        Chambre chambre = new Chambre(10, 30d, "Type 1", 2);
        Chambre chambre1 = new Chambre(12, 22d, "Type 3", 4);
        Hotel hotel = new Hotel("Hotel IBIS", "Rue toto", "0645785462");

        Set<Salarie> listeSalaries = new HashSet<>();
        listeSalaries.add(salarie);
        listeSalaries.add(salarie1);

        Set<Chambre> listeChambres = new HashSet<>();
        listeChambres.add(chambre);
        listeChambres.add(chambre1);

        directeur.setSalaries(listeSalaries);
        hotel.setChambres(listeChambres);
        hotel.setDirecteur(directeur);

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(hotel);
            session.save(directeur);
            session.save(salarie);
            session.save(salarie1);
            session.save(chambre);
            session.save(chambre1);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
