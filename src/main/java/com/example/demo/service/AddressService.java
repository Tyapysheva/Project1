package com.example.demo.service;

import com.example.demo.domain.entity.Address;
import com.example.demo.domain.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class AddressService {
    @Autowired
    private AddressRepository repository;

    @Transactional
    public List<Address> selectRecordss() {
        List<Address> c = repository.findAll();
        return c;
    }
    @Transactional
    public Optional<Address> selectRecordsByIdd(Integer id) {
        Optional<Address> c = repository.findById(id);
        return c;
    }
}
