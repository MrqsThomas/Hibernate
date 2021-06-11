package fr.hibernate.Service;

import fr.hibernate.Model.Hotel;
import fr.hibernate.Model.Salarie;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * @author Marques
 * @created 11/06/2021
 */
public class HotelService implements Serializable {

    public boolean create(Hotel hotel, Session s) {
        s.save(hotel);
        return true;
    }

    public void delete(Session s, int id) {
        Hotel hotel = s.get(Hotel.class, id);
        s.delete(hotel);
    }

    public void update(Session s, int id)
    {
        Hotel hotel = s.get(Hotel.class, id);
        hotel.setNom("Hotel 2");
        s.update(hotel);
    }

    public Hotel findById(Session s, int id)
    {
        Hotel hotel = s.get(Hotel.class, id);
        return hotel;
    }

    public List<Hotel> findAll(Session s)
    {
        Query q = s.createQuery("from Hotel");
        List<Hotel> listeHotels = q.list();

        return listeHotels;
    }
}
