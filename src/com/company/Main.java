package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        while(true)
        {
            System.out.println("Input a student's name. Input -1 to list all students' averages.");
            String name = input.nextLine();
            if(name.equals("-1"))
                break;
            students.add(new Student(name));
        }
        for(int i = 0; i < students.size(); i++)
        {
            System.out.println(students.get(i).name + " - " + students.get(i).calculateAverage());
        }
    }
}
