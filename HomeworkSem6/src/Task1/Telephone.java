package Task1;

public class Telephone {
    private boolean isOn;

    UnlockerFace face = new UnlockerFace();
    UnlockFinger finger = new UnlockFinger();
    UnlockPin pin = new UnlockPin();


    public void turnOn () {isOn = face.unlock() || finger.unlock() || pin.unlock();
        System.out.println("Telephone is on");}

    public void turnOff () {isOn = face.unlock() || finger.unlock() || pin.unlock();
        System.out.println("Telephone is off");}
}
