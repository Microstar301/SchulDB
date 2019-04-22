import de.thm.schule.Lehrer;

import javax.persistence.*;
import java.util.ArrayList;

public class SchulVerwaltung {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("THM");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        ArrayList<Lehrer> lehrerArrayList = new ArrayList<>();
        Lehrer l;
        int c = 1;
        boolean done = false;
        while( !done) {
            l = entityManager.find(Lehrer.class, c);
            if (l != null) {
                lehrerArrayList.add(l);
            }else {
                done = true;
            }
            c++;
        }
        lehrerArrayList.get(1).setNachname(null);
        for(int i=0;i<lehrerArrayList.size();i++){
            System.out.print(lehrerArrayList.get(i).getPnr()+". ");
            if(lehrerArrayList.get(i).getTitel() != null)
                System.out.print(lehrerArrayList.get(i).getTitel()+" ");
            System.out.print(lehrerArrayList.get(i).getVorname()+" ");
            System.out.print(lehrerArrayList.get(i).getNachname()+" ");
            System.out.print(lehrerArrayList.get(i).getGebdatum()+" ");
            System.out.print(lehrerArrayList.get(i).getSchuleintritt()+" ");
            System.out.print(lehrerArrayList.get(i).getStufe()+" \n");
        }

        l = entityManager.find(Lehrer.class, 1);
        entityManager.persist(l);
        l.setNachname("Schmittengrund");
        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    public void createLehrer(){
    }
}
