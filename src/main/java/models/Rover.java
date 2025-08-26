package models;

public class Rover {
    public static final String SEPERATOR = ":";
    private Direction direction = Direction.N;
    private int xCordinate;
    private int yCordinate;

    public Rover() {
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
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

    public void changeDirection(String command) {
        if (command.equals("L")) {
            setDirection(getDirection().left());
        } else if (command.equals("R")) {
            setDirection(getDirection().right());
        }
    }

}
