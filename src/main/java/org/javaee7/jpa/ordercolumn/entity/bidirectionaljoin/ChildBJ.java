package org.javaee7.jpa.ordercolumn.entity.bidirectionaljoin;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ChildBJ {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id", insertable = false, updatable = false)
    private ParentBJ parent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParentBJ getParent() {
        return parent;
    }

    public void setParent(ParentBJ parent) {
        this.parent = parent;
    }

}
