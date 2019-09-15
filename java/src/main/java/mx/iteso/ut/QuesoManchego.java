package mx.iteso.ut;

public class QuesoManchego implements Queso {
    boolean melted;
    int meltingTemperature = 21;
    int currentTemperature;


    public boolean isMelted() {
        return melted;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getMeltingTemperature() {
        return meltingTemperature;
    }

    public void setCurrentTemperature(int temp) {
        this.currentTemperature = temp;
    }

    public void melt(boolean melted) {
        this.melted = melted;
    }
}
