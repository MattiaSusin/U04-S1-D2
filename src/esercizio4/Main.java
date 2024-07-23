package esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------COSTRUTTO FOR----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero da cui partire per il conto alla rovescia:");
        int rovescia = Integer.parseInt(scanner.nextLine());

        for (int i = rovescia; i >= 0; i--) {                                                                                // 'i' sta per l'indice di partenza
            if (i == rovescia)
                continue;                                                                                     // 'i >= 0' sta per determinare fino a che numero si debba arrivare
            System.out.println(i);                                                                                           // 'i--' sta per decrementare
        }
        scanner.close();
    }
}
