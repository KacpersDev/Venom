package me.kacpersdev;

import me.kacpersdev.api.API;
import me.kacpersdev.chatcolor.CC;
import me.kacpersdev.item.Item;

public final class Venom {

    private final API api = new API();
    private final CC cc = new CC();
    private final Item item = new Item();

    public CC getCC(){
        return this.cc;
    }

    public API getApi(){ return this.api; }

    public Item getItem(){
        return this.item;
    }
}
