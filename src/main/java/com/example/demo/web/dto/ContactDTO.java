package com.example.demo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class ContactDTO {
@Id
    private Integer id;
    private String name;
    private List<AddressDTO> address = new ArrayList<AddressDTO>();

}
