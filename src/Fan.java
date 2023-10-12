public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    int speed = 1;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }
    public int getSLOW() {
        return SLOW;
    }
    public int getMEDIUM() {
        return MEDIUM;
    }
    public int getFAST() {
        return FAST;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on\n");
            state += ("Speed: " + this.speed + "\n");
        } else {
            state += ("Fan is off\n");
        }
        state += ("Color: " + this.color + "\n");
        state += ("Radius: " + this.radius + "\n");
        return state;
    }
}
