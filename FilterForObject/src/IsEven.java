import java.util.Scanner;

public class IsEven implements IsGood<Object>{
    @Override
    public boolean IsGood(Object item) {

        return  (Integer)item%2==0;
    }
}
