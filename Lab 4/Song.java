public class Song {
    String title = "";
    String artist = "";
    String genre = "";
    int yearRecorded;
    RunningTime time = new RunningTime();

    public void printSong() {
        System.out.println(this.title +
                " By " + this.artist +
                " (" + this.yearRecorded + ")" +
                " [" + this.genre + "]" +
                " {" + this.time.lengthMin + ((this.time.lengthSec < 10) ? ":0" : ":") + this.time.lengthSec + "} ");

    }
}
