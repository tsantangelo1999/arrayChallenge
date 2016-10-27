package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ts159 on 10/27/16.
 */
public class Student
{
    public ArrayList grades = new ArrayList();
    public String name;
    public Student(String n)
    {
        name = n;
        collectGrades();
    }

    private void collectGrades()
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("Input a grade. Input -1 to continue.");
            double grade = input.nextDouble();
            if(grade == -1)
                break;
            grades.add(grade);
        }
    }

    public double calculateAverage()
    {
        double sum = 0;
        for(int i = 0; i < grades.size(); i++)
        {
            sum += (double)grades.get(i);
        }
        return sum/grades.size();
    }
}
