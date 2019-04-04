package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Student> list = new ArrayList<>();

        for(int i = 0; i<2;i++){
            Student student1 = new Student();
            System.out.println("Enter name of Student::");
            student1.setName(scanner.next());
            System.out.println("Enter roll-no of Student::");
            student1.setRollNo(scanner.nextInt());
            System.out.println("Enter address of Student::");
            student1.setAddress(scanner.next());
            list.add(student1);
        }

        System.out.println("Enter option::");
        System.out.println("Enter 1 for filter by name::");
        System.out.println("Enter 2 for filter by roll number::");
        System.out.println("Enter 3 for filter by address::");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // finding by name
                System.out.println("Enter name to be searched ::");
                String name = scanner.next();
                for(Student student1: list) {
                    if(student1.getName().equals(name)) {
                        System.out.println(student1.toString());
                    }
                }break;
            case 2:
                //finding by roll-no
                System.out.println("Enter roll-no to be searched::");
                int roll = scanner.nextInt();
                for(Student student1 : list ){
                    if (student1.getRollNo()==roll){
                        System.out.println(student1.toString());

                    }
                }break;
            case 3:
                //finding by address
                System.out.println("Enter address to be searched::");
                String address = scanner.next();
                for(Student student1: list ){
                    if(student1.getAddress().equals(address)){
                        System.out.println(student1.toString());
                    }
                }break;

                default:
                    System.out.println("Invalid Input!!");


        }


        }

    }

