package com.example.demo.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="address")
public class Address{
    @Id
    @Column(name = "id_address")
    @Getter@Setter
    private Integer id;
    @Column(name = "city")
    @Getter@Setter private String city;
    @Column(name = "index")
    @Getter@Setter private Integer index;
    @ManyToMany(mappedBy="add")
    private Set<Contact> cont = new HashSet<Contact>();


}
