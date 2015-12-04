package org.javaee7.jpa.converter;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Arun Gupta
 */
@Stateless
public class EmployeeRepository {

    @PersistenceContext(unitName = "MySql")
    private EntityManager em;

    public void persist(EmployeeConverter e) {
        em.persist(e);
    }

    public List<EmployeeConverter> all() {
        return em.createNamedQuery("Employee.findAll", EmployeeConverter.class).getResultList();
    }
}
