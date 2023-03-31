package org.example.command;

import java.util.HashMap;

public class HelpCommand implements Command{
    public HelpCommand(Invoker inv){
        this.inv=inv;
    }
    private Invoker inv;
    @Override
    public void execute() {
        for (Command c : inv.getCommands().values()){
            System.out.println(c.descr());
        }
        System.out.println("exit - завершить программу (без сохранения в файл)");
    }
    public String descr(){
        return "help - вывести справку по доступным командам";
    }

}
