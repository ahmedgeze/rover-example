import models.Rover;

public class RoverCalculation {

    public static final String SEPERATOR = ":";

    public String calculate(String command) {
        var rover = new Rover();
        if (command != null) {
            String[] commandsList = command.split("");
            logRoverPosition(rover);
            for (String commandItem : commandsList) {
                if (commandItem.equals("L") || commandItem.equals("R")) {
                    rover.changeDirection(commandItem);
                    logRoverPosition(rover);
                } else if (commandItem.equals("M")) {
                    rover.movement();
                    logRoverPosition(rover);
                } else {
                    throw new IllegalArgumentException("Command must be L or R or M!");
                }

            }
            return rover.getCurrentPosition();
        } else {
            throw new IllegalArgumentException("Command must not be a null");
        }
    }

    private void logRoverPosition(Rover rover) {
        System.out.printf("Rover position is x=%d, y=%d, dir=%s%n", rover.getCordinates().getxCordinate(), rover.getCordinates().getyCordinate(), rover.getDirection().name());
    }


}


/*
    N: Up
    S: Down
    E: Right
    W: Left


 */