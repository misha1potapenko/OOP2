import java.util.List;

public abstract class Counterparty {
    private String name;
    private List<Integer> telephone;
    private String address;
    private String emailAddress;
    private String addressVK;
    private String addressTelegram;

    public Counterparty(String name, List<Integer> telephone, String address, String emailAddress,
                        String addressVK, String addressTelegram) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.emailAddress = emailAddress;
        this.addressVK = addressVK;
        this.addressTelegram = addressTelegram;
    }

    @Override
    public String toString() {
        return "Counterparty{" +
                "name='" + name + '\'' +
                ", telephone=" + telephone +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", addressVK='" + addressVK + '\'' +
                ", addressTelegram='" + addressTelegram + '\'' +
                '}';
    }
}
