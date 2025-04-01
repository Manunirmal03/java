import java.util.*;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    void display() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class EmployeeManagement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + " :");
            System.out.print("Employee ID: ");
            int eNo = sc.nextInt();
            sc.nextLine(); // To consume the newline character left by nextInt()
            System.out.print("Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Employee Salary: ");
            double eSalary = sc.nextDouble();
            employees[i] = new Employee(eNo, eName, eSalary);
        }

        int ch;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Search  2. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the Employee ID to search: ");
                    int searchNo = sc.nextInt();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.eNo == searchNo) {
                            System.out.println("Employee details found: ");
                            emp.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID '" + searchNo + "' not found.");
                    }
                    break;

                case 2:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (ch != 2); // The loop should continue until the user selects option 2 to exit.
    }
}

