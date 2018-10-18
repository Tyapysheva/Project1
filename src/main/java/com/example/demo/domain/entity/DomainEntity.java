package com.example.demo.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DomainEntity {
    @Id
    @Column(name = "id")
    @Getter
    @Setter
    private Integer id;
}
