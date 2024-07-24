import java.util.*;
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}


class Marks extends Student {
    int m1, m2, m3;

    Marks(int id, String name, int m1, int m2, int m3) {
        super(id, name); 
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void show() {
        System.out.println("Marks: ");
        System.out.println("M1: " + m1);
        System.out.println("M2: " + m2);
        System.out.println("M3: " + m3);
        super.display(); 
    }
}
class Result extends Marks {
    Result(int id, String name, int m1, int m2, int m3) {
        super(id, name, m1, m2, m3); 
    }

    void calculatePercentage() {
        int total = m1 + m2 + m3;
        double percentage = (total / 300.0) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }

    void displayResult() {
        System.out.println("Result: ");
        show(); 
        calculatePercentage();
    }
   
}

public class StudentDetails {
    public static void main(String[] args) {
        Result r = new Result(1, "ABC", 70, 80, 90);
        r.displayResult();
    }
}