package com.library.model.commontests.category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;

/**
 *
 * @author everton
 */
public class CategoryRepositoryUTest {

    private EntityManagerFactory emf;
    private EntityManager  em;

    @Before
    public void initTestCase() {
        emf = Persistence.createEntityManagerFactory("libraryPU");
        em = emf.createEntityManager();
    }

    @After
    public void closeEntityManager() {
        em.close();
        emf.close();
    }

    public void addCategoryAndFindIt() {
        try {
            em.getTransaction().begin();



            em.getTransaction().commit();
            em.clear();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }

}

