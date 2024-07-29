import java.util.Scanner;
abstract class Staff {
    protected int id;
    protected String name;
    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public abstract void display();
}
class OfficeStaff extends Staff {
    private String department;
    OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class StafInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of OfficeStaff: ");
        int n = scanner.nextInt();
        OfficeStaff[] officeStaffs = new OfficeStaff[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID, Name and Department for Office Staff " + (i + 1) + ":");
            int id = scanner.nextInt();
            String name = scanner.next();
            String department = scanner.next();
            officeStaffs[i] = new OfficeStaff(id, name, department);
        }
        System.out.println("\nDetails of Office Staff:");
        for (OfficeStaff officeStaff : officeStaffs) {
            officeStaff.display();
            System.out.println();
        }
    }
}