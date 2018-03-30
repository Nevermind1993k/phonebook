package com.nevermind.bu.service.interfaces;

import com.nevermind.bu.entity.Contact;

import java.util.List;

public interface ContactService {

    Contact getById(int id);

    List<Contact> getAll();

    List<Contact> getByName(String name);

    List<Contact> getByLastName(String lastName);

    List<Contact> getByMobileNumber(String mobileNumber);

    Contact createNewContact(Contact contact);

    void update(Contact contact);

    void delete(int id);

}