import de.thm.schule.Schueler;

import javax.persistence.*;

public class SchulDB {
    public static void main(String[] args){
        System.out.println("Test");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("THM");
        EntityManager entityManager = entityManagerFactory.createEntityManager();



        entityManager.close();
        entityManagerFactory.close();
    }
}
