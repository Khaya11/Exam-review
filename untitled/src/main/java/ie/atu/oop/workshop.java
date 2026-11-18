
package ie.atu.oop;

import java.util.HashSet;

public class workshop {

    private String Name;
    private int capacity;
    private HashSet<String> Ids;

    public workshop(String name, int capacity) {
        this.Name = name;
        this.capacity = capacity;
        this.Ids = new HashSet<>();
    }

    public String getName() {
        return Name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String registerStudent(String studentId) {

        if (studentId.isBlank()) {
            return "Invalid student ID";
        }

        if (Ids.contains(studentId)) {
            return "Duplicate";
        }

        if (Ids.size() >= capacity) {
            return "Workshop full";
        }

        Ids.add(studentId);
        return "Accepted";
    }

    public void displayDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Capacity: " + capacity);
    }

    public void displayReport(int rejected) {

        System.out.println("Registered student IDs:");

        for (String id : Ids) {
            System.out.println(id);
        }

        System.out.println("Accepted: " + Ids.size());
        System.out.println("Rejected: " + rejected);
        System.out.println("Places remaining: "
                + (capacity - Ids.size()));
    }
}
