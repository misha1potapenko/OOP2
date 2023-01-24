import java.util.List;

public class LegalEntity extends Counterparty{
    public LegalEntity(String name, List<Integer> telephone, String address, String emailAddress, String addressVK, String addressTelegram) {
        super(name, telephone, address, emailAddress, addressVK, addressTelegram);
    }
}
