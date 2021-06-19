package salarycalculator;

public class Main {
    public static void main(String[] args) {
        Employee enes = new Employee("Enes",3500, 8, 2015);
        Employee ahmet = new Employee("Ahmet",7000, 12, 2000);
        Employee ali = new Employee("Ali",15000, 6, 1990);

        enes.getEmployeeDetails();
        System.out.println();
        ahmet.getEmployeeDetails();
        System.out.println();
        ali.getEmployeeDetails();
    }
}
