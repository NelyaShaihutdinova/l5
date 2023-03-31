package org.example.command;

import org.example.entities.CollectionController;

public class InfoCommand implements Command{
    public InfoCommand(CollectionController cc) {
        this.cc = cc;
    }

    private CollectionController cc;
    @Override
    public void execute() {
        cc.info();
    }
    public String descr(){
        return "info - вывести информацию о коллекции";
    }
}
