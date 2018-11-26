package opdracht3.optie1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BlackJack spel = new BlackJack();

        // Scanner aangemaakt om de naam van de speler in te voegen
        System.out.println("Type uw naam in:" );
        Scanner sc = new Scanner(System.in);

        String naam = sc.nextLine();
        System.out.println(naam + " is nu toegevoegd aan het spel");

        spel.naam = naam;

        // Begin aan het spel
        spel.beginAanHetSpel(sc);

        // Als de speler ervoor kiest om verder te gaan geef dan nog een kaart
        System.out.println("Wil je nu doorgaan? Type Y/N: ");

        String antwoord = sc.nextLine();

        while (true) {
        if (antwoord.equals("Y")){
          spel.getKaart(antwoord);
        } else {
            break;
        }
        }
    }
}
