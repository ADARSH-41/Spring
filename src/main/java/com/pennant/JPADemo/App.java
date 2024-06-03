package com.pennant.JPADemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        Employee e = em.find(Employee.class, 2);
        System.out.println(e);
        
        Employee e1 = new Employee();
        e1.setEno(7);
        e1.setEname("Sudheer");
        e1.setJob("R&D Engineer");
        e1.setSalary(1200000);
        e1.setDeptno(1);
        
        em.getTransaction().begin();
        
        em.persist(e1);
        
        em.getTransaction().commit();
    }
}
