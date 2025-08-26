package models;

public class Cordinates {
    private int xCordinate;
    private int yCordinate;

    public int getxCordinate() {
        return xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void movement(int x, int y) {
        this.xCordinate += x;
        this.yCordinate += y;
    }


}
