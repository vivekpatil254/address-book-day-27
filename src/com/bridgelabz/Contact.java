package com.bridgelabz;

import java.util.Scanner;

public class Contact {


    String firstName, state, lastName, address, city, email;
    long zip, phoneNumber, addressBookIndex;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAddressBookIndex() {
        return addressBookIndex;
    }

    public void setAddressBookIndex(long addressBookIndex) {
        this.addressBookIndex = addressBookIndex;
    }

    public void getdata(String firstName) {
        Scanner scanner = new Scanner(System.in);
        this.firstName = firstName;
        System.out.println("Enter last name     :    ");
        lastName = scanner.nextLine();
        System.out.println("Enter address       :    ");
        address = scanner.nextLine();
        System.out.println("Enter city          :    ");
        city = scanner.nextLine();
        System.out.println("Enter state         :    ");
        state = scanner.nextLine();
        System.out.println("Enter E-mail        :    ");
        email = scanner.nextLine();
        System.out.println("Enter zip code      :    ");
        zip = scanner.nextLong();
        System.out.println("Enter contact number:    ");
        phoneNumber = scanner.nextLong();
    }

    public void display() {
        System.out.println("\n\n\n");
        System.out.println("First name          :    " + firstName);
        System.out.println("Last name           :    " + lastName);
        System.out.println("Address             :    " + address);
        System.out.println("City                :    " + city);
        System.out.println("State               :    " + state);
        System.out.println("E-mail Id           :    " + email);
        System.out.println("Zip code            :    " + zip);
        System.out.println("Contact Number      :    " + phoneNumber);
    }

    public boolean search(String name) {
        if (this.firstName.equalsIgnoreCase(name))
            return true;
        else
            return false;
    }


}
