import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Cards> deckOfCards = new LinkedList<Cards>();

        //making face cards
        for (int i = 11; i<=13; i++){
            FaceCard spade = new FaceCard(i, Suits.SPADES);
            FaceCard heart = new FaceCard(i, Suits.HEARTS);
            FaceCard club = new FaceCard(i, Suits.CLUBS);
            FaceCard diamond = new FaceCard(i, Suits.DIAMONDS);
            deckOfCards.add(spade);
            deckOfCards.add(heart);
            deckOfCards.add(club);
            deckOfCards.add(diamond);
        }


        //making number cards
        for (int i = 1; i<=10; i++){
            NumberCard spade = new NumberCard(i, Suits.SPADES);
            NumberCard heart = new NumberCard(i, Suits.HEARTS);
            NumberCard club = new NumberCard(i, Suits.CLUBS);
            NumberCard diamond = new NumberCard(i, Suits.DIAMONDS);
            deckOfCards.add(spade);
            deckOfCards.add(heart);
            deckOfCards.add(club);
            deckOfCards.add(diamond);
        }
        System.out.println("size of deck: " + deckOfCards.size());

        System.out.println("*********SORTING*********");

        CustomComparator c = new CustomComparator();
        Collections.sort(deckOfCards, c);
        Iterator<Cards> cardsIterator2 = deckOfCards.iterator();
        while (cardsIterator2.hasNext()) {
            System.out.print(cardsIterator2.next());
        }
//        Collections.sort(deckOfCards);
//        Iterator<Cards> cardsIterator = deckOfCards.iterator();
//        while (cardsIterator.hasNext()){
//            System.out.print(cardsIterator.next());
//        }

    }


}

