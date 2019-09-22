package mx.iteso.ut;

/**
 * Clase para poder hacer quesadillas, con queso manchego como dice su nombre.
 */
public class QuesoManchego implements Queso {
    /**
     * Para evitar magic numbers.
     */
    public static final int MELTING_POINT_NUMBER = 20;
    /**
     * Variable booleana que define si esta derretido.
     */
    private boolean melted;
    /**
     * Variable para temperatura.
     */
    private int temperature;
    /**
     * Variable para definir en que momento comenzara a derretir el queso.
     */
    private int melting = MELTING_POINT_NUMBER;

    /**
     * Acceso para melted desde fuera.
     * @return booleano de melted
     */
    public boolean getMelted() {
        return melted;
    }

    /**
     * Publico para hacer un set de melted.
     * @param arg hacer una actualizacion de melted
     */
    public void setMelted(final boolean arg) {
        this.melted = arg;
    }
    /**
     * Pregunta si esta derretido.
     * @return booleano derretido
     */
    public boolean isMelted() {
        return this.melted;
    }

    /**
     * Llamada para obtener la temperatura actual.
     * @return temperatura en número
     */
    public int getCurrentTemperature() {
        return this.temperature;
    }

    /**
     * Obtiene la llamda de la variable en que numero se derretira el queso.
     * @return regresa el numero
     */
    public int getMeltingTemperature() {
        return this.melting;
    }

    /**
     * Actualizar al temperatura actual.
     * @param temp recibe un int para sumarse a otro int
     */
    public void setCurrentTemperature(final int temp) {
        this.temperature = temp;
    }

    /**
     * Para obtener si se derritio o no se derritio el queso.
     * @param var Booleano si es que se derritio
     */
    public void melt(final boolean var) {
        this.melted = var;
    }
}
