import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortNames {
    public static void main(String[] args) throws IOException {
      try{  ReadTextFile reader = new ReadTextFile();
        ArrayList<String> names = reader.readNames();
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] name1 = s1.split("");
                String[] name2 = s2.split("");

                String firstName1 = name1[0];
                String firstName2 = name2[0];
                String lastName1 = firstName1.length()>1 ? name1[1] : " ";
                String lastName2 = firstName2.length()>1 ? name2[1] : " ";

                int firstNameComparison = firstName1.compareTo(firstName2);
                if (firstNameComparison != 0) {
                    return firstNameComparison;
                } else {
                    return lastName1.compareTo(lastName2);
                }
            }
        });

        for (String name : names) {
            System.out.println(name);
        }
    } catch (IOException e) {
        System.out.println("An error occurred while reading the file: " + e.getMessage());
    }
}
}
