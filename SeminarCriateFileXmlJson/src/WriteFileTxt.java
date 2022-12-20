import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTxt extends WriteFile {
    @Override
    public void writeFileForClass()  {
        try (FileWriter file = new FileWriter("markClass.txt")) {

        String text = "Иван Иванов=4.8\n" +
                "Мария Кузнецова=5.0\n" +
                "Степан Кузьмин=3.6";
        file.write(text);
        file.flush();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
