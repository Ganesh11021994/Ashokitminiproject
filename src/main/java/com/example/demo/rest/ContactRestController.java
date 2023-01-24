package com.example.demo.rest;

import java.util.List;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ContactRestController {

	@Autowired
	private ContactService Service;


@PostMapping("/contact")
public ResponseEntity<String> contact (@RequestBody Contact contact){
	
	String Status = Service.upsert(contact);
	return new ResponseEntity<>(Status,HttpStatus.CREATED);
};

@GetMapping("/contacts")
public ResponseEntity<List<Contact>> getAllContacts( ) {
	
	List<Contact> allContacts = Service.getAllContacts();
	
	return new ResponseEntity<List<Contact>>(allContacts,HttpStatus.OK);
}
	

@GetMapping("/contact/{cid}")
public ResponseEntity<Contact> getContact(@PathVariable int cid){
	Contact contact = Service.getContact(cid);
	
	return new ResponseEntity<>(contact,HttpStatus.OK);
	}



@DeleteMapping("/contact/{cid}")
	public ResponseEntity<String> deleteContact(@PathVariable int cid){
	
	 String deleteContact = Service.deleteContact(cid);
	return new ResponseEntity<>(deleteContact,HttpStatus.OK);
	
}
	}


