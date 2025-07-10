package web.model;

public class Car {
    private int id;
    private String make;
    private int horsePower;

    public Car(int id, String make, int horsePower) {
        this.id = id;
        this.make = make;
        this.horsePower = horsePower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car:" + " " +
               " make = " + make +
               ", HP = " + horsePower;
    }
}
