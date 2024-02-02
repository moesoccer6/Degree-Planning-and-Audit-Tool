import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String arg[]){
        File file = new File("/Users/anil/Documents/Freelancing/projects/cources.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            List<String> list = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {

                String a[] = line.split(",");
               list.add("'"+a[0]+"':"+"'"+a[1]+"'");
            }
            sb.append(String.join(",",list));
            sb.append("}");
            System.out.println("tcs.courses.pre= "+sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
