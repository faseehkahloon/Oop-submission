public class Game {
    Deck deck = new Deck();
    Player player[];

    Game(String name[]) {
        player = new Player[name.length];
        for (int i = 0; i < name.length; i++)
            player[i] = new Player(name[i]);
    }

    public void playGame() {
        deck.shuffle();
        for (int round = 0; round < 5; round++) {
            System.out.println("\nRound " + (round + 1));
            int highest = -1;
            Player winner = null;
            for (int i = 0; i < player.length; i++) {
                Card card = deck.drawCard();
                System.out.println(player[i].name + " drew " + card);
                int value = displayValue(card.getRank());
                if (value > highest) {
                    highest = value;
                    winner = player[i];
                }
            }
            winner.score++;
            System.out.println("Round Winner: " + winner.name);
        }

        displayWinner();
    }
    public int displayValue(String rank) {
        String ranks[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        for (int i = 0; i < ranks.length; i++)
            if (ranks[i].equals(rank))
                return i;
        return -1;
    }
    public void displayWinner() {
        Player winner = player[0];
        for (int i = 1; i < player.length; i++)
            if (player[i].score > winner.score)
                winner = player[i];
        System.out.println("\nFinal Winner: " + winner.name);
        System.out.println("\nFinal Scores:");
        for (int i = 0; i < player.length; i++)
            System.out.println(player[i]);
    }
}