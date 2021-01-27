package motorcycleExcercise;

public class Motorcycle {

    private int kilometers;
    public double tank;
    public String name;
    public double consumption;

    public Motorcycle(int kilometers, double tank, String name, double consumption) {
        this.kilometers = kilometers;
        this.tank = tank;
        this.name = name;
        this.consumption = consumption;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
