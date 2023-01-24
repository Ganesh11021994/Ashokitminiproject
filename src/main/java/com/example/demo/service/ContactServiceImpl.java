package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public String upsert(Contact contact) {

		Contact save = repo.save(contact);	

		return "Sucess";
	}

	@Override
	public List<Contact> getAllContacts() {

		return repo.findAll();
	}

	@Override
	public Contact getContact(int cid) {

		Optional<Contact> findById = repo.findById(cid);
		if (findById.isPresent()) {
			
			return findById.get();		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {

		repo.deleteById(cid);  
		
		return "Record deleted Success";
	}

}
