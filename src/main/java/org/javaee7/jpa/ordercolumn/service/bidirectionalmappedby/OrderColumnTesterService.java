package org.javaee7.jpa.ordercolumn.service.bidirectionalmappedby;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.javaee7.jpa.ordercolumn.entity.bidirectionalmappedby.ParentBMB;

@Stateless
public class OrderColumnTesterService {

    @PersistenceContext(unitName = "MySql")
    EntityManager entityManager;

    public ParentBMB save(ParentBMB parent) {
        return entityManager.merge(parent);
    }

    public ParentBMB getParentById(Long id) {
        return entityManager.find(ParentBMB.class, id);
    }

}
