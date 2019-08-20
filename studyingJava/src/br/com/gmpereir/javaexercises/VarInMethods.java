package br.com.gmpereir.javaexercises;

import java.util.Scanner;

/**
 * @author Gustavo Pereira
 */
public class VarInMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor da base: ");
        double base = input.nextDouble();

        System.out.println("Informe o valor da altura: ");
        double altura = input.nextDouble();

        double areaRetangulo = retangulo(base, altura);

        System.out.println("A area do retangulo de base " + base + " e altura "
                + altura + " é igual a " + areaRetangulo);

    }

    public static double retangulo(double base, double altura) {

        return base * altura;

    }

}
