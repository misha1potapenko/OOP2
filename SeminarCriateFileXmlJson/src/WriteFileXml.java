import java.io.FileWriter;
import java.io.IOException;

public class WriteFileXml extends WriteFile{
    @Override
    public void writeFileForClass()  {
        try (FileWriter file = new FileWriter("markClass.xml")) {

            String text = "<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                    "<students>\n" +
                    "<student>\n" +
                    "<name>Иван Иванов</name>\n" +
                    "<grade>4.8</grade>\n" +
                    "</student>\n" +
                    "<student>\n" +
                    "<name>Мария Кузнецова</name>\n" +
                    "<grade>5.0</grade>\n" +
                    "</student>\n" +
                    "<student>\n" +
                    "<name>Степан Кузьмин</name>\n" +
                    "<grade>3.6</grade>\n" +
                    "</student>\n" +
                    "</students>";
            file.write(text);
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
