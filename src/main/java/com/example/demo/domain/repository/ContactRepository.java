package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Contact;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends EntityRepository<Contact,Integer> {

}
