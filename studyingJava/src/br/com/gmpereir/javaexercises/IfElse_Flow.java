package br.com.gmpereir.javaexercises;

import java.util.Scanner;

/**
 * @author Gustavo Pereira
 */
public class IfElse_Flow {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Enter a valid age...");
        } else if (age < 18) {
            System.out.println("You are underage!");
        } else if (age >= 18) {
            System.out.println("You are overage");
        }

    }

}
