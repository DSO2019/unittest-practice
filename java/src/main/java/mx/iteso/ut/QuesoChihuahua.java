package mx.iteso.ut;

/**
 * This is a Javadoc comment.
 */
public class QuesoChihuahua implements Queso {

    /**
     * This is a Javadoc comment.
     */
    private static final int MELTING_START_TEMP = 20;
    /**
     * This is a Javadoc comment.
     */
    private boolean melted;

    /**
     * This is a Javadoc comment.
     */
    private int temperature;

    /**
     * This is a Javadoc comment.
     */
    private int melting = MELTING_START_TEMP;

    /**
     * This is a Javadoc comment.
     * @return melted.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * This is a Javadoc comment.
     * @return temperature.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * This is a Javadoc comment.
     * @return melting.
     */
    public int getMeltingTemperature() {
        return this.melting;
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
     * @param melted0 melted.
     */
    public void melt(final boolean melted0) {
        this.melted = melted0;

    }
}
