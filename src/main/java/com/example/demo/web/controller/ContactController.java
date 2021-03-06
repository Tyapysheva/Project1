package com.example.demo.web.controller;

import com.example.demo.domain.entity.Address;
import com.example.demo.domain.entity.Contact;
import com.example.demo.service.ContactService;
import com.example.demo.web.dto.AddressDTO;
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
    public List<AddressDTO> convertFromAddressListToDTO(List<Address> address) {
        List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
        for(Address i:address){
        AddressDTO aDTO = new AddressDTO(i.getId(), i.getCity(),i.getIndex());
        addressDTOList.add(aDTO);
        }
        return addressDTOList;
    }
    public ContactDTO convertFromContactToDTO(Contact con) {
        ContactDTO cDTO = new ContactDTO(con.getId(), con.getName(),convertFromAddressListToDTO(con.getAddress()));
        return cDTO;
    }
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
            return convertFromContactToDTO(con.get());
        }
        return null;
    }
    @GetMapping("addNewContact/{id}/{name}")
    public ContactDTO addContact(@PathVariable Integer id, @PathVariable String name){
        Contact con = n.addRecord(id, name);
        return convertFromContactToDTO(con);
    }
//    @RequestMapping(value = {"/studentAdd"}, method = RequestMethod.POST, produces = "application/json")
//    public @ResponseBody Contact add(@RequestParam("id")Integer id,
//                                           @RequestParam("name")String name){
//
//    }




}




