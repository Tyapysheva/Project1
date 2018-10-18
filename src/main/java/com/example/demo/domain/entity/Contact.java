package com.example.demo.domain.entity;






import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@Entity
@Table(name = "contact")
public class Contact extends DomainEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "contact_address",
            joinColumns = {@JoinColumn( name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_add")})
    private Set<Address> address = new HashSet<Address>();

    public Contact() {
    }
    public Contact(Integer id, String name) {
        id = id;
        name = name;
    }


}
