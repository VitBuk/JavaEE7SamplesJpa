package org.javaee7.jpa.ordercolumn.entity.unidirectional;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class ParentU {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @OneToMany(cascade = ALL, fetch = EAGER)
    @OrderColumn
    @JoinColumn
    private List<ChildU> children = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ChildU> getChildren() {
        return children;
    }

    public void setChildren(List<ChildU> children) {
        this.children = children;
    }

}
