package esercizio1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------- PARTE 1 ------------------");
        System.out.println("Inserisci un testo per capire se la lunghezza è PARI o DISPARI:");
        String stringa = scanner.nextLine();
        ;

        if (stringa.length() % 2 == 0) {
            System.out.println("E' pari la Stringa? " + " TRUE");
        } else {
            System.out.println("E' pari la Stringa? " + " FALSE");
        }
        ;


        System.out.println("---------------------- PARTE 2 ------------------");

        System.out.println("Inserisci l'Anno per capire se è Bisestile o meno:");
        int anno = Integer.parseInt(scanner.nextLine());

        if ((anno % 4) == 0) {
            if ((anno % 100) == 0) {

            } else if ((anno % 400) == 0)

                System.out.println("E' Bisestile");

        } else {
            System.out.println("Non è Bisestile");
        }
        scanner.close();
    }
}
