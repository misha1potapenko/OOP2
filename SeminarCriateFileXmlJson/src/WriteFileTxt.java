import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTxt extends WriteFile {
    @Override
    public void writeFileForClass() throws Exception {
        try (FileWriter file = new FileWriter("markClass.txt")) {

            file.write(myClass.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
