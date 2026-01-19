import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Ontario G1 Practice Test");

        //Part A
        ArrayList<String> questionsA = new ArrayList<String>();
        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> a2 = new ArrayList<String>();
        ArrayList<String> a3 = new ArrayList<String>();
        ArrayList<String> a4 = new ArrayList<String>();
        ArrayList<Character> answersA = new ArrayList<Character>();

        questionsA.add("What does a red light mean?");
        a1.add("A. Stop"); a2.add("B. Go"); a3.add("C. Slow"); a4.add("D. Yield");
        answersA.add('A');

        questionsA.add("What does a stop sign mean?");
        a1.add("A. Slow"); a2.add("B. Stop"); a3.add("C. Yield"); a4.add("D. Turn");
        answersA.add('B');

        questionsA.add("What does a yellow light mean?");
        a1.add("A. Stop"); a2.add("B. Go"); a3.add("C. Slow down"); a4.add("D. Speed up");
        answersA.add('C');

        questionsA.add("What does a green light mean?");
        a1.add("A. Stop"); a2.add("B. Go"); a3.add("C. Yield"); a4.add("D. Turn");
        answersA.add('B');

        questionsA.add("What does a yield sign mean?");
        a1.add("A. Stop"); a2.add("B. Speed up"); a3.add("C. Yield"); a4.add("D. Turn");
        answersA.add('C');

        questionsA.add("What does a flashing red light mean?");
        a1.add("A. Go"); a2.add("B. Stop"); a3.add("C. Yield"); a4.add("D. Slow");
        answersA.add('B');

        questionsA.add("What does a school zone sign mean?");
        a1.add("A. Stop"); a2.add("B. Speed up"); a3.add("C. Slow down"); a4.add("D. Turn");
        answersA.add('C');

        questionsA.add("What does a pedestrian sign mean?");
        a1.add("A. Cars only"); a2.add("B. Pedestrians crossing"); a3.add("C. No walking"); a4.add("D. Stop");
        answersA.add('B');

        questionsA.add("What does a speed limit sign show?");
        a1.add("A. Minimum"); a2.add("B. Maximum"); a3.add("C. Average"); a4.add("D. Turning");
        answersA.add('B');

        questionsA.add("What does a no entry sign mean?");
        a1.add("A. Enter"); a2.add("B. Do not enter"); a3.add("C. Turn"); a4.add("D. Yield");
        answersA.add('B');

        //Part B
        ArrayList<String> questionsB = new ArrayList<String>();
        ArrayList<String> b1 = new ArrayList<String>();
        ArrayList<String> b2 = new ArrayList<String>();
        ArrayList<String> b3 = new ArrayList<String>();
        ArrayList<String> b4 = new ArrayList<String>();
        ArrayList<Character> answersB = new ArrayList<Character>();

        questionsB.add("What should you do in fog?");
        b1.add("A. High beams"); b2.add("B. No lights"); b3.add("C. Low beams"); b4.add("D. Speed");
        answersB.add('C');

        questionsB.add("What should you do for an ambulance?");
        b1.add("A. Ignore"); b2.add("B. Speed up"); b3.add("C. Pull over"); b4.add("D. Stop anywhere");
        answersB.add('C');

        questionsB.add("What should you do on icy roads?");
        b1.add("A. Brake hard"); b2.add("B. Brake gently"); b3.add("C. Speed"); b4.add("D. Turn fast");
        answersB.add('B');

        questionsB.add("When must headlights be used?");
        b1.add("A. Night"); b2.add("B. Rain"); b3.add("C. Fog"); b4.add("D. All of the above");
        answersB.add('D');

        questionsB.add("What does a flashing yellow light mean?");
        b1.add("A. Stop"); b2.add("B. Slow down"); b3.add("C. Speed up"); b4.add("D. Turn");
        answersB.add('B');

        questionsB.add("What should you do at a railway crossing?");
        b1.add("A. Speed"); b2.add("B. Stop if train"); b3.add("C. Ignore"); b4.add("D. Turn");
        answersB.add('B');

        questionsB.add("What must you do before changing lanes?");
        b1.add("A. Honk"); b2.add("B. Signal"); b3.add("C. Speed"); b4.add("D. Brake");
        answersB.add('B');

        questionsB.add("When should seatbelts be worn?");
        b1.add("A. Driver only"); b2.add("B. Front only"); b3.add("C. Everyone"); b4.add("D. Never");
        answersB.add('C');

        questionsB.add("What is the safest following distance?");
        b1.add("A. 1 second"); b2.add("B. 2 seconds"); b3.add("C. 3 seconds"); b4.add("D. 5 seconds");
        answersB.add('C');

        questionsB.add("What should you do if tired?");
        b1.add("A. Drive faster"); b2.add("B. Ignore"); b3.add("C. Stop and rest"); b4.add("D. Drink soda");
        answersB.add('C');

        //Menu
        System.out.println("1. Write a G1 Test");
        System.out.println("2. Login as Admin");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        //G1 Test
        if (choice == 1) {

            int scoreA = 0;
            int scoreB = 0;

            ArrayList<Integer> usedA = new ArrayList<Integer>();
            ArrayList<Integer> usedB = new ArrayList<Integer>();

            System.out.println("Part A");

            while (usedA.size() < 6) {
                int index = (int)(Math.random() * questionsA.size());

                int found = 0;
                for (int i = 0; i < usedA.size(); i++) {
                    if (usedA.get(i) == index) {
                        found = 1;
                    }
                }

                if (found == 0) {
                    usedA.add(index);

                    System.out.println(questionsA.get(index));
                    System.out.println(a1.get(index));
                    System.out.println(a2.get(index));
                    System.out.println(a3.get(index));
                    System.out.println(a4.get(index));

                    char ans = sc.nextLine().toUpperCase().charAt(0);

                    if (ans == answersA.get(index)) {
                        System.out.println("Correct");
                        scoreA++;
                    } else {
                        System.out.println("Incorrect");
                    }

                    int remaining = 6 - usedA.size();
                    if (scoreA + remaining < 4) {
                        System.out.println("You can no longer pass Part A");
                        break;
                    }
                }
            }

            System.out.println("Part B");

            while (usedB.size() < 6) {
                int index = (int)(Math.random() * questionsB.size());

                int found = 0;
                for (int i = 0; i < usedB.size(); i++) {
                    if (usedB.get(i) == index) {
                        found = 1;
                    }
                }

                if (found == 0) {
                    usedB.add(index);

                    System.out.println(questionsB.get(index));
                    System.out.println(b1.get(index));
                    System.out.println(b2.get(index));
                    System.out.println(b3.get(index));
                    System.out.println(b4.get(index));

                    char ans = sc.nextLine().toUpperCase().charAt(0);

                    if (ans == answersB.get(index)) {
                        System.out.println("Correct");
                        scoreB++;
                    } else {
                        System.out.println("Incorrect");
                    }
                }
            }

            System.out.println("Part A Score: " + scoreA + "/6");
            System.out.println("Part B Score: " + scoreB + "/6");

            if (scoreA >= 4 && scoreB >= 4) {
                System.out.println("You pass!");
            } else {
                System.out.println("You failed.");
            }
        }

        //Admin
        else if (choice == 2) {

            System.out.print("Enter admin password: ");
            String password = sc.nextLine();

            if (password.equals("admin123")) {

                System.out.println("Admin Menu");
                System.out.println("1. Add question to Part A");
                System.out.println("2. Remove question from Part A");

                int adminChoice = sc.nextInt();
                sc.nextLine();

                if (adminChoice == 1) {

                    System.out.print("Enter the question: ");
                    String q = sc.nextLine();

                    System.out.print("Enter option A: ");
                    String o1 = "A. " + sc.nextLine();

                    System.out.print("Enter option B: ");
                    String o2 = "B. " + sc.nextLine();

                    System.out.print("Enter option C: ");
                    String o3 = "C. " + sc.nextLine();

                    System.out.print("Enter option D: ");
                    String o4 = "D. " + sc.nextLine();

                    System.out.print("Enter correct answer (A/B/C/D): ");
                    char correct = sc.nextLine().toUpperCase().charAt(0);

                    questionsA.add(q);
                    a1.add(o1);
                    a2.add(o2);
                    a3.add(o3);
                    a4.add(o4);
                    answersA.add(correct);

                    System.out.println("Question added successfully");
                }

                if (adminChoice == 2) {

                    for (int i = 0; i < questionsA.size(); i++) {
                        System.out.println(i + ": " + questionsA.get(i));
                    }

                    int remove = sc.nextInt();

                    questionsA.remove(remove);
                    a1.remove(remove);
                    a2.remove(remove);
                    a3.remove(remove);
                    a4.remove(remove);
                    answersA.remove(remove);

                    System.out.println("Question removed");
                }

            } else {
                System.out.println("Incorrect password");
            }
        }
    }
}


