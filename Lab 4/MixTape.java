
public class MixTape {
    String title;
    Song[] mixTapeArray = new Song[8];

    public MixTape(String title, Song song1, Song song2, Song song3, Song song4, Song song5, Song song6, Song song7,
            Song song8) {
        this.title = title;
        mixTapeArray[0] = song1;
        mixTapeArray[1] = song2;
        mixTapeArray[2] = song3;
        mixTapeArray[3] = song4;
        mixTapeArray[4] = song5;
        mixTapeArray[5] = song6;
        mixTapeArray[6] = song7;
        mixTapeArray[7] = song8;
        this.totalTime.totalTimeMixTape(this);
    }

    RunningTime totalTime = new RunningTime();

    public static void main(String[] args) {

        String title = "My Mix Tape";
        Song song1 = new Song();
        Song song2 = new Song();
        Song song3 = new Song();
        Song song4 = new Song();
        Song song5 = new Song();
        Song song6 = new Song();
        Song song7 = new Song();
        Song song8 = new Song();

        song1.title = "YYZ";
        song1.artist = "Rush";
        song1.yearRecorded = 1981;
        song1.genre = "rock";
        song1.time.lengthMin = 4;
        song1.time.lengthSec = 25;

        song2.title = "Euclid";
        song2.artist = "Sleep Token";
        song2.yearRecorded = 2023;
        song2.genre = "Metal";
        song2.time.lengthMin = 5;
        song2.time.lengthSec = 13;

        song3.title = "And the Hound";
        song3.artist = "Yaelokre";
        song3.yearRecorded = 2024;
        song3.genre = "Indie, Folk, Pop";
        song3.time.lengthMin = 3;
        song3.time.lengthSec = 23;

        song4.title = "Down with the Sickness";
        song4.artist = "Disturbed";
        song4.yearRecorded = 2000;
        song4.genre = "Nu Metal";
        song4.time.lengthMin = 4;
        song4.time.lengthSec = 39;

        song5.title = "Burning Pile";
        song5.artist = "Mother Mother";
        song5.yearRecorded = 2008;
        song5.genre = "Alternative";
        song5.time.lengthMin = 4;
        song5.time.lengthSec = 22;

        song6.title = "Sarcasm";
        song6.artist = "Get Scared";
        song6.yearRecorded = 2010;
        song6.genre = "Metalcore";
        song6.time.lengthMin = 3;
        song6.time.lengthSec = 18;

        song7.title = "Virtual Insanity";
        song7.artist = "Jamiroquai";
        song7.yearRecorded = 1996;
        song7.genre = "Funk";
        song7.time.lengthMin = 3;
        song7.time.lengthSec = 49;

        song8.title = "ALICE";
        song8.artist = "PEGGY";
        song8.yearRecorded = 2023;
        song8.genre = "Pop";
        song8.time.lengthMin = 2;
        song8.time.lengthSec = 33;

        MixTape myMixTape = new MixTape(title, song1, song2, song3, song4, song5, song6, song7, song8);

        System.out.println();
        printMixTape(myMixTape);

    }

    public static void printMixTape(MixTape tape) {
        System.out.printf("Title: %s\n", tape.title);
        System.out.printf("Running Time: %d:%d\n", tape.totalTime.lengthMin, tape.totalTime.lengthSec);
        tape.mixTapeArray[0].printSong();
        tape.mixTapeArray[1].printSong();
        tape.mixTapeArray[2].printSong();
        tape.mixTapeArray[3].printSong();
        tape.mixTapeArray[4].printSong();
        tape.mixTapeArray[5].printSong();
        tape.mixTapeArray[6].printSong();
        tape.mixTapeArray[7].printSong();
    }

}
