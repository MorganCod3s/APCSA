package Unit1.U1T7;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int num1) {
        x = num1;
        y = num1;
    }
    
    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
       return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        String coordinate = "(" + x + ", " + y + ")";
        return coordinate;
    }

    public String quadrant() {
        if (x > 0 && y > 0){
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x == 0 && y == 0) {
            return "origin";
        } else
            return "on an axis";

    }

    }
