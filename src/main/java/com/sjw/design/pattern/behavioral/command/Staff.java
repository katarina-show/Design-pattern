package com.sjw.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 8:23
 * @Description:
 **/
public class Staff {
    
    private List<Command> commandList = new ArrayList<>();
    
    public void addCommand(Command command){
        commandList.add(command);
    }
    
    public void executeCommands(){
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
