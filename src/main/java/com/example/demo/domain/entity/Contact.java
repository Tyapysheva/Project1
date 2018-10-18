package com.example.demo.domain.entity;

import lombok.Getter;
import lombok.Setter;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "contact")
public class Contact extends DomainEntity {
    @Column(name = "name")
    @Getter
    @Setter
    private String name;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "contact_address",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_address")})
    private Set<Address> add = new HashSet<Address>();

    public Contact() {
    }

    public Contact(Integer id, String name) {
        id = id;
        name = name;
    }


}
