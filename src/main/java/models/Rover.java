package models;

public class Rover {
    public static final String SEPERATOR = ":";
    private Direction direction = Direction.N;
    private int xCordinate;
    private int yCordinate;

    public Rover() {
    }

    public String getCurrentPosition() {
        var result = new StringBuilder();
        result.append(xCordinate);
        result.append(SEPERATOR);
        result.append(yCordinate);
        result.append(SEPERATOR);
        result.append(direction.name());
        return result.toString();
    }

}
