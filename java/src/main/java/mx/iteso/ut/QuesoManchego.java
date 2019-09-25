package mx.iteso.ut;

/**Clase Queso Manchego implementa la interfaz Queso.*/
public class QuesoManchego implements Queso {

    /** Determina si el queso esta derretido.*/
    private boolean melted;

    /** Temperatura actual del queso.*/
    private int temperature;

    /** Temperatura a la que se derrite el queso.*/
    private final int melting = 18;

    /**@return si el queso esta derretido.*/
    public boolean isMelted() {
        return this.melted;
    }

    /**@return la temperatura actual del queso.*/
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**@return la temperatura en que se derrite el queso.*/
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**@param temp temperatura actual.*/
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**@param pMelted si el queso esta derretido.*/
    public void melt(final boolean pMelted) {
        this.melted = pMelted;
    }
}
