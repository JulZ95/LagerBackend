package dev.LagerBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final WarenkorbRepository repository;

    @Autowired
    public DatabaseLoader (WarenkorbRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        /*List<Item> items = new ArrayList<Item>();
        items.add(new Item("Gurke", 10));
        items.add(new Item("Bretter", 200));
        items.add(new Item("Semmel", 50));*/

        this.repository.save(
                new Warenkorb(
                        "Heinz",
                        3
                )
        );
    }
}
