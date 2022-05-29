package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program ...");

        Contact contact = new Contact();
        List<Contact> addressBook = new ArrayList<>();
        contact.getdata();
        addressBook.add(contact);
        Contact temp = addressBook.get(0);
        temp.display();

    }
}
