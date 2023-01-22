package Task1;

public class UnlockerFace implements Unlocker {
    private String face;

    @Override
    public boolean unlock() {

        return face.equals("face");
    }
}
