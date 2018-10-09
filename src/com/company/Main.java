package com.company;

public class Main {

    public static void main(String[] args) {

        Student stu1 = new Student("Kayla", 2.9);
        Student stu2 = new Student("Jacob", 3.6);
        Student stu3 = new Student("Alex", 4.0);

        if (stu1.GPA > stu2.GPA){

            if (stu2.GPA > stu3.GPA ) {
                System.out.println("The top three students are:");
                System.out.println(stu1.name);
                System.out.println(stu2.name);
                System.out.println(stu3.name);
            }

            else if (stu2.GPA == stu3.GPA) {
                System.out.println("The top three students are:");
                System.out.println(stu1.name);
                System.out.println(stu2.name + " and " + stu3.name + " have the same GPA!");
            }

            else if (stu2.GPA < stu3.GPA){

                if (stu1.GPA > stu3.GPA) {
                    System.out.println("The top three students are:");
                    System.out.println(stu1.name);
                    System.out.println(stu3.name);
                    System.out.println(stu2.name);
                }

                else if (stu1.GPA == stu3.GPA) {
                    System.out.println("The top three students are:");
                    System.out.println(stu1.name + " and " + stu3.name + " have the same GPA!");
                    System.out.println(stu2.name);
                }

                else {
                    System.out.println("The top three students are:");
                    System.out.println(stu3.name);
                    System.out.println(stu1.name);
                    System.out.println(stu2.name);
                }
            }
        }

        else if (stu1.GPA < stu2.GPA) {

            if (stu1.GPA > stu3.GPA) {
                System.out.println("The top three students are:");
                System.out.println(stu2.name);
                System.out.println(stu1.name);
                System.out.println(stu3.name);
            }

            else if (stu1.GPA == stu3.GPA) {
                System.out.println("The top three students are:");
                System.out.println(stu2.name);
                System.out.println(stu1.name + " and " + stu3.name + " have the same GPA!");
            }

            else if (stu3.GPA > stu1.GPA) {

                if (stu3.GPA > stu2.GPA) {
                    System.out.println("The top three students are:");
                    System.out.println(stu3.name);
                    System.out.println(stu2.name);
                    System.out.println(stu1.name);
                }

                else if (stu3.GPA == stu2.GPA) {
                    System.out.println("The top three students are:");
                    System.out.println(stu2.name+ " and " + stu3.name + " have the same GPA!");
                    System.out.println(stu1.name);
                }

                else {
                    System.out.println("The top three students are:");
                    System.out.println(stu2.name);
                    System.out.println(stu3.name);
                    System.out.println(stu1.name);
            }


            }
        }
        else {

            if (stu1.GPA > stu3.GPA) {
                System.out.println("The top three students are:");
                System.out.println(stu1.name + " and " + stu2.name + " have the same GPA!");
                System.out.println(stu3.name);
            }

            else if (stu1.GPA == stu3.GPA) {
                System.out.println("There is a three way tie!! " + stu1.name + ", " + stu2.name + ", and " + stu3.name + " " + "have the same GPA!!!!");
            }

            else {
                System.out.println("The top three students are:");
                System.out.println(stu3.name);
                System.out.println(stu1.name + " and " + stu2.name + " have the same GPA!");
            }
        }
    }
}
