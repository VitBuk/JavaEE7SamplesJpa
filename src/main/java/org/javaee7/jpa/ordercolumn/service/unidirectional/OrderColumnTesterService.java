package org.javaee7.jpa.ordercolumn.service.unidirectional;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.javaee7.jpa.ordercolumn.entity.unidirectional.ParentU;

@Stateless
public class OrderColumnTesterService {

    @PersistenceContext(unitName = "MySql")
    EntityManager entityManager;

    public ParentU save(ParentU parent) {
        return entityManager.merge(parent);
    }

    public ParentU getParentById(Long id) {
        return entityManager.find(ParentU.class, id);
    }

}
