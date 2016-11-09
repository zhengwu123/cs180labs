import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Main MusicPlayer class
 */
public class MusicPlayer {

    protected ArrayList<String> playlist = new ArrayList<String>();
    protected int status;
    protected int volume;

    static final int OFF = 0;
    static final int ON = 1;
    static final int PLAYING = 2;
    static final int VOLUME_MAX = 100;
    static final int VOLUME_MIN = 0;
    static final int PLAYLIST_SIZE = 10;

    public MusicPlayer() {
        volume = VOLUME_MIN;
        status = OFF;
        playlist.add("Words");
        playlist.add("Stairway To Heaven");
        playlist.add("Dream On");
        playlist.add("Thrift Shop");
        playlist.add("Buzzcut Season");
    }

    /**
     * play: Plays track from playlist based on mentioned trackNo
     * by printing the track name to stdout
     */
    public void play(int trackNo) {
        if(trackNo<playlist.size()) {
            String song = playlist.get(trackNo);
            System.out.println("PLaying: " + song);
        }
        else{

            System.out.println("Tracking"+ trackNo+ "is not on the list ");
        }
    }

    /**
     * turnOn: Turn the player on
     * and print a msg to stdout
     */
    public void turnOn() {
        if(status==OFF)
            status=ON;
        System.out.println("PLayer ON");
    }

    /**
     * turnOff: Turn the player off and
     * print a msg to stdout
     */
    public void turnOff() {
        if(status==ON)
            status=OFF;
        System.out.println("Player OFF");

    }

    /**
     * increaseVolume: Method to increase volume
     * and print current volume to stdout
     *
     */
    public void increaseVolume(int increment) {
        if((increment+volume)>=100) {
            volume = VOLUME_MAX;
        }else{
            volume+=increment;
        }

        System.out.println("volume:" +volume);
    }

    /**
     * decreaseVolume: Method to decrease volume
     * and print current volume to stdout
     *
     */
    public void decreaseVolume(int decrement)  {
        if((volume-decrement)>0&&(volume-decrement)<=100) {
            volume -= decrement;
        }
        if((volume-decrement)<=0)
            volume=0;
        System.out.println("volume:" +volume);
    }

    /**
     * showPlaylist: Displays current playlist
     * to stdout
     */
    public void showPlaylist() {
        int i =0;
        for(String song:playlist){
            System.out.println(i+": "+song);
            i++;
        }

    }


    /**
     * Main method
     *
     */
    public static void main(String[] args) {
        System.out.println("\nCDPlayer");
        CDPlayer cd1 = new CDPlayer(1234);
        cd1.turnOn();
        System.out.println("\nCDPlayer Playlist:");
        cd1.showPlaylist();
        cd1.increaseVolume(20);
        cd1.play();
        cd1.nextTrack();
        cd1.previousTrack();
        cd1.play(21);
        cd1.decreaseVolume(30); // less than VOLUMN_MIN
        cd1.turnOff();

        System.out.println("\nEthernetPlayer");
        EthernetPlayer mp1 = new EthernetPlayer(123);
        mp1.turnOn();
        System.out.println("the playlist has: " + mp1.playlist.size()
                + " songs");
        mp1.increaseVolume(50);
        mp1.play(2);
        mp1.play(21);
        mp1.addToPlaylist("Broken");
        mp1.addToPlaylist("Sweet Child'O Mine");
        mp1.deleteFromPlaylist("Broken");
        mp1.download("haha"); // not in the download list.
        mp1.download("Dark Horse");
        mp1.download("Royals");
        mp1.download("Let Her Go");
        mp1.download("The Fox");
        mp1.download("Counting Stars");

        mp1.increaseVolume(60); // too loud
        System.out.println("\nEthernetPlayer Playlist:");
        mp1.showPlaylist();
        mp1.turnOff();
    }

}