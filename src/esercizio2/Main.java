package esercizio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------COSTRUTTO SWITCH----------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero a tua scelta:");
        int numero = Integer.parseInt(scanner.nextLine());

        switch (numero) {

            case 1: {
                System.out.println("Il numero inserito E' valido");
                if (numero == 1) {
                    System.out.println("Vai alla pagina successiva");
                }
                break;
            }

            case 2: {
                System.out.println("Il numero inserito E' valido");
                if (numero == 2) {
                    System.out.println("Vai alla pagina precedente");
                }
                break;
            }

            case 3: {
                System.out.println("Il numero inserito E' valido");
                if (numero == 3) {
                    System.out.println("Torna alla Home");
                }
                break;
            }

            default:
                System.out.println("Il numero inserito NON E' valido");
                break;

        }
        scanner.close();
    }
}
