package org.javaee7.jpa.defaultdatasource;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Arun Gupta
 */
@Stateless
public class EmployeeBean {

    @PersistenceContext(unitName = "MySql")
    EntityManager em;

    public void persist(EmployeeDDS e) {
        em.persist(e);
    }

    public List<EmployeeDDS> get() {
        return em.createNamedQuery("Employee.findAll", EmployeeDDS.class).getResultList();
    }
}
