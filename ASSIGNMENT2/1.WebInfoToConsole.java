import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebInfoToConsole {
    public static void main(String[] args) {
        try{
            //create a URL object for the website
            URL url = new URL("https://www.rediff.com");
            // create a open connection with url
            HttpURLConnection conn =  (HttpURLConnection) url.openConnection();
            //set the request method to get data from that server
            conn.setRequestMethod("GET");
            //read the input stream of data to reader
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            //print the data line by line
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
            //close the connection
            reader.close();
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

