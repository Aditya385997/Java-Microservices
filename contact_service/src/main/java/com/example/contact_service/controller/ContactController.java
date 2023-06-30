package com.example.contact_service.controller;

import com.example.contact_service.entity.Contact;
import com.example.contact_service.service.ContactServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactServiceImp contactServiceImp;
    @RequestMapping("/user/{user_id}")
    public List<Contact> getContact(@PathVariable("user_id") long userID)
    {
        System.out.print(userID);
        return this.contactServiceImp.getContact(userID);
    }
}
