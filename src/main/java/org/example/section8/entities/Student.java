package org.example.section8.entities;

import java.util.Locale;

public class Student {
    public String name;
    private double grade1;
    private double grade2;
    private double grade3;
    private double top = 35+35+30;

    public void setGrade1(double grade1){
        this.grade1 = grade1;
    }
    public void setGrade2(double grade2){
        if (grade2 > 35) {
            grade2 = 35;
        }
        this.grade2 = grade2;
    }

    public void setGrade3(double grade3){
        if (grade3 > 35) {
            grade3 = 35;
        }
        this.grade3 = grade3;
    }
    public double returnFinalGrade(){
        return grade1+grade2+grade3;
    }

    private String status(){
        if( returnFinalGrade() / top >= 0.6){
            return "PASS";
        }else{
            double remmain = 0.6 * top - returnFinalGrade();
            return "FAILED" +
                    "\nMISSING " + String.format("%.2f", remmain) + " POINTS";
        }
    }

    @Override
    public String toString() {
        String resp = "FINAL GRADE = " + String.format("%.2f",returnFinalGrade());
        resp += "\n"+status();
        return resp;
    }
}
