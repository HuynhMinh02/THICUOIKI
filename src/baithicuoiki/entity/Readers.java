package baithicuoiki.entity;

import baithicuoiki.dao.StoredFiles;

public class Readers {

    private String iD;
    private String name;
    private String job;
    private String phoneNumber;
    private String address;
    private String email;
    private String borrowedBooks;

    private static StoredFiles readers = new StoredFiles("listReaders.json");

    public Readers() {
    }

    public Readers(String iD, String name, String job, String phoneNumber, String address, String email,
            String borrowedBooks) {
        this.iD = iD;
        this.name = name;
        this.job = job;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
    }
    
    
    public Readers(String iD, String name){

    }
    public String getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static StoredFiles getReaders() {
        return readers;
    }

    @Override
    public String toString() {
        return "ID: " + this.getiD() + "Name: " + this.getName() + "Job: " + this.getJob()
                + "Phone Number : " + this.getPhoneNumber() + "Address : " + this.getAddress() + "Email"
                + this.getEmail();
    }

}
