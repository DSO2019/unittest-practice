package mx.iteso.ut;
/**Clase QuesoChihuahua. */
public class QuesoChihuahua implements Queso {
    /** Variable melted.*/
    private boolean melted;
    /** Variable temperatura.*/
    private int temperature;
    /** Variable melting temperature.*/
    private static final int MELTING = 20;

    /**
     * Método que retorna si el queso está derretido.
     * @return boolean Está derretido.
    */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * Método que retorna la temperatura del
     * queso actual.
     * @return int Tempertura actual.
    */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Método que retorna la temperatura de de fusión del
     * queso.
     * @return int Temperatura de fusión.
     */
    public int getMeltingTemperature() {
        return QuesoChihuahua.MELTING;
    }

    /**
     * Método que establece la temperatura actual.
     * @param pTemp temperatura
    */
    public void setCurrentTemperature(final int pTemp) {
        this.temperature = pTemp;
    }

    /**
     * Método establece si el queso está derretido.
     * @param pMelted melted.
    */
    public void melt(final boolean pMelted) {
        this.melted = pMelted;
    }
}
