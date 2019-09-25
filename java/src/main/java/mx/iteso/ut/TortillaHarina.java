package mx.iteso.ut;

/**
 * <b>TortillaHarina</b>.
 * @see Annotations
 */
public class TortillaHarina implements Tortilla {
    /**
     * TOASTING_TEMPERATURE.
     */
    public static final int TOASTING_TEMPERATURE = 10;
    /**
     * toasted.
     */
    private boolean toasted;
    /**
     * temperature.
     */
    private int temperature;
    /**
     * toasting.
     */
    private int toasting = TOASTING_TEMPERATURE;

    /**
     * @return toasted
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /**
     * @return toasting
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     * @return temperature
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * @param temp temp
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * @param isToasted toasted
     */
    public void toast(final boolean isToasted) {
        this.toasted = isToasted;
    }
}
