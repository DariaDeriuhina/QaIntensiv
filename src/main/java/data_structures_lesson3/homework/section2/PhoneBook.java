package data_structures_lesson3.homework.section2;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String number){
        contacts.put(name, number);
    }

    public void deleteContact(String name){
        contacts.remove(name);
    }

    public String findContactByName(String name){
        return contacts.get(name);
    }
}
