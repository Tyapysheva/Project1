package com.example.demo.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter

@Entity
@Table(name="address")

public class Address extends DomainEntity{
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "city")
    private String city;
    @Column(name = "index")
    private Integer index;
    @ManyToMany(mappedBy="address")
    private Set<Contact> contact = new HashSet<Contact>();
}
