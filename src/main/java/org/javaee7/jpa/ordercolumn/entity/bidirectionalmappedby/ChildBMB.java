package org.javaee7.jpa.ordercolumn.entity.bidirectionalmappedby;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ChildBMB {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    private ParentBMB parent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParentBMB getParent() {
        return parent;
    }

    public void setParent(ParentBMB parent) {
        this.parent = parent;
    }

}
