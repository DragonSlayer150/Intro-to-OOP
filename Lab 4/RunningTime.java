public class RunningTime {
    int lengthMin;
    int lengthSec;

    public void totalTimeMixTape(MixTape tape) {
        // Get min length of each song

        for (Song song : tape.mixTapeArray) {
            this.lengthSec += song.time.lengthSec;
            this.lengthMin += song.time.lengthMin;
        }

        this.lengthMin += this.lengthSec / 60;
        this.lengthSec %= 60;
    }
}
