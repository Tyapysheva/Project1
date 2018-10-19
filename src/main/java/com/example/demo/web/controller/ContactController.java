package com.example.demo.web.controller;

import com.example.demo.domain.entity.Contact;
import com.example.demo.service.ContactService;
import com.example.demo.web.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("contact")

public class ContactController {

    @Autowired
    ContactService n;

    @GetMapping("all")
    public List<ContactDTO> getAll() {
        List<Contact> c = n.selectRecords();
        List<ContactDTO> contactDTOList = new ArrayList<ContactDTO>();
        for (Contact i : c) {
            contactDTOList.add(convertFromContactToDTO(i));
        }
        return contactDTOList;
    }

    @GetMapping("id/{id}")
    public ContactDTO getById(@PathVariable Integer id) {
        Optional<Contact> con = n.selectRecordsById(id);
        if (con.isPresent()) {
            Contact contact = con.get();
            return convertFromContactToDTO(contact);
        }
        return null;
    }

    public ContactDTO convertFromContactToDTO(Contact con) {
        ContactDTO cDTO = new ContactDTO(con.getId(), con.getName());
        return cDTO;
    }

}
//
//    @GetMapping("save")
//    public Contact addContact(ContactDTO cdto){
//
//    }


