public class MixTape {
    String title;
    Song song1;
    Song song2;
    Song song3;
    Song song4;
    Song song5;
    Song song6;
    Song song7;
    Song song8;
    RunningTime totalTime = new RunningTime();

    public static void main(String[] args) {
        MixTape myMixTape = new MixTape();
        myMixTape.title = "My Mix Tape";

        myMixTape.song1 = new Song();
        myMixTape.song2 = new Song();
        myMixTape.song3 = new Song();
        myMixTape.song4 = new Song();
        myMixTape.song5 = new Song();
        myMixTape.song6 = new Song();
        myMixTape.song7 = new Song();
        myMixTape.song8 = new Song();

        myMixTape.song1.title = "YYZ";
        myMixTape.song1.artist = "Rush";
        myMixTape.song1.yearRecorded = 1981;
        myMixTape.song1.genre = "rock";
        myMixTape.song1.time.lengthMin = 4;
        myMixTape.song1.time.lengthSec = 25;

        myMixTape.song2.title = "Euclid";
        myMixTape.song2.artist = "Sleep Token";
        myMixTape.song2.yearRecorded = 2023;
        myMixTape.song2.genre = "Metal";
        myMixTape.song2.time.lengthMin = 5;
        myMixTape.song2.time.lengthSec = 13;

        myMixTape.song3.title = "And the Hound";
        myMixTape.song3.artist = "Yaelokre";
        myMixTape.song3.yearRecorded = 2024;
        myMixTape.song3.genre = "Indie, Folk, Pop";
        myMixTape.song3.time.lengthMin = 3;
        myMixTape.song3.time.lengthSec = 23;

        myMixTape.song4.title = "Down with the Sickness";
        myMixTape.song4.artist = "Disturbed";
        myMixTape.song4.yearRecorded = 2000;
        myMixTape.song4.genre = "Nu Metal";
        myMixTape.song4.time.lengthMin = 4;
        myMixTape.song4.time.lengthSec = 39;

        myMixTape.song5.title = "Burning Pile";
        myMixTape.song5.artist = "Mother Mother";
        myMixTape.song5.yearRecorded = 2008;
        myMixTape.song5.genre = "Alternative";
        myMixTape.song5.time.lengthMin = 4;
        myMixTape.song5.time.lengthSec = 22;

        myMixTape.song6.title = "Sarcasm";
        myMixTape.song6.artist = "Get Scared";
        myMixTape.song6.yearRecorded = 2010;
        myMixTape.song6.genre = "Metalcore";
        myMixTape.song6.time.lengthMin = 3;
        myMixTape.song6.time.lengthSec = 18;

        myMixTape.song7.title = "Virtual Insanity";
        myMixTape.song7.artist = "Jamiroquai";
        myMixTape.song7.yearRecorded = 1996;
        myMixTape.song7.genre = "Funk";
        myMixTape.song7.time.lengthMin = 3;
        myMixTape.song7.time.lengthSec = 49;

        myMixTape.song8.title = "ALICE";
        myMixTape.song8.artist = "PEGGY";
        myMixTape.song8.yearRecorded = 2023;
        myMixTape.song8.genre = "Pop";
        myMixTape.song8.time.lengthMin = 2;
        myMixTape.song8.time.lengthSec = 33;

        myMixTape.totalTime.totalTimeMixTape(myMixTape);

        System.out.println();
        printMixTape(myMixTape);

    }

    public static void printMixTape(MixTape tape) {
        System.out.printf("Title: %s\n", tape.title);
        System.out.printf("Running Time: %d:%d\n", tape.totalTime.lengthMin, tape.totalTime.lengthSec);
        tape.song1.printSong();
        tape.song2.printSong();
        tape.song3.printSong();
        tape.song4.printSong();
        tape.song5.printSong();
        tape.song6.printSong();
        tape.song7.printSong();
        tape.song8.printSong();
    }

}
