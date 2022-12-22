package ObjectsAndClasses._02_ObjectsAndClasses_Exercises._05_Vehicle_Catalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int power;

    public Vehicle(String type, String model, String color, int power) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    //Type: Car
//Model: Ferrari
//Color: red
//Horsepower: 550
    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d",
                this.type, this.model, this.color, this.power);
    }
}
