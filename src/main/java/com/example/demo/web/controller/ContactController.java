package com.example.demo.web.controller;

import com.example.demo.service.ContactService;
import com.example.demo.domain.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("contact")
public class ContactController {
    @Autowired
    ContactService n;

    @GetMapping("all")
    public void getAll() {
        List<Contact> p =n.selectRecords();
        for (int i=0;i<p.size();i++)
            System.out.println(p.get(i).getName());

    }

    @GetMapping("id")
    public Optional<Contact> getById() {

        return n.selectRecordsById(1);
    }

}
