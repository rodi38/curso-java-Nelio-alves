package org.example.section8.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        percentage = this.grossSalary*percentage/100;
        this.grossSalary += percentage;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f",netSalary());
    }
}
