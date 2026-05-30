import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;
    private ArrayList<Card> discard;

    public Deck() {

        deck = new ArrayList<>();
        discard = new ArrayList<>();

        String[] palos = {"Treboles", "Corazones", "Picas", "Diamantes"};

        String[] valores = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "A", "J", "Q", "K"
        };

        for (String palo : palos) {

            String color;

            if (palo.equals("Corazones") || palo.equals("Diamantes")) {
                color = "Rojo";
            } else {
                color = "Negro";
            }

            for (String valor : valores) {
                deck.add(new Card(palo, color, valor));
            }
        }

    }
    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("Se mezcló el Deck.");
    }
    public void head() {

        if (deck.isEmpty()) {
            System.out.println("No hay cartas disponibles.");
            return;
        }

        Card carta = deck.remove(0);

        discard.add(carta);

        System.out.println(carta);
        System.out.println("Quedan " + deck.size() + " cartas en deck");

    }
    public void pick() {

        if (deck.isEmpty()) {
            System.out.println("No hay cartas disponibles.");
            return;
        }

        Random random = new Random();

        int indice = random.nextInt(deck.size());

        Card carta = deck.remove(indice);

        discard.add(carta);

        System.out.println(carta);
        System.out.println("Quedan " + deck.size() + " cartas en deck");
    }
    public Card[] hand() {

        if (deck.size() < 5) {
            System.out.println("No hay suficientes cartas.");
            return null;
        }

        Card[] mano = new Card[5];

        for (int i = 0; i < 5; i++) {

            mano[i] = deck.remove(0);

            discard.add(mano[i]);

            System.out.println(mano[i]);
        }

        System.out.println("Quedan " + deck.size() + " cartas en deck");

        return mano;
    }
}