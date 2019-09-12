package mx.iteso.ut;

public class TortillaHarina implements Tortilla {


    boolean tasted;
    int temperature;
    int toast = 20;
    public boolean isToasted() {
        return this.tasted;
    }

    public int getToastTemperature() {
        return this.toast;
    }

    public int getCurrentTemperature() {
        return this.temperature;
    }

    public void setCurrentTemperature(int temp) {
        this.temperature =temp;

    }

    public void toast(boolean toasted) {this.tasted = toasted;

    }
}
