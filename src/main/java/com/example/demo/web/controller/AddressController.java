package com.example.demo.web.controller;

import com.example.demo.domain.entity.Address;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("addressall")
    public List<Address> getAddress(){
       return addressService.selectRecordss();
    }
    @GetMapping("addressbyid")
    public Optional<Address>getAddressById(Integer id){
        return addressService.selectRecordsByIdd(id);
    }
}
