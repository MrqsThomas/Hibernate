package fr.hibernate;

import fr.hibernate.Model.Salarie;
import fr.hibernate.Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * @author Marques
 * @created 11/06/2021
 */
public class Main {
    public static void main(String[] args) {
        Salarie salarie = new Salarie("Thomas", "Marques", 10000d, 1000d);
        Salarie salarie1 = new Salarie("Toto", "Tata", 1000d, 10d);

        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(salarie);
            session.save(salarie1);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Salarie> salaries = session.createQuery("from Salarie", Salarie.class).list();
            salaries.forEach(s -> System.out.println(s.getNom()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
