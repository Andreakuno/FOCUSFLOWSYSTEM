package FocusFlow;

import java.util.Scanner;

public class StudentLogIn {

    String username;
    int yearLevel;
    String course;

    public StudentLogIn(String username, int yearLevel, String course) {
        this.username = username;
        this.yearLevel = yearLevel;
        this.course = course;
    }

    public void StudentLogin() {
        Scanner sc = new Scanner(System.in);

         STUDENT student = new STUDENT();
         STUDY_TRACKER tracker = new STUDY_TRACKER();

        System.out.println();
        System.out.println("WELCOME, " + username);

         boolean running = true;

        while (running) {

        System.out.println("\n========================");
        System.out.println("FOCUSFLOW MENU");
        System.out.println("========================");
        System.out.println("[1] Add Subject");
        System.out.println("[2] View Subjects");
        System.out.println("[3] Edit/Remove Subject");
        System.out.println("[4] Start Study Session");
        System.out.println("[5] View Study History");
        System.out.println("[6] Search History");
        System.out.println("[7] View Daily Summary");
        System.out.println("[8] View Weekly Summary");
        System.out.println("[9] Set Daily Goal");
        System.out.println("[10] View Streak");
        System.out.println("[11] Exit");

        System.out.print("Choose Option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                //so diri kay kay ang name sa class dapat kay STUDENT(please para dili ko maglibo ig arrange) ang sulod sa diri nga class kay options 1,2 and 3
                //diri tawga ang para sa add subject nga method
                //Charita
                student.addSubject();
                break;
            case 2:
                //Charita
                student.viewSubject();
                break;
            case 3:
                //Charita
                student.editRemoveSubject();
                break;
            case 4:
                tracker.startSession(student, username);
                //STUDY TRACKER ang iname sa class, please para dili ko maglibo ig arrange.
                //mamili ug subject code then if possible kay dili na siya manual input ug time kung when siya mag start
                //pwede ra "Press "something" to start" tas himoi ug method para ma capture ang actual time nga nag start siya sa Laptop(naa man siguroy code para ana)
                //then same lang sa pag end sa session, capture dayon sa time ended.
                //once iend sa user ang session kay mag calculate dayon sa duration sa iyang study in minutes like (name sa user, studied 120 minutes), depends sa imo
                //pwede ra sad ka mag add ug press to break then random suggestions kung unsay nice himoon, like drink water first before continuing then press to start nasad.
                //then after ending sa session kay magdisplay ug random quote.
                //Angeneth
                break;
            case 5:
                //ikaw ray decide sa iname nimo sa class basta kay lahi ni siya  nga class
                //ma display diri ang subject name and code, date kung kanus-a nag study, what time nag start and end tas with duration kung pila ka minutes ang na spend niya
                //naka pasunod, most recent session first
                //Ayanna
                break;
            case 6:
                //ang name sa class kay SUMMARY GENERATOR
                //mag search ang user by subject name/code or date then mo display iyang ginapangita dayon
                //Mikka
                break;
            case 7:
                //same class sa Case 6
                //Total minutes today, subject with most time today, number of sessions today
                break;
            case 8:
                //same class sa Case 6
                //Total minutes this week, breakdown per day or per subject, busiest day
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                 running = false;
                break;
                default:
                    System.out.println("Invalid option. Please choose 1-11.");
                break;

        }
    }
    }
}

