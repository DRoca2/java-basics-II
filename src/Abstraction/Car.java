public class Car extends Vehicle{
    private String bodyStyle;

    public Car(String color, double maxSpeed, double milesTillEmpty, String bodyStyle) {
        super(color, maxSpeed, milesTillEmpty);
        this.bodyStyle = bodyStyle;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    @Override
    public void horn(){
        System.out.println("Beeeeeepppp!");
    }
}
