package com.redhat.pactquerysvc.service;

import java.util.List;

import com.redhat.pactquerysvc.model.ContactDM;
import com.redhat.pactquerysvc.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class PactQueryService {

    @Autowired
    ContactRepository contactsrepo;

    public List<ContactDM> findContactByState(String state) {
        return contactsrepo.findContactByState(state);
    }

    public List<ContactDM> findContactByCountry(String country)
    {
        return contactsrepo.findContactByCountry(country);
    }
}