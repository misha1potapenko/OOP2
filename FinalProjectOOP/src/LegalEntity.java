import java.util.List;

public class LegalEntity extends Counterparty{
    private String site;


    public LegalEntity(String name, List<Integer> telephone, String address, String emailAddress, String addressVK,
                       String addressTelegram, String site) {
        super(name, telephone, address, emailAddress, addressVK, addressTelegram);
        this.site = site;
    }


    @Override
    public String toString() {
        return "LegalEntity{" +
                "site='" + site + '\'' +
                "} " + super.toString();
    }
}
