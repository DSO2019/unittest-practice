package mx.iteso.ut;

public class TortillaMaiz implements Tortilla {

    boolean toasted;
    int currentTemperature;
    int toastTemperature = 40;

    public boolean isToasted() {
        return toasted;
    }

    public int getToastTemperature() {
        return toastTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int temp) {
        this.currentTemperature = temp;
    }

    public void toast(boolean toasted) {
        this.toasted = toasted;
    }
}
