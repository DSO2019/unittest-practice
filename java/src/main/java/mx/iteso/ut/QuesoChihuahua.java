package mx.iteso.ut;

/**
 * Clase de Queso Chihuahua.
 */
public class QuesoChihuahua implements Queso {
    /**Número mágico
     * Melting temperature.
     */
    public static final int MELTINGTEMP = 20;
    /**
     * Booleano que indica si está derretido.
     */
    private boolean melted;
    /**
     * Temperatura actual del queso.
     */
    private int temperature;
    /**
     * Temperatura a la que se derrite el queso.
     */
    private int melting = MELTINGTEMP;

    /**
     * @return si el queso está derretido.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * @return la temperatura actual del queso.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * @return la temperatura a la que se derrite el queso.
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * @param temp asigna la temperatura al queso.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * @param melt derrite el queso.
     */
    public void melt(final boolean melt) {
        this.melted = melt;

    }
}
