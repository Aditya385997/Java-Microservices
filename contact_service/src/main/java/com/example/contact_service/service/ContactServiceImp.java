package com.example.contact_service.service;

import com.example.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImp implements ContactService{
    //
    List<Contact>list = List.of(
            new Contact(1L,"amit@gmail.com","Amit",1311L),
            new Contact(2L,"anil@gmail.com","Anil",1312L),
            new Contact(3L,"anish@gmail.com","Anish",1313L),
            new Contact(4L,"krish@gmail.com","krish",1311L)
    );



    @Override
    public List<Contact> getContact(Long user_id) {
        return this.list.stream().filter(contact -> contact.getUser_id().equals(user_id)).collect(Collectors.toList());
    }
}
