package org.example.command;

import org.example.entities.CollectionController;

public class SaveCommand implements Command{
    public SaveCommand(CollectionController cc) {
        this.cc = cc;
    }

    private CollectionController cc;
    @Override
    public void execute() {
        cc.save();
    }
    public String descr(){
        return "save - сохранить коллекцию в файл";
    }
}
