package org.example.command;

import org.example.entities.CollectionController;

public class FilterGreaterCommand implements Command{
    private CollectionController cc;
    public FilterGreaterCommand(String param, CollectionController cc) {
        this.param = param; this.cc = cc;
    }
    private String param;
    public void execute(){
        cc.filterGreater(param);
    }

    @Override
    public String descr() {
        return "filter_greater_than_impact_speed impactSpeed - вывести элементы, значение поля impactSpeed которых больше заданного";
    }
}
