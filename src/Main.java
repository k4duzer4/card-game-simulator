public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player(deck);
        Player player2 = new Player(deck);

        System.out.println("Mão do Jogador 1:");
        System.out.println(player1.getHand());

        System.out.println("Mão do Jogador 2:");
        System.out.println(player2.getHand());
    }
}
