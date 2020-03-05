import entites.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Client client = new Client();
        client.setUser_name("Jhonny");
        client.setFirst_address("Minsk");
        client.setSecond_address("Urucha");

        entityManager.persist(client);
        entityManager.getTransaction().commit();

        System.out.println("Id = "+ client.getIdClient());

    }
}
