package mx.iteso.ut;

    /**
     * Clase que implementa la interfaz queso.
     * Se utilizará para mockear el queso en los metodos de preparacioo.
     */
public class QuesoManchego implements Queso {
    /**
     * Evitar numeros magicos.
     * Define la temperatura a la cual se derrite el queso.
     */
    public static final int MELTINGTEMP = 20;

    /**
     * Define el estado del queso.
     */
    private boolean melted;

    /**
     * Define la temperatura actual del queso.
     */
    private int temperature;

    /**
     * Define la temepratura a la cual se derrite el queso.
     */
    private int melting = MELTINGTEMP;

    /**
     *
     * @return estado del queso.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     *
     * @return temperatura actual del queso.
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     *
     * @return temperatura a la cual se derrite el queso.
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     *
     * @param temp define la temperatura actual del queso.
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     *
     * @param melt evalua el estado del queso.
     */
    public void melt(final boolean melt) {
        this.melted = melt;
    }
}
