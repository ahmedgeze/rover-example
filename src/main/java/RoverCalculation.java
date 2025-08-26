import models.RoverCalculationRequest;

public class RoverCalculation {

    public static final String SEPERATOR = ":";

    public String calculate(RoverCalculationRequest request) {
        var directions = request.getDirections().split("");
        int initialXCordinate = 0;
        int initialYCordinate = 0;
        String initialDirection = "N";
        String currentDirection = initialDirection;
        for (var movement : directions) {
            currentDirection = changeDirection(currentDirection, movement);
        }
        StringBuilder resultPosition = new StringBuilder();
        resultPosition.append(initialXCordinate);
        resultPosition.append(SEPERATOR);
        resultPosition.append(initialYCordinate);
        resultPosition.append(SEPERATOR);
        resultPosition.append(currentDirection);
        return resultPosition.toString();
    }

    private String changeDirection(String currentDirection, String command) {
        int nDirection = 1;
        int nDirection = 1;

        if (command.equals("L")) {
            currentDirection = "W";
        } else if (command.equals("R")) {
            currentDirection = "E";
        }
        return currentDirection;
    }
}


/*
    N: Up
    S: Down
    E: Right
    W: Left


 */