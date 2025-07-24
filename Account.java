package model;

public class Account {
    private int id;
    private String username;
    private String fullName;
    private double balance;

    public Account(int id, String username, String fullName, double balance) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.balance = balance;
    }

    // Getters and setters...
}