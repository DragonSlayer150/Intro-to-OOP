public class Tautogram {
    public static void main(String[] args) {
        String phrase = "a 5";
        String[] splitPhrase = phrase.trim().split(" ");
        char lastFirstLetter = phrase.trim().charAt(0);
        boolean isTautogram = false;
        int counter = 0;

        for (String word : splitPhrase) {
            if (word.charAt(0) == lastFirstLetter) {
                counter++;
            } else {
                break;
            }
        }
        if (counter == splitPhrase.length) {
            isTautogram = true;
        }

        System.out.printf("Is the phrase \"%s\" a tautogram? %b", phrase, isTautogram);

    }
}
