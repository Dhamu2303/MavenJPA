package xyz.com.MavenJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setS_id(1001);
        studentEntity.setS_name("Peter");
        studentEntity.setS_age(25);
        
        em.persist(studentEntity);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}
