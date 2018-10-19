package com.example.demo.web.dto;

import com.example.demo.domain.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Data
public class ContactDTO {
@Id
    private Integer id;
    private String name;
    private Set<Address> address = new HashSet<Address>();

}
