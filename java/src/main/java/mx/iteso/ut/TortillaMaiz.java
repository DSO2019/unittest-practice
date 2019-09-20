package mx.iteso.ut;

/**
 * This is a Javadoc comment.
 */
public class TortillaMaiz implements Tortilla {
    /**
     * This is a Javadoc comment.
     */
    private static final int TOASTING_START_TEMP = 10;

    /**
     * This is a Javadoc comment.
     */
    private boolean toasted;

    /**
     * This is a Javadoc comment.
     */
    private int temperature;

    /**
     * This is a Javadoc comment.
     */
    private int toasting = TOASTING_START_TEMP;

    /**
     * This is a Javadoc comment.
     * @return toasted.
     */
    public boolean isToasted() {
        return this.toasted;
    }

    /**
     * This is a Javadoc comment.
     * @return toasting.
     */
    public int getToastTemperature() {
        return this.toasting;
    }

    /**
     * This is a Javadoc comment.
     * @return current temperature.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * This is a Javadoc comment.
     * @param temp temp.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * This is a Javadoc comment.
     * @param toasted0 toasted.
     */
    public void toast(final boolean toasted0) {
        this.toasted = toasted0;
    }
}
