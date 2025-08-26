package models;

public class Rover {
    public static final String SEPERATOR = ":";
    private Direction direction = Direction.N;
    private Cordinates cordinates = new Cordinates();


    public Rover() {
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Cordinates getCordinates() {
        return cordinates;
    }

    public void setCordinates(Cordinates cordinates) {
        this.cordinates = cordinates;
    }

    public String getCurrentPosition() {
        var result = new StringBuilder();
        result.append(this.cordinates.getxCordinate());
        result.append(SEPERATOR);
        result.append(this.cordinates.getyCordinate());
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
