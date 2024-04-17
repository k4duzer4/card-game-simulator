import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Copas", "Ouros", "Paus", "Espadas"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei", "Ás"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public Card getAleatorio() {
        Random random = new Random();
        int index = random.nextInt(cards.size());
        return cards.remove(index);
    }
}
