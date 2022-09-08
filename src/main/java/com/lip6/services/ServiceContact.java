package com.lip6.services;


import java.util.ArrayList;


import com.lip6.daos.DAOContact;
import com.lip6.daos.IDAOContact;
import com.lip6.entities.Contact;

public class ServiceContact {
	
	public void createContact(long id, String fname, String lname, String email) {
		
		IDAOContact daoc=new DAOContact();
		boolean ok=daoc.addContact(id, fname, lname, email);
		if (ok)
			System.out.println("Contact ajouté!");
		else
			System.out.println("Contact non ajouté!");
		
	}
	
	public void searchIDContact(long id) {
		
	    IDAOContact daoc=new DAOContact();
		Contact ok=daoc.getContact(id);
		System.out.println(ok.getIdContact() + ","+ ok.getFirstName()+"," + ok.getLastName()+"," + ok.getEmail());
	}
	
public void searchFirstnameContact(String fname) {
		
	    IDAOContact daoc=new DAOContact();
	    ArrayList<Contact> firstname = new ArrayList<Contact>();
	    firstname.addAll(daoc.getContactByFirstName(fname));
	    System.out.println(firstname);
	    firstname.stream().forEach(System.out::println);
	 
	}


public void searchLastnameContact(String lname) {
	
	IDAOContact daoc=new DAOContact();
    ArrayList<Contact> lastname = new ArrayList<Contact>();
    lastname.addAll(daoc.getContactByLastName(lname));
    System.out.println(lastname);
   
}

public void searchEmailContact(String email) {
	
	IDAOContact daoc=new DAOContact();
    ArrayList<Contact> mail = new ArrayList<Contact>();
    mail.addAll(daoc.getContactByEmail(email));
    System.out.println(mail);
  
}
	
}
