public abstract class Vehicle {
    private String color;
    private double maxSpeed;
    private double milesTillEmpty;

    public Vehicle(String color, double maxSpeed, double milesTillEmpty) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.milesTillEmpty = milesTillEmpty;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getMilesTillEmpty() {
        return milesTillEmpty;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMilesTillEmpty(double milesTillEmpty) {
        this.milesTillEmpty = milesTillEmpty;
    }

    public abstract void horn();
}
