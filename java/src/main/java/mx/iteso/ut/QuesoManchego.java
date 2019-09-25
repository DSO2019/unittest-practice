package mx.iteso.ut;

/**
 * Clase.
 */
public class QuesoManchego {

    /**
     * Variable.
     */
    private boolean melted;

    /**
     * Variable.
     */
    private int temperature;

    /**
     * Variable.
     */
    private final int melting = 20;

    /**
     * Metodo.
     * @return el valor de melted.
     */
    public final boolean isMelted() {
        return this.melted;
    }

    /**
     * Metodo.
     * @return el valor de current temp.
     */
    public final int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Metodo.
     * @return el valor de melting temp.
     */
    public final int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Metodo.
     * @param temp is a variable.
     */
    public final void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Metodo.
     * @param m is a variable.
     */
    public final void melt(final boolean m) {
        this.melted = m;
    }
}
