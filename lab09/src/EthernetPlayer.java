import java.util.ArrayList;

/**
 * Class EthernetPlayer
 */

public class EthernetPlayer extends MusicPlayer {

    private int deviceID;
    private int connStatus;

    static final int CONNECTED = 1;
    static final int NOT_CONNECTED = 0;

    private ArrayList<String> downloadList = new ArrayList<String>();

    public EthernetPlayer(int id) {
        super(); // why do we need this?
        deviceID = id;
        connStatus = NOT_CONNECTED;

        downloadList.add("Dark Horse");
        downloadList.add("Royals");
        downloadList.add("Counting Stars");
        downloadList.add("Let Her Go");
        downloadList.add("The Fox");
    }

    /**
     *  @override turnOn and connect
     *
     */
    public void turnOn() {
        if(status==OFF) {
            status = ON;
            connStatus= CONNECTED;
        }
        System.out.println("EthernetPlayer ON");

    }

    /**
     *  @override turnOff and disconnect
     *
     */
   public void turnOff() {
       if(status==ON) {
           status = OFF;
           connStatus= NOT_CONNECTED;

       }
       System.out.println("EthernetPlayer OFF");

    }


    /**
     *  addTrackToPlaylist: Adds mentioned track to the end of playlist array
     *  print appropriate messages to stdout
     *
     */
    public void addToPlaylist(String trackName) {
        playlist.add(trackName);
        System.out.println(trackName+ " added to the list");

    }

    /**
     *  deleteFromPlaylist: deletes track of give name from the playlist
     *  print appropriate messages to stdout
     *
     */
    public void deleteFromPlaylist(String trackName) {
        int i=0;
        for(String s:playlist){
            if(s.equals(trackName))
                break;
            i++;
        }
        playlist.remove(i);
        System.out.println(trackName+ " deleted");
    }

    /**
     *  download: Downloads mentioned song from the given Download list and adds to playlist
     *  print appropriate messages to stdout
     *
     */
    public void download(String trackName) {
        //implement this section of code to lookup tracName in the downloadlist and
        if(downloadList.contains(trackName)) {
            playlist.add(trackName);
            System.out.println(trackName + "added to playlist");
        }
        else{

            System.out.println(trackName + "not available to download");
        }

    }

}