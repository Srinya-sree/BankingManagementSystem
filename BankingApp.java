package app;

import dao.AccountDAO;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountDAO dao = new AccountDAO();

        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (dao.login(user, pass)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
        sc.close();
    }
}