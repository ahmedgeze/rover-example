import models.Rover;

public class RoverCalculation {

    public static final String SEPERATOR = ":";

    public String calculate(String command) {
        var rover = new Rover();
        return rover.getCurrentPosition();
    }


}


/*
    N: Up
    S: Down
    E: Right
    W: Left


 */