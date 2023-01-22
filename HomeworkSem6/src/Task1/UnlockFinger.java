package Task1;

public class UnlockFinger implements Unlocker{
    private String finger;
    @Override
    public boolean unlock() {
        return finger.equals("finger");
    }
}
