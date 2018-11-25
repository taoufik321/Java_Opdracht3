package opdracht3.optie1;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean beginAanspel = true;
        int getal;

        // ArrayList maken van de mogelijke tekens
        List<String> tekens = Arrays.asList("♠", "♥", "♣", "♦");

        // ArrayList maken van de mogelijke nummers
        List<Integer> cijfers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Scanner aangemaakt om de naam van de speler in te voegen
        System.out.println("Type uw naam in:" );
        Scanner sc = new Scanner(System.in);

        String naam = sc.nextLine();
        System.out.println(naam + " is nu toegevoegd aan het spel");

        // Begin aan het spel
        beginAanHetSpel(sc);

//        if (sc.toString().equals("test")){
//            System.out.println("JAJA");
//        }

        getal = getRandomCijfer(cijfers);

        // Ken een random kaart toe aan de aangemaakte speler
        System.out.println("Dit is je kaart nu: " + getRandomTeken(tekens) + getal);

        // Als de speler ervoor kiest om verder te gaan geef dan nog een kaart
        System.out.println("Wil je nu doorgaan? Type Y/N: ");
        String antwoord = sc.next();

        // Als de speler ervoor kiest om te stoppen kijk dan of de waarde(s) van de kaart(en) niet hoger is dan 21
        if (antwoord.equals("N")) {
            // Als de waarde van zijn kaarten niet hoger is dan 21 dan heeft de speler gewonnen
            if (getal < 21) {
                System.out.println(naam + " heeft gewonnen!!");
            }
            else {
                // Als de waarde boven de 21 is uitgekomen dan heeft de speler verloren
                System.out.println(naam + " heeft helaas verloren.");

            }

        } else {

        }


    }

    public static void beginAanHetSpel(Scanner sc) {
        System.out.println("Type 'begin' om het spel te kunnen starten: ");

        String commando = sc.nextLine();

        if (commando.equals("begin")){
            System.out.println("oke");
        } else {
            System.out.println("Geen geldige invoer, probeer het nogmaals");
            commando = sc.next();

            if(commando.equals("begin")){
                System.out.println("oke");
            }
            else {
                System.out.println("Niet gelukt, probeer het later nogmaals");
            }
        }
    }

    public static String getRandomTeken(List<String> array) {
        // Kies een random getal binnen de String Array
        int randomNumber = new Random().nextInt(array.size());

        // randomNumber is nu de index, pak nu de waarde van de index in de String Array
        System.out.println(array.get(randomNumber));

        // Geef de waarde terug in deze methode
        return array.get(randomNumber);
    }

    public static int getRandomCijfer(List<Integer> array) {
        // Kies een random getal binnen de Integer Array
        int randomNumber = new Random().nextInt(array.size());

        // randomNumber is nu de index, pak nu de waarde van de index in de Integer Array
        System.out.println(array.get(randomNumber));

        // Geef de waarde terug in deze methode
        return array.get(randomNumber);
    }
}
