import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadTextFile {

    private static final String FILE_PATH = "C:\\Users\\hp\\OneDrive\\Documents\\JavaS\\input.txt";

    public ArrayList<String> readNames() throws IOException {
        ArrayList<String> names = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return names;
    }
}
