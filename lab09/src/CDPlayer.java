import java.util.ArrayList;

/**
 * Class CDPlayer
 */
public class CDPlayer extends MusicPlayer {

    private int deviceID;
    private int thisTrack;

    /**
     * Constructor for CD-Player
     */
    public CDPlayer(int id) {
        super();
        this.deviceID =id;
        thisTrack=0;
    }

    /**
     * Over-ride Method: turnOn
     */
    public void turnOn() {
        if(status==OFF)
            status=ON;
        System.out.println("CDPlayer ON");
    }

    /**
     * Over-ride Method: turnOff
     */
    public void turnOff() {
        if(status==ON)
            status=OFF;
        System.out.println("CDPlayer OFF");
    }

    /**
     * Method to play next track in the playlist by
     * printing it to stdout and changing current
     */
    public void nextTrack() {
        if(thisTrack<playlist.size())
        thisTrack++;
        String song = playlist.get(thisTrack);
        System.out.println("current playing "+ song );

    }

    /**
     * Method to play previous track in the playlist by
     * printing it to stdout and changing current
     */
    public void previousTrack() {
        if(thisTrack>0) {
            thisTrack -= 1;
            String song = playlist.get(thisTrack);
            System.out.println("current playing "+ song );
        }


    }

    /**
     * Method to play current track
     */
    public void play(int i) {
        if(i>=0 && i< playlist.size()) {
            System.out.println("Now playing: " + playlist.get(thisTrack));
        }
        else{
            System.out.println("Track"+ i+ "is not on the list ");
        }

    }

    public void play() {

            System.out.println("Now playing: " + playlist.get(thisTrack));

    }

}