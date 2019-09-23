package mx.iteso.ut;
/** Clase QuesoManchego. */
public class QuesoManchego implements Queso {
    /** Variable para saber si el queso está derretido.*/
    private boolean melted;
    /** Variable para de la temperatura actal del queso.*/
    private int temperature;
    /** Variable temperatura de fusión del queso.*/
    private static final int MELTING = 20;

    /**
        Método para saber si el queso está derretido.
        @return melted.
     */
    public boolean isMelted() {
        return this.melted;
    }

    /** Método que retorna la temperatura actual del queso.
        @return temeperature. */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /** Método que retorna la temperatura de fusión del queso.
        @return melting.
     */
    public int getMeltingTemperature() {
        return QuesoManchego.MELTING;
    }

    /**
        Método que establece la temperatura actual.
        @param pTemp temperatura actual.
     */
    public void setCurrentTemperature(final int pTemp) {
        this.temperature = pTemp;
    }

    /**
        Método que establece si el queso está derretido o no.
        @param pMelted Derretido
     */
    public void melt(final boolean pMelted) {
        this.melted = pMelted;
    }
}
