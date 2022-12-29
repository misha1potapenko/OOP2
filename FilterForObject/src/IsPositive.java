public class IsPositive implements IsGood<Object>{

    @Override
    public boolean IsGood(Object item) {
        return (Double)item>0;
    }
}
