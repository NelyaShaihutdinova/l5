package org.example.command;

import org.example.entities.CollectionController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Invoker {
    private CollectionController cc;
    private Map<String, Command> commands = new HashMap<>();
    private String param;
    public Invoker(CollectionController cc) {
        this.cc = cc;
    }
    public Map<String, Command> getCommands() {
        return commands;
    }
    public void setParam(String param) {
        this.param = param;
    }
    public String getParam(String param) {
        return this.param;
    }
    public void readCommands() {
        commands.put("add", new AddCommand(cc));
        commands.put("show", new ShowCommand(cc));
        commands.put("clear", new ClearCommand(cc));
        commands.put("info", new InfoCommand(cc));
        commands.put("help", new HelpCommand(this));
        commands.put("add_if_min", new AddIfMinCommand(cc));
        commands.put("remove_greater", new RemoveGreaterCommand(cc));
        commands.put("remove_lower", new RemoveLowerCommand(cc));
        commands.put("save", new SaveCommand(cc));
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            if (tokens.length == 2) {
                param = tokens[1];
            }
            commands.put("update", new UpdateIdCommand(param, cc));
            commands.put("remove_by_id", new RemoveByIdCommand(param, cc));
            commands.put("count_greater_than_impact_speed", new CountGreaterCommand(param, cc));
            commands.put("filter_contains_soundtrack_name", new FilterContainsCommand(param, cc));
            commands.put("filter_greater_than_impact_speed", new FilterGreaterCommand(param, cc));
            Command command = commands.get(tokens[0]);
            String exit = "exit";
            if(exit.equals(line)) {
                sc.close();
            } else {
                command.execute();
            }
        }
    }
}
