package ie.atu.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of workshop");
        String name = input.nextLine();

        System.out.println("Name of the workshop: " + name);

        System.out.println("Enter the capacity of workshop");
        int capacity = input.nextInt();
        input.nextLine();

        System.out.println("Capacity of workshop: " + capacity);

        workshop workshop = new workshop(name, capacity);

        System.out.println("Enter number of registration attempts");
        int attempts = input.nextInt();
        input.nextLine();

        int rejected = 0;

        for (int i = 0; i < attempts; i++) {

            System.out.println("Enter Student ID");
            String studentId = input.nextLine();

            String result = workshop.registerStudent(studentId);

            System.out.println("Registration result: " + result);

            if (!result.equals("Accepted")) {
                rejected++;
            }
        }

        workshop.displayDetails();
        workshop.displayReport(rejected);

        input.close();
    }
}
