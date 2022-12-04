package com.ronin;


import java.util.Scanner;

public class Course_Menu extends Lessons{

    int student_demand;

    @Override
    void listOfLessons() {
        super.listOfLessons();
        System.out.println("5 .Lab");
    }

    public void course_menu(){
        Scanner scanner=new Scanner(System.in);
        Teachers teachers=new Teachers();

        do {
            System.out.println("*** Course Menu ****");


            System.out.println("""
                    1 - List of Teachers
                    2 - My Lessons
                    3 - My Course Building""");

            System.out.println("Please , select");
           int student_demand=scanner.nextInt();

            switch (student_demand) {
                case 1 -> {

                    System.out.println(" *** List of Teachers ***");
                    System.out.print("1 . ");
                    teachers.create_teacher("John", "Johny");
                    System.out.print("2 . ");
                    teachers.create_teacher("Adele", "Love");
                    student_demand = scanner.nextInt();

                    if (student_demand == 1) {

                        teachers.create_teacher("John", "Johny");
                        System.out.println("You have selected : " + " " + teachers.getName() + " " + teachers.getSurname());

                    } else if (student_demand == 2) {

                        teachers.create_teacher("Adele", "Love");
                        System.out.println("You have selected : " + " " + teachers.getName() + " " + teachers.getSurname());

                    } else {
                        System.out.println("**** Select a number *****");
                    }
                }
                case 2 -> {
                    System.out.println("** My Lessons **");
                    listOfLessons();
                }
                case 3 -> {
                    System.out.println("** My Course Building Info **");
                    listOfCampusBuilding();
                }
            }

        }while (student_demand != 3);
    }

}
