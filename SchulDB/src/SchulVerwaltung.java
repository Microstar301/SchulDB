import de.thm.schule.Lehrer;

import javax.persistence.*;

public class SchulVerwaltung {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("THM");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Lehrer l = entityManager.find(de.thm.schule.Lehrer.class,1);
        System.out.println(l.getNachname()+" "+l.getVorname());


        entityManager.close();
        entityManagerFactory.close();
    }

    public void createLehrer(){
    }
}
