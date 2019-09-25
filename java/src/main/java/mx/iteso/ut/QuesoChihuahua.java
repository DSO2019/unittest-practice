package mx.iteso.ut;

/**
 * <b>QuesoChihuahua</b>.
 * @see Annotations
 */
public class QuesoChihuahua implements Queso {

    /**
     * MELTING_TEMPERATURE.
     */
    public static final int MELTING_TEMPERATURE = 20;
    /**
     * melted.
     */
    private boolean melted;
    /**
     * temperature.
     */
    private int temperature;
    /**
     * melting.
     */
    private int melting = MELTING_TEMPERATURE;

    /**
     * @return melted
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * @return temperature
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * @return melting
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * @param temp temp
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * @param isMelted isMelted
     */
    public void melt(final boolean isMelted) {
        this.melted = isMelted;

    }
}
