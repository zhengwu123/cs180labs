import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by wu673 on 11/9/16.
 */
class  InfoNotFoundException extends Exception{
    InfoNotFoundException(String msg){
        super(msg);
    }
}
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(1265);
        System.out.println("Server waiting for connection");
        try {
            while (true) {
                Socket socket = listener.accept();
                System.out.println("Connection is successful and waiting for commands");
                BufferedReader in =
                        new BufferedReader(new InputStreamReader(socket.getInputStream()));

                try {
                    PrintWriter out =
                            new PrintWriter(socket.getOutputStream(), true);
                    String msg ;
                    String filenname="";
                    String username="";
                    boolean flag =false;
                    int count =0;
                    while ((msg=in.readLine())!=null){
                        count++;
                        if(count==1)
                            filenname = msg.substring(9);
                        if(count==2) {
                            username = msg.substring(9);
                            break;
                        }
                        System.out.println(msg);
                    }
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("/homes/wu673/Desktop/cs180/lab12/Server/"+ filenname));
                        String sCurrentLine;

                        while ((sCurrentLine = br.readLine()) != null) {
                            if(sCurrentLine.contains(username)){
                                System.out.println(sCurrentLine);
                                flag=true;
                               //String s1= sCurrentLine.substring(username.length());
                                out.println(sCurrentLine);
                                break;
                            }
                        }
                        if(flag==false) {
                            out.println("InfoNotFoundException: Your information is not in our file");

                            throw new InfoNotFoundException("username not in the database");
                        }
                    }
                    catch (FileNotFoundException fe){
                        System.out.println("file not exist");
                        out.println("FileNotFoundException");

                        fe.printStackTrace();
                    }

                } catch (Exception e0){
                    e0.printStackTrace();
                }
                finally {
                    socket.close();
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            listener.close();
        }

    }

}

