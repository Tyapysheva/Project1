package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Integer> {

}
