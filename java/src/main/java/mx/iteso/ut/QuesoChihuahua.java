package mx.iteso.ut;

/**
* Implementation class QuesoChihuahua for Queso interface.
*/
public class QuesoChihuahua implements Queso {
    /**
    * Constant defined for melting temperature.
    */
    static final int MELTING_TEMPERATURE = 20;
    /**
    * Queso chihuahua melting status.
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
    public static boolean isMelted() {
        return this.melted;
    }
    /**
    * Method to get current temperature of QuesoChihuahua.
    * @return current temperature.
    */
    public static int getCurrentTemperature() {
        return this.temperature;
    }
    /**
    * Gets melting temperature for QuesoChihuahua.
    * @return melting temperature.
    */
    public static int getMeltingTemperature() {
        return this.melting;
    }
    /**
    * Sets the current temperature.
    * @param temp temperature selected.
    */
    public static void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }
    /**
    * Changes melting status.
    * @param melted melting status.
    */
    public static void melt(final boolean melted) {
        this.melted = melted;

    }
}
