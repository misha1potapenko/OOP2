package Task1;

import java.util.Scanner;

public class UnlockerFace implements Unlocker {
    private String face = "face";

    @Override
    public boolean unlock() {
        System.out.println("Ведите код 1 (face)");
        Scanner faces = new Scanner(System.in);
        String forFace = faces.next();
        return face.equals(forFace);
    }
}
