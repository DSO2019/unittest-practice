package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {
    boolean isToasted;
    int temperature;
    int toasting = 10;
    public boolean isToasted() {
        return this.isToasted;
    }

    public int getToastTemperature() {
        return this.toasting;
    }

    public int getCurrentTemperature() {
        return this.temperature;
    }

    public void setCurrentTemperature(int temp) {
        this.temperature = temp;
    }

    public void toast(boolean toasted) {
        this.isToasted = toasted;
    }
}
