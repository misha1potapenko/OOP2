import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFileJson extends WriteFile {


    public  void writeFileForClass() {
        JSONObject myClass = new JSONObject();
        myClass.put("Иван Иванов", 4.8);
        myClass.put("Нина Петрова", 3.6);
        myClass.put("Лида Козлова", 4.9);
        //Write JSON file
        try (FileWriter file = new FileWriter("markClass.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(myClass.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
