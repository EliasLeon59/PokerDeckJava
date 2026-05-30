public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.shuffle();

        System.out.println("\nHEAD:");
        deck.head();

        System.out.println("\nPICK:");
        deck.pick();

        System.out.println("\nHAND:");
        deck.hand();
    }
}