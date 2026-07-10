package FocusFlow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentLogIn s = new StudentLogIn();


        System.out.println("Enter Username: ");
        String username = sc.nextLine();
        System.out.println("Enter Year Level: ");
        int yearLevel = sc.nextInt();
        System.out.println("Enter Course: ");
        String course = sc.next();

    }
}