package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
	    /*int[] grades = {90, 95, 100, 20};
        double average = calculateAvg(grades);
        System.out.println(average);*/
        ArrayList grades = new ArrayList();
        ArrayList<String> names = new ArrayList();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        while(true)
        {
            System.out.println("Input a grade. Input -1 to get an average.");
            double grade = input.nextDouble();
            if(grade == -1)
                break;
            grades.add(grade);
            System.out.println("Input a name.");
            names.add(input2.nextLine());
        }
    }

    public static double calculateAvg(ArrayList g)
    {
        double sum = 0;
        for(int i = 0; i < g.size(); i++)
            sum += (double)g.get(i);
        return sum / g.size();
    }
}
