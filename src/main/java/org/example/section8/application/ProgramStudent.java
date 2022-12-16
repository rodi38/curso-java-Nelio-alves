package org.example.section8.application;

import org.example.section8.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student student = new Student();
        System.out.println("Name: ");
        student.name = scanner.nextLine();
        System.out.println("Grade 1: ");
        student.setGrade1(scanner.nextDouble());
        System.out.println("Grade 2: ");
        student.setGrade2(scanner.nextDouble());
        System.out.println("Grade 3: ");
        student.setGrade3(scanner.nextDouble());
        System.out.println(student);


    }
}
