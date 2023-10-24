package Creational_Pattern.Factory_Pattern.Factory_Pattern.TableShape;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Table;

public class TableModern implements Table {
    @Override
    public void create() {
        System.out.println("Create TableModern");
    }
}
