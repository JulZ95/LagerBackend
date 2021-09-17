package dev.LagerBackend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
    private @Id @GeneratedValue Long id;
    private String name;
    private int size;
    @ManyToOne Warenkorb warenkorb;

    public Item() {}
    public Item(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " Size: " + size + " cm³ ";
    }
}