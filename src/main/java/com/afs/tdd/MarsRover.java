package com.afs.tdd;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String heading;
    private String commands;

    public MarsRover(int locationX, int locationY, String heading, String commands) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.heading = heading;
        this.commands = commands;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getHeading() {
        return heading;
    }

    public void executeCommands() {
        Stream.of(commands).forEach(this::executeCommand);
    }

    private void executeCommand(String command) {
        if(command.equals("M")){
            if(heading.equals("N")){
                locationY++;
            }
            if(heading.equals("S")){
                locationY--;
            }
        }

        executeTurn(command);
    }

    private void executeTurn(String command) {

        List<String> headingList = Arrays.asList("N","W","S","E");
        int index = headingList.indexOf(heading);
        if(command.equals("L")){
            if(index == headingList.size() - 1){
                index = 0;
            }
            else{
                index++;
            }
        }
        if(command.equals("R")){
            if(index == 0){
                index = 3;
            }
            else{
                index--;
            }
        }
        heading = headingList.get(index);
    }
}
