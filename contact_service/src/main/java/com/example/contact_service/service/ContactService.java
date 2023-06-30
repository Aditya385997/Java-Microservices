package com.example.contact_service.service;

import com.example.contact_service.entity.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getContact(Long user_id);

}
