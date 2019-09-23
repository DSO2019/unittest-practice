package mx.iteso.ut;

/**
* Implementation class TortillaMaiz for Tortilla interface.
*/
public class TortillaMaiz implements Tortilla {
    /**
    * Constant defined for toasting temperature.
    */
    static final int TOASTING_TEMPERATURE = 40;
    /**
    * Variable used to set the toasting status.
    */
    private boolean toasted;
    /**
    * Tortilla toasting temperature.
    */
    private int toastTemperature = TOASTING_TEMPERATURE;
    /**
    * Current temperature.
    */
    private int temperature;

   /**
    * Returns the toasted status.
    * @return toasted.
    */
    public static boolean isToasted() {
        return toasted;
    }

    /**
    * Returns toasting temperature.
    * @return toastTemperature.
    */
    public static int getToastTemperature() {
        return toastTemperature;
    }

    /**
    * Getter for current temperature.
    * @return currentTemperature.
    */
    public static int getCurrentTemperature() {
        return temperature;
    }
    /**
    * Setter for current temperature.
    * @param temp current temperature.
    */
    public static void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
    * Setter for toeasted.
    * @param toasted status.
    */
    public static void toast(final boolean toasted) {
        this.toasted = toasted;
    }
}
