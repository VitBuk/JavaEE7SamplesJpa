package org.javaee7.jpa.ordercolumn.service.bidirectionaljoin;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.javaee7.jpa.ordercolumn.entity.bidirectionaljoin.ParentBJ;

@Stateless
public class OrderColumnTesterService {

    @PersistenceContext(unitName = "MySql")
    EntityManager entityManager;

    public ParentBJ save(ParentBJ parent) {
        return entityManager.merge(parent);
    }

    public ParentBJ getParentById(Long id) {
        return entityManager.find(ParentBJ.class, id);
    }

}
