import java.util.List;

public class PhysicalPerson extends Counterparty{
    public PhysicalPerson(String name, List<Integer> telephone, String address, String emailAddress, String addressVK, String addressTelegram) {
        super(name, telephone, address, emailAddress, addressVK, addressTelegram);
    }

    @Override
    public String toString() {
        return "PhysicalPerson{} " + super.toString();
    }
}
