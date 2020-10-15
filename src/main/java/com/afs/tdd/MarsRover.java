package com.afs.tdd;

import java.util.Arrays;

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
        Arrays.asList(commands).stream().forEach(command -> this.executeCommand(command));
    }

    private void executeCommand(String command) {
        if(command.equals("M")){
            if(heading.equals("N")){
                locationY++;
            }
        }
    }
}
