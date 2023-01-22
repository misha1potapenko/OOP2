package Task1;

public class UnlockPin implements Unlocker {

    private String pin;
    @Override
    public boolean unlock() {
        return pin.equals("pin");
    }
}
