package mx.iteso.ut;

public class TortillaHarina implements Tortilla {
    boolean toasted;
    int toastTemperature = 30;
    int temperature;

    public boolean isToasted() {
        return toasted;
    }

    public int getToastTemperature() {
        return toastTemperature;
    }

    public int getCurrentTemperature() {
        return temperature;
    }

    public void setCurrentTemperature(int temp) {
        this.temperature = temp;
    }

    public void toast(boolean toasted) {
        this.toasted = toasted;
    }
}
