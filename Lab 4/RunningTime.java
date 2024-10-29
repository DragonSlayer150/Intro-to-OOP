public class RunningTime {
    int lengthMin;
    int lengthSec;

    public void totalTimeMixTape(MixTape tape) {
        // Get min length of each song
        int song1Min = tape.song1.time.lengthMin;
        int song2Min = tape.song2.time.lengthMin;
        int song3Min = tape.song3.time.lengthMin;
        int song4Min = tape.song4.time.lengthMin;
        int song5Min = tape.song5.time.lengthMin;
        int song6Min = tape.song6.time.lengthMin;
        int song7Min = tape.song7.time.lengthMin;
        int song8Min = tape.song8.time.lengthMin;
        // Get sec length of each song
        int song1Sec = tape.song1.time.lengthSec;
        int song2Sec = tape.song2.time.lengthSec;
        int song3Sec = tape.song3.time.lengthSec;
        int song4Sec = tape.song4.time.lengthSec;
        int song5Sec = tape.song5.time.lengthSec;
        int song6Sec = tape.song6.time.lengthSec;
        int song7Sec = tape.song7.time.lengthSec;
        int song8Sec = tape.song8.time.lengthSec;

        this.lengthSec = song1Sec + song2Sec + song3Sec + song4Sec + song5Sec + song6Sec + song7Sec
                + song8Sec;
        this.lengthMin = song1Min + song2Min + song3Min + song4Min + song5Min + song6Min + song7Min
                + song8Min + (this.lengthSec / 60);
        this.lengthSec %= 60;
    }
}
