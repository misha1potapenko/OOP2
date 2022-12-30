public class BeginsWithA implements IsGood<Object>{
    @Override
    public boolean IsGood(Object item) {

        return item.toString().startsWith("A");
    }
}
