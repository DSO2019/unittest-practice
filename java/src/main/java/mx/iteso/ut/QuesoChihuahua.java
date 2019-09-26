package mx.iteso.ut;
/**
 * quesochuhuahua implementa queso.
 */
public class QuesoChihuahua implements Queso {

    /**
     * queso derretido?.
     */
    private boolean melted;

    /**
     * Temperatura de la quesadilla.
     */
    private int temperature;
    /**
     * temperatura a la que se derrite.
     */
    private static final int MELTING = 20;

    /**
     *
     * @return esta derretido?.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return temperatura actual.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return temperatura queso
     */
    public int getMeltingTemperature() {
        return this.MELTING;
    }

    /**
     *
     * @param temp temperatura de la quesadilla.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param amelted si el queso esta derretido.
     */
    public void melt(final boolean amelted) {
        this.melted = amelted;

    }
}
