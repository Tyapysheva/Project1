package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "contact_address",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_address")})
    private Set<Address> add = new HashSet<Address>();

    public Contact() {
    }

    public Contact(Integer id, String name) {
        setId(id);
        setName(name);
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
