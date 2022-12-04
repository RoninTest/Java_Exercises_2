package com.ronin;

import java.util.Scanner;

interface IStudent {

     Students students=new Students();


     static void showStudentInfo(){
         Scanner scanner_student_number=new Scanner(System.in);
         System.out.println("Please, your student number : ");
         students.setStudent_number(scanner_student_number.nextInt());

         Scanner scanner_student_name=new Scanner(System.in);
         System.out.println("Please, your student name : ");
         students.setName(scanner_student_name.nextLine());

         Scanner scanner_student_surname=new Scanner(System.in);
         System.out.println("Please , your student surname : ");
         students.setSurname(scanner_student_surname.nextLine());


         System.out.println(students.getName()
                 +" "+ students.getSurname()
                 + " " + students.getStudent_number());

    }



}
