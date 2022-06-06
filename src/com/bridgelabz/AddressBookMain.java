package com.bridgelabz;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    static List<Contact> addressBook = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program ...");

        int choice, flag = 0;
        String name;
        Contact contact = new Contact();
        Contact contact2 = new Contact();

        while (true) {


            System.out.println("1. ADD CONTACT");
            System.out.println("2. ADD MULTIPLE CONTACTS TO ADDRESSBOOK");
            System.out.println("3. EDIT CONTACT");
            System.out.println("4. DELETE CONTACT");
            System.out.println("5. DISPLAY CONTACT");
            System.out.println("6. EXIT");
            System.out.println("Enter your choice --> ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Contact temp = new Contact();
                    System.out.println("Enter first name     : ");
                    name = scanner.next();
                    boolean a;
                    if (addressBook.size() == 0) {
                        temp.getdata(name);
                        addressBook.add(temp);
                    } else {
                        checkDuplicate(name);
//                    temp.getdata(name);
//                    addressBook.add(temp);
                    }
                    break;
                case 2:
                    addMultiple();
                    break;
                case 3:
                    System.out.println("Enter first name to edit     : ");
                    name = scanner.next();
                    for (Contact contact1 : addressBook) {
                        if (contact1.getFirstName().equalsIgnoreCase(name)) {
                            contact1.getdata(name);
                            flag = 1;
                        }
                    }
                    if (flag == 1) {
                        System.out.println("Data Edited Successfully...");
                        flag = 0;
                    } else {
                        System.out.println("the entered contact not present in addressbook");
                        System.out.println("enter data for new contact in addressbook");
                        contact.getdata(name);
                        addressBook.add(contact);
                    }
                    break;
                case 4:
                    System.out.println("Enter first name to edit     : ");
                    name = scanner.next();
                    for (Contact contact1 : addressBook) {
                        if (contact1.getFirstName().equalsIgnoreCase(name)) {
                            contact2 = contact1;
                            //  addressBook.remove(contact1);
                            flag = 1;
                        }
                    }
                    if (flag == 1) {
                        addressBook.remove(contact2);
                        System.out.println("Data Delete Seccessfully...");
                        flag = 0;
                    } else {
                        System.out.println("the entered contact not present in addressbook");
                        System.out.println("enter data for new contact in addressbook");
                        contact.getdata(name);
                    }
                    break;
                case 5:
                    for (Contact contact1 : addressBook) {
                        contact1.display();
                    }
                    break;
                case 6:
                    System.exit(0);

            }
        }
    }

    public static void addMultiple() {
        int count;
        Contact contact = new Contact();
        List<Contact> mulipleContacts = new ArrayList<>();
        System.out.println("Enter how  many number of contacts you want to insert : ");
        count = scanner.nextInt();
        System.out.println("Enter the data for " + count + " contacts");
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name   :   ");
            contact.getdata(scanner.next());
            mulipleContacts.add(contact);
        }
        addressBook.addAll(mulipleContacts);
    }

    public static void checkDuplicate(String name) {
        int flag=0;
        Contact contact=new Contact();
        for (Contact contact1 : addressBook) {
            if (contact1.getFirstName().equalsIgnoreCase(name)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The entered contact is already present in addressbook, try again for new");
        } else {
            contact.getdata(name);
            addressBook.add(contact);
        }
    }
}
