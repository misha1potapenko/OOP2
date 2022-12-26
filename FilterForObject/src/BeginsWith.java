import java.util.Scanner;

public class BeginsWith implements IsGood<String>{
    @Override
    public boolean IsGood(String item) {
        System.out.print("Введите строку: ");
        Scanner with = new Scanner(System.in);
        String withA = with.nextLine();
        return item.startsWith(withA);
    }
}
