
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListContacts {
    private List<Counterparty> counterparties = new ArrayList<>();





    public List<Counterparty>  showContacts(){

        counterparties.add(new LegalEntity("Petrov Ivan Vladimirovich",Arrays.asList(256,65454), "323 Street Pentagon",
                "dsfsdfsdf@gmail.com","pogoda.vk", "telega1", "adidas.com"));
        counterparties.add(new LegalEntity("Ivanov Petr Ivanovich",Arrays.asList(7952555,5888656), "323 Street Pentagon",
                "dsfsdfsdf@gmail.com","pogoda.vk", "telega1", "adidas.com"));
        counterparties.add(new LegalEntity("Kudinov Vladimir Petrovich",Arrays.asList(3952555,58848656), "323 Street Pentagon",
                "dsfsdfsdf@gmail.com","pogoda.vk", "telega1", "adidas.com"));
        counterparties.add(new PhysicalPerson("Petya",Arrays.asList(55555,55555),"Popova 3", "duren@yandex.ru",
                "petya.vk","Telega2"));
        for (Counterparty element: counterparties
             ) {
            System.out.println(element);

        }
        return counterparties;
    }

}
