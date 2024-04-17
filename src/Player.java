class Player {
    private Hand hand;

    public Player(Deck deck) {
        hand = new Hand(5);
        for (int i = 0; i < 5; i++) {
            hand.addCard(deck.getAleatorio());
        }
    }

    public Hand getHand() {
        return hand;
    }
}

