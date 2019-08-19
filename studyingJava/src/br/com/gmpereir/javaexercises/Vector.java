package br.com.gmpereir.javaexercises;

import java.util.Scanner;

/**
 * @author Gustavo Pereira
 */
public class Vector {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numStudents = 5;
        float[] scoreStudents = new float[numStudents];

        for (int i = 0; i < numStudents; ++i) {

            System.out.println("Enter the score of " + (i + 1) + "º student.");
            scoreStudents[i] = input.nextFloat();

        }

        for (int i = 0; i < numStudents; ++i) {

            System.out.println("Score of " + (i + 1) + "º student: " + scoreStudents[i]);
        }

    }

}
