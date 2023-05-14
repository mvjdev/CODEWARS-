public class Game {
    public String winner(String[] deckSteve, String[] deckJosh) {
        int scoreSteve = 0;
        int scoreJosh = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            String cardSteve = deckSteve[i];
            String cardJosh = deckJosh[i];

            if (cardValue(cardSteve) > cardValue(cardJosh)) {
                scoreSteve++;
            } else if (cardValue(cardJosh) > cardValue(cardSteve)) {
                scoreJosh++;
            }
        }

        if (scoreSteve > scoreJosh) {
            return "Steve wins " + scoreSteve + " to " + scoreJosh;
        } else if (scoreJosh > scoreSteve) {
            return "Josh wins " + scoreJosh + " to " + scoreSteve;
        } else {
            return "Tie";
        }
    }

    private int cardValue(String card) {
        String ranks = "23456789TJQKA";
        return ranks.indexOf(card.charAt(0));
    }
}