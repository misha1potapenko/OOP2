package Task1;

import java.util.Scanner;

public class UnlockPin implements Unlocker {

    private String pin = "pin";
    @Override
    public boolean unlock() {
        System.out.println("Ведите код 3 (pin)");
        Scanner pins = new Scanner(System.in);
        String forPins = pins.next();
        return pin.equals(forPins);
    }
}
