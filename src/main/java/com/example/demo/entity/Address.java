package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="address")
public class Address {
    @Id
    @Column(name = "id_address")
    Integer id;
    @Column(name = "city")
    String city;
    @Column(name = "index")
    Integer index;
    @ManyToMany(mappedBy="add")
    private Set<Contact> cont = new HashSet<Contact>();
}
