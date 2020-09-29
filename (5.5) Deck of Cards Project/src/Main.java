import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Cards> deckOfCards = new LinkedList<Cards>();

        //making face cards
        for (int i = 1; i<=4; i++){
            String ppl = "Jack";
            if (i==2){
                ppl = "Queen";
            }
            if (i==3) {
                ppl = "King";
            }
            if (i==4){
                ppl = "Ace";
            }
            FaceCard spade = new FaceCard(ppl, Suits.SPADES);
            FaceCard heart = new FaceCard(ppl, Suits.HEARTS);
            FaceCard club = new FaceCard(ppl, Suits.CLUBS);
            FaceCard diamond = new FaceCard(ppl, Suits.DIAMONDS);
            deckOfCards.add(spade);
            deckOfCards.add(heart);
            deckOfCards.add(club);
            deckOfCards.add(diamond);
        }

        //making number cards
        for (int i = 2; i<=10; i++){
            NumberCard spade = new NumberCard(i, Suits.SPADES);
            NumberCard heart = new NumberCard(i, Suits.HEARTS);
            NumberCard club = new NumberCard(i, Suits.CLUBS);
            NumberCard diamond = new NumberCard(i, Suits.DIAMONDS);
            deckOfCards.add(spade);
            deckOfCards.add(heart);
            deckOfCards.add(club);
            deckOfCards.add(diamond);
        }
        System.out.println(deckOfCards);
        System.out.println("size of deck: " + deckOfCards.size());

        Cards c = new Cards();

    }


        //1 5 9     Spades
        //2 6 10    Hearts
        //3 7 11    Clubs
        //4 8 12    Diamonds

//        ll.add("A");
//        ll.add("B");
//        ll.addLast("C");
//        ll.addFirst("D");
//        ll.add(2, "E");
//        System.out.println(ll);
//
//        ll.remove("B");
//        ll.remove(3);
//        ll.removeFirst();
//        ll.removeLast();

    }

