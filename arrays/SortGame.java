package arrays;

import java.util.Scanner;

public class SortGame {
    private static class Employee {
        private String name;
        private int sal;
        Employee(String name, int sal) {
            this.name = name;
            this.sal = sal;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int salCheck = scanner.nextInt();
        Employee[] emp = new Employee[size];
        

       
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee(scanner.next(), scanner.nextInt());
        }

        // sort the employee by sal
        for (int i = 0; i < emp.length - 1; i++) {
            for (int j = 0; j < emp.length - 1 - i; j++) {
                if (emp[j].sal > emp[j + 1].sal ) {
                    int temp = emp[j].sal;
                    emp[j].sal = emp[j + 1].sal;
                    emp[j + 1].sal = temp;
                }
            }
        }
        
        // eleminate 
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].sal < salCheck ) {
                i++;
            }
        }

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].name + " " + emp[i].sal);
        }
    }
    
    
}
