package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    //Creating object for ContactDetails class.
    ContactDetails person;
    Scanner sc = new Scanner(System.in);
    public void addContact(){
        person = new ContactDetails();
        //Accepting values at console.
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("Enter your state: ");
        String state = sc.nextLine();
        System.out.println("Enter zip code of your area: ");
        Long zipCode = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter phone number: ");
        Long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter your EMail ID: ");
        String email = sc.nextLine();

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setZipCode(zipCode);
        person.setPhoneNumber(phoneNumber);
        person.setEmail(email);
    }
    public boolean firstName(String name) throws AddressBookException {
        if(name == null || name.isEmpty()){
            throw new AddressBookException("Enter proper First Name");
        }
        if(name != null){
            //throw new AddressBookException("valid first name");
            return true;
        }
        else
            throw new AddressBookException("invalid valid first name");
    }
}

