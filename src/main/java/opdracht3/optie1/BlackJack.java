package opdracht3.optie1;

import java.util.*;

public class BlackJack {
    int getal;
    String naam = "";

    // ArrayList maken van de mogelijke tekens
    List<String> tekens = Arrays.asList("♠", "♥", "♣", "♦");

    // ArrayList maken van de mogelijke nummers
    List<Integer> cijfers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    // ArrayList maken van de geselecteerde random getallen
    List<Integer> geselecteerdeGetallen = new ArrayList<Integer>();

    public void getKaart(String antwoord) {
        // Als de speler ervoor kiest om verder te gaan geef dan nog een kaart
        //System.out.println("Wil je nu doorgaan? Type Y/N: ");

        while(true){
            // Als de speler ervoor kiest om te stoppen kijk dan of de waarde(s) van de kaart(en) niet hoger is dan 21
            if (antwoord.equals("N") && getal < 21) {
                // Als de waarde van zijn kaarten niet hoger is dan 21 dan heeft de speler gewonnen
                System.out.println(naam + " heeft gewonnen!!");
                break;
            } else if (antwoord.equals("N") && getal > 21) {
                // Als de waarde boven de 21 is uitgekomen dan heeft de speler verloren
                System.out.println(naam + " heeft helaas verloren.");
                break;
            } else if (antwoord.equals("Y")) {
                // Als de speler ervoor kiest om verder te gaan dan moet er nieuwe kaarten gegeven worden aan de speler
                getal = getRandomCijfer(cijfers);

                geselecteerdeGetallen.add(getal);

                // Ken een random kaart toe aan de aangemaakte speler
                System.out.println("Dit is je kaart nu: " + getRandomTeken(tekens) + getal);

                break;
            } else {
                System.out.println("Geen geldige invoer.");
                break;
            }
        }
    }

    public void beginAanHetSpel(Scanner sc) {
        System.out.println("Type 'begin' om het spel te kunnen starten:");

        while(true){
            String commando = sc.nextLine();

            if(!commando.equals("begin")) {
                System.out.println("Geen geldige invoer, probeer het nogmaals.");
            } else {
                System.out.println("Het spel is nu begonnen.");

                getal = getRandomCijfer(cijfers);

                geselecteerdeGetallen.add(getal);

                // Ken een random kaart toe aan de aangemaakte speler
                System.out.println("Dit is je kaart nu: " + getRandomTeken(tekens) + getal);

                break;
            }
        }
    }

    public static String getRandomTeken(List<String> array) {
        // Kies een random getal binnen de String Array
        int randomNumber = new Random().nextInt(array.size());

        // randomNumber is nu de index, pak nu de waarde van de index in de String Array
        //System.out.println(array.get(randomNumber));

        // Geef de waarde terug in deze methode
        return array.get(randomNumber);
    }

    public static int getRandomCijfer(List<Integer> array) {
        // Kies een random getal binnen de Integer Array
        int randomNumber = new Random().nextInt(array.size());

        // randomNumber is nu de index, pak nu de waarde van de index in de Integer Array
        //System.out.println(array.get(randomNumber));

        // Geef de waarde terug in deze methode
        return array.get(randomNumber);
    }
}
