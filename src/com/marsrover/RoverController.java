package com.marsrover;


public class RoverController {
    Rover rover;
    View view;

    public RoverController(Rover rover, View view) {
        this.rover = rover;
        this.view = view;
    }

    public void start() {
        String direction = view.getInput();
        for (int i = 0; i < direction.length(); i++) {
            Operations operations = MarsRoverParser.parse(direction.charAt(i), rover, view);
            operations.execute();
        }
        view.display(rover);
    }
}
