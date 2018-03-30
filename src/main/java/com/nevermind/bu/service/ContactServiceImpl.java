package com.nevermind.bu.service;

import com.nevermind.bu.dao.ContactDao;
import com.nevermind.bu.entity.Contact;
import com.nevermind.bu.service.interfaces.ContactServie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContactServiceImpl implements ContactServie {

    @Autowired
    private ContactDao contactDao;

    @Override
    public Contact getById(int id) {
        return contactDao.findById(id);
    }

    @Override
    public List<Contact> getByName(String name) {
        return contactDao.findAllByName(name);
    }

    @Override
    public List<Contact> getByLastName(String lastName) {
        return contactDao.findAllByLastName(lastName);
    }

    @Override
    public List<Contact> getByMobileNumber(String mobileNumber) {
        return contactDao.findAllByMobilePhoneNumber(mobileNumber);
    }

    @Override
    public Contact createNewContact(Contact contact) {
        return contactDao.save(contact);
    }

    @Override
    public void update(Contact contact) {
        contactDao.save(contact);
    }

    @Override
    public void delete(int id) {
        contactDao.delete(id);
    }
}