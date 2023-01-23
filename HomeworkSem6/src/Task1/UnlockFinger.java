package Task1;

import java.util.Scanner;

public class UnlockFinger implements Unlocker{
    private String finger = "finger";
    @Override
    public boolean unlock() {
        System.out.println("Ведите код 2 (finger)");
        Scanner fingers = new Scanner(System.in);
        String forFingers = fingers.next();
        return finger.equals(forFingers);
    }
}
