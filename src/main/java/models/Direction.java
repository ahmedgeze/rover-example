package models;

public enum Direction {
    N(0, 1),  // Up
    E(1, 0),  // Right
    S(0, -1), // Down
    W(-1, 0); // Left


    private final int xCordinate;
    private final int yCordinate;

    Direction(int xCordinate, int yCordinate) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
    }


    public Direction left() {
        return switch (this) {
            case N -> W;
            case W -> S;
            case S -> E;
            case E -> N;
        };
    }

    public Direction right() {
        return switch (this) {
            case N -> E;
            case E -> S;
            case S -> W;
            case W -> N;
        };
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }
}
