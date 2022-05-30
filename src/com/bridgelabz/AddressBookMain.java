package com.bridgelabz;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program ...");
        Scanner scanner=new Scanner(System.in);
        int choice,flag=0;
        String name;
        Contact contact = new Contact();
        Contact contact2 = new Contact();
        List<Contact> addressBook = new ArrayList<>();
      //  contact.getdata("aaaa");
      //  contact2.getdata("bbb");
//        addressBook.add(contact);
//        addressBook.add(contact2);

    while (true) {


        System.out.println("1. ADD CONTACT");
        System.out.println("2. EDIT CONTACT");
        System.out.println("3. DELETE CONTACT");
        System.out.println("4. DISPLAY CONTACT");
        System.out.println("5. EXIT");
        System.out.println("Enter your choice --> ");
        choice =scanner.nextInt();
        switch(choice)
        {
            case 1:
                Contact temp = new Contact();
                System.out.println("Enter first name     : ");
                name =scanner.next();
                temp.getdata(name);
                addressBook.add(temp);
                break;
            case 2:
                Contact temp = new Contact();
                System.out.println("Enter first name to edit     : ");
                name =scanner.next();
                for (Contact contact1:addressBook) {
                    if(contact1.getFirstName().equalsIgnoreCase(name))
                    {
                        contact1.getdata(name);
                        flag=1;
                    }
                }
                if(flag == 1)
                {
                    System.out.println("Data Edited Successfully...");
                    flag=0;
                    }
                else
                {
                    System.out.println("the entered contact not present in addressbook");
                    System.out.println("enter data for new contact in addressbook");
                    contact.getdata(name);
                }
                break;
            case 3 :
                System.out.println("Enter first name to edit     : ");
                name =scanner.next();
               // Contact contact2;
//                addressBook.stream().forEach(contact1 -> {
//                    if(name.equalsIgnoreCase(contact1.getFirstName()))
//                        contact1.display();
//                });
                for (Contact contact1:addressBook) {
                    if(contact1.getFirstName().equalsIgnoreCase(name))
                    {   contact2=contact1;
                      //  addressBook.remove(contact1);
                        flag=1;
                    }
                }
                if(flag == 1)
                {   addressBook.remove(contact2);
                    System.out.println("Data Delete Seccessfully...");
                    flag=0;
                }
                else
                {
                    System.out.println("the entered contact not present in addressbook");
                    System.out.println("enter data for new contact in addressbook");
                    contact.getdata(name);
                }
                break;
            case 4:
                for (Contact contact1:addressBook) {
                    contact1.display();
                }
                break;
            case 5:
                System.exit(0);
        }





    }
    }
}
