/**
 * 
 */
package org.jhon.s2app.model;

import junit.framework.TestCase;

import javax.persistence.*;

/**
 * @author Jhonatan
 *
 */
public class PersistenceBaseClass extends TestCase {
	

    private EntityManagerFactory emf;
    protected EntityManager entityMgr;
    protected EntityTransaction tx;

    public PersistenceBaseClass() {
        super();
        emf = Persistence.createEntityManagerFactory("s2app");
    }

    protected void setUp() throws Exception {
        super.setUp();
        entityMgr = emf.createEntityManager();
        tx = entityMgr.getTransaction();
        tx.begin();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        tx.rollback();
    }

}