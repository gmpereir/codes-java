package br.com.gmpereir.javaexercises;

import java.util.Scanner;

/**
 * @author Gustavo Pereira
 */
public class IfElse_Flow {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String nome = input.nextLine();

        System.out.println("Hi " + nome);

    }

}
