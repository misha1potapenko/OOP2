public class IsPositive implements IsGood<Double>{

    @Override
    public boolean IsGood(Double item) {
        return item>0;
    }
}
