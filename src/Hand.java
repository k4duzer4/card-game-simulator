import java.util.ArrayList;
import java.util.List;

class Hand {
    private List<Card> cards;
    private int maxSize;

    public Hand(int maxSize) {
        this.maxSize = maxSize;
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        if (cards.size() < maxSize) {
            cards.add(card);
        } else {
            System.out.println("A mão já está cheia. Não é possível adicionar mais cartas.");
        }
    }

    public void removeCard(int index) {
        if (index >= 0 && index < cards.size()) {
            cards.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Card card : cards) {
            stringBuilder.append(card).append("\n");
        }
        return stringBuilder.toString();
    }
}
