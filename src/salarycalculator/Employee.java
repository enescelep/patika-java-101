package salarycalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double calculateTaxes(double salary) {
        if (salary < 1000) return salary;
        else return salary + (salary*0.03);
    }

    public int calculateBonus(int workHours) {
        return workHours * 30;
    }

    public double raiseSalary(Employee employee) {
        if (2021 - employee.hireYear > 10) return employee.salary * 1.05;
        else if (2021 - employee.hireYear > 9 && 2021 - employee.hireYear < 20) return employee.salary * 1.1;
        else if (2021 - employee.hireYear > 19) return  employee.salary * 1.15;
        else return employee.salary;
    }

    public void getEmployeeDetails() {
        Employee employee = new Employee(this.name, this.salary, this.workHours, this.hireYear);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary + this.calculateBonus(this.workHours));
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Taxes: " + this.calculateTaxes(this.salary));
        System.out.println("Bonus: " + this.calculateBonus(this.workHours));
        System.out.println("Raise Salary: " + this.raiseSalary(employee));
    }
}
