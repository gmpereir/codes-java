package br.com.gmpereir.javaexercises;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Gustavo Pereira
 */
public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt(10);
        int chute = 0;

        while (tentativas > 0 && acertou == false) {

            System.out.println("Qual o seu palpite entre 0 e 10? ");
            chute = input.nextInt();

            if (numeroSecreto == chute) {

                System.out.println("Você acertou!!!");
                acertou = true;

            } else if (chute < numeroSecreto) {

                --tentativas;
                System.out.println("Número muito pequeno! " + tentativas + " tentativas restantes.");

            } else if (chute > numeroSecreto) {

                --tentativas;
                System.out.println("Número muito grande!" + tentativas + " tentativas restantes.");

            }

        }

    }

}
