package FocusFlow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Year Level: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            sc.next(); 
            System.out.print("Enter Year Level: ");
        }
        int yearLevel = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        StudentLogIn s = new StudentLogIn(username, yearLevel, course);

        s.StudentLogin();
    }
}
