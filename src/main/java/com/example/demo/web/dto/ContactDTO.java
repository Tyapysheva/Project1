package com.example.demo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;

@AllArgsConstructor
@Data
public class ContactDTO {
@Id
    private Integer id;
    private String name;

}
