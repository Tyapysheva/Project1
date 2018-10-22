package com.example.demo.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private List<Contact> contact = new ArrayList<Contact>();
}
