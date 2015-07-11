package unimanytoone;

import org.hibernate.Session;
import unimanytoone.mapping.HibernateUtil;
import unimanytoone.model.Televidente;
import unimanytoone.model.Televisiva;

public class UniManyToOne {

    public static void main(String[] args) {
        Televisiva cadena1 = new Televisiva();
        cadena1.setNombre("Cadena 1");

        Televisiva cadena2 = new Televisiva();
        cadena2.setNombre("Cadena 2");

        Televisiva cadena3 = new Televisiva();
        cadena3.setNombre("Cadena 3");


        /* Guardamos estos tres objetos CadenaTelevisiva en la base de datos */
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.save(cadena1);
        sesion.save(cadena2);
        sesion.save(cadena3);
        sesion.getTransaction().commit();
        sesion.close();
        
        Televidente televidente1 = new Televidente();
        televidente1.setNombre("Televidente 1");
        televidente1.setTelevisiva(cadena1);

        Televidente televidente2 = new Televidente();
        televidente2.setNombre("Televidente 2");
        televidente2.setTelevisiva(cadena3);

        /* Guardamos los dos objetos Televidente en la base de Datos */
        sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        sesion.save(televidente1);
        sesion.save(televidente2);
        sesion.getTransaction().commit();
        sesion.close();
        
    }
    
}
