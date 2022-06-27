package baithicuoiki.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import baithicuoiki.Actions;
import baithicuoiki.dao.StoredFiles;
import baithicuoiki.entity.Readers;

public class NewReadersControl {
    private Readers readers;
    private static Scanner scanner = new Scanner(System.in);
    private Actions commands;
    

    public Readers getReaders() {
        return readers;
    }

    public NewReadersControl(Readers readers) {
        this.readers = readers;
        this.commands = null;
    }

    public void createReaders(String id, String name, String job, String phoneNumber, String address, String email,
            String borrowedBooks) {
        List<Object> listCheck;
        listCheck = readersValid(name, email);
        if (!(boolean) listCheck.get(0)) {
            System.out.println(listCheck.get(1));
        } else {

            Readers.getReaders().update(id, name, job, phoneNumber, address, email, borrowedBooks);// memory
            Readers.getReaders().write();
            System.out.println(listCheck.get(1));
        }

    }

    public List<Object> readersValid(String name, String email) {
        List<Object> list = new ArrayList<>();
        int index = 0;

        index = Readers.getReaders().search("name", name);
        if (index != -1) {
            list.add(false);
            list.add("Name already exists");
        }
        index = Readers.getReaders().search("email", email);
        if (index != -1) {
            list.add(false);
            list.add("A mail with that email already exists.");
            return list;
        }
        if (index == -1) {
            list.add(true);
            list.add("Reader information has been created");
        }
        return list;
    }

    public String handleCommand(String rep) {
        String cmd = rep.toUpperCase();
        this.commands = Actions.valueOf(cmd);
        if (this.commands.equals(Actions.ADD)) {
            return "Enter a ID , Name , JOB , PHONE NUMBER, ADDRESS , EMAIL , BORROWED BOOKS";
        } else {
            return "Unkown commands";
        }
    }

    public void handleInputs() {
        if (this.commands.equals(Actions.ADD)) {
            Readers readers = createReaders();
            this.createReaders(readers.getiD(), readers.getName(), readers.getJob(),
                    readers.getPhoneNumber(), readers.getAddress(), readers.getEmail(), readers.getBorrowedBooks());
        }
    }

    private static Readers createReaders() {
        System.out.println("ID: ");
        String iD = scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Job: ");
        String job = scanner.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Borrowed Books: ");
        String borrowedBooks = scanner.nextLine();
        return new Readers(iD, name, job, phoneNumber, address, email, borrowedBooks);
    }

    public void AddReaders() {
        while (true) {
            String rep = scanner.nextLine();
            String resCMD;

            if (rep.toUpperCase().equals(Actions.ADD.toString())) {
                resCMD = handleCommand(rep);
                System.out.println(resCMD);
                handleInputs();
            }
            break;
        }
    }

    public void ReadersBorrowed() {
        StoredFiles readers = new StoredFiles("listReaders.json");
        JsonArray jsonArray = readers.getAll();
        System.out.println("Enter ID: ");
        String value = scanner.nextLine();
        int index = readers.search("iD", value);
        JsonObject jB = jsonArray.get(index).getAsJsonObject();
        System.out.println(jB);
    }

    public void ReadersReturnBook() {
        StoredFiles readers = new StoredFiles("listReaders.json");
        JsonArray jsonArray = readers.getAll();
        System.out.println("Enter ID: ");
        String value = scanner.nextLine();
        int index = readers.search("iD", value);
    }

}