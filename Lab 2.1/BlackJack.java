public class BlackJack {
    public static void main(String[] args) {
        char cardOne = '5';
        char cardTwo = '%';
        int total = 0; // together K and 7 should yield a total of 17

        // Card One Logic
        if (cardOne == 'A') {
            total += 11;
        } else if (cardOne == 'K' || cardOne == 'Q' || cardOne == 'J' || cardOne == 'T') {
            total += 10;
        } else if (cardOne == '9') {
            total += 9;
        } else if (cardOne == '8') {
            total += 8;
        } else if (cardOne == '7') {
            total += 7;
        } else if (cardOne == '6') {
            total += 6;
        } else if (cardOne == '5') {
            total += 5;
        } else if (cardOne == '4') {
            total += 4;
        } else if (cardOne == '3') {
            total += 3;
        } else if (cardOne == '2') {
            total += 2;
        } else {
            System.out.println("ERROR!, cardOne: " + cardOne + " undefined");
            System.exit(1);
        }

        // Similar logic for cardTwo can be added here...
        if (cardTwo == 'A') {
            total += 11;
        } else if (cardTwo == 'K' || cardTwo == 'Q' || cardTwo == 'J' || cardTwo == 'T') {
            total += 10;
        } else if (cardTwo == '9') {
            total += 9;
        } else if (cardTwo == '8') {
            total += 8;
        } else if (cardTwo == '7') {
            total += 7;
        } else if (cardTwo == '6') {
            total += 6;
        } else if (cardTwo == '5') {
            total += 5;
        } else if (cardTwo == '4') {
            total += 4;
        } else if (cardTwo == '3') {
            total += 3;
        } else if (cardTwo == '2') {
            total += 2;
        } else {
            System.out.println("ERROR!, cardTwo: " + cardTwo + " undefined");
            System.exit(1);
        }

        if ((cardOne == 'A' || cardTwo == 'A') && total > 21) {
            total -= 10;
        }

        if (total == 21) {
            System.out.println("21!");
        } else if (total > 21) {
            System.out.println("Bust!");
        } else {
            System.out.println(total);
        }
    }
}
