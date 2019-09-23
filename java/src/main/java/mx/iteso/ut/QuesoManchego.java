package mx.iteso.ut;

/**
* Implementation class QuesoManchego for Queso interface.
*/
public class QuesoManchego implements Queso {
    /**
    * Constant defined for melting temperature.
    */
    static final int MELTING_TEMPERATURE = 23;
    /**
    * Queso manchego melting status.
    */
    private boolean melted
    /**
    * Queso current temperature.
    */
    private int temperature;
    /**
    * Queso melting temperature.
    */
    private int melting = MELTING_TEMPERATURE;
    /**
    * Method to get queso melting status.
    * @return melting status.
    */
    public boolean isMelted() {
        return melted;
    }
    /**
    * Method to get current temperature of QuesoManchego.
    * @return current temperature.
    */
    public int getCurrentTemperature() {
        return currentTemperature;
    }
    /**
    * Gets melting temperature for QuesoManchego.
    * @return melting temperature.
    */
    public int getMeltingTemperature() {
        return meltingTemperature;
    }
    /**
    * Sets the current temperature.
    * @param temp temperature selected.
    */
    public void setCurrentTemperature(final int temp) {
        this.currentTemperature = temp;
    }
    /**
    * Changes melting status.
    * @param melted melting status.
    */
    public static void melt(final boolean melted) {
        this.melted = melted;

    }
}
