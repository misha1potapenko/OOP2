import java.util.ArrayList;
import java.util.List;

public class Filter implements IsGood<Object> {
    public static <T> List filter (ArrayList<T> listForFilter){
        return listForFilter;
    }

    @Override
    public boolean IsGood(Object item) {
        return false;
    }
}
