
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListContacts {
    private List<Counterparty> Counterparties;

    public ListContacts(List<Counterparty> counterparties) {
        Counterparties = counterparties;

    }

    public List<Counterparty> Contacts(){
        List<Counterparty> counterparties = new ArrayList<>();
        counterparties.add(new LegalEntity("Petrov Ivan Vladimirovich",new Arrays.asList(256,65454), "323 Street Pentagon",
                "dsfsdfsdf@gmail.com","pogoda.vk", "telega1", "adidas.com"));
        counterparties.add(new LegalEntity("Ivanov Petr Ivanovich",new Arrays.asList(7952555,5888656), "323 Street Pentagon",
                "dsfsdfsdf@gmail.com","pogoda.vk", "telega1", "adidas.com"));
        counterparties.add(new LegalEntity("Kudinov Vladimir Petrovich",new Arrays.asList(3952555,58848656), "323 Street Pentagon",
                "dsfsdfsdf@gmail.com","pogoda.vk", "telega1", "adidas.com"));
        return counterparties ;
    }
}
