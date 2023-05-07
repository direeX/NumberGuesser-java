package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        int score = 0;
        while(true) {
            System.out.println("Zgadnij liczbę (1-100):");
            int playerGuess = scanner.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Tak jest! Wygrana!");
                System.out.println("Liczba prób: " + score);
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Liczba jest większa");
                score++;
            } else {
                System.out.println("Liczba jest mniejsza");
                score++;
            }
        }

    }
}