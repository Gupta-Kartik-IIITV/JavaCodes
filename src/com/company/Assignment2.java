package com.company;

public class Assignment2 {
    public static void main(String[] args) {
        Employee george = new Employee("George J. Smith",39,57.57,0.23,0.13);
        Employee.printDeductions(george.deductions, george.net);
    }
}

class Employee{
    String empName;
    double hoursWorked;
    double payRate;
    double govtTax;
    double provTax;
    double grossPay;
    double deductions;
    double net;


    Employee(String name, double hrs,double pay, double gTax, double pTax){
        this.empName = name;
        this.hoursWorked = hrs;
        this.payRate = pay;
        this.govtTax = gTax;
        this.provTax = pTax;
        grossPay = hoursWorked * payRate;
        deductions = grossPay*(provTax + govtTax);
        net = grossPay - deductions;
    }


    public static void printDeductions(double totalDeduction,double netPay){
        System.out.printf("Total tax deductions: %.2f \n",totalDeduction);
        System.out.printf("Net Pay: %.2f",netPay);
    }
}
