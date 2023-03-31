package org.example.command;

import org.example.entities.CollectionController;

public class ShowCommand implements Command{
    public ShowCommand(CollectionController cc) {
        this.cc = cc;
    }

    private CollectionController cc;
    @Override
    public void execute() {
        cc.show();
    }
    public String descr(){
        return "show - вывести все элементы коллекции";
    }
}
