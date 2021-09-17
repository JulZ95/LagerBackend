package dev.LagerBackend;

import javax.persistence.*;
import java.util.List;

@Entity
public class Warenkorb {

    private @Id @GeneratedValue Long id;
    private String orderer;
    private int itemCount;
    private @OneToMany
    List<Item> items;

    public Warenkorb() {}

    public Warenkorb(String orderer, int itemCount) {
        this.orderer = orderer;
        this.itemCount = itemCount;/*
        this.items = items;*/
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderer() {
        return orderer;
    }
    public void setOrderer(String orderer) {
        this.orderer = orderer;
    }

    public int getItemCount() {
        return itemCount;
    }
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    @Override
    public String toString() {
        return "Warenkorb Nr.: " + getId() +
                " Besteller: " + getOrderer() +
                " Artikelanzahl: " + getItemCount();
                /*+
                " Artikel: " + items.toString();*/
    }
}

