package com.example.demo;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SomeContact {
    @Autowired
    private ContactRepository repository;
    @Transactional
        public List<Contact> selectRecords(){
            List<Contact> c = repository.findAll();
            return c;
    }
    @Transactional
    public Optional<Contact> selectRecordsById(Integer id){
        Optional<Contact> c = repository.findById(id);
        return c;
    }
    @Transactional
    public Optional select(Integer id){

        return Optional.of(repository.findById(id));
    }


}
