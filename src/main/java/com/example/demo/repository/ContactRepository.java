package com.example.demo.repository;

import com.example.demo.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Integer> {
    List<Contact> findAll();
    Optional<Contact> findById(Integer id);
}
