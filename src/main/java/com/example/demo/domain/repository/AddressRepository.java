package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Address;
import com.example.demo.domain.entity.Contact;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends EntityRepository<Address,Integer> {

}
